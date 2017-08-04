package web;

import dao.SqlSessionHelper;
import dao.UserinfoDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/4.
 */
@WebServlet(name = "LoginServlet",value = "/loginservlet")
public class LoginServlet extends HttpServlet {
    UserinfoDao userinfoDao= SqlSessionHelper.getSqlSession().getMapper(UserinfoDao.class);
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname=request.getParameter("name");
        String pwd=request.getParameter("pwd");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
