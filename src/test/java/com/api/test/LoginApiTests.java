//package com.api.test;
//
//
//import com.api.base.AuthService;
//import com.api.model.request.LoginRequest;
//import com.api.model.request.SignUpRequest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//import io.restassured.response.Response;
//
//
//@Listeners(com.api.listeners.TestListeners.class)
//public class LoginApiTests {
//
//    private AuthService authService = new AuthService();
//
//    @BeforeClass()
//    public void start(){
//        System.out.println("Test Started");
//    }
//
////    @Test(description = "Create a account")
//   public void signUp(){
//        SignUpRequest signUpRequest = new SignUpRequest.Builder()
//                .userName("Manu")
//                .password("Manu@1234")
//                .email("mgmanu1997@gmail.com")
//                .password("Manu@1234")
//                .firstName("Manu")
//                .lastName("MG1")
//                .build();
//        AuthService authService = new AuthService();
//        Response response =  authService.signUp(signUpRequest);
//        System.out.println(response.asPrettyString());
//
//    }
//
//
//    @Test(description = "Verify if login api is working")
//    public void loginTest(){
//
//        LoginRequest request = new LoginRequest("Manu MG", "Manu@123");
//
//        Response response = authService.login(request);
//        System.out.println(response.asPrettyString());
//    }
//
////    @Test(description = "Verify forgot password is working or not")
//    public void forgotPassword(){
//        Response response = authService.forgotPassword("MGMANU1996@GMAIL.COM");
//        System.out.println(response.asPrettyString());
//    }
//
//
//
//}
