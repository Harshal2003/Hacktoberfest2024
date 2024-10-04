import java.util.Scanner;
class ArrayOperation{
    
    void arrayPrint(){
        Scanner sc = new Scanner(System.in);
        //Creating array and Initializing with random numbers. Numbers will be entered by user.
        
        int[] array = new int[10];
        System.out.println("Enter 10 values of array:-");
        for(int i=0; i<array.length;i++){
            array[i]= sc.nextInt();
        }
        //---------------------------------------------------------
        
        // Printing the array.
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        
        //---------------------------------------------------------
        
        //Finding maximum and minimum number from the given array.
        int max = array[0];
        int min = array[0];
        
        for(int i=1; i<array.length;i++){
            if (array[i]>max)
            {
                max= array[i];
            }
            if (array[i]<min)
            {
                min= array[i];
            }
        }
        
        System.out.println("Maximum number of array is:- " +max);
        System.out.println("Minimum number of array is:- " +min);
        
        //---------------------------------------------------------
        
        //Calculating Average value of array
        double sum = 0;
        for(int value: array){
            sum += value;
        }
        double average = sum/array.length;
        System.out.println("Agerage of array is: "+average);
        
        //---------------------------------------------------------
        
        //Reversing the array
        
        for (int i=array.length - 1 ; i>=0 ; i--){
            System.out.print(array[i]);
            if(i>0){
                System.out.print(" ,");
            }
        }System.out.print("\n");
        
        
    }
    // Main method to call the methods.
    public static void main(String[] args){
        ArrayOperation obj = new ArrayOperation();
        obj.arrayPrint();
    }
}
