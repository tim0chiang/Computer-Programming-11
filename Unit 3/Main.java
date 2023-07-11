public class Main {
    // This method adds the number 7 to the end of the array and returns the new array
    static int[] add_value(int[] arr) {
        // Create a new array that can fit one more value from the original array
        int[] newarr = new int[arr.length+1];
        // Adding the original values to the new array
        for(int x = 0; x < arr.length; x++) {
            newarr[x] = arr[x];
        }
        // Add the number 7 to the new array
        newarr[arr.length] = 7;
        // Return the new array
        return newarr;
    }
    // This method gets rid of the last value in an array
    static int[] delete_value(int[] arr){
        // Declaring the number of values that can be stored in the array
        int[] newarr = new int[arr.length-1];
        // Stop the for loop when it gets to the second last value of the original list to get rid of the last value
        // Adding the original values to the new array
        for (int i = 0; i<arr.length-1; i++) {
            newarr[i] = arr[i];
        }
        // Return the new array
        return newarr;
    }
    // This method adds the number 7 at position 2 to the array
    static int[] insert_value(int[] arr){
        // Create a new array that can fit one more value from the original array
        int[] newarr = new int[arr.length+1];
        for(int i=0; i<newarr.length; i++){
            // When the position is at 2 it adds the new value
            if (i == 2) {
                newarr[i] = 7;
            }
            // Since when i == 2 the value from the origial array was never used so minus one
            else if (i > 2) {
                newarr[i] = arr[i-1];
            }
            // If i >= 2 then add arr[i] to newarr[i]
            else {
                newarr[i] = arr[i];
            }
        }
        // return the new array
        return newarr;
    }
    public static void main(String[] args) {
        // The array that will be modified by three methods
        int[] num = {3, 4, 5, 6};

        // Gets the new array and prints out the new value that was added and the length of the new array
        int[] a_new_arr = add_value(num);
        System.out.println("The new value is " + a_new_arr[a_new_arr.length-1] + "\t The size of the array is " + a_new_arr.length);

        // Gets the new array and prints out the last value to show that the last value has been deleted from the original array and it will also print the length of the new array
        int[] d_new_arr = delete_value(num);
        System.out.println("The last value of the array is " + d_new_arr[d_new_arr.length-1] + "\t The size of the array is " + d_new_arr.length);

        // Gets the new array and prints out the new value that is added at position 2 and also print out the size of the array
        int [] i_new_arr = insert_value(num);
        System.out.println("The new value in the array is at position 2 and the number is " + i_new_arr[2] + "\t The size of the array is " + i_new_arr.length);
    }
}