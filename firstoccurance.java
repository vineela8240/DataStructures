package linearsearch;

import java.util.ArrayList;
import java.util.List;

public class firstoccurance {
    public static int FirstOccurance(List<Integer> list, int target){
        for(int i=0;i< list.size();i++){
            if(list.get(i)==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(10);
        myList.add(30);
        myList.add(40);
        int targetNumber=10;
        int result=FirstOccurance(myList,targetNumber);
        if(result!=-1){
            System.out.println("Element "  + targetNumber + " Found At:" +result);
        }
        else{
            System.out.println("Element Not found");
        }
    }
}
