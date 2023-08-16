package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* The code below is an example of
        comments */
        System.out.println("Hello world!"); //print char
        System.out.println(5); //print int

        //this is variable
        String name = "Agil";
        System.out.println("Hai" + name);

        int a = 1, b = 2;
        int c = a + b;
        System.out.println(c);

        float numFloat = 3.83F;
        char inName = 'A';
        boolean theBool = true;

        System.out.println("Initials" + " " + inName + " " + "IPK" + " " + numFloat + " " + "is a" +" " + theBool );

        //operator example with input
        int num1, num2, hasil;

        Scanner input = new Scanner(System.in);

        System.out.print("masukan angka: ");
        num1 = input.nextInt();
        System.out.print("masukan angka: ");
        num2 = input.nextInt();

        hasil = num1 + num2;
        System.out.println("maka hasilnya: " + hasil);

        //if else statement
        int ipk = 4;

        if (ipk > 3){
            System.out.println("Mantap cumlaude");
        } else if (ipk > 2 && ipk <= 3) {
            System.out.println("Sangat Memuaskan");
        }
        else{
            System.out.println("Memuaskan");
        }

        //switch case
        switch (ipk){
            case 1:
                System.out.println("Tidak Lulus");
                break;
            case 2:
                System.out.println("Memuaskan");
                break;
            case 3:
                System.out.println("Sangat Memuaskan");
                break;
            case 4:
                System.out.println("Dengan Pujian");
                break;
        }

        //looping while (dicek dulu nilai a nya)
        while (a <= 5){ //identifikasi nilai a
            System.out.print(a); //cetak nilai a
            a++; //menambahkan 1 pada a
        }

        //do while cetak terlebih dulu nilai a baru di cek nilai a nya
        do {
            System.out.println(a); //cetak nilai a
            a++; //menambahkan 1 pada variabel a
        }
        while (a <= 5); //mengecek nilai a

        //looping for
        for (int w=1; w<=5; w++){
            System.out.print(w);
        }

        //nested for (perulangan for dalam for)
        for (int nr = 1; nr <= 5; nr++){ //melakukan perulangan ke bawah
            for (int wa = 1; wa <= nr; wa++){ // melakukan perulangan ke samping
                System.out.print("*");
            }
            System.out.println();
        }
    }
}