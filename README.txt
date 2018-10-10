Para executar a aplicação basta seguir as seguintes instruções.

1) baixar ou fazer download no github em "https://github.com/asbruno/desafio-solutis.git" das pastas "api-rest" e "front-end-angular".

2) API - REST 
Depois de realizar o download ou de baixar a pasta "api-rest", só precisa ir ao console "cmd"
e dentro da pasta "api-rest" executar "java -jar api-rest", com isso o servidor e a aplicação RESTful 
irá iniciar.

Para testar a aplicação rest basta digitar em um navegador o endereço "http://localhost:8080/analise/listagem"
e a resposta deverá ser um JSON, conforme abaixo:
[{"string":"aAbBABacafe","vogal":"e","tempoTotal":10},{"string":"aAbBABiacafe","vogal":"i","tempoTotal":156}]

3) Front-End
3.a) Depois de baixar a pasta "front-end-angular", será necessario ter instalado em sua máquina o "node js", pode ser baixado em "https://nodejs.org/en/download/"
3.b) Já com "node js" instalado, deve-se abrir o console "cmd" e dentro da pasta "front-end-angular" executar "npm install"
3.c) Por fim, o comando "npm start", este último inicia o servidor e a aplicação front-end.
3.d) Em um navegador, preferenciamente o Firefox ou Chrome, acesse "http:/localhost:4200"




