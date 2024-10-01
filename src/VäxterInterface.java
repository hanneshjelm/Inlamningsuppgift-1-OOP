public interface VäxterInterface {

    double räknaUtMängdVätska();
    Vätsketyp getVätsketyp();

    enum Vätsketyp {
        KRANVATTEN ("kranvatten"),
        PROTEINDRYCK ("proteindryck"),
        MINERALVATTEN ("mineralvatten");

        public final String vätsketyp;

        Vätsketyp(String s) {
            vätsketyp = s;
        }
    }
}
