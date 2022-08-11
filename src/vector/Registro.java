
package vector;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class Registro {
    public String [] LlenarVec(int n){
        String vector[] = new String[n];
  
        
        JOptionPane.showMessageDialog(null,"Teclea los nombres ");
        for(int i=0;i<vector.length;i++){
                
            vector[i] =JOptionPane.showInputDialog("Ingresa el nombre" +(i+1));  

                
            }
        return vector;
    }
    public String ImprimirVec(String[] vector){
        String s = "\nElementos\n";
        
        for(int i=0;i<vector.length;i++){
            s = s+vector[i]+"\n";
           
        }
        return s;
    
    }
    
    public void ordenarVec1 (String[]vec1) {
        String aux1;
        for(int i=0;i<vec1.length;i++)
        {
            for(int k=0;k<(vec1.length-k);k++)
            {
                if(vec1[k].compareTo(vec1[k+1])>0) 
                {
                    aux1=vec1[k];
                    vec1[k]=vec1[k+1];
                    vec1[k+1]=aux1;
                    
                    

  
                }
 
            }

    }   

    
    }
}
    
     
    
    
    

