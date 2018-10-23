package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless(name = "FlightServiceEJB")
@LocalBean
public class FlightServiceBean {
    public FlightServiceBean() {
    }

    private String name = "aaaaaaaaaa";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
