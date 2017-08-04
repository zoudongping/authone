package Servlet;

import dao.SqlSessionHelper;
import dao.UserinfoDao;
import entity.Userinfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/4.
 */
@WebServlet(name = "LoginServlet",urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
    UserinfoDao userinfoDao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        userinfoDao= SqlSessionHelper.getSqlSession().getMapper(UserinfoDao.class);
        request.setCharacterEncoding("UTF-8");
        String uname=request.getParameter("name");
        String pwd=request.getParameter("pwd");
        Userinfo u=new Userinfo();
        u.setUname(uname);
        u.setUpass(pwd);
        Userinfo user=userinfoDao.findByUser(u);
        if(user!=null){
            request.getSession().setAttribute("user",user);
            response.sendRedirect("index.jsp");
        }
        else response.sendRedirect("login.html");
        SqlSessionHelper.closeSession();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
