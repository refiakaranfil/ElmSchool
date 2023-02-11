package section6_2;

public class ReplaceExample {
	
	public static void main(String args[]){  
        String s1 = "UMSEducation prepares SDETs";  
        
        String replaceString = s1.replace('e', 'a');
        System.out.println(replaceString);  
        
        
        
        String s2 = "UMSEducation prepares SDETs";  

        String replaceString2 = s2.replace("prepares", "for");
        System.out.println(replaceString2);


        
        
        
        String str = "ELM School";
        boolean bool = str.contains("ELM");
        
        System.out.println(bool);
        System.out.println(str.contains("elm"));

}
}
