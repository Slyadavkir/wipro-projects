package com.wipro;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 return new Class[] {  MyConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		                                       // http://localhost:8080/projectname/
		return new String[] { "/" };
	}
    
  
}