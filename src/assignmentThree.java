
public class assignmentThree {
	
	public static void main(String[] args) {
        int[] array1 = {4, 2, 7, 2, 9, 4, 10};
        int[] array2 = {5, 8, 3};

//        // 1. Find the largest element
//        int max = array1[0];
//        for (int i = 1; i < array1.length; i++) {
//            if (array1[i] > max) {
//                max = array1[i];
//            }
//        }
//        System.out.println("1. Largest element: " + max);
//
//        // 2. Calculate the sum of all elements
//        int sum = 0;
//        for (int i = 0; i < array1.length; i++) {
//            sum += array1[i];
//        }
//        System.out.println("2. Sum of elements: " + sum);
//
//        // 3. Reverse the array
//        System.out.print("3. Reversed array: ");
//        for (int i = array1.length - 1; i >= 0; i--) {
//            System.out.print(array1[i] + " ");
//        }
//        System.out.println();
//
//        // 4. Find the smallest element
//        int min = array1[0];
//        for (int i = 1; i < array1.length; i++) {
//            if (array1[i] < min) {
//                min = array1[i];
//            }
//        }
//        System.out.println("4. Smallest element: " + min);
//
//        // 5. Count even and odd numbers
//        int even = 0, odd = 0;
//        for (int i = 0; i < array1.length; i++) {
//            if (array1[i] % 2 == 0) even++;
//            else odd++;
//        }
//        System.out.println("5. Even: " + even + ", Odd: " + odd);
//
//        // 6. Copy one array to another
//        int[] copy = new int[array1.length];
//        for (int i = 0; i < array1.length; i++) {
//            copy[i] = array1[i];
//        }
//        System.out.print("6. Copied array: ");
//        for (int i = 0; i < copy.length; i++) {
//            System.out.print(copy[i] + " ");
//        }
//        System.out.println();
//
//        // 7. Sort array in ascending order.
//        int[] sorted = array1.clone();
//        for (int i = 0; i < sorted.length - 1; i++) {
//            for (int j = 0; j < sorted.length - i - 1; j++) {
//                if (sorted[j] > sorted[j + 1]) {
//                    int temp = sorted[j];
//                    sorted[j] = sorted[j + 1];
//                    sorted[j + 1] = temp;
//                }
//            }
//        }
//        System.out.print("7. Sorted array: ");
//        for (int i = 0; i < sorted.length; i++) {
//            System.out.print(sorted[i] + " ");
//        }
//        System.out.println();
//
//        // 8. Search for an element
//        int target = 9;
//        boolean found = false;
//        for (int i = 0; i < array1.length; i++) {
//            if (array1[i] == target) {
//                System.out.println("8. Element " + target + " found at index " + i);
//                found = true;
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("8. Element " + target + " not found.");
//        }
//
//        // 9. Merge two arrays
//        int[] merged = new int[array1.length + array2.length];
//        for (int i = 0; i < array1.length; i++) {
//            merged[i] = array1[i];
//        }
//        for (int i = 0; i < array2.length; i++) {
//            merged[array1.length + i] = array2[i];
//        }
//        System.out.print("9. Merged array: ");
//        for (int i = 0; i < merged.length; i++) {
//            System.out.print(merged[i] + " ");
//        }
//        System.out.println();

        // 10. Remove duplicate elements 
        int[] temp = new int[array1.length];
        int newLength = 0;

        for (int i = 0; i < array1.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newLength; j++) {
                if (array1[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[newLength] = array1[i];
                newLength++;
            }
        }

        System.out.print("10. Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}


