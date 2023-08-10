# Aula 14 - Programação Orientada a Objetos

> Aula 10/08/2023
> 
>  * Orientação a Objetos - Interfaces Gráficas. *

## Atividades da aula - roteiro
- Abstração
- Classes
- Objetos
- Herança
- Componentes Gráficos (Cadastro Completo - Uso de um ORM)

## Exemplo de Aplicação 
![Captura de Tela 2021-11-24 às 09 29 53](https://user-images.githubusercontent.com/81576640/143238724-3b06e700-7839-4660-a71e-bfea8b3060e1.png)




### Conteúdo
- [Conceitos de Programação Orientada a Objetos](Conteudo_POO.pdf)
- [Conceitos de Desenvolvimento de Aplicações](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/blob/c538408f813e12bb046aeddaf8ae0d15d8277fff/documentos/Conte%C3%BAdo_Aula_DSW_M%C3%B3dulo_I.pdf)


### Passo 1: Aplicação Completa (Controle de Clientes)
- [ ]  Conceito => CRUD - Create / Retrieve / Update / Delete
- [ ]  Conceito => Data Source (Base de Dados)
- [ ]  Camada => DAO - Data Access Object
- [ ]  Especificação => JPA (Java Persistence Application)
- [ ]  Conceito => ORM (Object-Relational Mapping)  
- [ ]  Criar uma Base de Dados - Database (ConClientes)
- [ ]  Criar uma Tabela - Table (cliente)

- [x]  Detalhamentos ou passo a passo
  - [x]  Estruturar o projeto em pastas/pacotes (DAO - MODEL - VIEW - EXCEPTIONS)
  - [x]  Criar uma base de dados (usar MySQL - Workbench) - BDClientesX
    - [ ]  Criar uma tabela de clientes (código com autoincremento e nome) - Clientes
  - [x]  Criar uma estrutura de persistência usando a IDE NetBeans (Entity Class from DataBase) 
    - [ ]  Usar os pacotes para criação do driver (mysql-connector-java-8.0.11.jar e protobuf-java-2.6.0.jar)
  - [ ]  Adicionar os pacotes na lista de bibliotecas necessárias - Libraries - "add jar/folder" (mysql-connector-java-8.0.11.jar e protobuf-java-2.6.0.jar)    
  - [ ]  Adicionar na camada DAO um controlador JPA - "new Persistence - JPA Controller Classes from Entity Classes"
  - [ ]  Fazer o primeiro teste com a inserção de um objeto/registro

- [x]  Enviar para o GitHub (ConClientes) 


[![Aulas no Youtube](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/blob/cb3e2ea9547f9ddc831277f07919c3e78451eb92/yt-icon.png)](https://www.youtube.com/channel/UCfO-aJxKLqau0TnL0AfNAvA)

####  Os vídeos abaixo mostram a implementação do programa

🥇:[![material complementar aula14](Capa_Videos_POO.png)](https://www.youtube.com/watch?v=wj8PfC--6ME)
-
🥈:[![material complementar aula14](Capa_Videos_POO.png)](https://www.youtube.com/watch?v=j49St1FJW2w)
-
🥈:[![material complementar aula14](Capa_Videos_POO.png)](https://www.youtube.com/watch?v=DJU-Z8cjYjw)


## Uma outra abordagem com IntelliJ Idea

### Passos: Aplicação Completa (Controle de Clientes)
- [X]  Novo Projeto - Opção Jakarta EE
  - [ ]  Opções importantes - Template: Library - Language: Java - Build: Maven (... next)
  - [ ]  Outras opções - Specifications: Persistence (JPA) - Implementations: Hibernate (... create)
  - [ ]  Estrutura (maven) primária criada: .idea .mvn .src ... pom.xml (arquivo de dependências e configurações)
- [X]  Inserir no arquivo pom.xml a dependência para o MySQL (mysql-connector-j) - Sincronizar
- [X]  Abrir janela de Persistência (Control+Shift+A) - Persistence
- [X]  Apropriar-se do arquivo default (clicar opção c3 mouse - new Entity)
- [X]  Criar a classe (Cliente) e o pacote (Model)
- [X]  Criar na classe os atributos (codigo: int, nome: string, email: string)
- [X]  Criar os contrutores, getters/setters, toString, hashCode e Equals
- [X]  Criar uma classe principal (para testes e verificar a criação dos objetos e entidades no banco de dados)
- [X]  Configurar na janela "Persistence" o arquivo "persistence.xml" colocando os parâmetros para criação do Schema/DataBase - vide código
- [X]  Criar código para testar a persistência da classe/entidade (Cliente) - vide código abaixo EntityManager e EntityManagerFactory
- [X]  Rodar a aplicação - Usar o DBBrowser do IntelliJ (instalar caso não esteja instalado)
- [X]  Verificar se foi criado o Database - Tabela - Registros
- [ ]  Criar um pacote View - criar uma Swing UI Designer - GUI Form (CadClientes)
- [ ]  


#### Parâmetros para acesso e criação do banco de dados
```
<properties>
  <property name="jakarta.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver" />
  <property name="jakarta.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/CadCli?createDatabaseIfNotExist=true" />
  <property name="jakarta.persistence.jdbc.user" value="root" />
  <property name="jakarta.persistence.jdbc.password" value="coswagsql" />
  <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL8Dialect" />
  <property name="jakarta.persistence.schema-generation.database.action" value="drop-and-create"/>
</properties>
```

#### Código para persistir entidade no banco de dados
```
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(cliente);
    em.getTransaction().commit();
    em.close();
    emf.close();
```




