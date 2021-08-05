package _past.j20210618_tryCatch;

public class MultiCatchEx {
	public static void main(String[] args) {

		
		try {
			
			int x = changeToInteger("test");
			int y = printArrayElement(new int[] {1, 2, 3}, 5);
		
		} catch (NumberFormatException nfe){
			nfe.getMessage();
		} catch (ArrayIndexOutOfBoundsException aiob) {
			aiob.getMessage();
		} catch (Exception e) {
			e.getMessage();
		}
			
	
	}
	
	
	private static int changeToInteger(String str) throws NumberFormatException{
		int number = Integer.parseInt(str);
		return number;
	}
	
	
	private static int printArrayElement(int[] intArr, int index) throws ArrayIndexOutOfBoundsException{
		int number = intArr[index];
		return number;
	}
}