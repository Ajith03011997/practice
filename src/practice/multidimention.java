package practice;

public class multidimention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][]=new int[2][3];
		b[0][0]=5;
		b[0][1]=7;
		b[0][2]=9;
		b[1][0]=9;
		b[1][1]=4;
		b[1][2]=3;
		System.out.println(b[0][2]);
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(b[i][j ]);
			}
		}

	}

}
