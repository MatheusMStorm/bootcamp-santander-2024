import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Parâmetro mínimo:");
        int parametroMin = entrada.nextInt();
        System.out.println("Parâmetro máximo");
        int parametroMax = entrada.nextInt();

        if (parametroMin > parametroMax) {
            throw new ParametrosInvalidosException();
        }
        else {
            contar(parametroMin, parametroMax);
        }
    }

    static void contar(int parametroMin, int parametroMax) {
        int contagem = parametroMax - parametroMin;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}