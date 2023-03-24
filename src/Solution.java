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
        String[] fixedArray = new String[]{};
        return fixedArray;
    }

    private static boolean isStringShortEnough(String str, int requiredLength) {
        return str.length() <= requiredLength;
    }

    private static void printArray(String[] array) {
        for (String str : array) {
            System.out.print(str + ' ');
        }
        System.out.println();
    }
}