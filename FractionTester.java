public class FractionTester {
    public static void main(String[] args) {
        Fraction f = new Fraction(0, 3); // create Fraction object
        // Testcode of Fraction class:
        // toString():
        Fraction lFraction = null;
        
        System.out.println(f.getNumerator() + "/" + f.getDenominator()); // print fraction
        try{
            Fraction g = new Fraction(3, 0); // Fraction with denominator 0
            System.out.println(g.getNumerator() + "/" + g.getDenominator());// print fraction
        
        



        } catch (ArithmeticException e) {   // Division by zero
            System.out.println("Fehler: " + e.getMessage());
        }
        Fraction h = new Fraction(f);
        // Encapsulation, Getter und Setter und Konstruktoren, equals():
        System.out.println(h.getNumerator() + "/" + h.getDenominator());// print fraction
        System.out.println(f.equals(h)); // should be true
        lFraction = new Fraction(0, 6); // visible everywhere
        System.out.println(f.equals(lFraction)); // should be true
       
        
        

        
        
        

        // statische Variablen:
        //final double PI = 3.14159; konstante Variable
        //try{
       //     PI = 3.14; // Fehler: cannot assign a value to final variable PI
        //}
        //catch (Exception e){
          //  System.out.println("Statische Variable: " + e.getMessage()); doesnt compile

   // }

}
}