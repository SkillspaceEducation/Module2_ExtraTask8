/* Написать программу, которая выводила бы консоль звездочки, следующим образом

 * * * * *

 * * * * *

 * * * * *

 */
public class Main {
    public static void main(String[] args) {
        int str = 3, num = 0;
        int col = 5;
        String symb = "*";
        System.out.println();
        while (num < str) {
            for (int i = 0; i < col; i++) {
                if (i == col - 1) {
                    System.out.print(symb + "\n");
                    System.out.println();
                } else {
                    System.out.print(symb + " ");
                }
            }
            num++;
        }
    }
}