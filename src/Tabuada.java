import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = input.nextInt();

       int resultado = 0;

       for (int i = 1; i <= 10; i ++){
           resultado = i *n;
           System.out.println(i + " x " + n + " = " + resultado);
       }

    }
}
