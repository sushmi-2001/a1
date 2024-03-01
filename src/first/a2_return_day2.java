//package first;
//
//public class a2_return_day2 {
//	
//	// to add number and call void
//	
////	int i=4,j=5,k;
//	
//	public static void main(String[] args) {
//
//		a2_return_day2 day2 = new a2_return_day2();
//		
//		day2.add();
//
//	}
//
//	int add() {
//		
//		int value = 100;
//		
////		k=i+j;
//		
//		System.out.print("i am from add()" + value);
//		
//		return value;// return statement must be the last statement
//
//	}
//
//}


//package first;
//
//public class a2_return_day2 {
//	int i = 4, j = 5, k;
//	
//	//processing
//	
//	
//	public static void main(String[] args) {
//
//		a2_return_day2 day2 = new a2_return_day2();
//		
//		
//		int returnedvalue = day2.add();
//		
////		System.out.println("the returned value is" +returnedvalue);
//		
//		System.out.println(day2.k);
//		
//		System.out.println(returnedvalue);
//
//	}
//
//	int add() {
//		
//		int value = 100;
//		
//		value = i * value + j * i ;
//		
//		return value;
//		
//	
//
//	}
//
//}


//package first;
//
//public class a2_return_day2 {
//	
//	
//	
//	public static void main(String[] args) {	
//
//		a2_return_day2 day2 = new a2_return_day2();
//		
//		day2.add(35, 65);//actual parameter
//
//	}
//
//	void add(int value1, int value2)//formal parameter {
//		
//		System.out.println("inside add()....");
//		
//		
//	
//
//	}
//
//}


//package first;
//
//public class a2_return_day2 {
//	
//	// return and method argument are opposite but exactly same
//	
//	public static void main(String[] args) {	
//
//		a2_return_day2 day2 = new a2_return_day2();
//		
//		day2.add(35, 65);//actual parameter
//
//	}
//
//	void add(int value1, int value2){
//		
//		int result = value1 + value2;
//		
//		System.out.println("inside add()...."+result);//return processed
//		
//		
//	
//
//	}
//
//}
//

package first;

public class a2_return_day2 {
	
	// co-variant return
	
	public static void main(String[] args) {	

		a2_return_day2 day2 = new a2_return_day2();
		
		int returnedvalue = day2.add(35,65);
		
	 System.out.println(returnedvalue);

	}

	int add(int value1, int value2){
		
		int result = value1 + value2;
		
		return result;
		
		
	

	}

}
