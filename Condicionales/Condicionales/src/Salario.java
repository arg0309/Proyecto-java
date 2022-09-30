import javax.swing.JOptionPane;

;public class Salario {
    public static void main(String[] args){
        Double ht, he, st;

        ht = Double.parseDouble(JOptionPane.showInputDialog("Digite las horas trabajadas "));

        if(ht > 40){
            he = (ht - 40);
            st = (40 * 15000) + (he * 20000);
        }
        else{
            st = (ht * 15000);
        }
        JOptionPane.showMessageDialog(null, "El salario total es "+st);
    }
}
