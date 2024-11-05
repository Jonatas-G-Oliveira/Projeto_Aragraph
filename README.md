

# RESULTADOS
- A aplicação esta configurada para conectar e trabalhar com um banco mongoDB
- A API faz busca para taxon e nome comum
- A API retorna um unico item para as busca

# Como testar?
 - Iniciar a aplicação Spring no Java
 - Testar:
 - http://localhost:8080/swagger-ui
 - (Não vai funcionar agora porque estou usando localmente)

# DUVIDAS 
- Porque o arquivo tem dois ID's diferentes(gera conflito na busca)
- Como retornar uma lista de objetos(tem que usar Page?)
- Como conectar a um banco externo

# MELHORIAS
- Implementar excessões
- Implementar os utros métodos GET
- Fazer os métodos retornarem lista de JSON
