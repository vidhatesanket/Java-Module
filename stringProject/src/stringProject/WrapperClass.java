package stringProject;

public class WrapperClass {
	public static void main(String args[]) {
	   int i = Integer.parseInt("1000", 2); 
       long l = Long.parseLong("1111", 4); 
       
       System.out.println(i); 
       System.out.println(l); 
       
       Integer I = Integer.valueOf("10"); 
       System.out.println(I); 
       
       Double D = Double.valueOf("10.0"); 
       System.out.println(D);
       System.out.println(I instanceof Number );
       
       System.out.println(Integer.parseInt("75"));
       
       String s = Integer.toString(10); 
       System.out.println(s); 
       
      char arr[]= {'H','e','l','l','o',' ','W','o','r','l','d'};
      System.out.println(String.valueOf(arr));
	}
}
