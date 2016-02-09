package test.fundation;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import fundation.BinarySearch;

public class Main{
	/**
	 * ²âÊÔ¶þ·Ö
	 * @throws IOException
	 */
	public static void BinarySearch() throws IOException{
		@SuppressWarnings("resource")
		Scanner cin = new Scanner(new File("BinarySearch.txt")) ;
		int N = cin.nextInt() ;
		int[] whitelist = new int[N] ;
		for(int i = 0 ; i < N ; i ++) whitelist[i] = cin.nextInt() ;
		Arrays.sort(whitelist) ;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in) ;
		while(in.hasNext()){
			int x = in.nextInt() ;
			System.out.println("x in whiteList is " + BinarySearch.rank(x , whitelist));
		}
	}
	public static void main(String[] args) throws Exception{
		
	}
}