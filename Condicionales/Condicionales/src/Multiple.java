import javax.swing.JOptionPane;

public class Multiple {

    public static void main(String[] args){
        int edad;

        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad "));

        if (edad > 17){
            JOptionPane.showMessageDialog(null, "Usted es mayor de edad");
        }
        else{
            JOptionPane.showInternalMessageDialog(null, "Usted es menor de edad ") ;
        }
    }
}