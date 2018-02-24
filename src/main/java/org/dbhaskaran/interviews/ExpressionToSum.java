package org.dbhaskaran.interviews;

public class ExpressionToSum {

	public static void main(String[] args) {
		int sum = ExpressionToSum.expression("1+3-6");
		System.out.println(sum);
		sum = ExpressionToSum.expression("8-5+7-23+19-5");
		System.out.println(sum);
		sum = ExpressionToSum.expression("1+3-6");
		System.out.println(sum);

	}
	
	public static int expression(String str) {
		int sum = 0;
		String curr = "";
		boolean isPositive = true;
		char[] charExp = str.toCharArray();
 		for(int i=0; i<charExp.length; i++) {
 			if (charExp[i] == '+') {
 				if(isPositive)
 					sum = sum + Integer.parseInt(curr);
 				else
 					sum = sum - Integer.parseInt(curr);
 				isPositive = true;
 				curr ="";
 				continue;
 			}
 			else if (charExp[i] == '-') {
 				if(isPositive)
 					sum = sum + Integer.parseInt(curr);
 				else
 					sum = sum - Integer.parseInt(curr);
 				isPositive = false;
 				curr = "";
 				continue;
 			}
 			else
 				curr += charExp[i];
 		}
 		if(isPositive)
				sum = sum + Integer.parseInt(curr);
			else
				sum = sum - Integer.parseInt(curr);
 		return sum;
	}

}
