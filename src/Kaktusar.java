public class Kaktusar extends Växter{

    public Kaktusar(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override
    public double räknaUtMängdVätska() {
        return 0.02;
    }

    @Override
    public Vätsketyp getVätsketyp() {
        return Vätsketyp.MINERALVATTEN;
    }
}
