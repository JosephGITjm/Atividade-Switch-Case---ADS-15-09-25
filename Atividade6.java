import java.util.Scanner;

public class Atividade6 {
    public static void main (String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\nEXERCÍCIO 6 - Dado o cardápio de uma lanchonete, leia o código do produto e a quantidade, calcule o valor total e imprima o nome do produto e o valor a ser pago.\n");

        int codigo, qtd;
        double preco, total;
        String prod;

        System.out.printf("Digite o código do produto: ");
        codigo = leitor.nextInt();
        System.out.printf("Digite a quantidade: ");
        qtd = leitor.nextInt();

        switch (codigo) {
            case 100:
                prod = "Cachorro Quente";
                preco = 1.20;
                break;
            case 101:
                prod = "Bauru Simples";
                preco = 1.30;
                break;
            case 102:
                prod = "Bauru com Ovo";
                preco = 1.50;
                break;
            case 103:
                prod = "Hambúrguer";
                preco = 1.20;
                break;
            case 104:
                prod = "Cheeseburguer";
                preco = 1.30;
                break;
            case 105:
                prod = "Refrigerante";
                preco = 1.00;
                break;

            default:
                System.out.println("Código inválido!");
                return;
        }

        total = preco * qtd;

        System.out.println("\nProduto: " + prod);
        System.out.printf("Valor total a pagar: R$ %.2f\n", total);
    }
}