import java.util.ArrayList;
import java.util.Scanner;

public class DataNilaiMahasiswa {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Nilai: ");
            double nilai = input.nextDouble();
            input.nextLine();

            daftarMahasiswa.add(new Mahasiswa(nama, nilai));
        }

        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(m.nama + " : " + m.nilai);
        }
    }
}
