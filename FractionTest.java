
public class FractionTest {
	public static void main(String[] args) {
		
		Fraction bruch1 = new Fraction(4);
		Fraction bruch2 = new Fraction(12, 16);
		
		if(bruch1.numerator == 4 && bruch1.denominator == 1) {
			System.out.println("Konstruktor 1 funktioniert.");
		}
		
		if(bruch2.numerator == 3 && bruch2.denominator == 4) {
			System.out.println("Konstruktor 2 funktioniert.");
		}
		
		bruch1 = bruch1.multiply(10);
		if(bruch1.numerator == 40 && bruch1.denominator == 1) {
			System.out.println("Methode 1 funktioniert.");
		}
		
		bruch1 = bruch1.multiply(bruch2);
		if(bruch1.numerator == 30 && bruch1.denominator == 1) {
			System.out.println("Methode 2 funktioniert.");
		}
		
		bruch1 = bruch1.divide(bruch2);
		if(bruch1.numerator == 40 && bruch1.denominator == 1) {
			System.out.println("Methode 3 funktioniert.");
		}
		
		Fraction bruch3 = new Fraction(5, 6);
		Fraction bruch4 = new Fraction(4, 7);
		Fraction[] bruchliste = {bruch2, bruch3, bruch4};
		
		bruch1 = bruch1.multiply(bruchliste);
		if(bruch1.numerator == 100 && bruch1.denominator == 7) {
			System.out.println("Methode 4 funktioniert.");
		}
		
		if(bruch1.toString().equals("100/7")) {
			System.out.println("toString() funktioniert.");
		}
	}
}
