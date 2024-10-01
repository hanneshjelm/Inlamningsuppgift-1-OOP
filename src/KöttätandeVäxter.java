public class KöttätandeVäxter extends Växter {

    public KöttätandeVäxter(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override
    public double räknaUtMängdVätska() {
        return 0.1 + (0.2 * getHöjd());
    }

    @Override
    public Vätsketyp getVätsketyp() {
        return Vätsketyp.PROTEINDRYCK;
    }
}
