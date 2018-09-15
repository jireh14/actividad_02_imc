/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.swing.JOptionPane;

/**
 *
 * @author Jireh Castillo
 */
public class ModelMessage {
   private float estatura = 0.0f;
        private float peso = 0.0f;
        private float imc = 0.0f;
        private String interpretacionImc= "";
    public void calcularImc(){
        
       
//        estatura = Float.parseFloat(this.jTF_estatura.getText()); 
//        peso = Float.parseFloat(this.jTF_peso.getText());
        imc= peso / (estatura*estatura);
        if (estatura >2 || estatura <1){
            JOptionPane.showMessageDialog(null, "No Ingresó la Estatura en Metros");
            JOptionPane.showMessageDialog(null,"El valor de la Estatura Maxima es 2 Metros \n El valor Minimo de la altura es 1 Metro" );
            
        }
        if (peso >400 || peso <3){
            JOptionPane.showMessageDialog(null,"El valor Maximo del Peso es 400 Kilos \n El valor Minimo del Peso es 3 Kilos" );
        
        }
        
//        this.jL_imc_es.setText(String.valueOf(imc));
               
        if (imc <=15.00){
           interpretacionImc=("DELGADEZ SEVERA");
       } 
        if (imc >=17.00 && imc <=20.00){
           interpretacionImc="BAJO PESO";
        }
        if (imc >=21.00 && imc <=24.00){
            interpretacionImc="PESO NORMAL";
        }
        if (imc >=25.00 && imc <=29.00){
            interpretacionImc="SOBREPESO";
        }
        if (imc >=30.00 && imc <=34.00){
            interpretacionImc="OBESIDAD: TIPO I";
        }
        if (imc >=35.00 && imc <=39.00){
            interpretacionImc="OBESIDAD: TIPO II";
        }
        if (imc >=40.00){
           interpretacionImc="OBESIDAD: TIPO III";
           JOptionPane.showMessageDialog(null, "Cuidado tiene un Peso Muy Alto");
        }
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public String getInterpretacionImc() {
        return interpretacionImc;
    }

    public void setInterpretacionImc(String interpretacionImc) {
        this.interpretacionImc = interpretacionImc;
    }
   
}
