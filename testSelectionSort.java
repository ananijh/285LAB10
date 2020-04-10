import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }

    public void testPositive(){
    	SelectionSort sort = new SelectionSort();

        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/

        assertArrayEquals(Sortedarr, sort.basicSelectionSort(arr));
    }

    public void testNegative(){
    	SelectionSort sort = new SelectionSort();

        int[] arr = new int[5];
        arr[0] = -1;
        arr[1] = -5;
        arr[2] = -7;
        arr[3] = -12;
        arr[4] = -6;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -12;
        Sortedarr[1] = -7;
        Sortedarr[2] = -6;
        Sortedarr[3] = -5;
        Sortedarr[4] = -1;


        /** Test data contains negative values only **/
        assertArrayEquals(Sortedarr, sort.basicSelectionSort(arr));
    }

    public void testMixed(){
    	SelectionSort sort = new SelectionSort();
        int[] arr = new int[5];
        
        arr[0] = 5;
        arr[1] = -9;
        arr[2] = 10;
        arr[3] = 0;
        arr[4] = -11;

        int[] Sortedarr = new int[5];
        
        Sortedarr[0] = -11;
        Sortedarr[1] = -9;
        Sortedarr[2] = 0;
        Sortedarr[3] = 5;
        Sortedarr[4] = 10;

        /** Test data contains with both positive, negative and zeros **/
        assertArrayEquals(Sortedarr, sort.basicSelectionSort(arr));
    }

    public void testDuplicates(){
    	SelectionSort sort = new SelectionSort();
        int[] arr = new int[5];
        
        arr[0] = 4;
        arr[1] = 4;
        arr[2] = 15;
        arr[3] = -9;
        arr[4] = -9;

        int[] Sortedarr = new int[5];
        
        Sortedarr[0] = -9;
        Sortedarr[1] = -9;
        Sortedarr[2] = 4;
        Sortedarr[3] = 4;
        Sortedarr[4] = 15;


        /** Test data contains duplicates **/
        assertArrayEquals(Sortedarr, sort.basicSelectionSort(arr));
    }
}
