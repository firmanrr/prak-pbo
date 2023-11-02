import java.util.ArrayList;

public class DosenSistemInformasi {
    public static void main(String[] args) {
        ArrayList<String> dosenSistemInformasi = new ArrayList<>();
        dosenSistemInformasi.add("- Faizal Akib S. Kom, M. Kom");
        dosenSistemInformasi.add("- Reza Maulana S.Kom.,M.T.");
        dosenSistemInformasi.add("- Zulkarnaim Masyhur S,Kom., M.T.");
        dosenSistemInformasi.add("- Asrul Azhari Muin S.Kom.,M.Kom");
        dosenSistemInformasi.add("- Adhy Rizaldy S. Kom., M.Kom");

        System.out.println("Daftar Dosen Sistem Informasi:");
        for (String dosen : dosenSistemInformasi) {
            System.out.println(dosen);
        }
    }
}