package section6_2;

public class IndexOf {
	
	public static void main(String[] args) {
		
		String aboutUs = "UMS Education is an interactive educational platform to educate SDETs";
		String searchStr = "edu";
		int index = aboutUs.indexOf(searchStr);

		while(index != -1) {
		    System.out.println(index);
		    index = aboutUs.indexOf(searchStr, index + 1);
		}
	}

}
