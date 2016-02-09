package fundation.groups;
/**
 * 优先队列
 * @author onion
 * @param <Key>
 */
public class MaxPQ<Key extends Comparable> {
	private Key[] pq ;
	private int N = 0 ; // 储存在pq[1 ... N] 中
	
	/**
	 * 构造函数
	 * @param max_N
	 */
	@SuppressWarnings("unchecked")
	public MaxPQ(int max_N){
		pq = (Key[]) new Comparable[max_N + 1] ;
	}
	public boolean isEmpty(){ return N == 0 ; }
	public int size(){ return N ; }
	
	/**
	 * 插入元素 V
	 * @param V
	 */
	public void insert(Key V){
		pq[++ N] = V ;
		swim(N) ;
	}
	private void swim(int k) {
		while(k > 1 && less(k/2, k) ){
			exch(k/2 , k) ;
			k = k / 2 ;
		}
	}
	private void exch(int i, int j) {
		Key t = pq[i] ;
		pq[i] = pq[j] ;
		pq[j] = t ;
	}
	private boolean less(int i, int j) {
		return pq[i].compareTo(pq[j]) < 0 ;
	}

	/**
	 * 删除操作
	 */
	public Key delMax(){
		Key max = pq[1] ;
		exch(1, N --) ;
		pq[N + 1] = null ;
		sink(1) ;
		return max ;
	}
	private void sink(int k) {
		while(2 * k <= N){
			int j = 2 * k ;
			if( j < N && less(j , j + 1) ) j ++ ;
			if( less(k, j) == false ) break ;
			exch(k, j) ;
			k = j ;
		}
	}
	
}
