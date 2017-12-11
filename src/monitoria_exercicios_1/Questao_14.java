package monitoria_exercicios_1;

import java.util.Scanner;

public class Questao_14 {

    public static void main(String[] args) {
        int jogos;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de jogos vendidos: ");
        jogos = scanner.nextInt();
        double vendas, valorTotal, valorBonus;
        vendas = jogos * 19.90;
        valorBonus = ((jogos / 15) * 0.08) * vendas;
        valorTotal = (vendas * 0.50) + valorBonus;
        System.out.println("Valor das vendas: " + vendas);
        System.out.println("Valor bônus: " + valorBonus);
        System.out.println("Valor total: " + valorTotal);
    }
}
