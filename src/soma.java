import java.util.Scanner;

public class soma {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        int [] numeros = new int[5];
       int  soma = 0;
      //ler números
       for (int i = 0; i<5; i ++){
           System.out.println("Digite um número: ");
            numeros[i]= input.nextInt();
       }
       //somar
        for (int i = 0; i<5; i ++ ){
            soma += numeros[i];
        }
      double    media = soma/5.0;

        System.out.printf("A soma desses números é %d%n",soma);
        System.out.printf("A média é %.2f", media);


    }
}

