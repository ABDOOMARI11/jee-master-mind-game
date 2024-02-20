package Metier;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

import Web.jeuBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "ServletJeu", value = "/jeu-servlet")
public class ServletJeu extends HttpServlet {
    private Jeu jeu;
    private AtomicBoolean jeuEnCours;

    public void init() {
        jeu = new Jeu();
        jeu.genererNombre();
        jeuEnCours = new AtomicBoolean(true);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            if (jeuEnCours.get()) {  // Vérifier si le jeu est en cours
                int nbPropose = Integer.parseInt(request.getParameter("nombrePropose"));
                HttpSession session = request.getSession();

                jeuBean monBean = (jeuBean) session.getAttribute("bean");

                if (monBean == null) {
                    monBean = new jeuBean();
                }

                monBean.setNb(nbPropose);
                monBean.getLstMessages().add(jeu.jouer(nbPropose));

                session.setAttribute("bean", monBean);

                // Vérifier si le nombre a été trouvé
                if (jeu.getNombreSecret()) {
                    jeuEnCours.set(false);  // Arrêter le jeu
                }

                // Rediriger vers la page JSP
                request.getRequestDispatcher("index.jsp").forward(request, response);
            } else {
                // Le jeu est terminé, vous pouvez rediriger ou afficher un message approprié.
                response.getWriter().write("Le jeu est terminé.");
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
    }
}
