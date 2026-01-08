package questions;

public class ImmutableStringQuestion {
    public void run() {
        System.out.println("=== Qual minha opinião sobre a String ser Imutável? ===");
        System.out.println(" 1. A segurança, com ela podemos armazerar uris, urls, \npalavaras sensiveis dos usuários, e ela sendo imutavel, \n isso evita de ser alterado por códigos maliciosos;");
        System.out.println(" 2. Pelo fato dela ser imutavel ela se tornar thread-safety,\n como não permite alteração do seu estado é possível\n compartilhar entre multiplas threads.");
        System.out.println(" 3. Imutabilidade também ajuda a evitar side effects (efeitos colaterais).");
        System.out.println("================================");
    }
}