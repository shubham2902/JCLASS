
public class GetInfo extends Student{

	public static void main(String[] args) {
		Student obj = new Student();
		
		System.out.println("Student Name: " + obj.Name);
		System.out.println("DOB: " + obj.month + "-"+ obj.date+ "-"+obj.year);
		
		Integer age = 2018 - obj.year;
		System.out.println("Age: "+ age);
		
	}

}
