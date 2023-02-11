package section8_5;

public class T_Garden {
	
	public static void main(String[] args) {

		T_AppleTree appleTree = new T_AppleTree("Fuji", 10, "honeybee");

		appleTree.grow();

		T_OakTree oakTree = new T_OakTree("White Oak", 25, "acorn");
		oakTree.grow();


		appleTree.methodFood();

		appleTree.staticAppleTreeMehod();

		T_Food.methodStatic();



		}

}
