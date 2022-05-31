package com.reqres.Methods;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

//        Vetify the following data from response

public class Get  {
   static ValidatableResponse response;
    //1.GET LIST USERS
 @Before
    public void inIt(){
RestAssured.baseURI = "https://reqres.in/";
        response = given()
                .when()
                .get("api/users?page=2")
        .then().statusCode(200);

    }
    //1.page = 2
    @Test
    public void verifyPageNumber(){
      int pageNumber =  response.extract().path("page");
        System.out.println("1) page number : " + pageNumber);
 }
    //2.per_page = 6
    @Test
    public void perPage(){
     int perPage = response.extract().path("per_page");
        System.out.println("2) per page : " + perPage);

    }
    //        3.data[1].id = 8
    @Test
    public void  getID(){
     int id = response.extract().path("data[1].id");
        System.out.println("3) data[1].id = " + id);
    }
    //        4.data[3].first_name = Byron
    @Test
    public void  getFirstName(){
        String FN = response.extract().path("data[3].first_name");
        System.out.println("4) data[3].first_named = " + FN);
    }
    //        5.list of data = 6
    @Test
    public void  getData(){
       List< Integer > data = response.extract().path("data");
        System.out.println("5) list of data = " + data.size() );
    }
    //        6.data[5].avatar="https://reqres.in/img/faces/11-image.jpg"
    @Test
    public void  getAvtar(){
       String avatar = response.extract().path("data[5].avatar");
        System.out.println("6) Avatar : " + avatar);
    }
    //        7. support.url = "https://reqres.in/#support-heading"
    @Test
    public void getUrl(){
     String url =  response.extract().path("support.url");
        System.out.println("7) support url : " + url);
    }
    //        8. support.txt = "To keep ReqRes free, contributions,  towards server costs are appreciated!"
    @Test
    public void getText(){
        String txt =  response.extract().path("support.text");
        System.out.println("8) support text : " + txt);
    }
}
