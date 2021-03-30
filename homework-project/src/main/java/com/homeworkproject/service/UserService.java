package com.homeworkproject.service;

import com.homeworkproject.dtos.UserLoginDTO;
import com.homeworkproject.exceptions.MissingParameterException;
import com.homeworkproject.exceptions.UserException;
import com.homeworkproject.repository.UserRepository;
import com.homeworkproject.security.AuthenticationRequest;
import com.homeworkproject.security.AuthenticationResponse;
import com.homeworkproject.security.JwtUtil;
import com.homeworkproject.security.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

  private UserRepository userRepository;
  private AuthenticationManager authenticationManager;
  private MyUserDetailsService userDetailsService;
  private JwtUtil jwtTokenUtil;

  @Autowired
  public UserService(UserRepository userRepository,
                     AuthenticationManager authenticationManager,
                     MyUserDetailsService userDetailsService, JwtUtil jwtTokenUtil) {
    this.userRepository = userRepository;
    this.authenticationManager = authenticationManager;
    this.userDetailsService = userDetailsService;
    this.jwtTokenUtil = jwtTokenUtil;
  }

  private void checkForMissingLoginParameters(AuthenticationRequest loginData) throws MissingParameterException {
    List<String> missingParameterList = new ArrayList<>();
    checkIfNullOrEmptyField(loginData.getUsername(), "username", missingParameterList);
    checkIfNullOrEmptyField(loginData.getPassword(), "password", missingParameterList);
    if (missingParameterList.size() > 0) {
      throw new MissingParameterException(missingParameterList);
    }
  }

  private void checkIfNullOrEmptyField(String inputField, String fieldName, List<String> missingParameterList) {
    if (inputField == null || inputField.equals("")) {
      missingParameterList.add(fieldName);
    }
  }

  private Boolean isUsernameMissing(AuthenticationRequest loginRequest) {
    return (loginRequest.getUsername() == null || loginRequest.getUsername().equals(""));
  }

  private Boolean isPasswordMissing(AuthenticationRequest loginRequest) {
    return (loginRequest.getPassword() == null || loginRequest.getPassword().equals(""));
  }


  public UserLoginDTO loginUser(AuthenticationRequest loginRequest) throws UserException {
    if (loginRequest == null || isUsernameMissing(loginRequest) && isPasswordMissing(loginRequest)) {
      throw new MissingParameterException(Arrays.asList("username", "password"));
    }
    checkForMissingLoginParameters(loginRequest);
    final UserDetails userDetails;
    userDetails = userDetailsService.loadUserByUsername(loginRequest.getUsername());
    authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(loginRequest.getUsername(),
            loginRequest.getPassword()));
    final String jwt = jwtTokenUtil.generateToken(userDetails);
    return new UserLoginDTO(new AuthenticationResponse(jwt));
  }
}
