package com.andana.config;

//import org.springframework.context.annotation.Configuration;
//

//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    http
//      .csrf().disable()
//      .authorizeRequests()
//        .antMatchers(HttpMethod.POST, "/api/**").authenticated()
//        .antMatchers(HttpMethod.PUT, "/api/**").authenticated()
//        .antMatchers(HttpMethod.DELETE, "/api/**").authenticated()
//        .anyRequest().permitAll()
//        .and()
//      .httpBasic().and()
//      .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//  }
//}