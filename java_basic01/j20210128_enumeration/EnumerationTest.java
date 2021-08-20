package _past.j20210128_enumeration;
import java.util.Calendar;
public class EnumerationTest {
	public static void main(String[] args) {
		/*
		 * enumeration 열거 타입
		 * -몇가지 값으로 한정된 값만을 갖는 타입
		 * -ex. 월화수목금토일 / 봄여름가을겨울 등
		 */
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		System.out.println("today : "+ today);
	}
}
