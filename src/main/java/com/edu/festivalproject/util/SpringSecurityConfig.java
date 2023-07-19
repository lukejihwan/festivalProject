package com.edu.festivalproject.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration //이 Configuration어노테이션의 효과는?
@EnableWebSecurity //이 EnableWebSecurity어노테이션의 효과는?
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
            .and()
                //form 로그인 방식을 사용하겠다는 메서드
            .formLogin()
            .defaultSuccessUrl("/adminPage/index", true)
            .permitAll()
            .and()
            .logout();
    }

    @Override //spring security적용을 받지 않도록 하는 패턴을 적용하는 메서드
    public void configure(WebSecurity web){
        web.ignoring().antMatchers("/js/**", "/css/**", "/images/**");
    }
}