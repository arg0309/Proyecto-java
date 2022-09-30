import javax.swing.JOptionPane;

public class Edades {
    public static void main(String[] args){
        int edad;

        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad "));
        
        if(edad >= 70){
            JOptionPane.showMessageDialog(null, "Usted es de la tercera edad ");

        }
        else{
            if(edad >= 18){
                JOptionPane.showMessageDialog(null,"Usted es mayor de edad");
            }
            else {
            JOptionPane.showMessageDialog(null," Usted es menor de edad"); 
            }
        }
    }
     

}
