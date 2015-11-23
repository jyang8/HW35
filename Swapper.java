// Jessica Yang
// APCS1 pd9
// HW35 -- Put it together
// 2015-11-20

import cs1.Keyboard;

public class Swapper {

	// instance vars
	private static String[][] a = {
		{"foo", "boo"},
    {"goo", "soo"},
    {"loo", "koo"},
    {"moo", "voo"}
	};

  // swaps the items at these locations
	public static void swap(int row1, int column1, int row2, int column2) {
    String tmp = a[row1][column1];
    a[row1][column1] = a[row2][column2];
    a[row2][column2] = tmp;
  }

  // prints the items in a string[][]
  public static void print(String[][] a) {
  	for (String[] x : a) {
  	  for (String y : x) {
  		  System.out.print(y + "\t");
  	  }
      System.out.println();
  	}
  }

  // main method for testing
	public static void main(String[] args) {
    System.out.println("Before swap: ");
    print(a);
    System.out.println();
    System.out.println("Location #1's row #: ");
    int r1 = Keyboard.readInt();
    System.out.println("Location #1's column #: ");
    int c1 = Keyboard.readInt();
    System.out.println("Location #2's row #: ");
    int r2 = Keyboard.readInt();
    System.out.println("Location #2's column #: ");
    int c2 = Keyboard.readInt();
    System.out.println();
    swap(r1,c1,r2,c2);
    System.out.println("After swap: ");
    print(a);
    System.out.println();
	}

}
