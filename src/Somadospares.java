
import java.util.Scanner;

public class Somadospares {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int soma = 0;

      for (int i = 1; i <= 100; i ++){
            if (i % 2 == 0){
                soma += i;

            }
       }
        System.out.println("Quantidade da soam de números PARES: "+ soma);

    }
}
