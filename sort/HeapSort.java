package sort;

import fundation.groups.MaxPQ;

/**
 * Ω®∂—¿¥≈≈–Ú
 * @author onion
 *
 */
public class HeapSort extends Sort {
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a){
		MaxPQ<Comparable> maxPQ = new MaxPQ<Comparable>(a.length) ;
		for(int i = 0 ; i < a.length ; i ++){
			maxPQ.insert(a[i]);
		}
		for(int i = 0 ; i < a.length ; i ++){
			a[i] = maxPQ.delMax() ;
		}
	}
}
