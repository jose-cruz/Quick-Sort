import java.util.ArrayList;

public class QuickSort {
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	int pivotPoint;
	int comparisons;
	
	public QuickSort(ArrayList<Integer> l){
		list = l;
		pivotPoint = 0;
		comparisons = 0;
	}
	
	public int getComparisons(){
		
		return comparisons;
		
	}
	
	public void sort(int low, int high){
		
		if(high > low){
			partition(low, high);
			sort(low, pivotPoint - 1);
			sort(pivotPoint + 1, high);
		}
		
	}
	
	public void partition(int low, int high){
		
		int pivotItem = list.get(low);
		int i, j;
		j = low;
		for(i = low + 1; i <= high; i++){
			comparisons++;
			if (list.get(i) < pivotItem){
				j++;
				exchange(i, j);
			}
		}
		pivotPoint = j;
		exchange(low, pivotPoint);
		
	}
	
	public void exchange(int index1, int index2){
		
		int temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);
		
	}

}
