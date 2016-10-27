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
public class Conta {
    private String nomec,nc;
    private double saldo;
    public Conta (){
    }
    
    public Conta (String x, String y,double z){
        nomec = x;
        nc = y;
        saldo = z;
    }

    public String getNomec() {
        return nomec;
    }

    public void setNomec(String nomec) {
        this.nomec = nomec;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean Ingresar(int s){
         if (s>=0){
             saldo+=s;
             return true;
         }else{
             return false;
         }
     }
    
    public boolean Retirar(int s){
         if (saldo>=s){
             saldo-=s;
             return true;
         }else{
             return false;
         }
     }
    
    public void Transferencia(Conta cD,int i){
        if (saldo>=i){
             saldo-=i;
        cD.saldo+=i;

         }
    }
    
    public void visualizar(){
        System.out.println("A conta "+nomec+" con numero de conta "+nc+" ten un saldo de:"+saldo);
    }
}
