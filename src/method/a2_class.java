package method;

public class a2_class {
	
	
	
	int a=10;
	static int b=20;
	
	public static void main(String[] args) {
	 
		
		a2_class r= new a2_class();
		r.Disp();
		a2_class.show();
		
		
	}
   static void show() {
	   
	  System.out.println("show()"+b); 
   }
   
   void Disp()
   {
	   System.out.println("Disp()"+a+" "+b);
   }
}
