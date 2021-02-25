package parallelsortstartendindex;

import java.util.Arrays;

public class ParallelSortStartEndIndex {
    
    public static void main(String[] args) {
        
        int[] arr={3,8,5,9,6,10,2};
        
        //Parallel Sort method for sorting int array
        Arrays.parallelSort(arr, 3, 7);
        
        //converting the array to stream and displaying using forEach
        Arrays.stream(arr).forEach(n->System.out.print(n+" ")); 
    }
    
}
