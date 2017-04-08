
public class TaxCalculator {

	public static void main(String[] args) {
		int a=10,b=5;
		Calculations calculations = new Calculations();
		calculations.addition(a,b);
		System.out.println(a+b);
		calculations.subtraction(a,b);
		System.out.println(a-b);
		calculations.multiplication(a,b);
		System.out.println(a*b);
		calculations.quotient(a,b);
		System.out.println(a/b);
		calculations.remainder(a,b);
        System.out.println(a%b);
	}

}

