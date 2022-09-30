import javax.swing.JOptionPane;
public class Ejercicio {
    public static void main(String[] args) throws Exception {
        Float nota1, nota2, nota3, prom;
        String materia;

        materia = JOptionPane.showInputDialog("Escriba nombre de la materia");

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota 1"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota 2"));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota 3"));
    
        prom = (nota1 + nota2 + nota3)/3;

    if(prom >3.5){ 
        JOptionPane.showMessageDialog(null, "La materia " + materia + "Aprobó y su nota es " +prom);
         
    }
    else{
        JOptionPane.showMessageDialog(null, "La materia " + materia + "Reprobó y su nota es " +prom);
    }
}
    
}
