package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class ConsultarPessoas2 {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome like ?";
		
		System.out.println("Informe o valor para pesquisa: ");
		String valor = sc.nextLine();

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + valor + "%");
		ResultSet resultado = stmt.executeQuery();
	
		
		sc.close();
		stmt.close();
		conexao.close();
	}

}
