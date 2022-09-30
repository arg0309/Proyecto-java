import javax.swing.JOptionPane;
public class Si {
    public static void main(String[] args) throws Exception {;
        int edad;

    edad = Integer.parseInt(JOptionPane.showInputDialog("Digita tu edad"));

    if(edad >17){ 
        JOptionPane.showMessageDialog(null, "usted es mayor de edad ");
         
    }
    else{
        JOptionPane.showMessageDialog( null, "usted es menor de edad ");
    }
}
    
}
