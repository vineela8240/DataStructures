package linearsearch;

public class maximumelementarray {
    public static int MaximumElementArray(int arr[]){
        int maxElement=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxElement){
                maxElement=arr[i];

            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90};
        int max=MaximumElementArray(arr);
        System.out.println("The Maximum Element is: " +max);

    }
}
