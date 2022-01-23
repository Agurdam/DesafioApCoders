/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.bancoDeDados;

import com.br.utils.Msg;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author X
 */
public class Conexao {

    /**
     * Metodo responsavel por estabelecar a conexao com o banco de dados.
     */
    public static Connection conector() {

        /**
         * Variaveis para armazenar credenciais do banco de dados.
         */
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/desafioap";
        String usuario = "root";
        String senha = "";

        /**
         * Estabelecendo a conexão com o banco de dados.
         */
        try {
            Class.forName(driver);

            return DriverManager.getConnection(url, usuario, senha);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro relacionado ao banco de dados\n\nErro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (Exception e2) {
            JOptionPane.showMessageDialog(null, "Erro não relacionado ao banco de dados\n\nErro :" + e2.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

}
