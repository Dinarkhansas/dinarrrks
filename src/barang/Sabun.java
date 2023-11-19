package barang;

public class Sabun extends Barang{
    public Sabun(String nama, int harga, int jumlah) {
        super(nama, harga, jumlah);
    }

    public void Diskon(){
        if((harga*jumlah) > 150000){
            System.out.println("Selamat anda mendapatkan diskon sebesar 20%");
            System.out.println("Harga yang harus dibayar sebesar : Rp" + (harga * jumlah -(harga* 0.2 * jumlah)));
        }else{
            System.out.println("Harga yang harus dibayar sebesar: Rp" + (jumlah*harga));
        }
    }

    public void Expired(){
        System.out.println("Masa Expired untuk sabun " + nama + "adalah lima tahun lagi");
    }
    
}
