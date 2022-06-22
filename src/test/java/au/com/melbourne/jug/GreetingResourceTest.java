package au.com.melbourne.jug;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hello from RESTEasy Reactive"));
    }

    @Test
    public void testTodosEndpoint() {
        given()
          .when().get("/todo")
          .then()
             .log().body()
             .statusCode(200)
             .body("title[0]", is("Prepare Demo"))
             .body("description[0]", is("Prepare Quarkus Demo for Melbourne JUG"));
    }
    
}