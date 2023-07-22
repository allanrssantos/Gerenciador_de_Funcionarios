# Gerenciador de Funcionários

Este projeto é um sistema de gerenciamento de funcionários, desenvolvido em Java com o framework Spring Boot. O objetivo é fornecer uma API RESTful que permite adicionar, atualizar, obter e excluir informações sobre funcionários.

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

1. Adicionar Funcionário: Permite adicionar informações sobre um novo funcionário ao sistema, como ID, nome, designação, salário, número de telefone e endereço.

2. Atualizar Funcionário: Permite atualizar as informações de um funcionário existente com base no seu ID. Os campos que podem ser atualizados incluem nome, designação, salário, número de telefone e endereço.

3. Obter Funcionário: Permite obter as informações de um funcionário específico com base no seu ID.

4. Excluir Funcionário: Permite excluir um funcionário do sistema com base no seu ID.

## Dependências

O projeto utiliza as seguintes dependências:

1. JUnit (versão 3.8.1): Framework de teste unitário para testar as classes e métodos do projeto.

2. Jackson Annotations (versão 2.15.1): Biblioteca para trabalhar com JSON em Java, usada para serialização e desserialização de objetos JSON.

3. Spring Boot Starter Web (versão 2.1.5.RELEASE): Starter do Spring Boot para construir aplicativos da web, que fornece um conjunto de componentes para criar uma API RESTful.

4. Springfox Swagger UI (versão 3.0.0): Biblioteca para gerar automaticamente a documentação da API usando o Swagger UI, que oferece uma interface interativa para explorar e testar a API.

5. Springfox Boot Starter (versão 3.0.0): Starter do Springfox para integrar o Swagger ao projeto Spring Boot, facilitando a configuração do Swagger na API.

## Considerações Finais

O projeto do Gerenciador de Funcionários utiliza as dependências mencionadas acima para implementar uma API RESTful completa, que permite gerenciar informações sobre os funcionários de forma eficiente e segura. Com o Swagger UI, os desenvolvedores têm acesso à documentação interativa da API, facilitando o desenvolvimento e teste dos endpoints disponíveis. O uso do Spring Boot simplifica a configuração do projeto, permitindo que os desenvolvedores se concentrem nas funcionalidades principais do sistema.
