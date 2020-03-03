package eu.senla;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet(urlPatterns = "/test", loadOnStartup = -2)
public class TestServlet extends HttpServlet {

    private static final Logger log = Logger.getLogger(TestServlet.class.getName());

    @Override
    public void destroy() {
        log.info("I have been destroyed!");
        super.destroy();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("Process GET request");
        resp.getWriter().println("I give you nothing, ha-ha");

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        log.info("I have been initialized!");
        super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getMethod();
        if(method.equals("VALIDATE")) {
            resp.getWriter().println("Processing custom VALIDATE method");
        } else {
            super.service(req, resp);
        }
    }
}