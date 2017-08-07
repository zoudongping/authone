package Servlet;

import dao.ResourccesDao;
import dao.SqlSessionHelper;
import dao.UserinfoDao;
import entity.Resourcces;
import entity.UserInfoVo;
import entity.Userinfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by THINK on 2017/8/5.
 */
@WebServlet(name = "GetResourcesByUserServlet",urlPatterns = "/getResourcesByUser")
public class GetResourcesByUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        ResourccesDao resourccesDao= SqlSessionHelper.getSqlSession().getMapper(ResourccesDao.class);
        UserinfoDao userinfoDao=SqlSessionHelper.getSqlSession().getMapper(UserinfoDao.class);
        Userinfo userinfo=(Userinfo)request.getSession().getAttribute("user");
        if(userinfo!=null){
            List<Resourcces> reslist=resourccesDao.findResourccesByUid(userinfo.getUid());
            request.getSession().setAttribute("reslist", reslist);
            List<UserInfoVo> userlist = userinfoDao.findAllUser();
            request.setAttribute("userlist",userlist);
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
        else {
            response.sendRedirect("index.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
