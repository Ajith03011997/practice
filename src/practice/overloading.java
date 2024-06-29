package practice;

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading ls=new overloading();
		ls.getData(6);
        ls.getData(100, 340);
        ls.getData("ajith");
	}
 
	public void getData(int a)
	{
		System.out.println("the output value "+a);	
		}
	public void getData(int a,int b)
	{
		System.out.println("The output value "+a +b);
	}
	public void getData(String nambe)
	{
		System.out.println("the output value is "+nambe);
	}
}
