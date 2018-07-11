package com.kz.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kz.dubbo.api.DubboService;
import com.kz.dubbo.api.ReturnResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DubboRPC {

    @Reference(group = "helloService")
    private DubboService dubboService;

    public ReturnResult dubboReturn() {
        return dubboService.echo("Hello Dubbo!");
    }
}
