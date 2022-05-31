package com.reqres.TestBase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Jay Vaghani
 */
public class TestBase {
//intial set up of url of the web site
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://reqres.in";


    }
}
