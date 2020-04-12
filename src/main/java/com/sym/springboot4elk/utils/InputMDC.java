package com.sym.springboot4elk.utils;

import org.slf4j.MDC;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: InputMDC
 * @Package com.sym.springboot4elk.utils
 * @Description: TODO
 * @date 2020/4/12 15:09
 */

@Component
public class InputMDC implements EnvironmentAware {

    private static Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        InputMDC.environment = environment;
    }

    public static void put(){
        MDC.put("hostName","corn");
        MDC.put("ip","127.0.0.1");
        MDC.put("applicationName",environment.getProperty("spring.application.name"));
    }
}
