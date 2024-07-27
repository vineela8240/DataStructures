package linearsearch;

public class stringarray {
    public static int StringArray(String arr[],String target){
        for(int i=0;i< arr.length;i++){
            if(arr[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String arr[]={"apple","mango","grapes","orange"};
        String targetString="apple";
        int result=StringArray(arr,targetString);
        if(result!=-1){
            System.out.println("String" +targetString+ "Found At:" +result);
        }
        else{
            System.out.println("String not found");
        }
    }
}
