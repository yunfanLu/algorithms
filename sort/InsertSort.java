package sort;

public class InsertSort extends Sort {
	public static void sort(Comparable[] a){
		for(int i = 1 ; i < a.length ; i ++){
			for(int j = i ; j > 0 && less(a[j - 1], a[j]) ; j --){
				exch(a, j, j);
			}
		}
	}
}
