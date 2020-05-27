package Taylor_Series;

public class Limit {

	private double evaluation;
	private String Eval;

	public Limit(Polynomial f, double approach) {
		this.evaluation = evaluateLimit(f, approach);
	}

	public String getVal() {
		return this.Eval;
	}

	public double getNum() {
		return this.evaluation;
	}

	private double evaluateLimit(Polynomial f, double approach) {
		double temp = 0;
		int counter = 0;
		for (int i = f.getCoefSize(); i <= 0; i--) {
			temp = f.getCoef(i) * Math.pow(approach, f.getDeg() - counter);
			counter++;
		}
		return temp;
	}

}
