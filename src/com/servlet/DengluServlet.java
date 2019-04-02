package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.UserDao;
import com.dao.UserDaoImpl;

@WebServlet(name = "DengluServlet")
public class DengluServlet extends HttpServlet {
    //重写doGet和doPost的方法
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        doPost(request,response);   //将信息使用doPost方法执行    对应jsp页面中的form表单中的method
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException{

        //得到jsp页面传过来的参数
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");

        UserDao ud = new UserDaoImpl();

        if(ud.login(name,pwd)){
            //向request域中放置信息
            request.setAttribute("xiaoxi","欢迎用户"+name);
            //转发到成功页面
            request.getRequestDispatcher("/success.jsp").forward(request,response);
        }else{
            //重定向到首页
            response.sendRedirect("index.jsp");
        }
    }
}
