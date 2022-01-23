/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * Classe para facilitar a comunicação com o usuário.
 */
public class Msg {

    public static void alertar(Component frame, String msg) {
        JOptionPane.showMessageDialog(frame, msg, "Alerta", JOptionPane.WARNING_MESSAGE);
    }

    public static void informar(Component frame, String msg) {
        JOptionPane.showMessageDialog(frame, msg, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void errar(Component frame, String msg) {
        JOptionPane.showMessageDialog(frame, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static boolean confirmar(Component frame, String msg) {
        Object[] options = {"Sim", "Não"};
        int option = JOptionPane.showOptionDialog(frame, msg, "Confirmar", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options);

        if (option == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }

}
