package com.Mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class EmployeeInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] configFile = {EmployeeAppConfig.class};
        return configFile;
    }

    @Override
    protected String[] getServletMappings() {
        String [] mapping = {"/"};
        return mapping;
    }
}
