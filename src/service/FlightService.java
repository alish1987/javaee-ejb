package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless(name = "FlightServiceEJB")
@LocalBean
public class FlightService {
    public FlightService() {
    }

    private Integer id = 111;
    private String from = "Los Angles";
    private String to = "London";
    private Integer price= 400;
    private Integer numOfSeats = 4;
    private String airPlaneModel = "Boeing 787";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(Integer numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public String getAirPlaneModel() {
        return airPlaneModel;
    }

    public void setAirPlaneModel(String airPlaneModel) {
        this.airPlaneModel = airPlaneModel;
    }
}
