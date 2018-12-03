import javax.swing.JOptionPane;

public class Quadratic
{
   
   public static void main(){
      double a = Double.parseDouble(JOptionPane.showInputDialog("Enter A:"));
      double b = Double.parseDouble(JOptionPane.showInputDialog("Enter B:"));
      double c = Double.parseDouble(JOptionPane.showInputDialog("Enter C:"));
      
      System.out.println(b*b);
      
      System.out.println(4*a*c);
      if((b*b)-(4*a*c) >= 0){
      
      System.out.println(Math.sqrt((b*b)-(4*a*c)));
      
      System.out.println((-b+(Math.sqrt((b*b)-(4*a*c))))/(2*a));
      
      System.out.println((-b-(Math.sqrt((b*b)-(4*a*c))))/(2*a));
    }
    else{
        
        System.out.println("Sorry this is impossible");
    }
}

}
