/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.ModelMessage;
import views.ViewMessage;
import controllers.ControllerMessage;
/**
 *
 * @author Jireh Castillo
 */
public class Main {
    private static ViewMessage viewMessage;
    private static ModelMessage modelMessage;
    private static ControllerMessage controllerMessage;
    
    public static void main(String[] args) {
        ModelMessage modelMessage = new ModelMessage();
        ViewMessage viewMessage = new ViewMessage();
        ControllerMessage controllerMessage = new ControllerMessage(modelMessage, viewMessage);
    }
    
}
