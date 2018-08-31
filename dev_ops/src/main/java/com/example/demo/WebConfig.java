package com.example.demo;

import javax.servlet.http.HttpServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.servlet.LoginServelet;
import com.example.servlet.Logoutservelet;

@Configuration
public class WebConfig {
   @Bean	
   public ServletRegistrationBean<HttpServlet> LoginServletfunc () {
	   ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
	   servRegBean.setServlet(new LoginServelet());
	   servRegBean.addUrlMappings("/LoginServelet/*");
	   servRegBean.setLoadOnStartup(1);
	   return servRegBean;
   }
    
   
   
   
   @Bean	
   public ServletRegistrationBean<HttpServlet> LogoutServletfunc () {
	   ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
	   servRegBean.setServlet(new Logoutservelet());
	   servRegBean.addUrlMappings("/Logoutservelet/*");
	   servRegBean.setLoadOnStartup(1);
	   return servRegBean;
   }
   
} 