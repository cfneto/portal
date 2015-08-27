package controlador;
import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classesDAO.*;

@WebServlet({ "/controlador" })
public class Controlador extends HttpServlet {

	private static final long serialVersionUID = 1L;
	Connection atacadao = null; 

	public Controlador() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rotina = request.getParameter("rotina");
		HttpSession sessao = request.getSession(true);
		RequestDispatcher dispatcher = null;
		sessao.setAttribute("mensagem", "");

		if (rotina.equals("favoritar"))
			UsuarioAppService.favoritos(request, response, sessao, dispatcher);	
	}

}
