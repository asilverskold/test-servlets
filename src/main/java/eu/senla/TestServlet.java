package eu.senla;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet(urlPatterns = "/test", loadOnStartup = 0)
public class TestServlet extends HttpServlet {

    private static final Logger log = Logger.getLogger(TestServlet.class.getName());

    @Override
    public void destroy() {
        log.info("I have been destroyed!");
        super.destroy();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        log.info("I have been initialized!");
        super.init(config);
    }

}