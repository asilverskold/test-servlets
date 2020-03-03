package eu.senla;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class SecondFilter implements Filter {

    private static final Logger log = Logger.getLogger(SecondFilter.class.getName());

    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("SecondFilter init");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("SecondFilter is filtering request");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
        log.info("SecondFilter destroy");
    }
}