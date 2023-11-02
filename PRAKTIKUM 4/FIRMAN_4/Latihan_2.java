//Firman Reski Ramadhan
//60900121062 (kelas B)


//kelas Scanner dari paket java. kelas Scanner digunakan untuk membaca input dari pengguna.
import java.util.Scanner;
//deklarasi kelas publik dengan nama Latihan_2
public class Latihan_2 {

    public static void main(String[] args) {
        //perulangan ini akan berjalan sebanyak 6 kali. variabel input dideklarasikan dan diinisialisasi dengan 1
        //perulangan akan berlanjut selama input kurang dari atau sama dengan 6.
        for (int input = 1; input <= 6; input++) {
            //membuat objek key dari kelas Scanner
            Scanner key = new Scanner(System.in);
            System.out.println("Masukkan nilai : ");

            //membaca sebuah bilangan bulat yang dimasukkan oleh pengguna dan menyimpannya dalam variabel grade
            int grade = key.nextInt();
            //penseleksian, kika nilai grade berada di antara 81 dan 100, maka blok kode di dalamnya akan dieksekusi
            if ((grade <= 100) && (grade >= 81)) {
                System.out.println("Perfect!");
            //penseleksian kedua. jika nilai grade kurang dari 80 dan lebih besar atau sama dengan 75, maka blok kode di dalamnya akan dieksekusi
            } else if ((grade < 80) && (grade >= 75)) {
                System.out.println("Good job");
            //penseleksian ketiga
            } else if ((grade < 74) && (grade >= 60)) {
                System.out.println("Average");
            //penseleksian keempat
            } else if ((grade < 60) && (grade >= 0)) {
                System.out.println("Poor");
            //kondisi default yang akan dieksekusi jika tidak ada kondisi sebelumnya yang terpenuhi.
            }else {
                System.out.println("Out of Bound");
            }
        }
    }
}