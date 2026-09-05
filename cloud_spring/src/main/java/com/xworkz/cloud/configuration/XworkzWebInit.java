package com.xworkz.cloud.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class XworkzWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public XworkzWebInit(){
        System.out.println("xworkzwebinit created");
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
