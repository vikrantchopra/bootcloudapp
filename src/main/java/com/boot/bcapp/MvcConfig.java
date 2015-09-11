package com.boot.bcapp;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/comments").setViewName("comments");
        registry.addViewController("/login").setViewName("login");
    }
    
    @Bean
    public MessageSource messageSource() {
    	final ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
    	
    	messageSource.setBasename("locale/messages");
    	messageSource.setDefaultEncoding("UTF-8");
    	
    	return messageSource;
    }

}
