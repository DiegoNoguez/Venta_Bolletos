package diego_u2_32;
import javax.swing.JOptionPane;
public class GeneralMetodos {
    public byte x, a;
    public void impresion(){
        JOptionPane.showMessageDialog(null,"Bienvenido a esta central de"
                + " Autobuses");
        JOptionPane.showMessageDialog(null,"A continuacion se mostraran las"
                + " rutas disponibles");
        x=Byte.parseByte(JOptionPane.showInputDialog("Rutas \n"
                + "1.-JILOTEPEC-CANALEJAS \n 2.-JILOTEPEC-VILLA DEL CARBON"
                + "\n 3.-JILOTEPEC-SOYANIQUILPAN \n 4.-JILOTEPEC-"
                + "CHAPA DE MOTA \n 5.-JILOTEPEC-SAN PABLO"));
        precioPorBol(a);
    }
    public byte precioPorBol(byte a){
        switch (x){
            case 1:
                a=14;
                break;
            case 2:
                a=25;
                break;
            case 3:
                a=12;
                break;
            case 4:
                a=28;
                break;
            case 5:
                a=24;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Digita un valor valido");
        }
        return a;
    }
}
