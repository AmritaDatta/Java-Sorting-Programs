package insertionsort;

public class InsertionSort {
    
    public static void main(String[] args) {
        
        int[] arr={10,5,2,4,9,6,7};
        int temp,j;
        
        for (int index=1; index<arr.length; index++){
            temp=arr[index];
            j=index;
            
            while(j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
        }
        for (int index=0; index<arr.length; index++){
        System.out.print(arr[index] + " ");
        }
    }   
}