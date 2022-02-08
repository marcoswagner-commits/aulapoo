# Aula 20/21/22/23/24 - Programação Orientada a Objetos

> Aula 27/01, 01/02, 03/02, 08/02, 10/02
> 
>  * Orientação a Objetos - ORM - Desenvolvimento de Aplicações WEB *

- [Conteúdo do Curso](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/documentos/documentos/Conteúdo_Aula_DSW_Módulo_I.pdf)
- [Repositório específico dos códigos](https://github.com/marcoswagner-commits/aula_complementar.git)

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
Github – http://www.github.com - [Repositório GitHub](https://github.com/marcoswagner-commits/aula_complementar)

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

### Passos específicos para criar um "Modelo de Domínio":
1. Verificar os atributos básicos
2. Verificar as associações/relações
3. Construtores
4. Getters/Setters
5. HashCode e Equals
6. Serializable
7. Anotações ORM

- [Modelo de Camadas](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/blob/c538408f813e12bb046aeddaf8ae0d15d8277fff/documentos/modelo_camadas.png)

### Incluir os primeiros códigos, :+1: ainda sem criar nenhuma classe ou pacote, usando o arquivo principal:

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
spring.datasource.url=jdbc:mysql://localhost:3306/aula_orm?createDatabaseIfNotExist=true&serverTimezone=UTC
spring.datasource.username=aula
spring.datasource.password=class 

# H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

spring.datasource.url=jdbc:h2:file:˜/teste // ou // spring.datasource.url=jdbc:h2:mem:teste
spring.datasource.username=teste
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver


#JPA
spring.jpa.hibernate.ddl-auto= update
spring.jpa.show-sql= true
spring.jpa.open-in-view= true
```

:shipit: Modelos
```
////// Entidade Pessoa
package com.marcos.aulapoo.orm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="PESSOAS")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pessoa_id")
	private Integer id;
	
	@Column(name="nome_pessoa", nullable = false)
	private String nome;
	
	@Column(name="email_pessoa", nullable = false)
	private String email;
	
	public Pessoa() {
		
	}

	public Pessoa(Integer id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}

////// Entidade Aluno
package com.marcos.aulapoo.orm.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="ALUNOS")
public class Aluno extends Pessoa {
	
	@Column(nullable = false, unique = true)
	private String matricula;
	
	@Column(nullable = false)
	private String curso;
	
	@ManyToMany(mappedBy = "alunos")
	
	private List<Disciplina> disciplinas = new ArrayList<>();
	
	public Aluno() {
		
	}

	public Aluno(Integer id, String nome, String email, String matricula, String curso) {
		super(id,nome,email);
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", curso=" + curso + "]";
	}
}


////// Entidade Disciplina
package com.marcos.aulapoo.orm.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="DISCIPLINAS")
public class Disciplina {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="disciplina_id")
	private Integer id;
	
	@Column(name="nome_disciplina", nullable = false)
	private String nome;
	
	private Integer carga_horaria;
	
	@ManyToMany
	@JoinTable(name="DISCIPLINAS_ALUNOS", 
	           joinColumns = @JoinColumn(name="disciplina_id"),
	           inverseJoinColumns = @JoinColumn(name="aluno_id"))
	@JsonIgnore
	private List<Aluno> alunos = new ArrayList<>();
	
	public Disciplina() {
		
	}

	public Disciplina(Integer id, String nome, Integer carga_horaria) {
		super();
		this.id = id;
		this.nome = nome;
		this.carga_horaria = carga_horaria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCarga_horaria() {
		return carga_horaria;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public void setCarga_horaria(Integer carga_horaria) {
		this.carga_horaria = carga_horaria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
```

:shipit: Repositórios
```
////// Repositório Aluno
package com.marcos.aulapoo.orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.aulapoo.orm.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

}

////// Repositório Disciplina
package com.marcos.aulapoo.orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.aulapoo.orm.model.Disciplina;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer>{

}

```


:shipit: Controladores
```
////// Controller Aluno
package com.marcos.aulapoo.orm.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.marcos.aulapoo.orm.model.Aluno;
import com.marcos.aulapoo.orm.repository.AlunoRepository;

@RestController
@RequestMapping(value="/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;
	
	@GetMapping
	public List<Aluno> listar(){
		List<Aluno> list = repository.findAll();
		return list;	
	}
	
	@GetMapping(value="/{id}")
	public Aluno listarUm (@PathVariable Integer id){
		Optional<Aluno> obj = repository.findById(id);
		return obj.orElse(null);	
	}
	
	@PostMapping
	public ResponseEntity<Void> inserir (@RequestBody Aluno obj) {
		obj = repository.save(obj);
		URI uri = ServletUriComponentsBuilder
				.fromCurrentContextPath().path("{}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<Void> atualizar(@RequestBody Aluno obj, @PathVariable Integer id) {
		Optional<Aluno> objF = repository.findById(id);
		objF.get().setNome(obj.getNome());
		objF.get().setEmail(obj.getEmail());
		objF.get().setMatricula(obj.getMatricula());
		objF.get().setCurso(obj.getCurso());
		obj = repository.save(objF.get());
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Void> excluir(@PathVariable Integer id) {
		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	

}

////// Controller Disciplina
package com.marcos.aulapoo.orm.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.marcos.aulapoo.orm.model.Disciplina;
import com.marcos.aulapoo.orm.repository.DisciplinaRepository;

@RestController
@RequestMapping(value="/disciplinas")
public class DisciplinaController {
	
	@Autowired
	private DisciplinaRepository repository;
	
	@GetMapping
	public List<Disciplina> listar(){
		List<Disciplina> list = repository.findAll();
		return list;	
	}
	
	@GetMapping(value="/{id}")
	public Disciplina listarUm (@PathVariable Integer id){
		Optional<Disciplina> obj = repository.findById(id);
		return obj.orElse(null);	
	}
	
	@PostMapping
	public ResponseEntity<Void> inserir (@RequestBody Disciplina obj) {
		obj = repository.save(obj);
		URI uri = ServletUriComponentsBuilder
				.fromCurrentContextPath().path("{}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<Void> atualizar(@RequestBody Disciplina obj, @PathVariable Integer id) {
		Optional<Disciplina> objF = repository.findById(id);
		objF.get().setNome(obj.getNome());
		objF.get().setCarga_horaria(obj.getCarga_horaria());
		obj = repository.save(objF.get());
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Void> excluir(@PathVariable Integer id) {
		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	
	

}

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






