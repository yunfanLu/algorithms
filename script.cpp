#include <iostream>
using namespace std;


int main(int argc, char const *argv[])
{
	freopen("BinarySearch.txt" , "w" , stdout) ;
	int N = 10000 ; cout << N << endl ;
	for(int i = 0 ; i < N ; i ++){
		int x = i ;
		if(i > 0) cout << " " ; 
		cout << x ;
	}
	cout << endl;
	return 0;
}