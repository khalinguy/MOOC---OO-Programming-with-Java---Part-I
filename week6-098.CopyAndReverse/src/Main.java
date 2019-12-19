

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

    // change the copied
        copied[0] = 99;

    // print both
        for (int number:copied){
            System.out.println(number);
        }
        for (int number:original){
            System.out.println(number);
        }
        // write testcode here
    }
    public static int[] copy (int[] array){
        int [] copy = new int [array.length];
        System.arraycopy(array, 0, copy, 0, array.length);
        return copy;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] reverseCopy = new int[array.length];
        for(int i = 0; i<array.length; i++){
            reverseCopy[i] = array[array.length - 1 - i];
        }
        return reverseCopy;
    }
}
 