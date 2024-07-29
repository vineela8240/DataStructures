package binarysearch;

public class firstoccurance {
    public static int FirstOccurance(int arr[],int target){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int sortedArray[]={1,2,2,3,4,5,7};
        int targetElement=2;
        int result=FirstOccurance(sortedArray,targetElement);
        if(result!=1){
            System.out.println("First Occurance of element found at " +result);
        }
        else{
            System.out.println("Element not Found in the array list");
        }
    }
}
