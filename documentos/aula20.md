# Aula 20/21/22/23/24 - Programação Orientada a Objetos

> Aula 27/01, 01/02, 03/02, 08/02, 10/02
> 
>  * Orientação a Objetos - ORM - Desenvolvimento de Aplicações WEB *

- [Conteúdo do Curso](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/documentos/documentos/Conteúdo_Aula_DSW_Módulo_I.pdf)

## Atividades da aula - roteiro
### 1 Conteúdos
1.1.1. API 

1.1.2. REST 

1.1.3. Protocolo HTTP

1.1.4. Ecossistema Spring

1.1.5. O padrão MVC

1.1.6. ORM

1.1.7. Camadas 

1.1.8. Segurança

1.1.9. Consumo de APIs

1.1.10. Frontend

1.1.11. React

1.1.12. Aplicação e repositórios na nuvem

### 2  - Ferramentas e recursos

#### Ferramentas:
Java – https://www.oracle.com/technetwork/java/javase/downloads 

Maven  - https://maven.apache.org 

STS - Spring Tool Suit (Eclipse / Maven / Tomcat / Jackson / JPA): https://spring.io/tools

MySQL (Workbench) – https://dev.mysql.com/downloads/workbench

Postman – https://www.getpostaman.com

Git (gitdesktop) – https://git-scm.com/downloads

Visual Studio Code - https://code.visualstudio.com/download 

Outras instalações necessárias: node, npm, yarn e outros...

#### Contas:
Github – http://www.github.com - [Repositório GitHub] (github.com/marcoswagner-commits/aula_complementar)

Heroku – www.heroku.com 

Netlify – http://www.netlify.com 

Draw.IO - https://app.diagrams.net 


### Conteúdo
- [Conceitos de Programação Orientada a Objetos](Conteudo_POO.pdf)


### Passo 1: Aplicação Simples com um EndPoint

- Conceituar Ecossistema SPRING - [Conteúdo do Curso](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/documentos/documentos/Conteúdo_Aula_DSW_Módulo_I.pdf)
- Importância do Spring Boot 
- Acessar o site Spring.io (https://spring.io) e verificar outros projetos existentes

### Ferramenta de implementação ([Vide - Ferramentas])

- [x] Abrir a Ferramenta STS4 (Spring Tool Suite)
- [x] Criar um novo Projeto (File - New - Spring Starter Project)
- [x] Primeira janela: 
(Service URL: spring.io -  Name/Artfact: testeAula1 - Type: Maven - Java Version: 11 - Packaging: Jar - Group/Package: br.edu.ufj - Description: Primeiro teste para Aula DAW)
- [x] Segunda janela: 
(Versão do Spring Boot: 2.4.5 - Starters: Spring WEB; Spring Data)

### Modelo Conceitual:
Descrição: O sistema (mini sistema com poucas classes) terá como premissa permitir que seja cadastrado um aluno do tipo pessoa e que este aluno possa ser vinculado a diversas disciplinas e que uma disciplina possa ter vários alunos.
![image](https://user-images.githubusercontent.com/81576640/150136748-5049fcc5-a062-4b06-bcb6-170835c16df8.png)


### Passos Gerais:
1. Criar o modelo conceitual no DrawIO usando um Diagrama de Classes Simplificado! 
2. Verificar o funcionamento do SGBD (MySQL - Workbench)
3. Criar projeto no GitHub (aula_complementar)
4. Criar projeto no STS4 (Spring Starter Project - Seguir check-list próprio)
5. Fazer o primeiro commit


### Passos específicos (STS4 com o Spring Boot):
1. Definir dependências iniciais (Spring Web; Spring Data JPA; SpringBoot DevTools; MySQL Driver)
2. Configurar o arquivo application.properties (banco de dados MySQL ou H2)
3. Construir o primeiro controller apenas para testar o container TomCat
4. Configurar o acesso ao banco de dados – usuário e senha

### Passos detalhados
1. Verificar a estrutura de arquivos do projeto
2. Compilar (run) a aplicação 
3. Adicionar a dependência H2, caso ainda não seja usado o MySQL, pois já foi informada a dependência Spring Data
4. Analisar primariamente o Project Object Model (pom.xml)
5. Fazer os primeiros testes com dois clientes (navegador e PostMan) ([Roteiro - Ferramentas](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/main/README.md))

### Passo 6: Incluir os primeiros códigos, :+1: ainda sem criar nenhuma classe ou pacote, usando o arquivo principal:

:shipit:
```
@SpringBootApplication
@RestController
public class TesteAula1Application {

	public static void main(String[] args) {
		SpringApplication.run(TesteAula1Application.class, args);
	}
	
	@GetMapping("/auladaw")
	public String auladaw() {
		return "Olá turma de DAW!;
	}
}
```
### Alterar os primeiros códigos, :+1::
:shipit:
```
@SpringBootApplication
@RestController
public class TesteAula1Application {

	public static void main(String[] args) {
		SpringApplication.run(TesteAula1Application.class, args);
	}
	
	@GetMapping("/auladaw")
	public String auladaw(@RequestParam(value = "nome", defaultValue = "NOME") String nome) {
		return String.format("Olá turma de DAW, meu nome é %s",nome);
	}
}
```

:shipit:
```
# MYSQL
spring.datasource.url= jdbc:mysql://localhost:3306/aula
spring.datasource.username=aula
spring.datasource.password=class 

#JPA
spring.jpa.hibernate.ddl-auto= update
spring.jpa.show-sql= true
spring.jpa.open-in-view= true
```



### Conceituar API, REST, HTTP...


[![Aulas no Youtube](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/blob/cb3e2ea9547f9ddc831277f07919c3e78451eb92/yt-icon.png)](https://www.youtube.com/channel/UCfO-aJxKLqau0TnL0AfNAvA)

####  Os vídeos abaixo mostram a implementação do programa

🥇:[![material complementar aula20](Capa_Videos_POO.png)](https://youtu.be/MvfzRq_Y6AQ)

🥈:[![material complementar aula20](Capa_Videos_POO.png)](https://youtu.be/pCFSuWUOc3M)

🥇:[![material complementar aula20](Capa_Videos_POO.png)](https://youtu.be/n0HZSp-B4CY)

🥈:[![material complementar aula20](Capa_Videos_POO.png)](https://youtu.be/Bil3qN_QC6k)

🥇:[![material complementar aula20](Capa_Videos_POO.png)](https://youtu.be/EHF2T3kkHCw)

🥈:[![material complementar aula20](Capa_Videos_POO.png)](https://youtu.be/jYYQQQ06jMk)

🥇:[![material complementar aula20](Capa_Videos_POO.png)](https://youtu.be/jUNWZSQviRM)

🥈:[![material complementar aula20](Capa_Videos_POO.png)](https://youtu.be/SoCUgfqXW4g)

🥇:[![material complementar aula20](Capa_Videos_POO.png)](https://youtu.be/Ka_HWA7_zWU)






