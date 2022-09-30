import javax.swing.JOptionPane;

public class Protentaje2 {
    public static  void main(String[] args){
        Float vlr, dto, vlrdesc, vt;

        vlr = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor de venta: "));
        dto = Float.parseFloat(JOptionPane.showInputDialog("Digite el descuento: "));

        vlrdesc = (vlr * dto) /100;
        vt = vlr - vlrdesc;

        JOptionPane.showMessageDialog(null, "El valor de la compra es " + "$" + vlr + "\n"
        + "El descuento aplicado es de " + dto + "%" + "\n" + "Total descuento "+ "$" + vlrdesc + "\n"
        + "El total a pagar es de " + "$" + vt);


    }
}
