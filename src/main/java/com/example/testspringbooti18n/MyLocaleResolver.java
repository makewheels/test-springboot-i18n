package com.example.testspringbooti18n;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {
    /**
     * zh-HK 华 - 香港的 SAR
     * zh-MO 华 - 澳门的 SAR
     * zh-CN 华 -中国
     * zh-CHS 华 (单一化)
     * zh-SG 华 -新加坡
     * zh-TW 华 -台湾
     * zh-CHT 华 (传统的)
     *
     * @param request
     * @return
     */
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        return Locale.SIMPLIFIED_CHINESE;
//        String lang = request.getParameter("lang");
//        if (StringUtils.isEmpty(lang))
//            return Locale.US;
//        if (lang.startsWith("zh"))
//            return Locale.SIMPLIFIED_CHINESE;
//        return Locale.US;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
    }
}
