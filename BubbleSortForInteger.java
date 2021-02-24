package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={36,19,29,12,5};
        int temp;
        
        for (int round=0;round<arr.length; round++){
            int flag=0;
            for (int swap=0; swap<arr.length-1-round; swap++){
                
                if (arr[swap]>arr[swap+1]){
                    temp=arr[swap];
                    arr[swap]=arr[swap+1];
                    arr[swap+1]=temp;
                    flag=1;
                }
            }
            if (flag==0){
                break;
            }
        }
        
        for (int round=0; round<arr.length; round++){
            System.out.print(arr[round]+ " ");
        }
    }  
}