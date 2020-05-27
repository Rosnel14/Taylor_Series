package Taylor_Series;

import java.util.ArrayList;

public class Polynomial {

	private int degree;
	private double[] coefficients;// Gonna change to an array

	public Polynomial(int degree, double[] coefficients) {
		this.degree = degree;
		for (int i = 0; i <= coefficients.length; i++) {
			this.coefficients[i] = (coefficients[i]);
		}

	}

	public int getDeg() {
		return degree;
	}

	public double getCoef(int index) {
		return this.coefficients[index];
	}

	public int getCoefSize() {
		return this.coefficients.length;
	}
}
