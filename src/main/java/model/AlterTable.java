package model;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlterTable {

    //Alter table qnt atual - qnt removida

    public static void alterarEstoque(String nome, int quantidadeAtual){
        String sql = "UPDATE estoque SET quantidade_produto = ? WHERE nome_produto = ?;";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, quantidadeAtual);
            ps.setString(2, nome);

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro no AlterTable" + e);
            JOptionPane.showMessageDialog(null,"Verifique se algum campo está vazio ou incorreto");
        }

    }
}