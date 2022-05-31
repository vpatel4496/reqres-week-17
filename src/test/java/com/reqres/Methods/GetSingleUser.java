package com.reqres.Methods;

import com.reqres.TestBase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

//        5.DELETE DELETE
//        GET LIST USERS
//        Vetify the following data from response
//        1.page = 2
//        2.per_page = 6
//        3.data[1].id = 8
//        4.data[3].first_name = Byron
//        5.list of data = 6
//        6.data[5].avatar="https://reqres.in/img/faces/11-im
//        age.jpg"
//        7. support.url =
//        "https://reqres.in/#support-heading"
//        8. support.txt = "To keep ReqRes free, contributions
//        towards server costs are appreciated!"
public class GetSingleUser extends TestBase {
    Response response;
    //        2.GET SINGLE USER
    @Test
    public void getSingleUser(){
        response = (Response) given()
                .when()
                .get("/api/users/2");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
