package serv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Achat;
import model.Article;

/**
 * Servlet implementation class ServAjout
 */
@WebServlet("/Ajout")
public class ServAjout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServAjout() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Achat> panier = new ArrayList<Achat>();
		int totalp = 0;
		if (request.getSession().getAttribute("totalp") != null)
			totalp = (int) request.getSession().getAttribute("totalp");
		if (request.getSession().getAttribute("panier") != null) {
			panier = (List<Achat>) request.getSession().getAttribute("panier");
		}
		int idart = Integer.parseInt(request.getParameter("select"));
		int quantite = Integer.parseInt(request.getParameter("quantite"));
		List<Article> articles = (List<Article>) request.getServletContext().getAttribute("articles");
		int total = 0;
		String nomart = null;
		for (Article article : articles) {
			if (idart == article.getRef()) {
				total = article.getPrix() * quantite;
				nomart = article.getNom();
			}
		}
		Achat a = new Achat(nomart, idart, quantite, total);
		panier.add(a);
		totalp += total;

		request.getSession().setAttribute("totalp", totalp);
		request.getSession().setAttribute("panier", panier);
		request.getRequestDispatcher("WEB-INF/choixarticle.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
