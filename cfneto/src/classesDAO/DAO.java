package classesDAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

	public  Connection conectaCom(String dbName) {

		Connection conexao = null;

		String url = "jdbc:mysql://127.0.0.1/";
		String userName = "filial134";
		String password = "senhafilial";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conexao = DriverManager.getConnection(url + dbName, userName, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conexao;

	}

}
