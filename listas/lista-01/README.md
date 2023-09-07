# Enunciado da Lista 01

## Questão 01:
Utilizando testes unitários com JUnit e a metodologia de TDD, desenvolva uma classe Data que possua os seguintes métodos:

public Data(int ano, int mes, int dia)
public Data()                      // hoje
public int getDia(), getMes(), getAno()
public void adicionaDias(int dias) // avanca a data em dias
public int diasNoMes()
public String diaDaSemana()        // ex. "Segunda-feira"
public boolean eAnoBisexto()
public void proximoDia()           // avanca um dia
public String porExtenso()         // exibe a data por extenso
 

Obedeça ao princípio da ocultação de informações.
Desenvolva uma classe Aplicacao para ilustrar o funcionamento da classe Data.
Desenhe a classe Data na notação UML.
A lógica dos métodos deve ser desenvolvida por você e não deve ser utilizada a API do Java.
Faça o uso adequado de atributos estáticos e finais.



## Questão 02:

Utilizando testes unitários com JUnit e a metodologia de TDD, desenvolva uma classe Pessoa. Deve-se armazenar o nome, o cpf, a idade e o sexo. Deve haver métodos para: construir a classe com valores padrões ou entrados pelo usuário; possuir atributos encapsulados; possuir métodos de acesso para permitir alterar o valor desses atributos, possuir métodos para permitir consultar o valor dos atributos; possuir método para informar se é maior de idade. Desenvolva uma classe aplicação para ilustrar o funcionamento da classe Pessoa. Não é necessário usar entrada de dados, mas basta instanciar um objeto da classe pessoa para demonstrar seu funcionamento. Desenhe a classe Pessoa na notação UML.




## Questão 03:
Utilizando testes unitários com JUnit e a metodologia de TDD, desenvolva uma classe Conta que representa uma conta bancária. Ela deve possuir no mínimo o número da conta e o saldo. Adicione novos atributos que julgar necessários. Adicione aos atributos da classe um identificador contador, utilizando membros estáticos. Desenvolva uma classe Aplicacao para ilustrar o funcionamento da classe Conta. Desenhe a classe Conta na notação UML.



## Questão 04:
Apesar do método destrutor public void finalize() poder ser utilizado para resolver pendências como um arquivo aberto ou 
uma conexão de banco de dados não finalizada, porque não devemos nos basear no destrutor para liberar recursos limitados 
de armazenamento ou de acesso a banco?

Resposta: O método `finalize()` apresenta várias limitações. Primeiro, ele não garante um momento preciso para liberar recursos, o que pode resultar em atrasos indesejados na liberação de recursos críticos, como conexões de banco de dados. Além disso, o método depende do coletor de lixo para ser invocado, o que pode nunca acontecer em alguns casos, levando a vazamentos de recursos. Finalmente, o uso do `finalize()` pode tornar o código propenso a erros difíceis de depurar, especialmente quando há dependências complexas entre objetos e recursos. Portanto, é aconselhável evitar o método `finalize()` e optar por abordagens mais confiáveis e controladas para a gestão de recursos.
