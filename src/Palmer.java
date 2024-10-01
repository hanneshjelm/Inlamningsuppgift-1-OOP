public class Palmer extends Växter{

    public Palmer(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override
    public double räknaUtMängdVätska() {
        return 0.5 * getHöjd();
    }

    @Override
    public Vätsketyp getVätsketyp() {
        return Vätsketyp.KRANVATTEN;
    }

}
