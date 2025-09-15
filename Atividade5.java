import java.util.Scanner;

public class Atividade5 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("\nEXERCÍCIO 5 - Faça um algoritmo que receba dois números; execute as operações da lista M, S, P, D.\n");

        double num1, num2;
        String metd;
        System.out.printf("Digite o primeiro número a ser calculado: ");
        num1 = scan.nextDouble();
        System.out.printf("Digite o segundo número a ser calculado: ");
        num2 = scan.nextDouble();

        System.out.printf("Agora escolha o método para a realização do cálculo (M, S, P, D): ");
        metd = scan.next();

        switch (metd){
            case "M":
            case "m":
                double media = (num1 + num2)/2;
                System.out.println("A média de seus números é "+media);
                break;
            case "S":
            case "s":
                double dif = num1 - num2;
                System.out.println("A diferença entre os números é "+dif);
                break;
            case "P":
            case "p":
                double prod = num1 * num2;
                System.out.println("O produto entre os números é "+prod);
                break;
            case "D":
            case "d":
                double div = (double) num1 / num2;
                System.out.println("A divisão de seus números é "+div);
                break;

            default:
                System.out.println("Digite apenas as letras selecionadas (M, S, P, D)");
        }
        scan.close();

    }
}