import java.util.Scanner;

public class Main { //para o arquivo funcionar mude o nome para "Main.java"
    public static void main(String args[]){
        //variaveis
        double pi = 3.14159;
        double raio, area;
        Scanner entrada = new Scanner(System.in);

        //entrada
        raio = entrada.nextDouble();

        //processamento
        area = pi * Math.pow(raio, 2);

        //saida
        System.out.printf("A=%.4f\n", area);
    }
}