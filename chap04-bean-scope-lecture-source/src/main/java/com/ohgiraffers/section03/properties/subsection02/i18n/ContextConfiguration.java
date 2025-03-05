package com.ohgiraffers.section03.properties.subsection02.i18n;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

public class ContextConfiguration {
    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        /* 설명. 점속하는 세션의 로케일(locale)에 따라 자동 재로딩하는 용도의 MessageSource */
        ReloadableResourceBundleMessageSource messageSource
                = new ReloadableResourceBundleMessageSource();

        /* 설명. */
        messageSource.setBasename("section03/proprerties/subsection02/i18h/messages");

        messageSource.setCacheSeconds(10);

        messageSource.setDefaultEncoding("UTF-8");

        return messageSource;
    }
}
