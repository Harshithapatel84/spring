package com.xworkz.cafeteria.initializer;

import com.xworkz.cafeteria.configuration.CafeApplicationConfig;
import com.xworkz.cafeteria.configuration.CafewebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CafeApplicationInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public  CafeApplicationInit()
    {
        System.out.println("Cafe ApplicationInit created");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{CafeApplicationConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
