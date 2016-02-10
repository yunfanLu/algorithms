package sort;

@SuppressWarnings("rawtypes")
public abstract class Sort {
	public static void sort(Comparable[] a) {}
	@SuppressWarnings("unchecked")
	public static boolean less(Comparable v , Comparable u){
		return v.compareTo(u) < 0 ;
	}
	public static void show(Comparable[] a) {
		for(int i = 0 ; i < a.length ; i ++){
			if(i > 0) System.out.print(" ") ;
			System.out.print(a[i].toString());
		}
		System.out.println("");
	}
	public static void exch(Comparable[] a , int i , int j){
		Comparable t = a[i] ;
		a[i] = a[j] ;
		a[j] = t ;
	}
	public static boolean isSorted(Comparable[] a){
		for(int i = 0 ; i < a.length - 1 ; i ++){
			if( less(a[i], a[i + 1]) ) { return false ; }
		}
		return true ;
	}
}
