Laporan 9

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        //List tanpa type parameter
//        List lo = new ArrayList();
//        //lo menampung objek String
//        lo.add("lo - string 1");
//
//        //lo menampung objek planet
//        lo.add(new Planet("Mercury", 0.06));
//
//        //List dengan type parameter Planet
//        List<Planet> lp = new ArrayList<>();
//
//        //lp menampung objek planet
//        lp.add(new Planet("Mercury", 0.06));
//        //baris berikut compile-error
//        //lp tidak diizinkan menampung objek String
//        lp.add("lp - String 2");

        List<String> ls = new ArrayList();
        ls.add("String1");
        ls.add("String2");

        print(ls);//apakah baris ini valid

        Collection<Planet> cp = new ArrayList();
        cp.add(new Planet("Mercury", 0.06));
        cp.add(new Planet("Venus", 0.82));

        print(cp);//apakah baris ini valid?

    }
        public static void print(Collection<?> collection){
            for(Object o : collection){
                System.out.println(o);
            }
        }

    }



Laporan 10

public static void public static void main(String[] args) {
    int[] a = new int[a]; //array integer dengan nama a dan menginisialisasinya dengan panjang a
    try { //digunakan untuk menangani pengecualian
        System.out.println("Akses elemen ke 5 :" + a[5]);
    } catch (ArrayIndexOutOfBoundsExeption e) {
        System.out.println("Exception trown :" + e);
    } finally {
        a[4] = 10; //mengatur nilai elemen terakhir dari array 
        System.out.println("Nilai elemen terakhir:" + a[4]);
    }
}