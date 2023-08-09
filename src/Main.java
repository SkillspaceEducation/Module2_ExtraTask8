/* Написать программу, которая выводила бы консоль звездочки, следующим образом
 * * * * *
 * * * * *
 * * * * *
 */
public class Main {
    public static void main(String[] args) {
        String[][] mas = new String[3][5];
        for (int i = 0; i < mas.length; i++) {
            System.out.println();
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = "*";
                if (j == mas[i].length - 1) {
                    System.out.print(mas[i][j] + "\n");
                } else {
                    System.out.print(mas[i][j] + " ");
                }
            }
        }
    }
}