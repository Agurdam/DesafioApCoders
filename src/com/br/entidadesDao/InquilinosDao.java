/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.entidadesDao;

import com.br.bancoDeDados.Conexao;
import com.br.entidades.Inquilinos;
import com.br.utils.Msg;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author X
 */
public class InquilinosDao {

    /**
     * Metodo para inserir dados no banco.
     */
    public void criar(Inquilinos i) {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("INSERT INTO inquilinos(nome, idade, sexo, email, telefone) VALUES(?,?,?,?,?)");
            pst.setString(1, i.getNome());
            pst.setInt(2, i.getIdade());
            pst.setString(3, i.getSexo());
            pst.setString(4, i.getEmail());
            pst.setString(5, i.getTelefone());

            pst.executeUpdate();
            Msg.informar(null, "Inquilino inserido com sucesso!");

        } catch (SQLException ex) {
            Msg.errar(null, "Erro ao salvar inquilino!");
            Logger.getLogger(InquilinosDao.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    /**
     * Metodo para ler dados no banco.
     */
    public List<Inquilinos> ler() {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Inquilinos> i = new ArrayList<>();

        try {
            pst = con.prepareStatement("SELECT * FROM inquilinos");
            rs = pst.executeQuery();

            while (rs.next()) {
                Inquilinos inquilino = new Inquilinos();

                inquilino.setId(rs.getInt("id"));
                inquilino.setNome(rs.getString("nome"));
                inquilino.setIdade(rs.getInt("idade"));
                inquilino.setSexo(rs.getString("sexo"));
                inquilino.setEmail(rs.getString("email"));
                inquilino.setTelefone(rs.getString("telefone"));
                i.add(inquilino);

            }
        } catch (SQLException ex) {
            Msg.errar(null, "Erro ao gerar tabela de inquilinos!");
            Logger.getLogger(InquilinosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    /**
     * Metodo para atualizar os dados do banco.
     */
    public void att(Inquilinos i) {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("UPDATE inquilinos SET nome = ?, idade = ?, sexo = ?, email = ?, telefone = ? WHERE id = ?");
            pst.setString(1, i.getNome());
            pst.setInt(2, i.getIdade());
            pst.setString(3, i.getSexo());
            pst.setString(4, i.getEmail());
            pst.setString(5, i.getTelefone());
            pst.setInt(6, i.getId());

            pst.executeUpdate();
            Msg.informar(null, "Inquilino atualizado com sucesso!");

        } catch (SQLException ex) {
            Msg.errar(null, "Erro ao atualizar inquilino!");
            Logger.getLogger(InquilinosDao.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public void excluir(Inquilinos i) {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("DELETE FROM inquilinos WHERE id = ?");

            pst.setInt(1, i.getId());

            pst.executeUpdate();
            Msg.informar(null, "Inquilino excluído com sucesso!");

        } catch (SQLException ex) {
            Msg.errar(null, "Erro ao excluir inquilino!");
            Logger.getLogger(InquilinosDao.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    /**
     * Metodo para buscar por data.
     */
    public List<Inquilinos> BuscarN(String nome) {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Inquilinos> i = new ArrayList<>();

        try {
            pst = con.prepareStatement("SELECT * FROM inquilinos WHERE nome LIKE ?");
            pst.setObject(1, "%" + nome + "%");
            rs = pst.executeQuery();

            while (rs.next()) {
                Inquilinos inquilino = new Inquilinos();

                inquilino.setId(rs.getInt("id"));
                inquilino.setNome(rs.getString("nome"));
                inquilino.setIdade(rs.getInt("idade"));
                inquilino.setSexo(rs.getString("sexo"));
                inquilino.setEmail(rs.getString("email"));
                inquilino.setTelefone(rs.getString("telefone"));
                i.add(inquilino);

            }
        } catch (SQLException ex) {
            Msg.errar(null, "Erro ao pesquisar na tabela de inquilinos!");
            Logger.getLogger(DespesasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

}
