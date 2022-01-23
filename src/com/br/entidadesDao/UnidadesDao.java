/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.entidadesDao;

import com.br.bancoDeDados.Conexao;
import com.br.entidades.Unidades;
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
public class UnidadesDao {

    /**
     * Metodo para inserir dados no banco.
     */
    public void criar(Unidades u) {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("INSERT INTO unidades (descricao, proprietario, condominio, endereco, condicao) VALUES(?,?,?,?,?)");
            pst.setString(1, u.getDescricao());
            pst.setString(2, u.getProprietario());
            pst.setString(3, u.getCondominio());
            pst.setString(4, u.getEndereco());
            pst.setString(5, u.getCondicao());

            pst.executeUpdate();
            Msg.informar(null, "Unidade inserida com sucesso!");

        } catch (SQLException ex) {
            Msg.errar(null, "Erro ao inserir unidade!");
            Logger.getLogger(UnidadesDao.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    /**
     * Metodo para ler dados no banco.
     */
    public List<Unidades> ler() {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Unidades> u = new ArrayList<>();

        try {
            pst = con.prepareStatement("SELECT * FROM unidades");
            rs = pst.executeQuery();

            while (rs.next()) {
                Unidades unidade = new Unidades();
                unidade.setId(rs.getInt("id"));
                unidade.setDescricao(rs.getString("descricao"));
                unidade.setProprietario(rs.getString("proprietario"));
                unidade.setCondominio(rs.getString("condominio"));
                unidade.setEndereco(rs.getString("endereco"));
                unidade.setCondicao(rs.getString("condicao"));
                u.add(unidade);

            }
        } catch (SQLException ex) {
            Msg.errar(null, "Erro ao gerar tabela de unidades!");
            Logger.getLogger(UnidadesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }

    public void att(Unidades u) {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("UPDATE unidades SET descricao = ?, proprietario = ?, condominio = ?, endereco = ?, condicao = ? WHERE id = ?");
            pst.setString(1, u.getDescricao());
            pst.setString(2, u.getProprietario());
            pst.setString(3, u.getCondominio());
            pst.setString(4, u.getEndereco());
            pst.setString(5, u.getCondicao());
            pst.setInt(6, u.getId());

            pst.executeUpdate(); 
            Msg.informar(null, "Unidade atualizada com sucesso!");

        } catch (SQLException ex) {
            Msg.errar(null, "Erro ao atualizar unidade!");
            Logger.getLogger(UnidadesDao.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public void excluir(Unidades u) {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("DELETE FROM unidades WHERE id = ?");

            pst.setInt(1, u.getId());

            pst.executeUpdate();
            Msg.informar(null, "Unidade excluída com sucesso!");

        } catch (SQLException ex) {
            Msg.informar(null, "Erro ao excluir unidade!");
            Logger.getLogger(UnidadesDao.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    /**
     * Metodo para buscar por proprietário.
     */
    public List<Unidades> BuscarP(String proprietario) {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Unidades> u = new ArrayList<>();

        try {
            pst = con.prepareStatement("SELECT * FROM unidades WHERE proprietario LIKE ?");
            pst.setObject(1, "%" + proprietario + "%");
            rs = pst.executeQuery();

            while (rs.next()) {
                Unidades uni = new Unidades();
                uni.setId(rs.getInt("id"));
                uni.setDescricao(rs.getString("descricao"));
                uni.setProprietario(rs.getString("proprietario"));
                uni.setCondominio(rs.getString("condominio"));
                uni.setEndereco(rs.getString("endereco"));
                uni.setCondicao(rs.getString("condicao"));
                u.add(uni);

            }
        } catch (SQLException ex) {
            Msg.errar(null, "Erro ao pesquisar na tabela de inquilinos!");
            Logger.getLogger(DespesasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }
    /**
     * Metodo para buscar por condominio.
     */
    public List<Unidades> BuscarCondominio(String condominio) {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Unidades> u = new ArrayList<>();

        try {
            pst = con.prepareStatement("SELECT * FROM unidades WHERE condominio LIKE ?");
            pst.setObject(1, "%" + condominio + "%");
            rs = pst.executeQuery();

            while (rs.next()) {
                Unidades uni = new Unidades();
                uni.setId(rs.getInt("id"));
                uni.setDescricao(rs.getString("descricao"));
                uni.setProprietario(rs.getString("proprietario"));
                uni.setCondominio(rs.getString("condominio"));
                uni.setEndereco(rs.getString("endereco"));
                uni.setCondicao(rs.getString("condicao"));
                u.add(uni);

            }
        } catch (SQLException ex) {
            Msg.errar(null, "Erro ao pesquisar na tabela de inquilinos!");
            Logger.getLogger(DespesasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }
    
    /**
     * Metodo para buscar por condominio.
     */
    public List<Unidades> BuscarCondicao(String condicao) {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Unidades> u = new ArrayList<>();

        try {
            pst = con.prepareStatement("SELECT * FROM unidades WHERE condicao = ?");
            pst.setObject(1,condicao);
            rs = pst.executeQuery();

            while (rs.next()) {
                Unidades uni = new Unidades();
                uni.setId(rs.getInt("id"));
                uni.setDescricao(rs.getString("descricao"));
                uni.setProprietario(rs.getString("proprietario"));
                uni.setCondominio(rs.getString("condominio"));
                uni.setEndereco(rs.getString("endereco"));
                uni.setCondicao(rs.getString("condicao"));
                u.add(uni);

            }
        } catch (SQLException ex) {
            Msg.errar(null, "Erro ao pesquisar na tabela de inquilinos!");
            Logger.getLogger(DespesasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }

}
