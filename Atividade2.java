import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("\nEXERCÍCIO 2 - Faça um algoritmo que leia um inteiro entre 1 e 12; imprima o nome do mês por extenso.\n");


        int mes;
        System.out.printf("Digite um número entre 1 e 12: ");
        mes = leitor.nextInt();

        switch(mes) {
            case 1:
                System.out.println("O mês é JANEIRO");
                break;
            case 2:
                System.out.println("O mês é FEVEREIRO");
                break;
            case 3:
                System.out.println("O mês é MARÇO");
                break;
            case 4:
                System.out.println("O mês é ABRIL");
                break;
            case 5:
                System.out.println("O mês é MAIO");
                break;
            case 6:
                System.out.println("O mês é JUNHO");
                break;
            case 7:
                System.out.println("O mês é JULHO");
                break;
            case 8:
                System.out.println("O mês é AGOSTO");
                break;
            case 9:
                System.out.println("O mês é SETEMBRO");
                break;
            case 10:
                System.out.println("O mês é OUTUBRO");
                break;
            case 11:
                System.out.println("O mês é NOVEMBRO");
                break;
            case 12:
                System.out.println("O mês é DEZEMBRO");
                break;

            default:
                System.out.println("Este não é um mês do ano");
        }
        leitor.close();


    }
}