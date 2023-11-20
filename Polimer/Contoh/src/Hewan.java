public class Hewan {
    public String nama;
    public int umur;
    public String jenis;

    public Hewan(String nama, int umur, String jenis){
        this.nama = nama;
        this.umur = umur;
        this.jenis = jenis;
    }

    public void DisplaySemua(){
        System.out.println("Nama hewan adalah: " + nama);
        System.out.println("Umur " + nama + " adalah " + umur + " tahun");
        System.out.println(nama + " adalah berjenis: " + jenis);
    }
    
}
