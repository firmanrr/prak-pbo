//Firman Reski Ramadhan
//60900121062 (kelas B)


//deklarasi kelas publik dengan nama no1
public class no1 {
    public static void main(String[] args) {
        //deklarasi dan menginisialisasi array dengan nama angka
        //yang berisi sepuluh elemen bertipe data int
        int angka[] = {45, 56, 57, 89, 78, 23, 68, 99, 96, 75};
        //menginisialisasi variabel count dengan nilai awal 0
        // Variabel ini digunakan untuk menghitung jumlah elemen yang memenuhi kondisi tertentu.
        int count = 0;

        //perulangan ini akan berjalan sebanyak jumlah elemen dalam array angka
        //variabel i dideklarasikan dan diinisialisasi dengan 0, dan perulangan akan berlanjut selama i kurang dari panjang array angka.
        //length itu method dalam array angka
        for (int i = 0; i < angka.length; i++) {
            //seleksian angka
            if (angka[i] >= 81) {
                //operator increment count akan bertambah 1 setiap kali kondisi di atas terpenuhi.
                count++;
                //melanjutkan ke iterasi berikutnya dalam perulangan
                continue;
            }
        }
        //mencetak pesan yang berisi jumlah elemen dalam array angka yang lebih besar atau sama dengan 81
        System.out.println("Nilai A ada " + count);
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] >= 75 && angka[i] < 81) {
                count++;
                continue;
            }
        }
        //perulangan for pada baris 18-26,29-34, 37-42, 38-43, dan 43-48 memiliki struktur dan tujuan yang sama
        //setiap perulangan memeriksa rentang nilai yang berbeda
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] >= 60 && angka[i] < 75) {
                count++;
                continue;
            }
        }
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] < 60) {
                count++;
                continue;
            }
        }
    }
}