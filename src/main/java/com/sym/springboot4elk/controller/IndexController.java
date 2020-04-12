package com.sym.springboot4elk.controller;

import com.sym.springboot4elk.utils.InputMDC;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: IndexController
 * @Package com.sym.springboot4elk.controller
 * @Description: TODO
 * @date 2020/4/12 14:12
 */

@Slf4j
@RestController
public class IndexController {


    @RequestMapping(value = "/index")
    public String index(){

        InputMDC.put();
        log.info("this is an info log");
        log.warn("this is an warn log");
        log.error("this is an error log");

        return "index";
    }

    @RequestMapping(value = "/err")
    public String err(){

        InputMDC.put();
        try{
            int i=1/0;
        }catch (Exception e){
            log.error("算术异常啦",e);
        }

        return "err";
    }

}
