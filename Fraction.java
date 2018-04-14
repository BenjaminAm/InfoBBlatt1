
public class Fraction {
	int numerator;
	int denominator;
	
	// Konstruktor für ganze Zahlen.
	public Fraction(int numerator) {
		this.numerator = numerator;
		this.denominator = 1;
	}
	
	// Konstruktor für Brüche mit Nenner > 1 
	public Fraction(int numerator, int denominator) {
		this(numerator);
		this.denominator = denominator;
		// Suche nach dem größtmöglichen Teiler und Kürzen.
		for(int i = this.denominator; i > 1; i--) {
			if(this.numerator % i == 0 && this.denominator % i == 0) {
				this.numerator = this.numerator / i;
				this.denominator = this.denominator / i;
			}
		}
	}
	
	// Multiplikation mit einer ganzen Zahl
	public Fraction multiply(int factor) {
		 return new Fraction(this.numerator*factor, this.denominator);
	}
	
	// Multiplikation mit einem Bruch
	public Fraction multiply(Fraction factor) {
		return new Fraction(this.numerator*factor.numerator, 
				this.denominator*factor.denominator);
	}
	
	// Division mit einem Bruch
	public Fraction divide(Fraction divisor) {
		return new Fraction(this.numerator*divisor.denominator,
				this.denominator*divisor.numerator);
	}
	
	// Multiplikation mit einer variablen Liste von Brüchen
	public Fraction multiply(Fraction[] factors) {
		int num = this.numerator;
		int den = this.denominator;
		for(int i = 0; i < factors.length; i++) {
			num = num * factors[i].numerator;
			den = den * factors[i].denominator;
		}
		return new Fraction(num, den);
	}
	
	// Funktion für die Umwandlung in String
	public String toString() {
		return (this.numerator + "/" + this.denominator);	
	}
	
}
