/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] edad;
        edad = new int[10];
        double [] precio = new double[3];
        double total=0;
        
        /*for(int i=0; i<precio.length; i++){
            
        }*/
        
        int seguir;
        String nombre="";
        int num=0;
        
        do{
            nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
            JOptionPane.showMessageDialog(null,"hola"+nombre);
            seguir=JOptionPane.showConfirmDialog(null, "desea continuar", "confirmar", JOptionPane.YES_NO_OPTION);
            
        }while(seguir== JOptionPane.YES_OPTION);
    }
    
}
