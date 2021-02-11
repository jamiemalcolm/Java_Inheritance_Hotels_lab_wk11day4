package Hotels;

import People.Guest;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms){
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void addGuest(Guest guest){
        Bedroom roomAddto = this.bedrooms.get(0);
        roomAddto.addGuest(guest);
    }

    public void removeGuest(Guest guest) {
        Bedroom roomToExit = this.bedrooms.get(0);
        roomToExit.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int noOfNights) {
        Booking booking = new Booking(noOfNights, bedroom);
        return booking;
    }
}