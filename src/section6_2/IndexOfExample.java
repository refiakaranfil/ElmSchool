package section6_2;

public class IndexOfExample {
	
	public static void main(String args[]){  
        String s1 = "this is index of example";  
        
        int index1 = s1.indexOf("is");             // returns the index of 'is' substring  
        int index2 = s1.indexOf("index");          // returns the index of 'index' substring  
        System.out.println(index1 + " " + index2);

  
        int index3 = s1.indexOf("is", 4);          // returns the index of 'is' substring after 4th index  
        System.out.println(index3);                
  

        int index4 = s1.indexOf('s');              // returns the index of 's' char value  
        System.out.println(index4);
        
        
        
        String s2 = "This is indexOf method";         
        
        int index = s2.indexOf("method", 10);             // returns the index of 'method' substring after index 10
        System.out.println("index of method after index 10: " + index);  

        index = s2.indexOf("method", 20);                 // returns -1 if 'method' substring is not found  
        System.out.println("index of method after index 20: " + index);          
    }

}
