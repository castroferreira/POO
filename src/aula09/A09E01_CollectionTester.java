package aula09;

import java.util.*;
import static java.lang.System.*;

public class A09E01_CollectionTester {
	public static void main(String[] args) {
		final int DIM = 1000;
		out.println("Collection        1000   5000    10000    20000     40000    100000");
		Collection<Integer> col1, col2, col3, col4, col5, col6;
		
		col1 = new ArrayList<Integer>();
		col2 = new ArrayList<Integer>();
		col3 = new ArrayList<Integer>();
		col4 = new ArrayList<Integer>();
		col5 = new ArrayList<Integer>();
		col6 = new ArrayList<Integer>();
		
		out.println("ArrayList");
		out.printf("%-17s %.2f %6.2f %8.2f %8.2f %9.2f %9.2f\n", "add", checkPerformanceAdd(col1, DIM),
				checkPerformanceAdd(col2, DIM + 4000), checkPerformanceAdd(col3, DIM + 9000),
				checkPerformanceAdd(col4, DIM + 19000), checkPerformanceAdd(col5, DIM + 39000),
				checkPerformanceAdd(col6, DIM + 99000));
		out.printf("%-17s %.2f %6.2f %8.2f %8.2f %9.2f %9.2f\n", "search", checkPerformanceSearch(col1, DIM),
				checkPerformanceSearch(col2, DIM + 4000), checkPerformanceSearch(col3, DIM + 9000),
				checkPerformanceSearch(col4, DIM + 19000), checkPerformanceSearch(col5, DIM + 39000),
				checkPerformanceSearch(col6, DIM + 99000));
		out.printf("%-17s %.2f %6.2f %8.2f %8.2f %9.2f %9.2f\n", "remove", checkPerformanceRemove(col1, DIM),
				checkPerformanceRemove(col2, DIM + 4000), checkPerformanceRemove(col3, DIM + 9000),
				checkPerformanceRemove(col4, DIM + 19000), checkPerformanceRemove(col5, DIM + 39000),
				checkPerformanceRemove(col6, DIM + 99000));
		
		col1 = new ArrayList<Integer>();
		col2 = new LinkedList<Integer>();
		col3 = new LinkedList<Integer>();
		col4 = new LinkedList<Integer>();
		col5 = new LinkedList<Integer>();
		col6 = new LinkedList<Integer>();
		
		out.println("LinkedList");
		out.printf("%-17s %.2f %6.2f %8.2f %8.2f %9.2f %9.2f\n", "add", checkPerformanceAdd(col1, DIM),
				checkPerformanceAdd(col2, DIM + 4000), checkPerformanceAdd(col3, DIM + 9000),
				checkPerformanceAdd(col4, DIM + 19000), checkPerformanceAdd(col5, DIM + 39000),
				checkPerformanceAdd(col6, DIM + 99000));
		out.printf("%-17s %.2f %6.2f %8.2f %8.2f %9.2f %9.2f\n", "search", checkPerformanceSearch(col1, DIM),
				checkPerformanceSearch(col2, DIM + 4000), checkPerformanceSearch(col3, DIM + 9000),
				checkPerformanceSearch(col4, DIM + 19000), checkPerformanceSearch(col5, DIM + 39000),
				checkPerformanceSearch(col6, DIM + 99000));
		out.printf("%-17s %.2f %6.2f %8.2f %8.2f %9.2f %9.2f\n", "remove", checkPerformanceRemove(col1, DIM),
				checkPerformanceRemove(col2, DIM + 4000), checkPerformanceRemove(col3, DIM + 9000),
				checkPerformanceRemove(col4, DIM + 19000), checkPerformanceRemove(col5, DIM + 39000),
				checkPerformanceRemove(col6, DIM + 99000));
		
		col1 = new Stack<Integer>();
		col2 = new Stack<Integer>();
		col3 = new Stack<Integer>();
		col4 = new Stack<Integer>();
		col5 = new Stack<Integer>();
		col6 = new Stack<Integer>();
		
		out.println("Stack");
		out.printf("%-17s %.2f %6.2f %8.2f %8.2f %9.2f %9.2f\n", "add", checkPerformanceAdd(col1, DIM),
				checkPerformanceAdd(col2, DIM + 4000), checkPerformanceAdd(col3, DIM + 9000),
				checkPerformanceAdd(col4, DIM + 19000), checkPerformanceAdd(col5, DIM + 39000),
				checkPerformanceAdd(col6, DIM + 99000));
		out.printf("%-17s %.2f %6.2f %8.2f %8.2f %9.2f %9.2f\n", "search", checkPerformanceSearch(col1, DIM),
				checkPerformanceSearch(col2, DIM + 4000), checkPerformanceSearch(col3, DIM + 9000),
				checkPerformanceSearch(col4, DIM + 19000), checkPerformanceSearch(col5, DIM + 39000),
				checkPerformanceSearch(col6, DIM + 99000));
		out.printf("%-17s %.2f %6.2f %8.2f %8.2f %9.2f %9.2f\n", "remove", checkPerformanceRemove(col1, DIM),
				checkPerformanceRemove(col2, DIM + 4000), checkPerformanceRemove(col3, DIM + 9000),
				checkPerformanceRemove(col4, DIM + 19000), checkPerformanceRemove(col5, DIM + 39000),
				checkPerformanceRemove(col6, DIM + 99000));
		
		col1 = new TreeSet<Integer>();
		col2 = new TreeSet<Integer>();
		col3 = new TreeSet<Integer>();
		col4 = new TreeSet<Integer>();
		col5 = new TreeSet<Integer>();
		col6 = new TreeSet<Integer>();
		
		out.println("TreeSet");
		out.printf("%-17s %.2f %6.2f %8.2f %8.2f %9.2f %9.2f\n", "add", checkPerformanceAdd(col1, DIM),
				checkPerformanceAdd(col2, DIM + 4000), checkPerformanceAdd(col3, DIM + 9000),
				checkPerformanceAdd(col4, DIM + 19000), checkPerformanceAdd(col5, DIM + 39000),
				checkPerformanceAdd(col6, DIM + 99000));
		out.printf("%-17s %.2f %6.2f %8.2f %8.2f %9.2f %9.2f\n", "search", checkPerformanceSearch(col1, DIM),
				checkPerformanceSearch(col2, DIM + 4000), checkPerformanceSearch(col3, DIM + 9000),
				checkPerformanceSearch(col4, DIM + 19000), checkPerformanceSearch(col5, DIM + 39000),
				checkPerformanceSearch(col6, DIM + 99000));
		out.printf("%-17s %.2f %6.2f %8.2f %8.2f %9.2f %9.2f\n", "remove", checkPerformanceRemove(col1, DIM),
				checkPerformanceRemove(col2, DIM + 4000), checkPerformanceRemove(col3, DIM + 9000),
				checkPerformanceRemove(col4, DIM + 19000), checkPerformanceRemove(col5, DIM + 39000),
				checkPerformanceRemove(col6, DIM + 99000));
	}

