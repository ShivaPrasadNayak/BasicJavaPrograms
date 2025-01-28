public class LinearSearch {
    // Function to perform linear search on an array
    public static void main(String[] args) {
        int[] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int target = 110;
        int n = arr.length;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            if (arr[i] == target){
                System.out.println("Element found at index: " + i);
                break;
            }
        }
    }
}
