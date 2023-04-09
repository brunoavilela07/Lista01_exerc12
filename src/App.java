import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // dados de entrada a altura de uma pessoa
        double altura;
        double peso;
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a sua altura? ");
        altura = input.nextDouble();
        // construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
        // (72.7*altura) - 58
        peso = ((72.7 * altura) - 58);
        System.out.println("Sendo assim, o seu peso ideal é: " + peso + "kg");

    }
}