	private static double checkPerformanceAdd(Collection<Integer> col, int DIM) {
		double start, stop, delta;
		// Add
		start = System.nanoTime(); // clock snapshot before
		for (int i = 0; i < DIM; i++)
			col.add(i);
		stop = System.nanoTime(); // clock snapshot after
		delta = (stop - start) / 1e6; // convert to milliseconds
		return delta;
	}

	private static double checkPerformanceSearch(Collection<Integer> col, int DIM) {
		double start, stop, delta;
		// Search
		start = System.nanoTime(); // clock snapshot before
		for (int i = 0; i < DIM; i++) {
			int n = (int) (Math.random() * DIM);
			if (!col.contains(n))
				System.out.println("Not found???" + n);
		}
		stop = System.nanoTime(); // clock snapshot after
		delta = (stop - start) / 1e6; // convert nanoseconds to milliseconds
		return delta;
	}

	private static double checkPerformanceRemove(Collection<Integer> col, int DIM) {
		Iterator<Integer> iterator;
		double start, stop, delta;
		// Remove
		start = System.nanoTime(); // clock snapshot before
		iterator = col.iterator();
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		stop = System.nanoTime(); // clock snapshot after
		delta = (stop - start) / 1e6; // convert nanoseconds to milliseconds
		return delta;
	}
}