import javax.swing.JOptionPane;

public class GPA
{
   
   public static void main(){
       float gpa = Float.parseFloat(JOptionPane.showInputDialog("please enter gpa"));
       if (gpa >= 5.0 || gpa <= 0.0) {
           System.out.println("thats imposible");
           
           
        }
       else if(gpa >= 4.0){
           System.out.println("great job");
            
        }
        else{
            System.out.println("very impressive");
        }
       
    }

}
