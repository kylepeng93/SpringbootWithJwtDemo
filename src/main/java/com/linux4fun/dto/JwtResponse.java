package com.linux4fun.dto;

/**
 * created by pengkai at 2021/12/18
 * 个人主页：https://kylepeng93.github.com
 */
public class JwtResponse {
    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;

    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getToken() {
        return this.jwttoken;
    }
}
