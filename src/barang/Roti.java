package barang;

public class Roti extends Barang{
    public Roti(String nama, int harga, int jumlah){
        super(nama, harga, jumlah);
    }

    public void Expired(){
        System.out.println("Masa Expired untuk roti " + nama + " adalah satu minggu");
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
