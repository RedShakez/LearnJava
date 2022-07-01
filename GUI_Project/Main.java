import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Enter Thy Name"); //This allows the user to insert their age
        JOptionPane.showMessageDialog(null, "Hello " + name); //This will print out a greeting message for the user

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); //This will allow the user to insert their age
        JOptionPane.showMessageDialog(null, "You are " + age + " years old"); //This will print out a statement about the user's age
       
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height")); //This will allow the user to insert their height
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall"); //This will print out a statement about the user's height

        If_Statement.CheckAge();
    }
}