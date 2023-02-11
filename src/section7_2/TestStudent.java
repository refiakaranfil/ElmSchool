package section7_2;

public class TestStudent {
	
	public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "John";
   //     s1.printStudent();

        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Jane";
   //   s2.school = "Java4SDETs";
   //   s2.printStudent();

        Student s3 = new Student();
        s3.id = 103;
        s3.name = "Jonas";
   //   s3.printStudent();

        s1.printStudent();
   //   s2.read();
   //   Student.read();
        s2.printStudent();
        s3.printStudent();
        
   //   System.out.println(Student.id);     Cannot make a static reference to the non-static field Student.id
   //   System.out.println(Student.school);  
        
//        
        Student s4 = new Student(101, "John Doe");
        
        System.out.println( s4.id );    // printing out student's id
        System.out.println( s4.name );  // printing out student's name
        System.out.println( s4.school );// printing out student's school
    }
        

}
