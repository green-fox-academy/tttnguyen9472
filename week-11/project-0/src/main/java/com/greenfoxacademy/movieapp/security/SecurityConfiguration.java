package com.greenfoxacademy.movieapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(userDetailsService);

//        auth.inMemoryAuthentication()
//                .withUser("tomi")
//                .password("1234")
//                .roles("ADMIN")
//                .and()
//                .withUser("peti")
//                .password("4321")
//                .roles("USER");


//        auth.jdbcAuthentication()
//                .dataSource(dataSource)
//                .usersByUsernameQuery("select username, password, enabled"
//                + "from users"
//                + "where username = ?")
//                .usersByUsernameQuery("select username, authority"
//                        + "from authorities"
//                        + "where username = ?");


//                .withDefaultSchema()
//                .withUser(
//                        User.withUsername("tomi")
//                                .password("1234")
//                                .roles("ADMIN")
//                )
//                .withUser(
//                        User.withUsername("peti")
//                                .password("4321")
//                                .roles("USER")
//                );
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/user").hasAnyRole("USER", "ADMIN")
                .antMatchers("/").permitAll()
                .and().formLogin();
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
