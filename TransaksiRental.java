public class TransaksiRental {
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    BarangRental Barangrental;

    TransaksiRental(int kodeTransaksi, String namaPeminjam, int lamaPinjam, double totalBiaya, BarangRental Barangrental){
        this.kodeTransaksi = kodeTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.totalBiaya = totalBiaya;
        this.Barangrental = Barangrental;
    }
}