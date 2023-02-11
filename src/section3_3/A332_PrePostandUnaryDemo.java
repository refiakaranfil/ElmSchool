package section3_3;

public class A332_PrePostandUnaryDemo {
	
	public static void main (String[] args){
		PrePostDemo();
		UnaryDemo();
	}

	public static void PrePostDemo() {
		
		int i = 3;
        i++;
        System.out.println(i);    
        ++i;                     
        System.out.println(i);    
        System.out.println(++i);  
        System.out.println(i++);  
        System.out.println(i);
	}

	
    public static void UnaryDemo() {
    	
    	int result = +1;
        System.out.println(result);

        result--;
        System.out.println(result);

        result++;
        System.out.println(result);

        result = -result;
        System.out.println(result);

        boolean success = false;
        System.out.println(success);

        System.out.println(!success);
    }
    }