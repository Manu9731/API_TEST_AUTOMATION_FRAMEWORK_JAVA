package com.api.base;

import io.restassured.response.Response;

import java.util.HashMap;

public class AuthService extends BaseService {

    private static final String BASE_URL = "/api/auth/";

    public Response login(Object payload ){
        return this.postRequest(payload, BASE_URL+"login");
    }

    public Response signUp(Object payload){
        return this.postRequest(payload, BASE_URL+"signup");
    }

    public  Response forgotPassword(String emailAddress){
        HashMap<String, String> payload = new HashMap<String, String>();
        payload.put("email", emailAddress);
        System.out.println(payload);
        return  postRequest(payload, BASE_URL+"forgot-password");
    }

}
