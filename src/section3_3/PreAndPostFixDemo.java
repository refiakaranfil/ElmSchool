package section3_3;

public class PreAndPostFixDemo {
	
	public static void main(String[] args) {
		
		int i = 10;
        int j = 20;
        int x = 15;
        int y = 65;
    
        System.out.println("Pre-Increment Example");
        System.out.println(" Value of i : " + i); 
        System.out.println(" Value of i : " + ++i); 
        System.out.println(" Value of Incremented i : " + i); 
           
        System.out.println("Post-Increment Example");
        System.out.println(" Value of j : " + j); 
        System.out.println(" Value of j : " + j++); 
        
        System.out.println(" Value of Incremented j : " + j);
        
        System.out.println("Pre-Decrement Example");
        System.out.println(" Value of x : " + x); 
        System.out.println(" Value of x : " + --x); 
        System.out.println(" Value of Decremented x : " + x); 
           
        System.out.println("Post-Decrement Example");
        System.out.println(" Value of y : " + y); 
        System.out.println(" Value of y : " + y--); 
        System.out.println(" Value of Decremented y : " + y);
	}

}
