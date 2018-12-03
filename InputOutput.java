import javax.swing.JOptionPane;


public class InputOutput
{
    public static void main(){
        
        //comment, compiler does not read this
        //comments are for humans
        String username = JOptionPane.showInputDialog("Please enter your username:");
        
        if(username.equals("Cole")) {
            String password = JOptionPane.showInputDialog("Please enter your password:");
            if(password.equals("12345678")) {
            System.out.println("Access Granted");

        }
        else {
            System.out.println("Access Denied");

        }
        }
        else {
            System.out.println("Access Denied");
            
        }
        
        
        //System.out.println("Hello " + password);

        
    }
}
