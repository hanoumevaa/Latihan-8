package latihan;

import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("*** PROGRAM PENGECEKAN TIPE DATA ***\n\n");
        System.out.print("\tMasukkan angka\t: ");
        double a = in.nextDouble();
        superku s = new superku();
        String b = (a % 1 == 0) ? s.methodI1() : s.methodD1();
        System.out.println("Angka " + a + " memiliki tipe data " + b);
    }
}
