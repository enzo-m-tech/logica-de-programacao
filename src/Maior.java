import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
     // qual número é maior ou se eles são iguais
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = input.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = input.nextInt();
     if (num1 > num2){
         System.out.printf(" %d é maior que %d",num1,num2);
     } else if (num2 > num1){
         System.out.printf(" %d é maior que %d",num2,num1);
     }else {
         System.out.println("Os números são iguais");
     }


    }
}
