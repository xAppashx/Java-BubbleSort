import java.util.Arrays;

public class BubbleSort {
      
      
      // The function that does the sorting
      public static int[] BubbleSortAlg(int[] ArrayToSort) {
            
            int LenArrayToSort = ArrayToSort.length;
            int[] Array = Arrays.copyOf(ArrayToSort, LenArrayToSort);
            
            int LengthList = (Array.length);
            int Key;
            int i;
            
            for (int Loop = LengthList - 2; Loop > -1 ; Loop = Loop - 1) {
                  
                  Key = Array[Loop];
                  i = Loop + 1;
                  
                  while (i < LengthList && Array[i] < Key) {
                           int TempVar = Array[i - 1];
                           Array[i - 1] = Array[i];
                           Array[i] = TempVar;
                           
                           i = i + 1;
                  } // While
                  
                  
            } // for (int Loop = 0; Loop < LengthList; Loop = Loop + 1)
            
            return Array;
      } // public static int[] BubbleSortAlg
      
      
      
      
      
      
      public static void main(String[] args) {
            
            int[] OriginalArray = {3, 2, 1, 4, 5, 14, 22, 63, 6, 53, 22, 12, 45, 213, 53, 233, 41, 98};
            
            int[] SortedArray = BubbleSortAlg(OriginalArray);
            
            System.out.println("Original array: " + Arrays.toString(OriginalArray));
            System.out.println("Sorted array: " + Arrays.toString(SortedArray));
      } // Public static void main
      
} // Public Class BubbleSort