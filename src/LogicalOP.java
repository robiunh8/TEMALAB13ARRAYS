import java.util.Arrays;

public class LogicalOP {

    public void arrayEX1(){
        int[] arrayex2 = new int[100];
        for (int i = 0; i < arrayex2.length; i++) {
            arrayex2[i] = i + 1;
        }
        for (int num : arrayex2) {
            System.out.print(num + " ");
        }
    }

    public static void populateEvenNumbers(int[] arr) {
        int index = 0;
        for (int i = 2; i <= 100; i += 2) {
            arr[index] = i;
            index++;
        }
    }
    public static int[] populateArray(int[] array) {
        int[] numbers = {2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            array[i] = numbers[i];
        }
        return array;
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static String[] populateArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = "value" + 3;
        }
        return array;
    }
    public static boolean checkValue(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static int findNumberInArray(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void printGrid() {
        String[] grid = new String[100];
        Arrays.fill(grid, "- ");
        for (int i = 0; i < grid.length; i++) {
            System.out.print(grid[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static int[] removeNumber(int[] array, int numberex7) {
        int[] newArray = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != numberex7) {
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }

    public static int findSecondSmallest(int[] arr) {
        int[] fixedArray = {10, 20, 30, 40, 50};
        Arrays.sort(arr);
        int secondSmallest = Integer.MAX_VALUE;
        for (int i : fixedArray) {
            if (i > arr[0] && i < secondSmallest) {
                secondSmallest = i;
            }
        }
        return secondSmallest;
    }

    public static void copyArray(int[] source, int[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }













}