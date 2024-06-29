//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 6, 7, 9, 11};
        int target = 6;

        int result = binarySearch(arr, target);
        if(result < 0) {
            System.out.println("Element Not Found.");
        } else {
            System.out.println("Element found at Index: " + result);
        }


    }

    public static int binarySearch(int[] arr, int target){
        int left=0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right)/2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}