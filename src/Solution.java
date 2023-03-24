public class Solution {
    public static void main(String[] args) {
        String[] array1 = new String[]{"hello","2","world",":-)"};
        String[] array2 = new String[]{"1234","1567","-2","computer science"};
        String[] array3 = new String[]{"Belarus","Denmark","Brest"};
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