package Taylor_Series;

import acm.program.*;

import java.util.ArrayList;

import acm.graphics.*;
import acm.util.*;

public class Taylor_Runner extends ConsoleProgram {

	private TaylorGraph graph;
	private ArrayList<Double> Test = new ArrayList<Double>();

	public void run() {
		Test.add(2.0);
		Test.add(3.0);
		Test.add(4.0);
		Test.add(5.0);
		graph = new TaylorGraph();
		add(graph);
		Polynomial test = new Polynomial(3, Test);
		Limit testLim = new Limit(test, 3.0);
		println(testLim.getNum());
	}

<<<<<<< HEAD
	public void init() {
		
	}
=======

>>>>>>> 387785ed4b3034f2034e214ec320e556fabf2048
}
