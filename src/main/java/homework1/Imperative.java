package homework1;

public class Imperative {
    public static void main(String[] args) {
        int[] inputarray = new int[]{1, 1, 2, 2, 4, 5, 6 , 7 };
        sortArray(inputarray, 0);
        printArray(inputarray);
        sortArray(inputarray,2);
        printArray(inputarray);
    }
    static void printArray ( int[] ar){
        System.out.print("[");
        for (int el:ar ) {
            System.out.print(el + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    static boolean isInvertSort (int num){
        return num == 0;
    }

    static int[] sortArray(int[] array, int invert){
        int temp;
        if(isInvertSort(invert)) {
            for (int i = 1; i < array.length; i++) {
                for (int j = 0; j < array.length - i; j++) {
                    if (array[j] < array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
        else {
            for (int i = 1; i < array.length; i++) {
                for (int j = 0; j < array.length - i; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
        return array;
    }
}
