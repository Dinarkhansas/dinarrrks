package barang;

public class Susu extends Barang {
    public Susu(String nama, int harga, int jumlah) {
        super(nama, harga, jumlah);
    }

    public void Diskon(){
        if((harga*jumlah) > 50000){
            System.out.println("Selamat anda mendapat diskon sebesar 10%" );
            System.out.println("Harga yang harus dibayar sebesar: Rp" + (harga * jumlah -(harga*0.1 * jumlah)));
            
        }else{
            System.out.println("Harga yang harus dibayar sebesar : Rp" +(harga*jumlah));
        }
    }
    
    public void Expired(){
        System.out.println("Masa Expired untuk susu " + nama + " adalah 2 tahun lagi");
    }
}
