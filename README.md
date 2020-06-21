### Projeto de uma API básica usando Spring Boot, Banco de dados em memória H2
#### Rotas:
**localhost:8080/api/jedi
verbo HTTP: GET
Lista todos os Jedis**

**localhost:8080/api/jedi/{id}
verbo HTTP: GET
Retorna o jedi com o ID especicificado**

**localhost:8080/api/jedi
verbo HTTP: POST
Para criar um jedi, passar um Json nod Body com as seguintes informações:
{
  "name": "nome do jedi",
  "lastName": "sobrenome do jedi"
}**

**localhost:8080/api/jedi/{id}
verbo HTTP: PUT
Para atualizar o jedi com o ID especificado, passar um Json no Body com as informações a serem atualizados:
{
  "name": "nome do jedi",
  "lastName": "sobrenome do jedi"
}**

**localhost:8080/api/jedi/{id}
verbo HTTP: DELETE
Remove o jedi com o ID especificada na URL**





