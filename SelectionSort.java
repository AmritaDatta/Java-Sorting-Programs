package selectionsort;

public class SelectionSort {
    
    public static void main(String[] args) {
        int[] arr={5,7,4,9,6,8,2};
        int min, temp=0;
        
        for (int index=0; index<arr.length; index++){
            min=index;
            for (int checkindex=index+1;checkindex<arr.length; checkindex++){
                if (arr[checkindex]<arr[min]){
                    min=checkindex;
                }               
            }
            
            temp=arr[index];
            arr[index]=arr[min];
            arr[min]=temp;           
        }
        
        for (int index=0; index<arr.length; index++){
            System.out.print(arr[index] + " ");
        }
    }    
}