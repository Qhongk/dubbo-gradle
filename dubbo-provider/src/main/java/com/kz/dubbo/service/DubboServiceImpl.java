package com.kz.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.google.common.collect.Lists;
import com.kz.dubbo.api.DubboService;
import com.kz.dubbo.api.ReturnResult;

import java.util.List;

@Service(group = "helloService")
public class DubboServiceImpl implements DubboService {

    public ReturnResult echo(String text) {
        List result = Lists.newArrayListWithCapacity(3);
        result.add(text);
        result.add("welcome to dubbo!");
//        DateFormatter dateFormatter = new DateFormatter("yyyy-MM-dd");
        result.add(System.currentTimeMillis());

        ReturnResult returnResult = new ReturnResult("ok", result);
        return returnResult;
    }
}
