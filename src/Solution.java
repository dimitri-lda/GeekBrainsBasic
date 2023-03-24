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
}