# Aula 21 - Programação Orientada a Objetos

> Aula 15/02 e 17/02/2022
> 
>  * Orientação a Objetos - Padrões de Projeto*

## Atividades da aula - roteiro
- 

### Conteúdo
- [Conceitos de Programação Orientada a Objetos](Conteudo_POO.pdf)


### Pilares da O.O.:
#### Abstração
#### Encapsulamento
#### Herança/Relações
#### Polimorfismo


### Princípios da O.O.:
#### S O L I D 
O que é SOLID?
SOLID é um acrônimo criado por Michael Feathers, após observar que cinco princípios da orientação a objetos e design de código — Criados por Robert C. Martin (a.k.a. Uncle Bob) e abordados no artigo The Principles of OOD — poderiam se encaixar nesta palavra.


S.O.L.I.D: Os 5 princípios da POO
##### S — Single Responsiblity Principle (Princípio da responsabilidade única)

##### O — Open-Closed Principle (Princípio Aberto-Fechado)

##### L — Liskov Substitution Principle (Princípio da substituição de Liskov)

##### I — Interface Segregation Principle (Princípio da Segregação da Interface)

##### D — Dependency Inversion Principle (Princípio da inversão da dependência)


Esses princípios ajudam o programador a escrever códigos mais limpos, separando responsabilidades, diminuindo acoplamentos, facilitando na refatoração e estimulando o reaproveitamento do código.

1. SRP — Single Responsibility Principle:
Princípio da Responsabilidade Única — Uma classe deve ter um, e somente um, motivo para mudar.
Esse princípio declara que uma classe deve ser especializada em um único assunto e possuir apenas uma responsabilidade dentro do software, ou seja, a classe deve ter uma única tarefa ou ação para executar.
Quando estamos aprendendo programação orientada a objetos, sem sabermos, damos a uma classe mais de uma responsabilidade e acabamos criando classes que fazem de tudo — God Class*. Num primeiro momento isso pode parecer eficiente, mas como as responsabilidades acabam se misturando, quando há necessidade de realizar alterações nessa classe, será difícil modificar uma dessas responsabilidades sem comprometer as outras. Toda alteração acaba sendo introduzida com um certo nível de incerteza em nosso sistema — principalmente se não existirem testes automatizados!

*God Class — Classe Deus: Na programação orientada a objetos, é uma classe que sabe demais ou faz demais.
Nota: Os exemplos desse artigo foram escritos usando a linguagem PHP, porém, são facilmente compreendidos por qualquer pessoa que já teve contato com programação orientada a objetos, independente da linguagem.

A violação do Single Responsibility Principle pode gerar alguns problemas, sendo eles:
Falta de coesão — uma classe não deve assumir responsabilidades que não são suas;
Alto acoplamento — Mais responsabilidades geram um maior nível de dependências, deixando o sistema engessado e frágil para alterações;
Dificuldades na implementação de testes automatizados — É difícil de “mockar” esse tipo de classe;
Dificuldades para reaproveitar o código;


2. OCP — Open-Closed Principle:
Princípio Aberto-Fechado — Objetos ou entidades devem estar abertos para extensão, mas fechados para modificação, ou seja, quando novos comportamentos e recursos precisam ser adicionados no software, devemos estender e não alterar o código fonte original.

3. LSP— Liskov Substitution Principle:
Princípio da substituição de Liskov — Uma classe derivada deve ser substituível por sua classe base.
O princípio da substituição de Liskov foi introduzido por Barbara Liskov em sua conferência “Data abstraction” em 1987. A definição formal de Liskov diz que:
Se para cada objeto o1 do tipo S há um objeto o2 do tipo T de forma que, para todos os programas P definidos em termos de T, o comportamento de P é inalterado quando o1 é substituído por o2 então S é um subtipo de T
Um exemplo mais simples e de fácil compreensão dessa definição. Seria:
se S é um subtipo de T, então os objetos do tipo T, em um programa, podem ser substituídos pelos objetos de tipo S sem que seja necessário alterar as propriedades deste programa. — Wikipedia.

4. ISP — Interface Segregation Principle:
Princípio da Segregação da Interface — Uma classe não deve ser forçada a implementar interfaces e métodos que não irão utilizar.
Esse princípio basicamente diz que é melhor criar interfaces mais específicas ao invés de termos uma única interface genérica.

5. DIP — Dependency Inversion Principle:
Princípio da Inversão de Dependência — Dependa de abstrações e não de implementações.
De acordo com Uncle Bob, esse princípio pode ser definido da seguinte forma:
a. Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender da abstração.
b. Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.
No contexto da programação orientada a objetos, é comum que as pessoas confundam a Inversão de Dependência com a Injeção de Dependência, porém são coisas distintas, mas que relacionam entre si com um proposito em comum, deixar o código desacoplado.
Importante: Inversão de Dependência não é igual a Injeção de Dependência, fique ciente disso! A Inversão de Dependência é um princípio (Conceito) e a Injeção de Dependência é um padrão de projeto (Design Pattern).


Veja um artigo completo sobre SOLID (https://medium.com/desenvolvendo-com-paixao/o-que-%C3%A9-solid-o-guia-completo-para-voc%C3%AA-entender-os-5-princ%C3%ADpios-da-poo-2b937b3fc530#:~:text=SOLID%20s%C3%A3o%20cinco%20princ%C3%ADpios%20da,a%20qualquer%20linguagem%20de%20POO).

### Passo 1: Um exemplo simples de um Padrão de Projeto (SingleTom)
- [x]  Criando um Projeto para SingleTom
- [x]  Detalhar o padrão
- [ ]  Implementar

### Passo 2: Outro exemplo simples de um Padrão de Projeto (SingleTom)
- [x]  Criando um Projeto para SingleTom
- [x]  Detalhar o padrão
- [ ]  Implementar


[![Aulas no Youtube](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/blob/cb3e2ea9547f9ddc831277f07919c3e78451eb92/yt-icon.png)](https://www.youtube.com/channel/UCfO-aJxKLqau0TnL0AfNAvA)

####  Os vídeos abaixo mostram a implementação do programa

🥇:[![material complementar aula18](Capa_Videos_POO.png)]()
-
🥈:[![material complementar aula18](Capa_Videos_POO.png)]()



