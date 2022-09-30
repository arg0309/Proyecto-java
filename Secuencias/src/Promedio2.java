import javax.swing.JOptionPane;

public class Promedio2 {
    public static void main(String[] args){
        Float n1, n2, n3, prom;

        n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota 1"));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota 2"));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota 3"));

        prom = (n1 + n2 +n3)/3;

        JOptionPane.showMessageDialog(null, "Aprobó"+ "\n" +"El promedio es: " +prom);

    }
}
