
public class ArrayIntro {

	public static void main(String[] args) {

		// Allocate memory for an array
		int[] myIntArray = new int[10];

		// Array is initialized
		for (int i=0; i < myIntArray.length; i++) {
			myIntArray[i] = i+1;
		}

		for (int i=0; i < myIntArray.length; i++) {
			System.out.println(myIntArray[i]);
		}

		//Array is initialized during declaration
		char[] myCharArray = {'a', 'b', 'c'};

		for (int i=0; i < myCharArray.length; i++) {
			System.out.println(myCharArray[i]);
		}

	}

}
