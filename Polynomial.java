package Taylor_Series;

import java.util.ArrayList;

public class Polynomial {

	private int degree;
	private ArrayList<Double> coefficients;
	
	public Polynomial(int degree, ArrayList<Double> coefficients) {
		this.degree = degree;
		for (double d : coefficients) {
			this.coefficients.add(d);
		}
		
	}
	
	public int getDeg() {
		return degree;
	}
	
	public double getCoef(int index) {
		for(int i=0; i<= this.coefficients.size()-1; i++) {
			
		}
	}
}
