// UML Diagramm


    class Fraction {
        ~ static int numberOfFractions
        - int numerator
        - int denominator
        + Fraction(int numerator, int denominator)
        + Fraction(Fraction f)
        + void setNumerator(int numerator)
        + int getNumerator()
        + int getDenominator()
        + void setDenominator(int denominator)
        + boolean equals(Fraction f)
        + String toString()
    }
    Additional notes: Fraction(int numerator, int denominator) checks for denominator != 0

    


