package diego_u2_32;
import javax.swing.JOptionPane;
public class GeneralMetodos {
    public byte x, precio,y,cantAdult, acumulador=0;
    public double f,f1,DESCUENTO=0.15,total;
    public void impresion(){
        JOptionPane.showMessageDialog(null,"Bienvenido a esta central de"
                + " Autobuses");
        JOptionPane.showMessageDialog(null,"A continuacion se mostraran las"
                + " rutas disponibles");
        x=Byte.parseByte(JOptionPane.showInputDialog("Rutas \n"
                + "1.-JILOTEPEC-CANALEJAS \n 2.-JILOTEPEC-VILLA DEL CARBON"
                + "\n 3.-JILOTEPEC-SOYANIQUILPAN \n 4.-JILOTEPEC-"
                + "CHAPA DE MOTA \n 5.-JILOTEPEC-SAN PABLO"));
        precioPorBol(precio);
        JOptionPane.showMessageDialog(null,"El precio del boleto para la ruta"
                + " seleccionada es de $"+precio);
        descuentoSiNo(y);
        operacion(f1);
    }
    public byte precioPorBol(byte a){
        
        switch (x){
            case 1:
                precio=14;
                break;
            case 2:
                precio=25;
                break;
            case 3:
                precio=12;
                break;
            case 4:
                precio=28;
                break;
            case 5:
                precio=24;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Digita un valor valido");
        }
        
        return precio;
    }
    
    public byte descuentoSiNo(byte b){
        y=Byte.parseByte(JOptionPane.showInputDialog("Ingrea un 1 si eres un adulto "
                + "mayor de lo contrario ingresa un 0"));
        return y;
    }
    
    public double operacion (double f){
        if(y==1){
            acumulador+=y;
            if (acumulador<=5){
                f=precio*DESCUENTO;
                f1=precio-f;
                JOptionPane.showMessageDialog(null,"El precio final de su boleto"
                        + "junto a su desceunto de adulto mayor es $"+f1);
            }else{
                f1=precio;
                JOptionPane.showMessageDialog(null,"El precio del boleto sigue"
                        + " siendo el mismo $"+f1);
            }
        }
        total=f1;
        return f1;
    }
    
    public double ganaciatotal(double gto){
        gto=f1;
        total=gto;
        return total;
    }
} 