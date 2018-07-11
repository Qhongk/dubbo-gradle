package com.kz.dubbo.consumer.controller;

import com.kz.dubbo.api.ReturnResult;
import com.kz.dubbo.common.vo.Response;
import com.kz.dubbo.consumer.service.DubboRPC;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DubboController {

    @Autowired
    private DubboRPC dubboRPC;

    @RequestMapping("/hello")
    @ResponseBody
    public Response hello() {
        log.info("hello dubbo start!");
        ReturnResult rr = dubboRPC.dubboReturn();
        log.info("hello dubbo return! {}", rr);
        return new Response(rr.getResult());
    }
}
