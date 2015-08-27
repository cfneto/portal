package classesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LinkDAO extends DAO {
	
public List<Link> procure(String setor) {
		
		Connection atacadao = null;
		PreparedStatement declaracao;
		ResultSet rs = null;
		String sql = "SELECT * FROM links WHERE setor = INFORMATICA";
				  
		List<Link> listaDeFavoritos = new ArrayList<Link>();
		
		try {
			atacadao = conectaCom("atacadao");
			declaracao = atacadao.prepareStatement( sql );
			
			rs = declaracao.executeQuery();   
			
			while (rs.next()) {				
				Link objLink = new Link();
				objLink.setSetor( rs.getString("setor") );
				objLink.setNome( rs.getString("nome") );
				objLink.setLink( rs.getString("link") );						
				listaDeFavoritos.add( objLink );			
			}			
			declaracao.close(); 			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				atacadao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return listaDeFavoritos;		
	}
}
