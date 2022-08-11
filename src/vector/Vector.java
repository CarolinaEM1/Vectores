
package vector;
import java.util.Collections;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Registro re= new Registro();
        int n;
        byte menu;
        String [] vec1 = null;
    
       do {
            menu=Byte.parseByte(JOptionPane.showInputDialog("Teclea 1 Para registrar personas\nTeclea 2 para ver el reporte\nTeclea 3  para salir "));
            switch(menu){
                case 1:  n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas personas desea registrar?"));
        if (n>10){
            System.out.println("El máximo de personas que se pueden registrar son 10, intentalo de nuevo");
            System.exit(0);
        } else {
            vec1=re.LlenarVec(n);
        }     
            break;
            case 2:
                    re.ordenarVec1(vec1);
                    System.out.print("Arreglo 1 ordenado "+re.ImprimirVec(vec1));
            break;
            case 3:System.exit(0); 
            break;
            default:JOptionPane.showMessageDialog(null,"La opcion ingresada es erronea\nIngrese nuevamente una opcion");
            }
        } while(menu!=3);
    
    }
    
}
