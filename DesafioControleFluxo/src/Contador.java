import java.util.Scanner;

// Classe que representa a exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

// Classe Contador
public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            // Chama o método para realizar a contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            // Captura a exceção personalizada e imprime a mensagem
            System.out.println(e.getMessage());
        }

        sc.close();
    }


    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }


        int contagem = parametroDois - parametroUm;

        // Realiza o loop para imprimir os números incrementados
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
