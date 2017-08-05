package Servlet;

import dao.ResourccesDao;
import dao.SqlSessionHelper;
import entity.Resourcces;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by THINK on 2017/8/4.
 */
@WebServlet(name = "ResourceServlet")
public class ResourceServlet extends HttpServlet {
    ResourccesDao resourccesDao= SqlSessionHelper.getSqlSession().getMapper(ResourccesDao.class);
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Resourcces> all=resourccesDao.findAll();
        request.setAttribute("all",all);
        response.sendRedirect("resource.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}