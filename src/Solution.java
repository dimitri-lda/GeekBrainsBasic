public class Solution {
    public static void main(String[] args) {
        int requiredLength = 3;
        String[] array1 = new String[]{"hello","2","world",":-)"};
        String[] array2 = new String[]{"1234","1567","-2","computer science"};
        String[] array3 = new String[]{"Belarus","Denmark","Brest"};
        String[] fixedArray1 = getArrayOfCorrectLengthElements(array1, requiredLength);
        String[] fixedArray2 = getArrayOfCorrectLengthElements(array2, requiredLength);
        String[] fixedArray3 = getArrayOfCorrectLengthElements(array3, requiredLength);
        printArray(fixedArray1);
        printArray(fixedArray2);
        printArray(fixedArray3);
        System.out.println();

        // Additional solution with recursion and without getArraySize method
        int startFixedArraySize = 0;
        fixedArray1 = getArrayOfCorrectLengthElementsRecursion(array1, startFixedArraySize, requiredLength);
        fixedArray2 = getArrayOfCorrectLengthElementsRecursion(array2, startFixedArraySize, requiredLength);
        fixedArray3 = getArrayOfCorrectLengthElementsRecursion(array3, startFixedArraySize, requiredLength);
        printArray(fixedArray1);
        printArray(fixedArray2);
        printArray(fixedArray3);
    }

    private static String[] getArrayOfCorrectLengthElements(String[] array, int requiredLength) {
        int fixedArraySize = getArraySizeOfCorrectLengthElements(array, requiredLength);
        String[] fixedArray = new String[fixedArraySize];
        int index = 0;
        for (String str : array) {
            if (isStringShortEnough(str, requiredLength)) {
                fixedArray[index] = str;
                index++;
            }
        }
        return fixedArray;
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
        int fixedArraySize,
        int requiredLength
    ) {
        String[] fixedArray = new String[fixedArraySize];
        int index = 0;
        for (String str : array) {
            if (isStringShortEnough(str, requiredLength)) {
                if (index + 1 > fixedArraySize) {
                    fixedArray = getArrayOfCorrectLengthElementsRecursion(
                            array,
                            fixedArraySize + 1,
                            requiredLength
                    );
                } else {
                    fixedArray[index] = str;
                    index++;
                }
            }
        }
        return fixedArray;
    }
}