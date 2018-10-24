package conrollers;

import service.FlightService;

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
     * inject FlightService (make instance from FlightService class)
     * az ejb container darkhast mikonad ke yek instance az in FlightService bema bedahad .
     */
    @EJB
    FlightService flightService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("the flights details servlet has been called ...");
        out.println(flightService.getAirPlaneModel());
        out.println(flightService.getFrom());
    }
}
