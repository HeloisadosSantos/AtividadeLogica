import java.util.Random;
import java.util.Scanner;

/**
 * Logica
 */
public class Logica {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {

        System.out.println("Informe a quantidade de Linha da nossa Matriz");
        int Linha = sc.nextInt();
        System.out.println("Informe a quantidade de Coluna da nossa Matriz");
        int coluna = sc.nextInt();

        int Logica[][] = new int[Linha][coluna];

        for (int i = 0; i < Linha; i++) {
            for (int j = 9; j < coluna; j++) {
                Logica[i][j] = rd.nextInt(0, 9);
            }
        }
        for (int i = 0; i < Linha; i++) {
            System.out.print("| ");
            for (int j = 0; j < coluna; j++) {
                System.out.println("Logica[" + i + "][" + j + "]=" + Logica[i][j]);
            }
        }
        for (int i = 0; i < Linha; i++) {
            System.out.print("| ");
            for (int j = 0; j < coluna; j++) {
                if (i > j) {
                    Logica[i][j] = 1;
                }else if (i == j) {
                    Logica[i][j] = 0;
                }else {
                    Logica[i][j] = 2;
                }
            }
            System.out.println("tab[" + i + "][" + coluna + "]=" + Logica[i][coluna]);
        }
    }

    public void exercicio2() {

        Random rd = new Random();
        int contador = 0;
        int valorSorteado = rd.nextInt(1000);
        boolean tenteNovamente = true;
        while (tenteNovamente) {
            System.out.println("Digite um Nº");
            int nDigitado = sc.nextInt();
            System.out.println("Você tentou "+contador+ ".")
            if (nDigitado == valorSorteado) {
                System.out.println("Acertouuuu!!!!!!!");
                tenteNovamente = false;
            } else if (nDigitado < valorSorteado) {
                System.out.println("Este valor é menor do que o número sorteado.");
            } else if (nDigitado > valorSorteado) {
                System.out.println("Este valor é maior do que o número sorteado.");
            }
            contador++;
        }
    }

    public void exercicio3() {

        int vetor[]= new int [rd.nextInt(900)+100];
        int contImpar=0;
        int contPar=0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100)+1;
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2==1) {
                System.out.println("vetor Impar ["+i+"]="+vetor[i]);
                contImpar++;
            }else{
                System.out.println("vetor Par ["+i+"]="+vetor[i]);
                contPar++;
            }
        }
        System.out.println(contPar);
        System.out.println(contImpar);

    }

}
