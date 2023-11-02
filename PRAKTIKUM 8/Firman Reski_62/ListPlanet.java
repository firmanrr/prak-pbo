import java.util.ArrayList; //mengimpor kelas ArrayList dan List dari paket java.util
import java.util.List;

public class ListPlanet{ //kelas ListPlanet
    public static void main(String[] args) {
        String[] heroes = new String[2]; //deklarasi array heroes yang memiliki kapasitas dua elemen bertipe String
        heroes[0] = "Firman"; //menyimpan elemen Firman pada indeks 0 array heroes
        heroes[1] = "Takas"; ////menyimpan elemen Takas pada indeks 1 array heroes

        List<String> planets = new ArrayList<>(); //deklarasi planets sebagai objek ArrayList yang menampung elemen bertipe String
        planets.add("Merkurius"); //menambahkan elemen Merkurius kedalam arraylist dengan menggunakan method add
        planets.add("Venus"); //menambahkan elemen Venus kedalam arraylist
        planets.add("Bumi"); //menambahkan elemen Bumi kedalam arraylist
        planets.add("Mars"); //menambahkan elemen Mars kedalam arraylist
        System.out.println("List planets awal : "); //mencetak teks List planets awal
        for (int i = 0; i < planets.size(); i++){ //perulangan for
            System.out.println("\tindex= "+ i + " = " + planets.get(i)); //setiap elemen di planets dicetak bersama dengan indeksnya
        }

        planets.remove("Venus"); //menghapus elemen dengan nilai "Venus" dari planets menggunakan metode remove
        System.out.println("List planets akhir : "); //mencetak teks List Planets akhir
        for (int i = 0;i<planets.size();i++){ //perulangan for
            System.out.println("\tindex- " + i + " = " + planets.get(i)); //setiap elemen di planets setelah penghapusan "Venus" dicetak dengan indeksnya
        }
    }
}