package model;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    public static Integer selectMethod(String nome) {
        try {
            Connection con = Conexao.getConexao();

            assert con != null;
            PreparedStatement selectStatement = con.prepareStatement("SELECT quantidade_produto FROM estoque WHERE nome_produto = ?");
            selectStatement.setString(1, nome);

            ResultSet result = selectStatement.executeQuery();

            if (!result.next()) {
                JOptionPane.showMessageDialog(null, "Produto não cadastrado ou incorreto.", "Entrada Inválida", JOptionPane.WARNING_MESSAGE);
                return null;
            } else {
                int quantidade = result.getInt("quantidade_produto");
                JOptionPane.showMessageDialog(null, "Produto alterado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                return quantidade;
            }

        } catch (SQLException e) {
            // Caso ocorra um erro de SQL, lança uma exceção em tempo de execução
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
