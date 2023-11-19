package barang;

public abstract class Barang {
    public String nama;
    public int harga;
    public int jumlah;

    public Barang(String nama, int harga, int jumlah){
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public void Displayharga(){
        System.out.println("Harga " + nama + " adalah : " + harga);
    }

    public void Displaynama(){
        System.out.println("Nama barang: " + nama);
    }

    public abstract void Expired();
    public abstract void Diskon();
}
