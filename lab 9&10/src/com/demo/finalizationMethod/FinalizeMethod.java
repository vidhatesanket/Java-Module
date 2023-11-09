package com.demo.finalizationMethod;

import java.util.ArrayList;
import java.util.List;

public class FinalizeMethod {
	int i;
	
	public  FinalizeMethod(int i){
		this.i=i;
		
		
	}

    protected void finalize() throws Throwable
    {
    	
        try {
 
            System.out.println("inside demo's finalize()"+i);
        }
        catch (Throwable e) {
 
            throw e;
        }
        finally {
 
            System.out.println("Calling finalize method"
                               + " of the Object class "+i);
 
            // Calling finalize() of Object class
            super.finalize();
        }
    }
 

	public static void main(String[] args) throws Throwable {
		
		    // Driver code
		  
		 
		        // Creating demo's object
		FinalizeMethod d;
		
		        List<Integer> lst=new ArrayList<>();
		        d=null;
		        d=new FinalizeMethod(10);
		        d=new FinalizeMethod(20);
		        d=new FinalizeMethod(30);
		        d=new FinalizeMethod(40);
		        System.gc();
		        d=new FinalizeMethod(50);
		        d=new FinalizeMethod(60);
		        // Calling finalize of demo
		        d.finalize();
		
	}

}
