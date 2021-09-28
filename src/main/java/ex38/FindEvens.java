package ex38;

public class FindEvens
{
    public int[] findEvens(int array[]){
        int even=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                even++;
            }
        }

        int newArray[]=new int[even];
        int k=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                newArray[k]=array[i];
                k++;
            }
        }
        return newArray;
    }
}

