package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.operaciones.MultiplesOperaciones;
import org.junit.Assert;

public class DividirStepSuccess {

    private MultiplesOperaciones operaciones;
    private Double resultado;

    @Given("Quiero dividir Numeros Enteros")
    public void quieroDividirNumerosEnteros() {
        // Write code here that turns the phrase above into concrete actions
        operaciones = new MultiplesOperaciones();
    }
    @When("Divido {int} entre {int}")
    public void dividoEntre(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        resultado = operaciones.dividir(int1, int2);
    }
    @Then("Deberia ver el resultado de {double}")
    public void deberiaVerElResultadoDe(Double double1) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(double1, resultado);
    }

}
