
public class bs_recursion {
private static boolean binarySearch(int[] arr, int low, int high, int key) {
	int mid = (low + high)/2;
	if(low > high)
		return false;
	if(arr[mid] == key)
		return true;
	if(key < arr[mid])
		return binarySearch(arr, low, mid-1, key);

		return binarySearch(arr, mid+1, high, key);
}
	public static void main(String[] args) {
		int[] arr = {2, 5, 9, 13, 17, 20, 21};
		if(binarySearch(arr, 0, (arr.length-1), 20))
			System.out.println("Element Found");
		else
			System.out.println("Element not Found");
	}

}
