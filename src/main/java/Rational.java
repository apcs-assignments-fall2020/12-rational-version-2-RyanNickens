public class Rational
{
    // instance variables: every Rational object will have its own copy
    // of these variables
    public int numerator;
    public int denominator;
    
    /**
     * Constructor: the special method that will actually create a new Rational
     * object
     * Constructors are always public
     * Constructors have the same name as the class
     * Constructors have no return type
     */
    public Rational(int a, int b) {
        numerator = a;
        denominator = b;
    }

    // This method takes two Rationals, add thems up,
    // and returns a Rational equal to the sum
    public static Rational add(Rational r, Rational s) {
        int newNumerator = r.numerator * s.denominator + s.numerator * r.denominator;
        int newDenominator = r.denominator * s.denominator;

        Rational x = new Rational(newNumerator, newDenominator);
        x = simplify(x);
        return x;
    }

    // Finds the greatest common factor between a and b
    public static int greatestCommonFactor(int a, int b) {
        int gcd = 1;

        int k = Math.max(a, b);

        for (int i = 1; i <= k; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    // This method is given a rational, and returns a simplified version
    // of the input rational
    // e.g. simplify(2/4) => 1/2
    // simplify(1/2) => 1/2
    public static Rational simplify(Rational r) {
        int factor = greatestCommonFactor(r.numerator, r.denominator);
        int newNumerator = r.numerator / factor;
        int newDenominator = r.denominator / factor;
        Rational x = new Rational(newNumerator, newDenominator);
        return x;
    }

    // *****
    // Here are all of our NON-STATIC methods:
    // *****

    // Returns whether or not the numerator is greater than or equal
    // to the denominator
    public boolean isImproper() {
        return (this.numerator >= this.denominator);
    }

    // Returns whether or not the Rational is currently simplified
    // or not
    public boolean isSimplified() {
        int factor = greatestCommonFactor(this.numerator, this.denominator);
        return (factor == 1); // YOUR CODE HERE
    }

    // Calculates the double value of our Rational
    public double calculateDecimalValue() {
        double val = ((double) this.numerator) / this.denominator;
        return val; // YOUR CODE HERE
    }

    // Returns the Rational we get from raising the rational number to an integer
    // power
    public Rational pow(int exponent) {
        int newNumerator = (int) (Math.pow(this.numerator, exponent));
        int newDenominator = (int) (Math.pow(this.denominator, exponent));
        Rational x = new Rational(newNumerator, newDenominator);
        return x; // YOUR CODE HERE
    }

    // Checks to see if either the numerator or denominator match a given number
    public boolean matches(int x) {
        return (this.numerator == x || this.denominator == x); // YOUR CODE HERE
    }

    // Methods you'll write for homework:
    // Returns whether or not the Rational is a negative number
    public boolean isNegative() {
        int newnew = (int)this.numerator;
        int newdew = (int)this.denominator;
        //double whole = (double)(newnew / newdew);
        if (newnew >=0 && newdew >=0) {
            return false;
        }
        if (newnew <=0 && newdew <=0){
            return false;
        }
        else {
            return true;
        }
        //return false; // YOUR CODE HERE
    }

    // Calculates the reciprocal of a Rational number.
    // The reciprocal of 3/4 is 4/3, the reciprocal of 1/2 is 2/1
    public Rational reciprocal() {
        int newNum = (int)this.denominator;
        int newDen = (int)this.numerator;
        Rational x = new Rational(newNum, newDen);
        return x; // YOUR CODE HERE
        
        //return null;

    }

    // Checks whether the current Rational is the exactly the same as other
    public boolean equals(Rational other) {
        if (this.numerator == other.numerator && this.denominator == other.denominator) {
            return true;
        }
        else {
            return false;
        }
        //return false; // YOUR CODE HERE
    }


    // This returns a string representation of a Rational (e.g. "1/2")
    @Override
    public String toString()
    {
        return this.numerator + "/" + this.denominator;
    }
}













