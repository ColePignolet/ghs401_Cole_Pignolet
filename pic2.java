
public class pic2
{
 public static void main(){
     int[] myArray = new int[12];
     System.out.println("The length of the aray is " + myArray.length);
     myArray[0] = 55;
     myArray[3] = 18;
     myArray[11] = 100;
     
     for(int i=0; i<myArray.length; i++){
         System.out.println("The value of element: " + i + " in the array is " + myArray[i]);
  
        }
    }
}

