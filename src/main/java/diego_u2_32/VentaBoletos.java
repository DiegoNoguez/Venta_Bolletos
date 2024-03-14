package diego_u2_32;
import javax.swing.JOptionPane;
public class VentaBoletos {
    public static void main(String[] args) {
        GeneralMetodos imprimir=new GeneralMetodos();
        byte repetir;
        int total=0;
        do{
            imprimir.impresion();
            repetir=Byte.parseByte(JOptionPane.showInputDialog("Ingresa un 1 "
                    + "si para registrar otro boleto, para finalizar el dia y"
                    + " ver lo obtenido oprima 0"));
        }while(repetir==1);
        JOptionPane.showMessageDialog(null,"Las ganancias obtenidas el día de "
                + "hoy es: $"+imprimir.gananciatotal(total));
    }
}
