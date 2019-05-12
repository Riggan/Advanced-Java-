import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public class Servlet extends HttpServlet
{
  public void service(HttpServletRequest req, HttpServletResponse res)
  {
    int i = Integer.parseInt(req.getParameter('num1'));
    int j = Integer.parseInt(req.getParameter('num2'));

    int k = i + j;

    res.getWriter().println(k);
  }
}
