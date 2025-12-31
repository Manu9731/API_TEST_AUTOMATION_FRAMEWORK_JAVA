package com.api.base;

import io.restassured.response.Response;

public class UserProfileManagementService extends BaseService {
    private static final String BASE_URL = "/api/users/";

    public Response getProfile(String token){
        this.seAuthToken(token);
        return this.getRequest(BASE_URL+"profile");
    }

    public Response updateProfile(Object payload, String token){
        this.seAuthToken(token);
        return this.putRequest(payload, BASE_URL+"profile");
    }

}
