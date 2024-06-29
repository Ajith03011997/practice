package practice;

public class cldClass extends prtClass {
	int fruit=200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cldClass hj=new cldClass();
		hj.demo();
		hj.tj();
		

	}
	
	public cldClass()
	{
		super();
	  System.out.println("cld constructor");
	}
	public void tj()
	{
		super.tj();
	System.out.println("the values is from cld class");
	}
	
	public void demo()
	{
		
		System.out.println(fruit);
		System.out.println(super.fruit);
	}

}
