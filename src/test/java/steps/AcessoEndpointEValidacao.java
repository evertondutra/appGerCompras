package steps;


import components.Components;
import io.cucumber.java.en.*;

public class AcessoEndpointEValidacao {

    Components components;


    @Given("que seja acessado API {string}")
    public void que_seja_acessado_api(String url) {
        components = new Components(url);
        components.endpointReturn();
    }

    @When("for validado o valor do campo name seja igual a {string}")
    public void for_validado_o_valor_do_campo_name_seja_igual_a(String value) {
        components.validationPath("content.nome[0]", value);
    }

    @Then("efetuado o teste de contrato ou Schema")
    public void efetuado_o_teste_de_contrato_ou_schema() {
        components.validationSchema();

    }

}