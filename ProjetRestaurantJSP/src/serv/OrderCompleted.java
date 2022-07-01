package serv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CommandeArticleDaoImpl;
import dao.CommandeDaoImpl;
import model.Achat;
import model.Client;
import model.Commande;
import model.CommandeArticle;

@WebServlet("/OrderCompleted")
public class OrderCompleted extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public OrderCompleted() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Client cl = (Client) request.getSession().getAttribute("client");
		int total = (int) request.getSession().getAttribute("totalp");
		Commande c = new Commande(cl.getId(), new Date(), total);
		List<Achat> panier = new ArrayList<Achat>();
		if (request.getSession().getAttribute("panier") != null) {
			panier = (List<Achat>) request.getSession().getAttribute("panier");
		}
		try {
			int id = new CommandeDaoImpl().createreturn(c);
			request.getSession().setAttribute("p", id);
			for (Achat a : panier) {
				System.out.println(a);
				int idart = a.getIdarticle();
				System.out.println(idart);
				int quantite = a.getQuantite();
				System.out.println(quantite);
				new CommandeArticleDaoImpl().create(new CommandeArticle(id, idart, quantite));
				request.getSession().setAttribute("totalp", null);
				request.getSession().setAttribute("panier", null);
			}
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
