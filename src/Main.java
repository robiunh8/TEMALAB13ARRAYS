import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LogicalOP opArray= new LogicalOP();

        //ex1 array
        System.out.println("EX 1 Array");

        opArray.arrayEX1();


        //ex2 array
        System.out.println(" ");
        System.out.println("EX 2");

        int[] evenNumbers = new int[50];
        opArray.populateEvenNumbers(evenNumbers);
        for(int i=0;i<evenNumbers.length;i++)
            System.out.print(evenNumbers[i]+" ");


        //ex 3 array
        System.out.println(" ");
        System.out.println("EX 3");

        int[] numbers = new int[4];
        numbers = opArray.populateArray(numbers);
        System.out.println("Average: " + opArray.calculateAverage(numbers));


        //ex 4 array
        System.out.println(" ");
        System.out.println("EX 4");

        String[] stringArray = new String[2];
        stringArray = opArray.populateArray(stringArray);
        String value = "value2";
        System.out.println(opArray.checkValue(stringArray, value));

        //ex 5 array
        System.out.println(" ");
        System.out.println("EX 5");

        int[] array = {1, 2, 3, 4, 5};
        int num = 3;
        int result = opArray.findNumberInArray(array, num);
        if(result == -1)
            System.out.println(num + " not found in the array");
        else
            System.out.println(num + " found at index " + result);

        //ex 6 array
        System.out.println(" ");
        System.out.println("EX 6");

        opArray.printGrid();


        //ex 7 array
        System.out.println(" ");
        System.out.println("EX 7");

        int[] numberex7 = {1, 2, 3, 4, 5};
        int numberToRemove = 4;
        numberex7 = LogicalOP.removeNumber(numberex7, numberToRemove);
        System.out.println(Arrays.toString(numberex7));


        //ex 8 array
        System.out.println(" ");
        System.out.println("EX 8");

        int[] myArray = {12, 15, 40, 50, 30};
        int secondSmallest = LogicalOP.findSecondSmallest(myArray);
        System.out.println(secondSmallest);


        // ex 9 array
        System.out.println(" ");
        System.out.println("EX 9");

        int[] sourceArray = {10, 100, 1000, 10000};
        int[] destinationArray = new int[sourceArray.length];
        System.out.println("Source Array before transfer: "+ Arrays.toString(sourceArray));
        System.out.println("Destination Array before transfer: "+ Arrays.toString(destinationArray));
        LogicalOP.copyArray(sourceArray, destinationArray);
        System.out.println("Source Array after transfer: "+ Arrays.toString(sourceArray));
        System.out.println("Destination Array after transfer: "+ Arrays.toString(destinationArray));







    }
}