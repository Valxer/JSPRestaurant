package serv;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CommandeDaoImpl;
import model.Commande;

@WebServlet("/OrderCompleted")
public class OrderCompleted extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public OrderCompleted() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Commande c = new Commande(17, new Date(), 175);
		try {
			new CommandeDaoImpl().create(c);
			int id = new CommandeDaoImpl().getLastCommandeId(17);
			request.getSession().setAttribute("p", id);
			request.getRequestDispatcher("WEB-INF/bravo.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
