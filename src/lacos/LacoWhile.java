package lacos;

import java.util.Scanner;

public class LacoWhile {

    public static void main(String[] args) {

        int x = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para x:");
        x = sc.nextInt();

        while(x >= 0){

            System.out.println("O valor de x é:" + x);

            x--;
        }
        System.out.println("Saiu do while");



    }
}
