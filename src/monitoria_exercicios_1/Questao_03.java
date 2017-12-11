package monitoria_exercicios_1;

import java.util.Scanner;

public class Questao_03 {

    public static void main(String[] args) {
        double distancia, combustivel;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe a distância total percorrida (em Km): ");
        distancia = s.nextDouble();
        System.out.print("Informe o total de combustível gasto (em litros): ");
        combustivel = s.nextDouble();
        double consumo;
        consumo = distancia / combustivel;
        System.out.println("O consumo médio é: " + consumo);
    }
}
