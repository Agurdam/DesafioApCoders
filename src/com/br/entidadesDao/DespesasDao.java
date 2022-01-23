/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.entidadesDao;

import com.br.bancoDeDados.Conexao;
import com.br.entidades.Despesas;
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
public class DespesasDao {

    /**
     * Metodo para inserir dados no banco.
     */
    public void criar(Despesas d) {
        java.sql.Connection con = Conexao.conector();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("INSERT INTO despesas (descricao, tipoDespesa, valor, vencimentoFatura, statusPagamento) VALUES(?,?,?,?,?)");
            pst.setString(1, d.getDescricao());
            pst.setString(2, d.getTipoDespeca());
            pst.setFloat(3, d.getValor());       
            
            pst.setString(5, d.getStatus());
            
             /**
             * Função´para formatar data antes de inserir no banco
             */
            String dia = d.getVencimento().substring(0, 2);
            String mes = d.getVencimento().substring(3, 5);
            String ano = d.getVencimento().substring(6);
            String dataMYSQL = ano+"-"+mes+"-"+dia;
            pst.setObject(4, dataMYSQL);

            pst.executeUpdate();
            Msg.informar(null, "Despesa inserido com sucesso!");

        } catch (SQLException ex) {
            Msg.errar(null, "Erro ao inserir despesa!");
            Logger.getLogger(DespesasDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Metodo para ler dados no banco.
     */
    public List<Despesas> ler() {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Despesas> d = new ArrayList<>();

        try {
            pst = con.prepareStatement("SELECT * FROM despesas");
            rs = pst.executeQuery();

            while (rs.next()) {
                Despesas despesa = new Despesas();

                despesa.setId(rs.getInt("id"));
                despesa.setDescricao(rs.getString("descricao"));
                despesa.setTipoDespeca(rs.getString("tipoDespesa"));
                despesa.setValor(rs.getFloat("valor"));
                String dataDB = rs.getDate("vencimentoFatura").toString();
                String dia = dataDB.substring(8);
                String mes = dataDB.substring(5,7);
                String ano = dataDB.substring(0,4);
                String dataTb = dia + "-"+ mes +"-"+ ano;
                despesa.setVencimento(dataTb);
                //despesa.setVencimento(rs.getDate("vencimentoFatura").toString());
                despesa.setStatus(rs.getString("statusPagamento"));
                d.add(despesa);

            }
        } catch (SQLException ex) {
            Msg.errar(null, "Erro ao gerar tabela de despesas!");
            Logger.getLogger(DespesasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }

    public void att(Despesas d) {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("UPDATE despesas SET descricao = ?, tipoDespesa= ?, valor = ?, vencimentoFatura = ?, statusPagamento = ? WHERE id = ?");
            pst.setString(1, d.getDescricao());
            pst.setString(2, d.getTipoDespeca());
            pst.setFloat(3, d.getValor());
            pst.setString(5, d.getStatus());
            pst.setInt(6, d.getId());
            
             /**
             * Função´para formatar data antes de inserir no banco
             */
            String dia = d.getVencimento().substring(0, 2);
            String mes = d.getVencimento().substring(3, 5);
            String ano = d.getVencimento().substring(6);
            String dataMYSQL = ano+"-"+mes+"-"+dia;
            pst.setObject(4, dataMYSQL);            

            pst.executeUpdate();
            Msg.informar(null, "Despesa atualizado com sucesso!");

        } catch (SQLException ex) {
            Msg.errar(null, "Erro ao atualizar despesa!");
            Logger.getLogger(DespesasDao.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public void excluir(Despesas d) {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("DELETE FROM despesas WHERE id = ?");

            pst.setInt(1, d.getId());

            pst.executeUpdate();
            Msg.informar(null, "Despesa excluída com sucesso!");

        } catch (SQLException ex) {
           Msg.errar(null, "Erro ao excluir despesa!");
            Logger.getLogger(DespesasDao.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    /**
     * Metodo para buscar por data.  
     */
    public List<Despesas> BuscarData (String data) {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Despesas> d = new ArrayList<>();

        try {
            pst = con.prepareStatement("SELECT * FROM despesas WHERE vencimentoFatura = ?");
            
            pst.setObject(1, data);
            rs = pst.executeQuery();

            while (rs.next()) {
                Despesas despesa = new Despesas();

                despesa.setId(rs.getInt("id"));
                despesa.setDescricao(rs.getString("descricao"));
                despesa.setTipoDespeca(rs.getString("tipoDespesa"));
                despesa.setValor(rs.getFloat("valor"));
                despesa.setVencimento(rs.getDate("vencimentoFatura").toString());
                despesa.setStatus(rs.getString("statusPagamento"));
                d.add(despesa);

            }
        } catch (SQLException ex) {
            Msg.errar(null, "Erro ao gerar tabela de despesas!");
            Logger.getLogger(DespesasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }
    /**
     * Metodo para buscar por data.  
     */
    public List<Despesas> BuscarDesc(String desc) {
        Connection con = Conexao.conector();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Despesas> d = new ArrayList<>();

        try {
            pst = con.prepareStatement("SELECT * FROM despesas WHERE descricao LIKE ?");
            
            pst.setString(1, "%"+desc+"%");
            rs = pst.executeQuery();

            while (rs.next()) {
                Despesas despesa = new Despesas();

                despesa.setId(rs.getInt("id"));
                despesa.setDescricao(rs.getString("descricao"));
                despesa.setTipoDespeca(rs.getString("tipoDespesa"));
                despesa.setValor(rs.getFloat("valor"));
                despesa.setVencimento(rs.getDate("vencimentoFatura").toString());
                despesa.setStatus(rs.getString("statusPagamento"));
                d.add(despesa);

            }
        } catch (SQLException ex) {
            Msg.errar(null, "Erro ao pesquisar na tabela de despesas!");
            Logger.getLogger(DespesasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }


}
