import java.util.Scanner;

public class Ex2848 {
    public static void main(String[] args) {
        // variaveis e objetos
        Scanner scanner = new Scanner(System.in);
        String entrada;
        String[] valores;
        int tamVet, rodadas;
        int limInf, limSup, kMenor, guga, dabriel, menor, contKEsimo;
        int difGuga, difDabri;

        // entrada
        entrada = scanner.nextLine();
        valores = entrada.split("\\s");
        tamVet = Integer.parseInt(valores[0]);
        rodadas = Integer.parseInt(valores[1]);

        int vet[] = new int[tamVet];
        leVetor(vet);

        for (int i = 0; i < rodadas; i++) {
            entrada = scanner.nextLine();
            valores = entrada.split("\\s");

            limInf = Integer.parseInt(valores[0]);
            limSup = Integer.parseInt(valores[1]);
            kMenor = Integer.parseInt(valores[2]);
            guga = Integer.parseInt(valores[3]);
            dabriel = Integer.parseInt(valores[4]);

            // processamento
            int intervalo[] = new int[limSup - limInf + 1];
            copiaVetor(vet, intervalo, limInf - 1, limSup);
            seletion(intervalo.length, intervalo);
            menor = intervalo[kMenor - 1];

            contKEsimo = contNum(intervalo, menor);
            difGuga = Math.abs(contKEsimo - guga);
            difDabri = Math.abs(contKEsimo - dabriel);

            char result = 'E';
            if (difGuga < difDabri) {
                result = 'G';
            } else if (difDabri < difGuga) {
                result = 'D';
            }

            // saida
            System.out.println(menor + " " + contKEsimo + " " + result);
        }

        scanner.close();
    }

    static void leVetor(int vet[]) {
        String entrada;
        String[] valores;
        Scanner scanner = new Scanner(System.in);
        entrada = scanner.nextLine();
        valores = entrada.split("\\s");
        for (int i = 0; i < valores.length; i++) {
            vet[i] = Integer.parseInt(valores[i]);
        }
    }

    static void copiaVetor(int vetOrig[], int vetDest[], int inicio, int fim) {
        for (int i = inicio, j = 0; i < fim; i++, j++) {
            vetDest[j] = vetOrig[i];
        }
    }

    static void seletion(int n, int vet[]) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (vet[j] < vet[min]) {
                    min = j;
                }
            }
            int aux = vet[i];
            vet[i] = vet[min];
            vet[min] = aux;
        }
    }

    static int contNum(int vet[], int n) {
        int cont = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == n) {
                cont++;
            }
        }
        return cont;
    }
}