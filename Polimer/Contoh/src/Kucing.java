public class Kucing extends Hewan{
    public Kucing(String nama, int umur, String jenis) {
        super(nama, umur, jenis);
    }

    public String suara = "Miaw"; 

    @Override
    public void DisplaySemua() {
        super.DisplaySemua();
        System.out.println("Suara kucing adalah: " + suara);
    }
}


