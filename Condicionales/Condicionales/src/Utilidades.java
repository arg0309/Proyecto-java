import javax.swing.JOptionPane;

public class Utilidades {
    public static void main(String[] args){
        Double ST, TT, UT;

        ST = Double.parseDouble(JOptionPane.showInputDialog("Digite el salario "));
        TT = Double.parseDouble(JOptionPane.showInputDialog("Digite el tiempo de trabajo "));

        if(TT < 12){
            UT = (ST * 5)/100;
        }
        else{
            if(TT >= 12 & TT < 24){
                UT = (ST);

            }
        }
    }
}


