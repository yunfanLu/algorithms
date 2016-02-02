package example.stack;

import fundation.groups.StackByList;

public class Evaluate {

	public static void main(String[] args) {
		String str = new String("(1+2*(3/(4-5)))") ;
		double res = Dijistra(str) ;
		System.out.println("res = " + res);
	}
	public static double Dijistra(String str) {
		StackByList<String> ops = new StackByList<String>() ;
		StackByList<Double> val = new StackByList<Double>() ;
		for(int i = 0 ; i < str.length() ; i ++){
			String ch = str.substring(i, i + 1) ;
			System.out.print(" " + ch);
			if		( ch.equals("(") ) ;
			else if ( ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/") ) ops.push(ch) ;
			else if ( ch.equals(")") ){
				String op = ops.pop() ;
				double va = val.pop() ;
				if 		( op.equals("+") ) va = val.pop() + va ;
				else if ( op.equals("-") ) va = val.pop() - va ;
				else if ( op.equals("*") ) va = val.pop() * va ;
				else if ( op.equals("/") ) va = val.pop() / va ;
				val.push(va) ;
			}
			else val.push(Double.parseDouble(ch)) ;
		}
		return val.pop();
	}

}
