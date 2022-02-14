# Aula 21 - Programação Orientada a Objetos

> Aula 15/02 e 17/02/2022
> 
>  * Orientação a Objetos - Padrões de Projeto*

## Atividades da aula - roteiro
- 

### Conteúdo
- [Conceitos de Programação Orientada a Objetos](Conteudo_POO.pdf)
- [Aula03-Design Patterns.pdf](https://github.com/marcoswagner-commits/aulapoo/files/8061296/Aula03-Design.Patterns.pdf)



### Pilares da O.O.:
Abstração

Encapsulamento

Herança/Relações

Polimorfismo


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


Veja um artigo completo sobre SOLID - [Artigo S O L I D](https://medium.com/desenvolvendo-com-paixao/o-que-%C3%A9-solid-o-guia-completo-para-voc%C3%AA-entender-os-5-princ%C3%ADpios-da-poo-2b937b3fc530#:~:text=SOLID%20s%C3%A3o%20cinco%20princ%C3%ADpios%20da,a%20qualquer%20linguagem%20de%20POO).


### PADRÕES DE PROJETO
Padrões de projeto podem ser vistos como uma solução que já foi testada para um problema. Desta forma, um padrão de projeto geralmente descreve uma solução ou uma instância da solução que foi utilizada para resolver um problema específico. Padrões de projetos  são soluções para problemas que alguém um dia teve e resolveu aplicando um modelo que foi documentado e que você pode adaptar integralmente ou de acordo com necessidade de sua solução.

#### Em geral, um padrão tem quatro elementos essenciais:
1 – Nome do padrão: é uma referência que podemos usar para descrever um problema de projeto, suas soluções e consequências em uma ou duas palavras.
2 – O problema: explica o problema e seu contexto.
3 – A solução: descreve os elementos que compõem o projeto, seus relacionamentos, suas responsabilidades e colaborações.
4 – As conseqüências: resultados e análises das vantagens e desvantagens (trades-off) da aplicação do padrão.
Podemos considerar que a idéia original de Design Patterns surgiu com Christopher Alexander (Engenheiro Civil) quando ele propôs a criação de catálogos de padrões para arquitetura no ano de 1978. 
Com a palavra Christopher Alexander :
"Um padrão descreve um problema que ocorre inúmeras vezes em determinado contexto, e descreve ainda a solução para esse problema, de modo que essa solução possa ser utilizada sistematicamente em distintas situações."


####  Descrevendo os padrões de projeto
As notações gráficas, embora sejam importantes e úteis, não são suficientes. Elas simplesmente capturam o produto final do processo de projeto como relacionamentos entre classes e objetos. Para reutilizar o projeto, nós devemos registrar decisões, alternativas e análises de custos e benefícios que levaram a ele. Também são importantes exemplos concretos, porque ajudam a ver o projeto em ação.
Nós descrevemos padrões de projeto usando um formato consistente. Cada padrão é dividido em seções de acordo com o gabarito a seguir. O gabarito fornece uma estrutura uniforme às informações, tornando os padrões de projeto mais fáceis de aprender, comparar e usar:

1. Nome e classificação do padrão
2. Intenção e objetivo
3. Também conhecido como
4. Motivação
5. Aplicabilidade
6. Estrutura
7. Participantes
8. Colaborações
9. Consequencias
10.  Implementação
11.  Exemplo de código
12.  Usos conhecidos
13.  Padrões relacionados

####  Principais propriedades dos padrões de projetos

Dentre as principais propriedades dos padrões de projetos podemos citar:
1. Capturam o conhecimento e a experiência de especialistas em projeto de software.
2. Especificam abstrações que estão acima do nível de classes ou objetos isolados ou de componentes.
3. Definem um vocabulário comum para a discussão de problemas e soluções de projeto.
4. Facilitam a documentação e manutenção da arquitetura do software.
5. Auxiliam o projeto de uma arquitetura com determinadas propriedades.
6. Auxiliam o projeto de arquiteturas mais complexas.

####  Quando e como utilizar padrões de projetos
A primeira coisa que você tem que ter é bom senso. Faça a sua parte, implemente sua solução e veja se ela funciona. A seguir verifique se ela pode ser otimizada, se for o caso utilize o padrão de projeto que se ajusta ao seu caso para melhorar as deficiências verificadas no seu projeto.
Naturalmente isto será tão mais fácil se você tiver uma visão global do seu projeto e seu funcionamento.

Os padrões de projeto não são uma varinha mágica que vai tornar o seu projeto isento de falhas. Se for mal implementado eles podem até diminuir a compreensão do seu projeto e aumentar a quantidade de código. Portanto padrões de projeto não resolvem todos os problemas de design de projetos.
Os componentes de um padrão de projeto são :
1- Nome - descreve a essência do padrão.
2- Objetivo - descreve como o padrão atua.
3- Problema - descreve o problema.
4- Solução - descreve a solução.
5- Conseqüências - descreve os benefícios da utilização do padrão.
Requisitos de um bom sistema de padrões:
O sistema deve conter uma boa quantidade de padrões. A descrição dos padrões deve seguir um formato padronizado. O sistema deve ser estruturado, organizando os padrões seguindo critérios bem definidos.
Existem 23 padrões divididos em: Criação, Estruturais e Comportamentais.

![padroes_projeto](https://user-images.githubusercontent.com/81576640/153916660-e78e627f-8615-4859-93fb-65ac5c421d80.png)

### Livro Referência
![Captura de Tela 2022-02-14 às 14 29 31](https://user-images.githubusercontent.com/81576640/153916757-41e0c3ef-19f6-46cd-8108-b7356a760e0e.png)

Veja um artigo completo sobre Padrões de Projeto - [Design Patterns](https://www.devmedia.com.br/conheca-os-padroes-de-projeto/957)


### Passo 1: Um exemplo simples de um Padrão de Projeto (Singleton)
- [x]  Criando um Projeto para Singleton
- [x]  Detalhar o padrão
- [ ]  Implementar

#### Singleton
Motivação: algumas classes devem ser instanciadas uma única vez:

    - Um spooler de impressão
    - Um sistema de arquivos
    - Um Window manager
    - Um objeto que contém a configuração do programa
    - Um ponto de acesso ao banco de dados

Obstáculo: a definição de uma variável global deixa a instância (objeto) acessível mas não inibe a instanciação múltipla.
Como assegurar que somente uma instância de uma classe seja criada para toda a aplicação?

Intenção: garantir que uma classe tem apenas uma instância, e prover um ponto de acesso global a ela;

Solução: fazer com que a própria classe seja responsável pela manutenção da instância única, de tal forma que:

    - Quando a instância for requisitada pela primeira vez, essa instância deve ser criada;
    - Em requisições subseqüentes, a instância criada na primeira vez é retornada.
    - A classe Singleton deve:

        - armazenar a única instância existente;
        - garantir que apenas uma instância será criada;
        - prover acesso a tal instância.
        

### Passo 2: Outro exemplo simples de um Padrão de Projeto (Strategy e Template Method)
- [x]  Criando um Projeto para Strategy e Template Method
- [x]  Detalhar o padrão
- [ ]  Implementar

#### Strategy
Intenção
Criar uma Strategy para cada variante e fazer com que o método delegue o algoritmo para uma instância de Strategy.

- Outros nomes dado ao Padrão
Policy e Motivação

A lógica condicional é uma das estruturas mais complexas e utilizadas no desenvolvimento de softwares corporativos. Lógicas condicionais tendem a crescer e tornar-se cada vez mais sofisticadas, maiores e mais difíceis de manter com o passar do tempo. O padrão Strategy ajuda a gerenciar toda essa complexidade imposta pelas lógicas condicionais. O Padrão Strategy sugere que se produza uma família de classes para cada variação do algoritmo e que se forneça para a classe hospedeira uma instância de Strategy para a qual ela delegará em tempo de execução. Um dos pré-requisitos para o Strategy é uma estrutura de herança onde cada subclasse específica contém uma variação do algoritmo. Assim, o padrão Strategy possui diversos benefícios como clarificar algoritmos ao diminuir ou remover lógica condicional, simplificar uma classe ao mover variações de um algoritmo para uma hierarquia, e habilitar um algoritmo para ser substituído por outro em tempo de execução.

Aplicabilidade

Em resumo o padrão Strategy pode ser utilizado quando se tem as seguintes situações:

Quando muitas classes relacionadas diferem apenas no seu comportamento;

Quando necessita-se de variantes de um algoritmo;

Quando se precisa ocultar do usuário a exposição das estruturas de dados complexas, específicas do algoritmo;

Quando uma classe define muitos comportamentos e por sua vez eles aparecem como diversos “IFs”. Com isso esses comandos condicionais são movidos para sua própria classe Strategy.

Estrutura do Padrão
![Captura de Tela 2022-02-14 às 15 39 32](https://user-images.githubusercontent.com/81576640/153925878-647ada22-d7ca-4650-b911-3038f8d30dc9.png)



#### Template Method
Definir o esqueleto de um algoritmo em uma operação, postergando (deferring) alguns passos para subclasses. Template Method (gabarito de método) permite que subclasses redefinam certos passos de um algoritmo sem mudar a estrutura dele.

Agora imagine que você tenha de construir uma aplicação que possui uma determinada função da qual só é de conhecimento o algoritmo de execução, e o trabalho de codificação para realização da operação possa ser postergado. Observe a Figura 5.

Estrutura do padrão

![Captura de Tela 2022-02-14 às 15 41 41](https://user-images.githubusercontent.com/81576640/153926203-4e456ac7-8082-46fb-9849-9f4a5fa9b4b8.png)


Sobre a aplicabilidade desse padrão temos:

Para implementar as partes invariantes de um algoritmo e deixar para subclasses a implementação da parte variante;
Para fatorar o comportamento semelhante entre subclasses numa superclasse evitando-se assim a duplicação de código;
Para controlar extensões de classes com métodos "gancho";

Seus participantes são:

AbstractClass – define as operações primitivas e abstratas que representam os passos de um algoritmo e implementa um método que invoca estas operações primitivas;
ConcreteClass – implementa as operações específicas definidas na superclasse com o código específico.
Os métodos template são uma técnica fundamental para a reutilização de código. Eles conduzem a uma estrutura de inversão de controle em inglês Inversion of Control IoC ou princípio da dependência inversa, comumente conhecida como “o princípio de Hollywood”, ou seja: “não nos chame, nós chamaremos você”. Isto se refere a como uma classe-mãe chama as operações de uma subclasse, e não o contrário.

[![Aulas no Youtube](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/blob/cb3e2ea9547f9ddc831277f07919c3e78451eb92/yt-icon.png)](https://www.youtube.com/channel/UCfO-aJxKLqau0TnL0AfNAvA)

####  Os vídeos abaixo mostram a implementação do programa

🥇:[![material complementar aula18](Capa_Videos_POO.png)](https://www.youtube.com/watch?v=as2xYdNm2ao)
-
🥈:[![material complementar aula18](Capa_Videos_POO.png)]()



