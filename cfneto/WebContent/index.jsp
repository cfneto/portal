<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet" %>
<%@page import="classesDAO.Link" %>
<%@page import="classesDAO.UsuarioAppService"%>	
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title></title>
<link rel='stylesheet' href="./css/normalize.css">
<link rel='stylesheet' href="./css/style.css">
</head>

<body>
	<%		
		List<Link> listaDeFavoritos = null;	
		listaDeFavoritos = (List<Link>) session.getAttribute("listaDeFavoritos");		
	%>
	<div class="art">
	
		<div class="loginBarra">		
			<a href="http://dunlop.atacadao.com.br:8080/cfneto/indexnew/"><img src="./imgs/ata.png"/></a>
		
		</div>	
		
		<ul class="menu">
			<li><a href="#">Corporativo</a>
					<ul>
						<li><a href="http://newintranet.atacadao.com.br:7783/forms/frmservlet?config=DBCOM" target="_blank">Almoxarifado</a></li>
						<li><a href="http://newintranet.atacadao.com.br:7783/forms/frmservlet?config=DBADM" target="_blank">Administrativo</a></li>
						<li><a href="http://conferencia.atacadao.com.br" target="_blank">Conferentes</a></li>
						<li><a href="#">Estornos</a></li>
						<li><a href="http://newintranet.atacadao.com.br:7783/forms/frmservlet?config=MENTHOR" target="_blank">Menthor</a></li>						
						<li><a href="http://email.atacadao.com.br/iwaredir.nsf">Notes</a></li>						
						<li><a href="http://srvweb2.atacadao.com.br/telefonia/ramais" target="_blank">Ramais</a></li>
						<li><a href="http://10.113.81.154/sumus/" target="_blank">Sumus</a></li>
						<li><a href="http://tpldunlop.atacadao.com.br" target="_blank">TPLinux</a></li>											
					</ul>	
			</li>
			<li><a href="#">Informativo</a>
					<ul>
						<li><a href="#">Aniversariantes</a></li>
						<li><a href="#">CIPA</a></li>
						<li><a href="#">Destaques do mes</a></li>
						<li><a href="#">Recursos Humanos</a></li>						
					</ul>			
			</li>
			<li><a href="http://portal.atacadao.com.br">Intranet</a></li>			  
			<li><a href="http://matrizweb.atacadao.com.br/portal/atacadao?mvc=3634" target="_blank">Chamados</a></li>
		</ul>
	</div>


	<div class="corpo">
	
		<div class="economia">		
			<object>
			<param name="wmode" value="opaque">
              <embed src="./imgs/bn_atacadao_economia.swf" wmode="opaque" ></embed>
			</object>
		</div>
		
		<div class="slide"></div>		
		<div class="menuSetor">		
			<div class="setore">
				<h1>Informatica</h1>
					<ul>
						<li><a href="controlador?rotina=favoritar" >links</a></li>
				
						
					</ul>								
			</div>			
		</div>				
		
	</div>
	
		
		
		
	
	
</body>
</html>