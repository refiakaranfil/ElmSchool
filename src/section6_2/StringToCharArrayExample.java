package section6_2;

public class StringToCharArrayExample {
	
	public static void main(String args[]){  
        String s1 = "hello";  

        char[] ch = s1.toCharArray();  
        for(int i = 0; i < ch.length; i++){  
            System.out.print( ch[i] + " ");  
        }  
        
        
        
        
        String s2 = "Welcome to Java4SDETs";  
        char[] chr = s2.toCharArray();  
        int len = chr.length;  

        System.out.println("Char array length: " + len);  
        
        System.out.println("Char Array elements: ");  
        for (int i = 0; i < len; i++) {  
            System.out.print( chr[i] + " " );  
        }  
    }

}
