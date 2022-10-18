public class LeetcodePermutations {
    // Function to generate all the permutations from l to r
    private static void permute(int[] arr, int l, int r) {
        if (l == r) {
            // Print this permutation
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = l; i <= r; i++) {
            // Fix an element at index l
            swap(arr, l, i);
            // Recur for index l + 1 to r
            permute(arr, l + 1, r);
            // Back track
            swap(arr, l, i);
        }
    }
    // Function to swap element at index x and y of array arr
    private static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
    public static void main(String[] args) {
        // Example
        int arr[] = new int[] {1, 2, 3};
        int n = arr.length;
        // Generate permutations from index 0 to n - 1
        permute(arr, 0, n - 1);
    }
}