import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    public Main() {
        Kaktusar igge = new Kaktusar("Igge", 0.2);
        Palmer laura = new Palmer("Laura", 5);
        KöttätandeVäxter meatloaf = new KöttätandeVäxter("Meatloaf", 0.7);
        Palmer olof = new Palmer("Olof", 1);
        List<Växter> växtlista = Arrays.asList(igge, laura, olof, meatloaf);

        while (true) {
            String input = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            if (input == null) {
                break;
            }
            printVäxt(input, växtlista);

        }
    }

    public void printVäxt(String växt, List<Växter> växtlista) {
        boolean växtFinns = false;
        for (Växter v : växtlista) {
            if (växt.equalsIgnoreCase(v.getNamn())) {
                // Polymorphism när vi använder samma metodnamn men olika metoder körs.
                JOptionPane.showMessageDialog(null, v.getNamn() + " behöver " + v.räknaUtMängdVätska() + " liter " +
                        v.getVätsketyp().vätsketyp + " per dag");
                växtFinns = true;
            }
        }
        if(!växtFinns) {
            JOptionPane.showMessageDialog(null, "Växten finns inte.");
        }
    }

    public static void main(String[] args) {
       Main main = new Main();
    }
}