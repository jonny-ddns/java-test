package java_basic02.simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateE {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat format2 = new SimpleDateFormat("HH:mm:ss");

		format1.format(date);
				
		System.out.println(format1.format(date));
		System.out.println(format2.format(date));
	}
}

