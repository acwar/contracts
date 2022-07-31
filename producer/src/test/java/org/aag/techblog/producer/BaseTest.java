package org.aag.techblog.producer;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    public static void setup(){
        RestAssuredMockMvc.standaloneSetup(new FraudController());
    }
}
