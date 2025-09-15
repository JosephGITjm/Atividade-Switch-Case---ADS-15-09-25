import java.util.Scanner;

public class Atividade3 {
    public static void main (String[] args){

        Scanner leitor = new Scanner(System.in);
        System.out.println("\nEXERCÍCIO 3 - Faça um algoritmo que leia o período em que um aluno estuda: M - Matuino; V - Vesperino; N - Noturno.\n");


        String periodo;
        System.out.printf("Digite o período que você estuda com (M - Matuino; V - Vesperino; N - Noturno): ");
        periodo = leitor.next();

        switch(periodo) {
            case "M":
            case "m":
                System.out.println("BOM DIA PARA VOCÊ");
                break;
            case "V":
            case "v":
                System.out.println("BOA TARDE PARA VOCÊ");
                break;
            case "N":
            case "n":
                System.out.println("BOA NOITE PARA VOCÊ");
                break;

            default:
                System.out.println("Digite M, V ou N conforme mencionado");
        }
        leitor.close();




    }
}
