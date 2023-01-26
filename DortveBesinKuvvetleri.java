package Donguler;

import java.util.Scanner;

public class DortveBesinKuvvetleri {
    public static void main(String[] args) {
        int x;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayı giriniz: ");
        x = inp.nextInt();

        System.out.print("4'ün kuvvetleri = ");
        for (int i = 1; i <= x; i *= 4) {
            System.out.print(i +" ");
        }
        System.out.print("\n5'in kuvvetleri = ");
        for (int i = 1; i <= x; i *= 5) {
            System.out.print(i+" ");

        }
    }
}
