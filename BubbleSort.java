import java.util.Arrays;

public class BubbleSort {
      
      // The function to call: It sets up the parameters
      public static int[] BubbleSortStart(int[] ArrayToSort) {
            
            int LenArrayToSort = ArrayToSort.length;
            int[] Array = Arrays.copyOf(ArrayToSort, LenArrayToSort);
            
            int[] SortedArray = BubbleSortAlg(Array);
            
            return SortedArray;
            
      } // public static int[] BubbleSortStart
      
      
      
      // The function that does the sorting
      public static int[] BubbleSortAlg(int[] Array) {
            
            int LengthList = (Array.length) -1;
            int SortedTo = LengthList;
            int Pivot;
            
            for (int Loop = 0; Loop < LengthList; Loop = Loop + 1) {
                  
                  Pivot = 0;
                  
                  for (int i = 0; i < SortedTo; i = i + 1) {
                        
                        int Var1 = Array[Pivot]; 
                        int Var2 = Array[Pivot + 1];
                        
                        if (Var2 < Var1) {
                              Array[Pivot] = Var2;
                              Array[Pivot + 1] = Var1;
                        } // if (Var2, Var1)
                     
                     Pivot = Pivot + 1;
                  } // for (int i = 0; i < SortedTo; i = i + 1)
                  
                  SortedTo = SortedTo - 1;
            } // for (int Loop = 0; Loop < LengthList; Loop = Loop + 1)
            
            return Array;
      } // public static int[] BubbleSortAlg
      
      
      
      public static void main(String[] args) {
            
            int[] OriginalArray = {3, 2, 1, 4, 5, 14, 22, 63, 6, 53, 22, 12, 45, 213, 53, 233, 41, 98};
            
            int[] SortedArray = BubbleSortStart(OriginalArray);
            
            System.out.println("Original array: " + Arrays.toString(OriginalArray));
            System.out.println("Sorted array: " + Arrays.toString(SortedArray));
      } // Public static void main
      
} // Public Class BubbleSort