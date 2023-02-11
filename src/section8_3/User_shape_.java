package section8_3;

public class User_shape_ {
	
	public static void main(String[] args) {
		
//		Dell dell = new Dell();
//		
//		dell.setModelNumber(1000001);
//		dell.setName("Dell");
//		dell.setScreenSize(17);
//		dell.model = "Alinware";
//		dell.memory = 1024;
//		dell.OS = "Windows";
//		
//		dell.printFields();
		
		Shape shape1 = new Shape("circle", 6);
		Shape shape2 = new Shape("square", 4);
		Shape shape3 = new Shape("triangle", 7);		
		Shape shape4 = new Shape("hectagon", 9);
		
		//write a code to print shape names which has a even length
		Shape [] shapes = {shape1, shape2, shape3, shape4};	
		
		for (Shape shape : shapes){
			if (shape.getLength() % 2 == 0) {
				
				System.out.println(shape.getName());			
			}			
		}
	}
}
