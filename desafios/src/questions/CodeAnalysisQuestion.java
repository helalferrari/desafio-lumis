package questions;

public class CodeAnalysisQuestion {
    public void run() {
        System.out.println("=== Code Analysis ===");
        System.out.println("O código apresenta 3 problemas principais:");
        System.out.println("1 - Na linha 1 está usando operador de atribução dentro do if, o correto \nseria utilizar .equals();");
        System.out.println("2 - Risco de NullPointerException, se objeto person ou retorno do getName() \n forem nulos e tentar invocar o equals() causará um erro fatal de execução;");
        System.out.println("3 - O código está redudante a linha 5 seria suficiente, mas mesmo assim da \nforma que ela está não é uma boa prática, essa palavra deveria estar dentro de uma varíavel to tipo String;");
        System.out.println("=====================");
    }
}
