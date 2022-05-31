package com.reqres.Methods;

import com.reqres.TestBase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Delete extends TestBase {
    @Test
    public void removeUser(){
        Response response = given()
                .when()
                .delete("/api/users/2");
        response.then().statusCode(204);
        response.prettyPrint();
    }
}
