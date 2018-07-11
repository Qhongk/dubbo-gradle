package com.kz.dubbo.common;

public class ResponseCode {
    public static final String MESSAGE_SUCCESS = "success";

    public static final int SUCCESS = 0;

    // 通用错误码定义
    /*
    缺少必填参数
     */
    public static final int MISSING_REQUIRED_PARAMETER_ERROR = 1001;
    /*
    fatal error, api key非法
     */
    public static final int API_KEY_ERROR = 1002;
    /*
    APP遇到ACCESS_TOKEN_ERROR就清session，跳登录页面
     */
    public static final int ACCESS_TOKEN_ERROR = 1003;
    /*
    签名错误
     */
    public static final int SIGNATURE_ERROR = 1004;
    /*
    缺少用户身份
     */
    public static final int MISSING_REQUIRED_USER_ERROR = 1005;
}
