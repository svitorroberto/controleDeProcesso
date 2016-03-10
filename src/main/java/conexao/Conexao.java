package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	String url = "jdbc:mysql://localhost:3306/sysdecisao";
	String usuario = "root";
	String senha = "aluno";
	Connection con;

	public void conectar() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conectado!");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}

	}

	public void desconectar() {
		try {
			con.close();
			System.out.println("Desconectado!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}