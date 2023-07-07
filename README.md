<h2 align="center">DSList - Backend</h2>

  - A aplicação é uma coleção de jogos eletrônicos que permite aos usuários realizarem pesquisas e encontrar informações sobre diferentes jogos listados. As buscas podem ser realizadas com base no gênero e na classificação dos jogos. Além disso, possui a funcionalidade de reorganizar a lista de jogos de acordo com suas preferências.

  - ### Modelo Conceitual:

    ![image](https://github.com/marcosrebelo97/dslist-backend/assets/37541973/2dee92be-9be2-4b40-ad60-dddd1bfe3c01)

  - ### Padrão de Camadas:

    ![image](https://github.com/marcosrebelo97/dslist-backend/assets/37541973/532c5180-f13d-4ef0-8003-7e14639e6f0d)

  - ### Postman Collection (passo a passo):
  
     [![Run in Postman](https://run.pstmn.io/button.svg)](https://god.postman.co/run-collection/19986209-ccfc096a-da53-4a02-bf95-9c1e23085543?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D19986209-ccfc096a-da53-4a02-bf95-9c1e23085543%26entityType%3Dcollection%26workspaceId%3Df3ebd102-7eba-4911-8348-205a6bbb21c6#?env%5BDSList%5D=W3sia2V5IjoiaG9zdCIsInZhbHVlIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwIiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQifV0=)

  - ### Games Endpoints RESTs API:
    | Rest  | Request         | Função |
    |-------|-----------------| ------- |
    | GET   | Games           | Retorna a lista completa de jogos |
    | GET   | Game By ID      | Retorna as informações de um jogo específico com base no seu ID |
    | GET   | Games Lists     | Retorna os gêneros dos games disponíveis |
    | GET   | Games By Lists  | Retorna os jogos que pertencem a um gênero específico, com base no seu ID |
    | POST  | List Replacement  | Permite que o usuário organize a ordem da lista de jogos de acordo com sua preferência |

    > Obs: após a requisição **`List Replacement`** ser concluída corretamente, obtendo o código de resposta 200, é possível verificar no endpoint **`GET By Lists`** as alterações realizadas nas posições dos jogos na lista disponível.
    

## Tecnologias | Implantação em produção
  - Java (JDK 17)
  - Spring Boot
  - JPA / Hibernate
  - Maven
  - H2 Database
  - PostgreSQL
  - Ambiente local com Docker Compose
  - Processo de deploy: CI/CD
  - Implantação Back-end: Railway
  - Implantação Banco de Dados: PostgreSQL | DBeaver
