import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DreamCodeTest {

    @Test
    public void zipCodeTest() {
        given()
            .get("https://api.zippopotam.us/us/94105")
        .then()
            .statusCode(200).
                body("places[0]['place name']", equalTo("San Francisco"));
    }
}
