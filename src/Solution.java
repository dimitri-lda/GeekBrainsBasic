public class Solution {
    public static void main(String[] args) {
        int requiredStringLength = 3;
        String[] array1 = new String[]{"hello","2","world",":-)"};
        String[] array2 = new String[]{"1234","1567","-2","computer science"};
        String[] array3 = new String[]{"Belarus","Denmark","Brest"};
        String[] resultArray1 = getArrayOfCorrectLengthElements(array1, requiredStringLength);
        String[] resultArray2 = getArrayOfCorrectLengthElements(array2, requiredStringLength);
        String[] resultArray3 = getArrayOfCorrectLengthElements(array3, requiredStringLength);
        printArray(resultArray1);
        printArray(resultArray2);
        printArray(resultArray3);
        System.out.println();

        // Additional solution with recursion and without getArraySize method
        int startResultArraySize = 0;
        resultArray1 = getArrayOfCorrectLengthElementsRecursion(array1, startResultArraySize, requiredStringLength);
        resultArray2 = getArrayOfCorrectLengthElementsRecursion(array2, startResultArraySize, requiredStringLength);
        resultArray3 = getArrayOfCorrectLengthElementsRecursion(array3, startResultArraySize, requiredStringLength);
        printArray(resultArray1);
        printArray(resultArray2);
        printArray(resultArray3);
    }

    private static String[] getArrayOfCorrectLengthElements(String[] array, int requiredLength) {
        int resultArraySize = getArraySizeOfCorrectLengthElements(array, requiredLength);
        String[] resultArray = new String[resultArraySize];
        int index = 0;
        for (String str : array) {
            if (isStringShortEnough(str, requiredLength)) {
                resultArray[index] = str;
                index++;
            }
        }
        return resultArray;
    }

    private static int getArraySizeOfCorrectLengthElements(String[] array,  int requiredLength) {
        int index = 0;
        for (String str : array) {
            if (isStringShortEnough(str, requiredLength))
                index++;
        }
        return index;
    }

    private static boolean isStringShortEnough(String str, int requiredLength) {
        return str.length() <= requiredLength;
    }

    private static void printArray(String[] array) {
        System.out.print('[');
        for (String str : array) {
            System.out.print(str + ' ');
        }
        System.out.println(']');
    }

    private static String[] getArrayOfCorrectLengthElementsRecursion(
        String[] array,
        int resultArraySize,
        int requiredLength
    ) {
        String[] resultArray = new String[resultArraySize];
        int index = 0;
        for (String str : array) {
            if (isStringShortEnough(str, requiredLength)) {
                if (index + 1 > resultArraySize) {
                    resultArray = getArrayOfCorrectLengthElementsRecursion(
                            array,
                            resultArraySize + 1,
                            requiredLength
                    );
                } else {
                    resultArray[index] = str;
                    index++;
                }
            }
        }
        return resultArray;
    }
}