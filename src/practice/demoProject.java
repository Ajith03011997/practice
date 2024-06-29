package practice;

public class demoProject implements globally,environments,who,me{

	public static void main(String[] args) {
		globally am=new demoProject();
		am.greengo();
		am.yellowready();
		am.redstop();
		environments rj=new demoProject();
		rj.rain();rj.mountain();rj.sea();
		demoProject vm=new demoProject();
		vm.getData();
		vm.sandor();
		who lk=new demoProject();
		lk.name();
		lk.num();
		int scores2 = lk.scores;
		me centre=new demoProject();
		centre.mane();
		centre.suncun();
		//centre.scan();
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("the light is red");
	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("the light is green");
	}

	@Override
	public void yellowready() {
		// TODO Auto-generated method stub
		System.out.println("The light is yellow");
		
		
	}

	@Override
	public void sea() {
		// TODO Auto-generated method stub
		System.out.println("salt water");
		
	}

	@Override
	public void mountain() {
		// TODO Auto-generated method stub
		System.out.println("stones");
		
	}

	@Override
	public void rain() {
		// TODO Auto-generated method stub
		System.out.println("Drinking water");
	}
    public void getData()
    {
    	System.out.println("custom method");
    }
    public void sandor()
    {
    	System.out.println("the man is king");
    }

	@Override
	public String name() {
		// TODO Auto-generated method stub
		String son="ajith";
		System.out.println(""+son);
	    return son;
	}

	@Override
	public int num() {
		// TODO Auto-generated method stub
		int value=310;
	    System.out.println(value);
		return value;
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("scan centre");
		
	}

	@Override
	public void mane() {
		// TODO Auto-generated method stub
		System.out.println("scan centre trichy");
	}

	@Override
	public void suncun() {
		// TODO Auto-generated method stub
		System.out.println("scan centre kovai");
	}
}
