package test.group;

import fundation.groups.MaxPQ;

@SuppressWarnings("rawtypes")
class Key implements Comparable{
	public int id ;
	public int val ;
	@Override
	public int compareTo(Object o) {
		Key t = (Key) o ;
		return this.id < t.id ? 1 : -1 ;
	}
	@Override
	public String toString() {
		return "Key [id=" + id + ", val=" + val + "]";
	}
}

public class judgeMaxPQ {
	public static void main(String[] args) {
		int N = 10 ;
		MaxPQ<Key> maxPQ = new MaxPQ<Key>(N) ;
		for(int i = 0 ; i < 2 * N ; i ++){
			Key key = new Key() ;
			key.id = N - i ; key.val = i ;
			maxPQ.insert(key) ;
		}
		for(int i = 0 ; i < 2 * N ; i ++){
			Key t = maxPQ.delMax() ;
			System.out.println(t.toString());
		}
	}
}
