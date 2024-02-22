Feature: Validação da API AppGerCompras

  Scenario: validação do sistemaAPI
    Given que seja acessado API "http://localhost:8080/user"
    When for validado o valor do campo name seja igual a "Tone"
    Then efetuado o teste de contrato ou Schema