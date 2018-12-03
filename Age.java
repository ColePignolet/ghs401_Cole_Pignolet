import javax.swing.JOptionPane;


public class Age
{
   public static void main(){
       int age = Integer.parseInt(JOptionPane.showInputDialog("please enter age"));
       if (age >= 16){
           System.out.println("You can drive");
           
           
        }
       else{
           System.out.println("You can't drive");
           
        }
       
    }
}
