import java.util.Scanner;

public class Pra_impar {
    public static void main(String[] args) {
//se o número é par ou ímpar
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número digitado é PAR ");
       if (numero>10){
           System.out.println("O número digitado é PAR e maior que 10 ");
       }else{
            System.out.println("O número digitado é ÍMPAR ");
       }

        }
    }
}






