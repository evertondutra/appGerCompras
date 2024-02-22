package components;

import system.RestAssuredBase;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.core.Is.is;

public class Components {
    public Components(String url) {
        RestAssuredBase.setup(url);
    }

    public void endpointReturn() {
        given().when().get().then().log().all();
    }

    public void validationPath(String path, String value) {
        given().when().get().then().body(path, is(value));
    }

    public void validationSchema() {
        given().when().get().then().body(matchesJsonSchemaInClasspath("jsonValidation.json"));
    }

}
