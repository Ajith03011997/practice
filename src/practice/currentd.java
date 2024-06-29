package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class currentd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date tc=new Date();
		System.out.println(tc.toString());
		SimpleDateFormat bg=new SimpleDateFormat("M/d/yyyy");
		System.out.println(bg.format(tc));
		
	}

}
