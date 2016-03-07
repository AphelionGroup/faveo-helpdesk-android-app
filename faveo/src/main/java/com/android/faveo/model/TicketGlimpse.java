package com.android.faveo.model;

/**
 * Created by Sumit
 */
public class TicketGlimpse {

    public int ticketID;
    public String ticketNumber;
    public String ticketSubject;
    public boolean isTicketOpen;

    public TicketGlimpse(int ticketID, String ticketSubject, boolean isTicketOpen) {
        this.ticketID = ticketID;
        this.ticketSubject = ticketSubject;
        this.isTicketOpen = isTicketOpen;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getTicketSubject() {
        return ticketSubject;
    }

    public void setTicketSubject(String ticketSubject) {
        this.ticketSubject = ticketSubject;
    }

    public boolean isTicketOpen() {
        return isTicketOpen;
    }

    public void setIsTicketOpen(boolean isTicketOpen) {
        this.isTicketOpen = isTicketOpen;
    }

}
