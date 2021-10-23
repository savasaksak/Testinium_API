package Step_Defs;

import org.junit.Before;
import utilities.ConfigReader;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Hooks {

    @Before
    public static void setUp(){
        baseURI = ConfigReader.get("baseURI");
    }
}
