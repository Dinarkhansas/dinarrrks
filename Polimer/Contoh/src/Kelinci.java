public class Kelinci extends Hewan{
    public Kelinci(String nama, int umur, String jenis) {
        super(nama, umur, jenis);
    }

    public String jk = "Laki-laki";

    @Override
    public void DisplaySemua() {
        super.DisplaySemua();
        System.out.println("Hewan ini berjenis kelamin: " + jk);
    }
}
