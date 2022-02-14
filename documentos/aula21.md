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

![Captura de Tela 2022-02-14 às 12 00 29](https://user-images.githubusercontent.com/81576640/153888505-a812c9fc-7aba-433d-9831-bcd366af55c5.png)



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



