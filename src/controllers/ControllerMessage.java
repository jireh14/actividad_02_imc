/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelMessage;
import views.ViewMessage;

public class ControllerMessage implements ActionListener{
    ModelMessage modelMessage;
    ViewMessage viewMessage;

    public ControllerMessage(ModelMessage modelMesssage, ViewMessage viewMessage) {
        this.modelMessage = modelMesssage;
        this.viewMessage = viewMessage;
        this.viewMessage.jB_calcular.addActionListener(this);
        initComponets();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewMessage.jB_calcular){
            jB_calcular_action_performed();
        }
    }
    
    public void jB_calcular_action_performed(){
       modelMessage.setEstatura(Float.parseFloat(viewMessage.jTF_estatura.getText()));
       modelMessage.setPeso(Float.parseFloat(viewMessage.jTF_peso.getText()));
       modelMessage.calcularImc();
       viewMessage.jL_imc_es.setText("Su IMC es:" + modelMessage.getImc());
       viewMessage.jL_imc_tiene.setText("De acuerdo con el IMC, tiene:" + modelMessage.getInterpretacionImc());
               
    }
    public void initComponets(){
        viewMessage.setVisible(true);
        viewMessage.setVisible(true);
        viewMessage.jTF_estatura.setText(String.valueOf(modelMessage.getEstatura()));
        viewMessage.jTF_peso.setText(String.valueOf(modelMessage.getPeso()));
    }
}
