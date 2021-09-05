import java.util.Scanner;

public class Ex1130 {
    public static void main(String args[]) {
        /* variaveis */
        Scanner entrada = new Scanner(System.in);
        String aux = new String();
        int n;
        char ePossivel = 'N';

        /* entrada */
        while (true) {
            n = entrada.nextInt(); // condicao de parada
            if (n == 0) {
                break;
            }

            StringBuffer tabuleiro = new StringBuffer(n), tabFuturo = new StringBuffer(n);

            aux = entrada.nextLine();
            tabuleiro.append(aux);

            // processamento
            for (int i = 0; i < tabuleiro.capacity(); i++) {
                tabuleiro.getChars(0, n - 1, tabFuturo, 0);

                if (tabuleiro.charAt(i) == '.') {
                    tabFuturo.setCharAt(i, 'X');
                    if (tabFuturo.indexOf("XXX") != -1) {
                        ePossivel = 'S';
                        break;
                    } 
                    else {
                        if(tabFuturo.indexOf("...") == -1 && tabFuturo.indexOf("X.X") == -1 && tabFuturo.indexOf(".XX") == -1 && tabFuturo.indexOf("XX.") == -1){
                            ePossivel = 'S';
                            break;
                        }
                    }
                }
            }
            // saida
            System.out.println(ePossivel);
        }

        entrada.close();
    }
}