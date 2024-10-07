package AccentureEasyQ;

public class SecondLargEleArray {
    public static int secondLargest(int[] arr){
        int first = Integer.MIN_VALUE; 
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i]!=first) {
                second = arr[i];
            }
                
            
        }
        return second;
        
    }
    public static void main(String[] args) {
        int[] arr = {7,4,3,5,1,8,6,9};
        System.out.println(secondLargest(arr));
    }

    }
    
