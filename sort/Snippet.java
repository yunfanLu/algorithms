package sort;

public class Snippet {
	
	public static void main(String[] args) {
		final int max_N = 100 ;
		Double[] a = new Double[max_N] ;
		for(int i = 0 ; i < a.length ; i ++){
			a[i] = i * 1.0 ;
			if(i % 2 == 0) a[i] = - a[i] ;
		}
		Sort.show(a);
//		SelectSort.sort(a) ;
// 		InsertSort.sort(a) ;
// 		ShellSort.sort(a) ;
//		MergeSort.sort(a);
		QuickSort.sort(a);
		Sort.show(a) ;
		boolean isSort = Sort.isSorted(a) ;
		if(isSort == false){
			System.out.println("NONONONONO") ;
		}else{
			System.out.println("YES") ;
		}
	}
}

