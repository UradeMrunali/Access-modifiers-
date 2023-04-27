package PackB;

public class TestEmp2 {
	public static void main(String[] args) {
		Emp e = new Emp();
		
//private access modifier cannot access outside the class		
//		e.salary=202.54775;
		
//default access modifier is accessible in this class because it is in same package		
		e.id=12;
		e.name="Yashu";
		e.ph_no=937000000;
		
		System.out.println(e.id);
		System.out.println(e.name);
	}

}
