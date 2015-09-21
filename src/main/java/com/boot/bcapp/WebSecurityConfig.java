package com.boot.bcapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebMvcSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
   
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//            .authorizeRequests()
//                .antMatchers("/", "/home","/**/signup", "/**/signupSuccess").permitAll()
//                .anyRequest().authenticated()
//                .and()
//            .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .and()
//            .logout()
//                .permitAll();
//    }
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .antMatchers("/user/signup", "/user/signupSuccess").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll();
    }

   /* @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");
    }*/
    
    /*
     *  http.authorizeRequests()
            .antMatchers("/", "/public/**").permitAll()
            .antMatchers("/users/**").hasAuthority("ADMIN")
            .anyRequest().fullyAuthenticated()
            .and()
            .formLogin()
            .loginPage("/login")
            .failureUrl("/login?error")
            .usernameParameter("email")
            .permitAll()
            .and()
            .logout()
            .logoutUrl("/logout")
            .deleteCookies("remember-me")
            .logoutSuccessUrl("/")
            .permitAll()
            .and()
            .rememberMe();
     * */
}
