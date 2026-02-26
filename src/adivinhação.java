import java.util.Random;
import java.util.Scanner;

public class adivinhação {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);
    int numero =  random.nextInt(7 + 1); //gera de 1 até 7
    int nsecreto = 0;
    int palpite = 0;
    int tentativas = 0;
    nsecreto  = numero; // inicializando

    while(palpite != nsecreto){
        System.out.println("Adivinhe o número, lembrando que é um número de 1 até 7: ");
         palpite = input.nextInt();
        tentativas ++;
        if (palpite == nsecreto){
            System.out.println("Parabéns você acertou o número!! ");

        }else{
            System.out.println(" Tente outro número: ");
        }
    }

    }
}
