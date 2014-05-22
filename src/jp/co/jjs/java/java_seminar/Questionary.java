package jp.co.jjs.java.java_seminar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Questionary
 */
@WebServlet("/Questionary")
public class Questionary extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Questionary() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();

        writer.println("<!DOCTYPE html><html><head>");
        writer.println("<title>title</title>");
        writer.println("</head><body>");

        writer.println("<h1>あんけーと結果</h1>");
        writer.println("<form method='post' action='work_sheet.jsp'>");
        writer.println("性別<input type='radio' name='sex' value='男性' />男性");
        writer.println("<input type='radio' name='sex' value='女性'/>女性<br>");
        writer.println("年齢<input type='number' name='age' /><br>");
        writer.println("職業<select name='job'>");
        writer.println("<option value='会社員'>会社員</option>");
        writer.println("<option value='学生'>学生</option>");
        writer.println("</select><br><br>");
        writer.println("今日の気分<br>");
        writer.println("<textarea name='today' rows='3' cols='30'>");
        writer.println("(例) ウィットに富んだジョークでもかましたい気分だ。</textarea><br>");
        writer.println("<input type='submit' value='送信'>");

        writer.println("</form></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
