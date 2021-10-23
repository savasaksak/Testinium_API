package Step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ConfigReader;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.*;

public class apiTest {

    public String IdBoard;
    public String IdList;
    public String[] IdCards;

    @Given("Trello üzerinde bir board olusturunuz")
    public void trello_üzerinde_bir_board_olusturunuz() {

        Response response = given().accept(ContentType.JSON)
                .and().queryParam("name", "Test")
                .queryParam("key", ConfigReader.get("key"))
                .queryParam("token", ConfigReader.get("token"))
                .when().post("1/boards");

        assertEquals(response.statusCode(),200);
        assertEquals(response.contentType(),"application/json; charset=utf-8");

        JsonPath jsonPath = response.jsonPath();

        IdBoard = jsonPath.getString("id");

        assertEquals(jsonPath.getString("name"),"Test");

    }

    @When("Olusturdugunuz boarda iki tane kart oluşturunuz")
    public void olusturdugunuz_boarda_iki_tane_kart_oluşturunuz() {

    }

    @When("Olusturdugunuz bu iki karttan random olacak sekilde bir tanesini güncelleyiniz")
    public void olusturdugunuz_bu_iki_karttan_random_olacak_sekilde_bir_tanesini_güncelleyiniz() {

    }

    @Then("Olusturdugunuz kartları siliniz")
    public void olusturdugunuz_kartları_siliniz() {

    }

    @Then("Olusturdugunuz boardu siliniz")
    public void olusturdugunuz_boardu_siliniz() {

    }









}
