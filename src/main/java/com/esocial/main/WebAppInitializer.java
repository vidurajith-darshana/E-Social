package com.esocial.main;

import com.esocial.socketConfig.WebSocketConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebApplicationInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class, WebSocketConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
