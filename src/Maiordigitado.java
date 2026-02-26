import java.util.Scanner;

public class Maiordigitado {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int maior = 0;
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = input.nextInt();
            if (maior < numeros[i]){
                maior = numeros[i];
            }

        }
        System.out.println("O maior numero digitado foi: "+maior);
          }
        }

