package com.reqres.Methods;

import com.reqres.TestBase.TestBase;
import com.reqres.model.LoginPojo;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostLogIn extends TestBase {
    //        4.POST LOGIN-SUCCESSFUL
    @Test
    public void createLogInCredentials() {
        LoginPojo loginPojo = new LoginPojo();
        loginPojo.setEmail("dfgr@gmail.com");
        loginPojo.setPassword("zxc@123");

        Response response = given()
                .header("Content-Type","application/json")
                .body(loginPojo)
                .when()
                .post("/api/login");
        response.then().statusCode(201);
        response.prettyPrint();

    }
}