package _dataStructure_algorighm.pack01_temp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SelfNumber {

/*
https://wikidocs.net/238

어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.

		d(91) = 9 + 1 + 91 = 101

예를 들어 이 때, n을 d(n)의 제네레이터(generator)라고 한다. 위의 예에서 91은 101의 제네레이터이다.

어떤 숫자들은 하나 이상의 제네레이터를 가지고 있는데, 101의 제네레이터는 91 뿐 아니라 100도 있다.
그런데 반대로, 제네레이터가 없는 숫자들도 있으며, 이런 숫자를 인도의 수학자 Kaprekar가 셀프 넘버(self-number)라 이름 붙였다.
예를 들어 1, 3, 5, 7, 9, 20, 31 은 셀프 넘버 들이다.

1 이상이고 5000 보다 작은 모든 셀프 넘버들의 합을 구하라.
*/
	
	
	/*
	 * 숫자가 abcd 라면
	 * a * 10의 3제곱 
	 * b * 10의 2제곱
	 * c * 10의 1제곱
	 * d * 10의 0제곱
	 * + a + b + c + d 이다
	 * 
	 * d(abcd) = 1001a + 101b + 11c + 2d = 새로운 숫자 ---> 이걸로 안만들어지면 self number
	 * 
	 * 1부터 5000까지 숫자 중에서 이 함수로 나오지 않는 숫자를 걸러내면 됨
	 * a, b, c, d 는 0을 포함한 정수
	 */
	static int max = 5000;
	static HashSet<Integer> set = new HashSet<>();
	static List<Integer> list = new ArrayList<>();
	
	static void method() {
		int number = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<50; j++) {
				for(int k=0; k<455; k++) {
					for(int l=0; l<2500; l++) {
					
						number = 1001*i+ 101*j + 11*k + 2*l;
						set.add(number);
						
						if(number >= 5000) return;
					}
				}
			}
		}
	}
	
	public static void method2(){
		for(int i=0; i<max; i++) {
			if(!set.contains(i)) {
				list.add(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		method();
		method2();

		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			int a = iterator.next();
			System.out.println(a);
		}
	}
}
