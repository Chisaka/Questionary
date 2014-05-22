package jp.co.jjs.java.java_seminar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class work_sheet
 */
@WebServlet("/work_sheet")
public class work_servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public work_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");

        String sex   = request.getParameter("sex");
        String age   = request.getParameter("age");
        String job   = request.getParameter("job");
        String today = request.getParameter("today");

        request.setAttribute("sex", sex);
        request.setAttribute("age", age);
        request.setAttribute("job", job);
        request.setAttribute("today", today);

        RequestDispatcher dispatcher = request.getRequestDispatcher("work_sheet.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

}
