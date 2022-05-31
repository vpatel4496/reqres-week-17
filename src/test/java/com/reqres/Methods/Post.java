package com.reqres.Methods;

import com.reqres.TestBase.TestBase;
import com.reqres.model.Pojo;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Post extends TestBase {
    //        3.POST CREATE
    @Test
    public void createUser(){
        Pojo pojo = new Pojo();
        pojo.setName("Nid");
        pojo.setJob("Tester");

        Response response;
        response = given()
                .header("Content-Type","application/json")
                .body(pojo)
                .when()
                .post("/api/users");
        response.then().statusCode(201);
        response.prettyPrint();
//id = 290

    }



}
