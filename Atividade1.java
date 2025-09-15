import java.util.Scanner;

public class Atividade1{

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        System.out.println("\nEXERCÍCIO 1 - Crie um algoritmo que leia um número de 1 a 7\n");

        int semanas;
        System.out.printf("Digite um número de 1 a 7: ");
        semanas = leitor.nextInt();

        switch(semanas) {
            case 1:
                System.out.println("Este dia é Domingo");
                break;
            case 2:
                System.out.println("Este dia é Segunda-Feira");
                break;
            case 3:
                System.out.println("Este dia é Terça-Feira");
                break;
            case 4:
                System.out.println("Este dia é Quarta-Feira");
                break;
            case 5:
                System.out.println("Este dia é Quinta-Feira");
                break;
            case 6:
                System.out.println("Este dia é Sexta-Feira");
                break;
            case 7:
                System.out.println("Este dia é Sábado");
                break;
            default:
                System.out.println("Você não digitou de 1 - 7");

        }

        leitor.close();


    }

}