package day02.misc;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Academy academy = new Academy();
		academy.setName("Freshworks STS Software Academy");
		academy.setId(12345);
		academy.setCode("FSSA");
		
		Student student1 = new Student();
		System.out.println(Student.count);
		student1.setName("Vignesh");
		student1.setId(137);
		student1.setEmail("vignesh.ramachandran@fssa.freshworks.com");
		
		Student student2 = new Student();
		System.out.println(Student.count);
		student2.setName("Maruthan");
		student2.setId(132);
		student2.setEmail("maruthan.alagar@fssa.freshworks.com");

	}

}
