import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1047 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) throws IOException {
        // variaveis & objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        String[] input = bf.readLine().split(" ");
        bf.close();

        int hrInicio = Integer.parseInt(input[0]);
        int minInicio = Integer.parseInt(input[1]);
        int hrFim = Integer.parseInt(input[2]);
        int minFim = Integer.parseInt(input[3]);

        // processamento
        int tempoEmMinutosInicio = hrInicio * 60 + minInicio;
        int tempoEmMinutosFim = hrFim * 60 + minFim;
        int duracaoHoras = tempoEmMinutosInicio >= tempoEmMinutosFim
                ? ((24 * 60 - (tempoEmMinutosInicio - tempoEmMinutosFim)) / 60)
                : ((tempoEmMinutosFim - tempoEmMinutosInicio) / 60);
        int duracaoMinutos = tempoEmMinutosInicio >= tempoEmMinutosFim
                ? ((24 * 60 - (tempoEmMinutosInicio - tempoEmMinutosFim)) % 60)
                : ((tempoEmMinutosFim - tempoEmMinutosInicio) % 60);

        // saida
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoHoras, duracaoMinutos);
    }
}