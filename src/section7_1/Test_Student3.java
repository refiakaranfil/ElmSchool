package section7_1;

public class Test_Student3 {
	
	public static void main(String[] args) {   // we should be able to invoke a main() without any need to create an object in the Heap memory. 
//        Student3 s1 = new Student3();
//        s1.id = 101;
//        s1.name = "John";
//
//        Student3 s2 = new Student3();
//        s2.id = 102;
//        s2.name = "Jane";
//        s2.school = "Java4SDETs";
//
//        Student3 s3 = new Student3();
//        s3.id = 103;
//        s3.name = "Jonas";
//
//        s1.printStudent();
//        s2.printStudent();
//        s3.printStudent();
		
//		  System.out.println( Student.id );      // This will not compile. You will get an error stating that
												 //we 'Cannot make a static reference to the non-static field Student.id'.
//		  System.out.println( Student.school );  // a memory for static fields is allocated when the class that 
												 //the static fields belong to is called / invoked.
        
 
		
//		  Student3 s1 = new Student3();
//        s1.id = 101;
//        s1.name = "John";
//        s1.printStudent();          // In this case, we invoked the printStudent() after each Student object
//
//        Student3 s2 = new Student3();
//        s2.id = 102;
//        s2.name = "Jane";
//        s2.school = "Java4SDETs";
//        s2.printStudent();
//
//        Student3 s3 = new Student3();
//        s3.id = 103;
//        s3.name = "Jonas";
//        s3.printStudent();
		
		
		
		Student3 s1 = new Student3();
        s1.id = 101;
        s1.name = "John";

        Student3 s2 = new Student3();
        s2.id = 102;
        s2.name = "Jane";

        s1.printStudent();
        s2.read();
        s1.read();
        s1.read();
        Student3.read();
        Student3.read();
    }


}
