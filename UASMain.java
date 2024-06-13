import java.util.Scanner;
public class UASMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int menu;
        LinkedList Sll = new LinkedList();

        BarangRental[] daftarKendaraan = new BarangRental[]{
            new BarangRental("S 4567 YV", "Honda Beat", "Motor", 2017, 10000),
            new BarangRental("N 4511 VS", "Honda Vario", "Motor", 2018, 10000),
            new BarangRental("N 1453 AA", "Toyota Yaris", "Motor", 2022, 30000),
            new BarangRental("AB 4321 A", "Toyota Innova", "Mobil", 2019, 60000),
            new BarangRental("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 25000)
        };

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5) : ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                for (BarangRental barang : daftarKendaraan) {
                    System.out.println("No TNKB: " + barang.noTNKB);
                    System.out.println("Nama Kendaraan: " + barang.namaKendaraan);
                    System.out.println("Jenis: " + barang.jenisKendaraan);
                    System.out.println("Tahun: " + barang.tahun);
                    System.out.println("Biaya Sewa Perjam: " + barang.biayaSewa);
                    System.out.println();   
        }
                break;
                case 2:
                System.out.println("Peminjaman:");
                System.out.print("Masukkan Nama Peminjam: ");
                String namaPeminjam = sc2.nextLine();
                System.out.print("Masukkan No TNKB: ");
                String noTNKB = sc2.nextLine();
                System.out.print("Masukkan Lama Pinjam: ");
                int lamaPinjam = sc.nextInt();
                System.out.print("Apakah Member (ya/tidak): ");
                String member = sc2.nextLine();
                
                
                break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            
            }
        }
    }
}