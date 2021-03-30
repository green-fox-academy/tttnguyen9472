package com.homeworkproject.controller;

import com.homeworkproject.dtos.UserLoginDTO;
import com.homeworkproject.exceptions.UserException;
import com.homeworkproject.security.AuthenticationRequest;
import com.homeworkproject.service.ItemService;
import com.homeworkproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MainController {

  private UserService userService;
  private ItemService itemService;

  @Autowired
  public MainController(UserService userService, ItemService itemService) {
    this.userService = userService;
    this.itemService = itemService;
  }

  @PostMapping("/login")
  public ResponseEntity<UserLoginDTO> login(@RequestBody(required = false) AuthenticationRequest loginRequest) throws
      UserException {
    return ResponseEntity.ok(userService.loginUser(loginRequest));
  }
}
