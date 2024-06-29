package practice;

public class ifelsePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int a=1;
		if(a>=1)
		{
			System.out.println(true);
		}else	{
			System.out.println(false);
		}
        int i=71;
        if(i>90)
        {
        	System.out.println("you paased with grade A");
        }else if(i>70){
        	System.out.println("You passed with grade B");
        	}
        else if(i>=50) {
        	System.out.println("You passed with grade C");
        }
        	else{
        		System.out.println("You failed the exam try again");
        	}
        int[] arr= new int[5];
        arr[0]=80;
        arr[1]=100;
        arr[2]=90;
        arr[3]=50;
        arr[4]=30;
       for(int k=0;k<arr.length;)
       {
    	   System.out.println("the values are"+arr[k]);
    	   k++;
       }
       String[] name= {"ajith","vijay","kumar","babu"};
       for(int k=0;k<name.length;k++)
       {
	       System.out.println("the value is"+name[k]);
	       k++;
       }
       int z=1;
       for(z=0;z>=0;z++)
       {
    	   System.out.println(z);
    	   Thread.sleep(50);
       if(z>=100)
       {
    	   break;
       }
       }
      
       
        }
	}

