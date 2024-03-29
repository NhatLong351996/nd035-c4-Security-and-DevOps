package com.example.demo.security;

public class SecurityConstants {

    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
	public static final String SECRET = "oursecretkey";
    public static final String HEADER_STRING = "Authorization";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String SIGN_UP_URL = "/api/user/create";
    public static final String SUCCESS  = "SUCCESS";
    public static final String LOGIN_URL  = "/login";


    public static final String LOG_FORMAT = "Method: %s, Status: %s - Request: %s";
    public static final String FAIL  = "FAIL";




}
