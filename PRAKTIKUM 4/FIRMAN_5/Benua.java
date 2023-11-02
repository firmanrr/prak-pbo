//Firman Reski Ramadhan
//60900121062 (kelas B)


//kelas publik dengan nama Benua
public class Benua {
    //deklarasikan variabel bagianBenua dengan tipe data String dan memberikan nilai awal "Asia Tenggara"
    //variabel ini mengunakan (protected), yang berarti dapat diakses oleh kelas turunan
    protected String bagianBenua="Asia Tenggara";
    //mendefinisikan metode tropis. metode ini menggunakan publik
    //blok kode di dalamnya akan mencetak pesan "Musim hujan dan kemarau".
    public void tropis() {
        System.out.println("Musim hujan dan kemarau");
    }
}
//deklarasi kelas asia yang merupakan kelas turunan dari kelas Benua
//asia adalah subkelas dari Benua.
class asia extends Benua {
    //deklarasi variabel namaNegara dengan tipe data String dan memberikan nilai awal "Indonesia".
    //variabel ini menggunakan (private),hanya dapat diakses di dalam kelas asia ini.
    private String namaNegara= "Indonesia";
    public static void main(String[] args) {
        //membuat objek myCountry dari kelas asia menggunakan operator new.
        asia myCountry = new asia();
        //memanggil metode tropis() dari objek myCountry
        myCountry.tropis();
        //mencetak nilai dari variabel bagianBenua yang diakses melalui objek myCountry
        //outputnya akan menjadi "Asia Tenggara Indonesia".
        System.out.println(myCountry.bagianBenua + " " + myCountry.namaNegara);
    }
}