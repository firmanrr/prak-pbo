import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // a. Tambahkan 6 item sekaligus terus print
        ArrayList<String> listA = new ArrayList<>();
        listA.add("Item 1");
        listA.add("Item 2");
        listA.add("Item 3");
        listA.add("Item 4");
        listA.add("Item 5");
        listA.add("Item 6");
        System.out.println("List A: " + listA);

        // b. Clone listA untuk salinan akhir
        ArrayList<String> listB = (ArrayList<String>) listA.clone();

        // c. Hapus salah satu elemen dan tampilkan keterangan bahwa item telah dihapus
        listA.remove(3);
        System.out.println("Item tel ah dihapus dari List A");

        // d. Tampilkan indeks yang berada pada posisi 2
        System.out.println("Indeks pada posisi 2: " + listA.get(2));

        // e. Atur item pada indeks 2 menggunakan set
        listA.set(2, "Item baru");

        // f. Lakukan pengecekan item berada pada indeks ke berapa dalam sebuah ArrayList
        int index = listA.indexOf("Item baru");
        System.out.println("Item \"Item baru\" berada pada indeks ke-" + index + " dalam List A");

        // g. Tampilkan item hasil beberapa operasi di atas
        System.out.println("List A setelah beberapa operasi: " + listA);

        // h. Hapus semua item
        listA.clear();
        System.out.println("Semua item telah dihapus dari List A");

        // i. Lakukan pengecekan apakah item masih kosong atau tidak
        boolean isEmpty = listA.isEmpty();
        System.out.println("List A kosong? " + isEmpty);

        // j. Tampilkan item yang telah dihapus pada tahap h dan tampilkan data yang telah di clone pada tahap b
        System.out.println("List A setelah dihapus: " + listA);
        System.out.println("List B (Clone): " + listB);
    }
}