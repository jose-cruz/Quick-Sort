import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Driver {
	
public static void main(String[] args) throws IOException {
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		int iniLow = 0;
		int iniHigh = -1;
		//l1.add(12); l1.add(23); l1.add(1); l1.add(2); l1.add(5);
		BufferedReader br = new BufferedReader(new FileReader("quicksort.txt"));
		String line;
		while ((line = br.readLine()) != null) {
			
			l1.add(Integer.parseInt(line));
			iniHigh++;
			
		}
		br.close();
		
		
//		ArrayList<Integer> l2 = new ArrayList<Integer>();
//		l2.add(3);
//		l2.add(5);
//		l2.add(7);
//		l2.add(1);
//		l2.add(9);
//		l2.add(4);
//		l2.add(8);
//		l2.add(2);
//		l2.add(6);
		
		QuickSort qs1 = new QuickSort(l1);
		qs1.sort(iniLow, iniHigh);
		System.out.println("Using the first number as a pivot:");
		System.out.println("Number of comparisons: " + qs1.getComparisons());
		
		QuickSort qs2 = new QuickSort(l1);
		qs2.exchange(iniHigh, iniHigh);
		qs2.sort(iniLow, iniHigh);
		System.out.println("Using the last number as a pivot:");
		System.out.println("Number of comparisons: " + qs2.getComparisons());
		
		
		
	}

}
