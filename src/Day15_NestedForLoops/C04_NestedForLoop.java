package Day15_NestedForLoops;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("olusturulacak seklin satir sayisini giriniz");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir; i++) { // satır
            for (int j =1; j <= i; j++) { // sutun
                System.out.print("*  ");
            }
            System.out.println("");

        }
    }
}
