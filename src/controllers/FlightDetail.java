package controllers;

import service.FlightLocal;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/flightDetail")
public class FlightDetail extends HttpServlet {
    public FlightDetail() {
        super();
    }

    /**
     * inject FlightServiceStateLess (make instance from FlightServiceStateLess class)
     * az ejb container darkhast mikonad ke yek instance az in FlightServiceStateLess bema bedahad .
     */
    @EJB(beanName = "flightServiceStateLess")
    FlightLocal flightServiceStateLess;
    @EJB(beanName = "flightServiceStateFull")
    FlightLocal flightServiceStateFull;

    /**
     * در stateless اگر ما ده تا ابجکت (بین) از یک کلاس بگیریم وقتی برای آخرین بار مقداری هرکدام از ابجکتها را تغییر دهیم همه مقدارهای ابجکتهای دیگر هم مانند آخرین تغییر عوض می شوند یعنی انگار در کانتینر ما ده ابجکت معادل با یک ابجکت است ولی در statefull هر ابجکت تغییرات خودش را دارد انگار که ده ابجکت جدا در کانتینر ما وجود دارد
     * */


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("the flights details servlet has been called ...");
        out.println("the flights details  StateLess: " + flightServiceStateLess.getAirPlaneModel());
        out.println("the flights details StateFull: " + flightServiceStateFull.getAirPlaneModel());

       /* try {
            Context context = new InitialContext();
            Object o = context.lookup("java:global/FlightServiceStateLess!service.FlightServiceStateLess");
            flightServiceStateLess = (FlightServiceStateLess) o;
        } catch (NamingException e) {
            e.printStackTrace();
        }
        if (Objects.nonNull(flightServiceStateLess)) {
            flightServiceStateLess.getAirPlaneModel();
        }*/
    }
}
