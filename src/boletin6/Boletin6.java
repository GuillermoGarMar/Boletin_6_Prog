/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6;

/**
 *
 * @author ggarciamartinez
 */
public class Boletin6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c1 = new Conta("c1","234",2300);
        Conta c2 = new Conta("c2","3574",12);
        c1.Ingresar(3000);
        c1.Transferencia(c2, 2900);
        c1.visualizar();
        c2.visualizar();
    }
    
}
