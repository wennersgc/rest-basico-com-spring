# Projeto de uma API básica usando Spring Boot, Banco de dados em memória H2
## Rotas:

### verbo HTTP: GET
#### localhost:8080/api/jedi
Lista todos os Jedis

### verbo HTTP: GET
#### localhost:8080/api/jedi/{id}
Retorna o jedi com o ID especicificado

### verbo HTTP: POST
#### localhost:8080/api/jedi
Para criar um jedi, passar um Json nod Body com as seguintes informações:
{
  "name": "nome do jedi",
  "lastName": "sobrenome do jedi"
}

### verbo HTTP: PUT
#### localhost:8080/api/jedi/{id}
Para atualizar o jedi com o ID especificado, passar um Json no Body com as informações a serem atualizados:
{
  "name": "nome do jedi",
  "lastName": "sobrenome do jedi"
}

### verbo HTTP: DELETE
####  localhost:8080/api/jedi/{id}
Remove o jedi com o ID especificada na URL





