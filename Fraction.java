

public class Fraction {
	private int num;
	private int denominator;
	private int newNum;
	private int newDenominator;
	
	Fraction (){
		this.num = 1;
		this.denominator = 2;
	}
	Fraction(int num ,int denominator){
		this.num = num;
		this.denominator = denominator;
	}
	void setNumerator  (int num){
		this.num = num;
	}
	void setDenominator  (int denominator){
		this.denominator = denominator;
	}
	int getNumerator() {
		return this.num;
	}
	int getDenominator() {
		return this.denominator;
	}
	
	void findRatio() {
		int total = 2;
		while (total <= num && total <= denominator) {
			if(num % total == 0 && denominator % total == 0) {
				num = num / total;
				denominator = denominator / total;
			}
			else {
				total++;
			}
		}
		System.out.println("Ratio of two integers are  " + num + " : " +denominator);
	}
	void display() {
		System.out.println("Numerator : " + this.num + " Denominator : " + this.denominator);
	}
	public boolean equals(int newNume ,int newDenominator ) {
		this.newNum = newNum;
		this.newDenominator = newDenominator;
		

		if(this.num == newNum && this.denominator == newDenominator) {
			System.out.println("fractions are identical");
			return true;
		}
		else {
			System.out.println("Fractions are not identical");
			return false;
		}
	}
	
	
	
	
	
}
