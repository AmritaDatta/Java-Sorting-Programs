package bubblesortforstring;
public class BubbleSortForString {
    public static void main(String[] args) {
        String[] arr={"Tiu","Miu","Kiu","Liu","Biu"};
        String temp;
        
        for (int round=0;round<arr.length; round++){
            int flag=0;
            for (int swap=0; swap<arr.length-1-round; swap++){
                
                if (arr[swap].compareTo(arr[swap+1])>0)  //"compareTo()" is a method of String class & it returns three integers(-1,0,1);
                {  
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