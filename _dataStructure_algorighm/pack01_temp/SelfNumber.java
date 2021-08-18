package _dataStructure_algorighm.pack01_temp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SelfNumber {

/*
https://wikidocs.net/238

� �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ���ڶ�� ��������.

		d(91) = 9 + 1 + 91 = 101

���� ��� �� ��, n�� d(n)�� ���׷�����(generator)��� �Ѵ�. ���� ������ 91�� 101�� ���׷������̴�.

� ���ڵ��� �ϳ� �̻��� ���׷����͸� ������ �ִµ�, 101�� ���׷����ʹ� 91 �� �ƴ϶� 100�� �ִ�.
�׷��� �ݴ��, ���׷����Ͱ� ���� ���ڵ鵵 ������, �̷� ���ڸ� �ε��� ������ Kaprekar�� ���� �ѹ�(self-number)�� �̸� �ٿ���.
���� ��� 1, 3, 5, 7, 9, 20, 31 �� ���� �ѹ� ���̴�.

1 �̻��̰� 5000 ���� ���� ��� ���� �ѹ����� ���� ���϶�.
*/
	
	
	/*
	 * ���ڰ� abcd ���
	 * a * 10�� 3���� 
	 * b * 10�� 2����
	 * c * 10�� 1����
	 * d * 10�� 0����
	 * + a + b + c + d �̴�
	 * 
	 * d(abcd) = 1001a + 101b + 11c + 2d = ���ο� ���� ---> �̰ɷ� �ȸ�������� self number
	 * 
	 * 1���� 5000���� ���� �߿��� �� �Լ��� ������ �ʴ� ���ڸ� �ɷ����� ��
	 * a, b, c, d �� 0�� ������ ����
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
