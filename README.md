

# RESULTADOS
- A aplicação esta configurada para conectar e trabalhar com um banco mongoDB na CLOUD
- A API faz busca para taxon e nome comum
- API esta rodando na AWS em uma instancia ubuntu
- O front renderiza uma lista vinda da API
  
# Como testar?
- Voce pode testar todos os endpoints atraves da url do swagger
- http://44.200.204.104:8080/swagger-ui.html
- Ou acessar pelas rotas
- Padrão: http://44.200.204.104:8080/
- Pegar todas as aves: /aves/nome/todas
- Pegar aves por id: /aves/id/{numero_id}
- Pegar ave por familila: /aves/familia/{nome_familia}

# DUVIDAS 
- Pra rodar o servidor onde que a aplicação tem que estar?
- A instancia tem q rodar o comando mesmo quando eu for fechar o terminal
- Como adicionar um evento Hover pra mostrar uma informação

# MELHORIAS
- HTML e CSS estão muito pobres(versao de testes)
- Clicar na lista de passaros e mostrar um card
- Adicionar o card a a tela de visualizacao
