package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.operaciones.MultiplesOperaciones;

import static org.junit.Assert.assertEquals;

public class DividirStepError {

    private MultiplesOperaciones operaciones;
    private Exception exception;

    @Given("Quiero dividir por {int}")
    public void quieroDividirPor(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        operaciones = new MultiplesOperaciones();
    }
    @When("Divido cero {int} entre {int}")
    public void dividoCeroEntre(Integer int1, Integer int2) {
        try {
            operaciones.dividir(int1, int2);
        }catch (Exception e){
            exception = e;
        }
    }
    @Then("Deberia ver un error {string}")
    public void deberiaVerUnError(String string) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(string, exception.getMessage());
    }

}
