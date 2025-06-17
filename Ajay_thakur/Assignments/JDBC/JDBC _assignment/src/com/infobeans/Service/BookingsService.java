package com.infobeans.Service;

import com.infobeans.dao.BookingsDao;
import com.infobeans.model.Bookings;

import java.sql.SQLException;
import java.util.List;

public class BookingsService {

    private BookingsDao bookingsDao;

    public BookingsService(){

        this.bookingsDao = new BookingsDao();
    }

    public void addBookings(Bookings booking) throws SQLException{

        bookingsDao.insertBooking(booking);
    }

    public List<Bookings> fetchAllBookings() throws SQLException{

        return bookingsDao.getAllBookings();
    }

    public Bookings fetchBookingById(int id) throws  SQLException{

        return  bookingsDao.getBookingById(id);
    }

    public boolean changeCheckOut(int id, String date) throws SQLException{

        return bookingsDao.updateCheckOutById(id,date);
    }
}
