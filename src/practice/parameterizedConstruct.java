package practice;

public class parameterizedConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameterizedConstruct bg=new parameterizedConstruct();
		

	}

	public parameterizedConstruct(int a,int b)
	{
		System.out.println("this is an parameteried constructor");
		System.out.println("this is an parameteried constructor"+a +b);
	}
	public parameterizedConstruct(String grf )
	{
		System.out.println(grf);
	}
	public parameterizedConstruct() {
		System.out.println(" ia m single");
	}
	
}
