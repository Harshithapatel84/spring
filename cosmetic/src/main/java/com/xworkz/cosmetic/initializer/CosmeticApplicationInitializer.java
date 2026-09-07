package com.xworkz.cosmetic.initializer;

import com.xworkz.cosmetic.configuration.CosWebConfig;
import com.xworkz.cosmetic.configuration.CosmeticConfig;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CosmeticApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    public CosmeticApplicationInitializer() {
        System.out.println("cosmetic application initializer");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{CosmeticConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{CosWebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
