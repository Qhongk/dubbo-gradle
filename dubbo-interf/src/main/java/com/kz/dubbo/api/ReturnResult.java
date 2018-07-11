package com.kz.dubbo.api;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
public class ReturnResult implements Serializable {

    String msg;

    List result;
}
