package com.edu.festivalproject.util;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

//이 클래스는 SpringSecurityConfig 클래스에 의해 대체 될 것이므로 곧 없어질 예정
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    //WebSecurityConfigurerAdapter 가 이제는 안쓰인다는데 그럼 어떤 클래스를 상속받아서 사용해야 되나?

    @Override
    public void configure(WebSecurity web){
        web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /*
        http.csrf().disable().authorizeRequests()
                //about 요청에 대해서는 로그인을 요구함
                .antMatchers("/about").authenticated()
                // /admin요청에 대해서는 ROLE_ADMIN 역할을 가지고 있어야 함
                .antMatchers("/admin").hasRole("ADMIN")
                //나머지 요청에 대해서는 로그인을 요구하지 않음
                .anyRequest().permitAll()
                .and()
                //로그인하는 경우에 대해 설정함
                .formLogin()
                //로그인 페이지를 제공하는 url을 설정함
                .loginPage("/adminMain")
                //로그인 성공 url을 설정함
                .successForwardUrl("/adminPage/index")
                //로그인 실패 URL을 설정함
                .failureForwardUrl("/index")
                .permitAll()
                .and()
                .addFilterBefore(customAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
                //얘는 왜 안 먹히지?
        */
    }

    //이게 다 뭐야??
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public BCryptPasswordEncoder bCryptPasswordDecoder(){}
}
