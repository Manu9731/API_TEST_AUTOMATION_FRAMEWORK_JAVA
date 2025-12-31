package com.api.test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.model.request.LoginRequest;
import com.api.model.request.ProfileRequest;
import com.api.model.request.UpdateFewInfo;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.api.model.response.LoginResponse;

import  com.api.model.response.UserProfileResponse;

@Listeners(com.api.listeners.TestListeners.class)
public class UserManagement {

    private static String token;

    @BeforeClass(description = "Login")
    public void login(){
        LoginRequest loginRequest = new LoginRequest("Manu MG", "Manu@123");
        AuthService authService = new AuthService();
        Response response =  authService.login(loginRequest);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        UserManagement.token = loginResponse.getToken();
    }

    @Test(description = "Get profile Information")
    public void profileInfo(){
        UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
        Response response = userProfileManagementService.getProfile(UserManagement.token);
        System.out.println(response.asPrettyString());
//        System.out.println(UserManagement.token);
        UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
//        System.out.println(userProfileResponse.getMobileNumber());
    }

    @Test(description = "Update a profile information")
    public void updateProfileInfo(){
        ProfileRequest profileRequest = new ProfileRequest.Builder()
                .email("mgmanu1996@gmail.com")
                .firstName("Manu")
                .lastName("MG")
                .mobileNumber("9731645038")
                .builder();
        UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
        Response response = userProfileManagementService.updateProfile(profileRequest, UserManagement.token);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.statusCode(), 200);
    }

    @Test(description = "Update single profile info")
    public void updateSingleProfileInfo(){
        UpdateFewInfo updateFewInfo = new UpdateFewInfo.Builder().mobileNumber("9731645040").build();
        UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
        Response response =  userProfileManagementService.updateFewInfo(updateFewInfo, token);
        System.out.println(response.asPrettyString());
    }


}
