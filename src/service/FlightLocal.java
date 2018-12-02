package service;

import javax.ejb.Local;
/**
 * in  yaeni ke faghat dar in majule mitavanad estefade shavad (local) va majulaye dg nmitavanand az on estefade konand .
 */
@Local
public interface FlightLocal {
     Integer getId();

     void setId(Integer id);

     String getFrom();

     void setFrom(String from);

     String getTo();

     void setTo(String to);

     Integer getPrice();

     void setPrice(Integer price);

     Integer getNumOfSeats();

     void setNumOfSeats(Integer numOfSeats);

     String getAirPlaneModel();

     void setAirPlaneModel(String airPlaneModel);
}
