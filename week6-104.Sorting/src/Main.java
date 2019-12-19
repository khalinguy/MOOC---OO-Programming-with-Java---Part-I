import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
  
        // write testcode here
    }
    
    public static int smallest(int [] array){
        int smallest = array[0];
        for(int number: array){
            if (number < smallest){
                smallest = number;
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array){
        int index = 0;
        int smallest = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i]< smallest){
                smallest = array[i];
                index = i;
            }
            
        }
        return index;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array,int index){
        int smallestindex = index;
        for(int i = index; i< array.length; i++){
            if( array[i] < array[smallestindex] ){
                smallestindex = i;
            }
        }
        return smallestindex;
    }
    public static void swap(int[] array, int index1, int index2){
        int value1 = array[index1];
        int value2 = array[index2];
        
        array[index1] = value2;
        array[index2] = value1;
    }
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++){
            swap(array,i,indexOfTheSmallestStartingFrom(array,i));
            
        }
    }
}
