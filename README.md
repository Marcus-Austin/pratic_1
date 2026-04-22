<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Aplicação de Estudo - Spring Security</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
            line-height: 1.6;
        }
        h1, h2, h3 {
            color: #2c3e50;
        }
        code {
            background-color: #f4f4f4;
            padding: 5px;
            display: block;
            margin: 10px 0;
        }
    </style>
</head>
<body>

<h1>Aplicação de Estudo - Spring Security</h1>

<h2>Sobre o Projeto</h2>
<p>
Este projeto foi desenvolvido com base nos três primeiros capítulos do livro 
<strong>Spring Security in Action</strong>, com foco nos conceitos básicos de segurança em aplicações Java.
</p>

<p>
A aplicação demonstra a configuração inicial do Spring Security, com autenticação básica e proteção de endpoints.
</p>

<h2>Objetivos</h2>
<ul>
    <li>Entender o funcionamento do Spring Security</li>
    <li>Configurar autenticação básica</li>
    <li>Proteger endpoints da aplicação</li>
</ul>

<h2>Tecnologias Utilizadas</h2>
<ul>
    <li>Java</li>
    <li>Spring Boot</li>
    <li>Spring Security</li>
    <li>Maven</li>
</ul>

<h2>Autenticação</h2>
<p>
A aplicação utiliza autenticação HTTP Basic, onde o usuário precisa informar login e senha para acessar os endpoints.
</p>

<code>
Usuário: user<br>
Senha: password
</code>

<h2>Proteção de Endpoint</h2>
<p>
O endpoint da aplicação foi configurado para permitir apenas requisições autenticadas com permissão de leitura (read).
</p>

<code>
@Bean<br>
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {<br>
&nbsp;&nbsp;http<br>
&nbsp;&nbsp;&nbsp;&nbsp;.authorizeHttpRequests(auth -> auth<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;.anyRequest().authenticated()<br>
&nbsp;&nbsp;&nbsp;&nbsp;)<br>
&nbsp;&nbsp;&nbsp;&nbsp;.httpBasic();<br><br>

&nbsp;&nbsp;return http.build();<br>
}
</code>

<h2>Execução</h2>

<code>
git clone &lt;url-do-repositorio&gt;<br>
cd nome-do-projeto<br>
mvn spring-boot:run
</code>

<p>Acesse:</p>

<code>
http://localhost:8080/
</code>

<h2>Autor</h2>
<p>Projeto desenvolvido por Marco como parte dos estudos em Spring Security.</p>

</body>
</html>
