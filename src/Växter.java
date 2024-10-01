abstract class Växter implements VäxterInterface{

    // Här är inkapsling
    private String namn;
    private double höjd;

    public Växter(String namn, double höjd) {
        this.namn = namn;
        this.höjd = höjd;
    }

    public String getNamn() {
        return namn;
    }

    public double getHöjd() {
        return höjd;
    }
}
