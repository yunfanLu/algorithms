package sort;

public class SelectSort extends Sort {
	public static void sort(@SuppressWarnings("rawtypes") Comparable[] a) {
		for(int i = 0 ; i < a.length ; i ++){
			int min = i ;
			for(int j = i + 1 ; j < a.length ; j ++){
				if( less(a[min], a[j]) ) min = j ;
			}
			exch(a, i, min);
		}
	}
}
