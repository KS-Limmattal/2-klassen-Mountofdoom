public class FractionTester {
    public static void main(String[] args) {
        Fraction f = new Fraction(0, 3);
        // Der folgende Code funktioniert nur, wenn die Felder von Fraction nicht privat sind:
        
        System.out.println(f.getNumerator() + "/" + f.getDenominator());
        try{
        Fraction g = new Fraction(3, 0);
        System.out.println(g.getNumerator() + "/" + g.getDenominator());
        
        Fraction lFraction = new Fraction(0, 6);



        } catch (ArithmeticException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
        Fraction h = new Fraction(f);
        System.out.println(h.getNumerator() + "/" + h.getDenominator());
        System.out.println(f.equals(h));
        System.out.println(f.equals(lFraction));
       
        
        // toString():
        
        // Encapsulation, Getter und Setter:

        // Copy-Konstruktor und equals():
        
        // Klassen- und Instanzenmethoden:

        // statische Variablen:

    }

}
