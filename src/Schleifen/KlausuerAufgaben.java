package Schleifen;

public class KlausuerAufgaben {

    public static void main(String[] args) {
        System.out.println(rightPart("134679", '2'));
        System.out.println(getRightPart("hertz"));
        System.out.println(getRightPart("tee"));
    }

    /**
     * Liefert das Endstück des übergebenen String rechts von der letzten Stelle,
     * an der das übergebene Zeichen im String vorkommt. Falls das Zeichen nicht
     * vorkommt, liefert die Methode den gesamten String.
     * Beispiel: rightPart("21324679", '2') = "4679"
     *
     * @param s ein String, von dem das Endstück geliefert wird
     * @param c ein Zeichen
     * @return den Teilstring rechts von der letzten Stelle, an der c in s vorkommt,
     * <p>
     * oder s, wenn c nicht in s vorkommt
     */
    public static String rightPart(String s, char c) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) != c) {
            i = i - 1;
        }
        return s.substring(i + 1, s.length());
    }

    /**
     * Liefert das längste Endstück des übergebenen String, in dem die
     * zeichen echt aufsteigend sind.
     * Beispiele: getRightPart ("hertz") = "ertz"
     * <p>
     * getRightPart ("tee") =
     *
     * @param s der String, von dem das Endstück geliefert wird;
     *          es wird vorausgesetzt, dass s nicht leer ist
     *          Greturn das längste Endstück von s, in dem die Zeichen echt
     *          aufsteigend sind
     */

    public static String getRightPart(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) > s.charAt(i - 1)) {
            i = i - 1;
        }

        return s.substring(i, s.length());
    }
}


