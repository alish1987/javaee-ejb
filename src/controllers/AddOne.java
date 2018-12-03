package controllers;

import service.CounterBean;
import service.CounterStateFullBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addOne")
public class AddOne extends HttpServlet {
    public AddOne() {
        super();
    }

    @EJB
    CounterBean cb;

//    @EJB
//    CounterStateFullBean cbStateFull;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        CounterStateFullBean cbStateFull = (CounterStateFullBean) session.getAttribute("cbStateFull");

        PrintWriter out = response.getWriter();
        out.println("The Current count value for singletone is :  " + cb.getCount());
        out.println("The Current count value for statefull is :  " + cbStateFull.getCount());
        cb.addOneToCount();
        cbStateFull.addOneToCount();
        out.println("The COunt was increamented by one , The Current count value for singletone is  :  :  " + cb.getCount());
        out.println("The COunt was increamented by one , The Current count value for statefull is  :  :  " + cbStateFull.getCount());

    }
}
