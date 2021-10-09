# Tarefa 4 - parcial
1. Característica importante de linguagens de programação é o suporte à
abstração. Há dois tipos de abstração: de processo e de dados. Discorra sobre
a associação entre o primeiro tipo e as linguagens estruturadas e o segundo
tipo e as linguagens orientadas a objetos.
Resposta:
    * Associação entre a abstração de processo e as linguagens estruturadas
        - O conceito de abstração de processo está entre os mais antigos no
        projeto de linguagens de programação. Todos os subprogramas são abstrações
        de processo, porque fornecem uma maneira pela qual um programa
        especifica um processo, sem fornecer os detalhes de como ele realiza
        sua tarefa, ao menos no programa chamador.
        - Neste contexto, a programação estruturada consiste em módulos bem
        estruturados e separados. O usuário pode criar suas próprias funções
        definidas pelo usuário. É um subconjunto da programação procedural.
        Os programas são divididos em pequenos programas ou funções. Trata-se
        de facilitar a criação de programas com código legível e componentes
        reutilizáveis.
        - As linguagens estruturadas dão suporte à organização, gerenciamento e
        codificação de programas que podem fornecer modificações e entendimento
        mais fáceis. Os subprogramas são escritos globalmente e as linhas de
        código são processadas uma a uma, ou seja, sequencialmente. Utiliza-se
        a abordagem “de cima para baixo”. Fornece menos flexibilidade e abstração
        em comparação com a POO.
        - Desta forma, linguagens estruturadas dão mais importância ao ao processo.
    * Associação entre a abstração de dados e as linguagens orientadas a objetos
        - A abstração de dados Impõe uma separação clara entre propriedades
        abstratas de um tipo de dados e os detalhes concretos de sua implementação.
        As propriedades abstratas são aquelas visíveis ao código do cliente que
        faz uso do tipo de dados (interface para o tipo de dados) enquanto que
        a implementação concreta é mantida inteiramente privada e, de fato,
        pode mudar.
        - As linguagens orientadas a objetos baseiam-se no conceito de objetos
        que contêm dados e processo. Os programas são divididos em objetos ou
        entidades. A criação de objetos geralmente contêm funções e dados.
        O principal objetivo é melhorar e aumentar a qualidade e a produtividade
        da análise e do projeto do sistema. Concentra-se em representar a
        estrutura e o comportamento do sistema de informação em módulos minúsculos
        ou pequenos que geralmente combinam dados e processos. Um conjunto de
        objetos pode variar dinamicamente e pode ser executado apenas por agir
        e ler um para o outro. Geralmente, segue a abordagem “Bottom-Up”.
        Fornece mais flexibilidade e abstração em comparação com a programação
        estruturada. É menos difícil modificar programas orientados a objetos e
        reutilizar código em comparação com programas estruturados.
        - Desta forma, linguagens orientadas a objetos são mais importância aos dados.



2. Explique o princípio da substituição.
Resposta:
        Uma linguagem suporta o princípio da substituição, se ela permite programas
    nos quais uma variável de uma classe pode ser substituída por uma variável
    de uma de suas classes ancestrais em qualquer situação, sem causar erros de
    tipo e sem alterar o comportamento do programa.

3. Analise as seguintes afirmativas
   [ ~F  ] a. Encapsulamento é a capacidade de uma operação atuar de modos
diversos em classes diferentes.
        * a capacidade de uma operação atuar de modos diversos em classes
        diferentes denomina-se Polimorfismo

   [  ~F ] b. Polimorfismo é o compartilhamento de atributos e métodos entre
classes com base em um relacionamento hierárquico.
        * compartilhamento de atributos e métodos entre classes com base em
        um relacionamento hierárquico denomina-se Herança.

   [  F ] c. Herança consiste no processo de ocultação dos detalhes internos de
implementação de um objeto.
        * processo de ocultação dos detalhes internos de implementação de um
        objeto denomina-se Encapsulamento.

   [ V ] d. Sobreposição é a redefinição das funções de um método herdado.
Os métodos apresentam assinaturas iguais.

   [ F ] e. Em Java, todos os métodos numa classe abstrata devem ser declarados
como abstratos.
        * Uma classe abstrata pode ou não ter métodos abstratos. Entretanto, se
        uma classe contém métodos abstratos, então obrigatoriamente a classe
        deve ser declarada abstrata.

   Para cada uma delas marque V ou F. Explique aquelas que você marcou F.


4. Codifique, em sua linguagem escolhida, as classes Forma, Círculo, Cilindro e
Lista apresentadas nos slides disponíveis em
https://turing.inf.ufg.br/pluginfile.php/101007/mod_resource/content/0/15-lpp-heranca-e-polimorfismo.pdf.
Implemente e execute uma unidade de programa que use as classes codificadas e
mostre o princípio da substituição funcionando (slide 6). Caso a linguagem
escolhida ofereça suporte ao polimorfismo ou ao princípio da substituição,
implemente em outra linguagem que ofereça este suporte.
==>> Além de postar suas respostas, leve-as para discutirmos na nossa próxima aula síncrona.