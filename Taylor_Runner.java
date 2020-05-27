package Taylor_Series;

import acm.program.*;

import java.util.ArrayList;

import acm.graphics.*;
import acm.util.*;

public class Taylor_Runner extends ConsoleProgram {

	private TaylorGraph graph;
	private double[] test1 = {2.0, 3.0 ,4.0 ,5.0};

	public void run() {
		Polynomial f = new Polynomial(5,test1);
		f.getCoef(3);
	}
}
