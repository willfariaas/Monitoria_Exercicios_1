package monitoria_exercicios_1;

import java.util.Scanner;

public class Questao_15 {

    public static void main(String[] args) {
        double litrosUsados, tempo, velocidade, distancia;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o tempo gasto (em horas): ");
        tempo = s.nextDouble();
        System.out.print("Digite a velocidade média (em km/h): ");
        velocidade = s.nextDouble();
        distancia = tempo * velocidade;
        litrosUsados = distancia / 12;
        System.out.printf("Combustível gasto:" + "%.3f", litrosUsados);
    }
}
