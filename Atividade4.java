import java.util.Scanner;

public class Atividade4{
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("\nEXERCÍCIO 4 - Um funcionário receberá aumento de acordo com seu plano de trabalho. Faça um algoritmo que leia: o plano de trabalho e o salario atual de um funcionario; Calcule e imprima o seu novo salário\n");

        int sal;
        String plan;
        System.out.printf("Digite seu plano (A,B,C): ");
        plan = scan.next();

        System.out.printf("Agora digite seu salário: ");
        sal = scan.nextInt();

        switch(plan) {

            case "A":
            case "a":
                double aumA = (sal * 0.10) + sal;
                System.out.println("Seu novo salário agora é R$ "+ aumA);
                break;
            case "B":
            case "b":
                double aumB = (sal * 0.15) + sal;
                System.out.println("Seu novo salário agora é R$ "+ aumB);
                break;
            case "C":
            case "c":
                double aumC = (sal * 0.20) + sal;
                System.out.println("Seu novo salário agora é R$ "+ aumC);
                break;

            default:
                System.out.println("Digite apenas os planos disponíveis (A,B e C) para receber o resultado.");
        }
        scan.close();

    }
}