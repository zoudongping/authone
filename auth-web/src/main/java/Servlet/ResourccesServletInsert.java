package Servlet;

import dao.ResourccesDao;
import dao.SqlSessionHelper;
import entity.Resourcces;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/4.
 */
@WebServlet(name = "ResourccesServletInsert" ,value="/addResourcces")
public class ResourccesServletInsert extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String rname =request.getParameter("rname");
        String resurl=request.getParameter("resurl");
        String resorderno=request.getParameter("resorderno");
        String  redsdes=request.getParameter("redsdes");
        String parentID= request.getParameter("parentID");
        Resourcces r=new Resourcces();
        r.setParentID(Integer.parseInt(parentID));

        r.setResurl("resurl");
        r.setRname("rname");
        r.setResorderno(Integer.parseInt(resorderno) );
        r.setRedsdes(redsdes);
        ResourccesDao dao= SqlSessionHelper.getSqlSession().getMapper(ResourccesDao.class);
        int num = dao.insert(r);
        SqlSessionHelper.getSqlSession().commit();
        SqlSessionHelper.closeSession();
        if(num==1){
            response.sendRedirect("resourcelist");
        }else{
            response.getWriter().append("Sorry!").close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }
}
