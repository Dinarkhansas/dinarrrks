package barang;

public class Roti extends Barang{
    public Roti(String nama, int harga, int jumlah){
        super(nama, harga, jumlah);
    }

    @Override
    public void Displaynama() {
        super.Displaynama();
        System.out.println("Nama roti yang kamu pilih adalah: " + nama);
    }

    public void Expired(){
        System.out.println("Masa Expired untuk roti " + nama + " adalah satu minggu");
    }

    public void Expired(int tanggal){
        System.out.println("Roti: " + nama + " akan expired pada tanggal " + tanggal);
    }
    
    public void Diskon(){
        if((harga*jumlah) > 100000){
            System.out.println("Selamat anda mendapatkan diskon sebesar 15%");
            System.out.println("Harga yang harus dibayarkan : Rp" + (harga * jumlah -(harga*0.15 * jumlah)));
        }else{
            System.out.println("Harga yang harus dibayarkan : Rp" + (harga*jumlah));
        }
    }
}
