package classesDAO;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UsuarioAppService {

	public static void favoritos(HttpServletRequest request,HttpServletResponse response, HttpSession sessao,RequestDispatcher dispatcher) {
		
		LinkDAO objLinkDAO = new LinkDAO();
		List<Link> listaDeFavoritos = objLinkDAO.procure("setor");
		sessao.setAttribute("listaDeFavoritos", listaDeFavoritos);

		dispatcher = request.getRequestDispatcher("index.jsp");
		
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
