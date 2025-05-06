@testesWeb
Feature: Teste Automacao
  Aula do modulo 3

  Scenario: Validar se o botao pesquisar esta funcionando corretamente
    Given que eu acesse o site do Google
    When eu digitar o texto automacao de testes
    And clicar no botao Pesquisar
    Then deve aparecer a tela com a lista de pesquisas encontradas no Google