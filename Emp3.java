package PackB;

public class Emp3 extends Emp {
	void get()
	{
//id is default and in same package therefore it is accessible here		
		id=121;
		
//ph_no is protected, as protected property is accessible to its child class as well as
//		in which it is declared
		ph_no=25564;
		
//name is public therefore it is accessible here		
		name="jhu";
		
//salary is private, as it cannot access outside the  class		
		//salary=258.145;
	}

}
