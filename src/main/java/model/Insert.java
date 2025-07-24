package model;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void cadastrarProduto(Produto produto) {

        String sql = "INSERT INTO estoque(nome_produto,quantidade_produto,valor_produto) VALUES (?,?,?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1,produto.getNome_produto());
            ps.setString(2,produto.getQnt_produto());
            ps.setString(3,produto.getValor_produto());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro no Insert" + e);
            JOptionPane.showMessageDialog(null,"Verifique se algum campo está vazio ou incorreto");
        }


    }
}
