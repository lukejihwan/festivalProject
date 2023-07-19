package com.edu.festivalproject.util;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//이 클래스는 SpringSecurityConfig 클래스에 의해 대체 될 것이므로 곧 없어질 예정
public class WebMvcConfig implements WebMvcConfigurer {
    //WebMvcConfigurer 인터페이스는 또 뭐고?

    //이거는 뭐야??
    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {"classpath:/static/", "classpath:/public/", "classpath:/",
            "classpath:/resources/", "classpath:/META-INF/resources/", "classpath:/META-INF/resources/webjars/"};

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        //에 해당하는 url mapping을 /common/test로 forward한다.
        registry.addViewController("/").setViewName("forward:/index");
        //우선 순위를 가장 높게 잡는다. 이게 무슨 말이야??
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE); //가장 우선순위를 높게 잡는 다는 것으은
        //알겠는데 무엇을 우선순위를 높게 잡는 다는 것이고, 왜 우선순위를 높게 잡는건데??
    };

    @Override //이 메서드는 또 뭐야??
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
    }
}
