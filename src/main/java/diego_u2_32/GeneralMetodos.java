package diego_u2_32;
import javax.swing.JOptionPane;
public class GeneralMetodos {
    public byte x;
    public void impresion(){
        JOptionPane.showMessageDialog(null,"Bienvenido a esta central de"
                + " Autobuses");
        JOptionPane.showMessageDialog(null,"A continuacion se mostraran las"
                + "rutas disponibles");
        x=Byte.parseByte(JOptionPane.showInputDialog("Rutas disponibles \n"
                + "1.-JILOTEPEC-CANALEJAS \n 2.-JILOTEPEC-VILLA DEL CARBON"
                + "\n 3.-JILOTEPEC-SOYANIQUILPAN \n 4.-JILOTEPEC-"
                + "CHAPA DE MOTA \n 5.-JILOTEPEC-SAN PABLO"));
    }
}
