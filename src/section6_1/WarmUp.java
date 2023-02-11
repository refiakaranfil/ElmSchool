package section6_1;

public class WarmUp {
	
	public static void main(String[] args) {
			
			//Write a program that checks given String and finds if it has cat and dog in it
			//If only cat appears print "cats only"
			//If only dog appears print dog only
			//If both are there print I love animals
			//None of the are here
			//contains(String str) -> returns(boolean) if str is appearing in given String
			String str = "dogdogdog";
			
			if (str.contains("cat") && str.contains("dog")) {
				System.out.println("I love animals");
			}else if (str.contains("cat")) {
				System.out.println("cats only");
			}else if(str.contains("dog")) {
				System.out.println("dogs only");
			}else {
				System.out.println("None of them are here");
			}
			
			//how many dogs is in given String
			//c231345235dogcdogcdog
			int dogCount = 0;
			int index = 0;
			
			while (index != -1) {
					//-1
				index = str.indexOf("dog", index);
				if (index != -1) {
					dogCount++; //3
					index += 3; //9
				}
				
			}
			System.out.println(dogCount);

			
		}

	}


