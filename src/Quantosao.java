import java.util.Scanner;

public class Quantosao {
    public static void main(String[] args) {
//quantos são pares quantos são ímpares
        Scanner input = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int [] numeros = new int[10];

        for (int i= 0; i<numeros.length; i ++){
            System.out.println("Number: ");
            numeros[i] = input.nextInt();

            if (numeros[i] % 2 == 0){
                pares  ++;


            }else{
                impares ++;


            }
            System.out.println("Quantidade de PARES: "+ pares);
            System.out.println("Quantidade de ÍMPARES: "+impares);
        }



    }
}