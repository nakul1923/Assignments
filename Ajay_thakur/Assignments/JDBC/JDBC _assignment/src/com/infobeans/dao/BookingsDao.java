package com.infobeans.dao;

import com.infobeans.model.Bookings;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookingsDao {


    private String url = "jdbc:mysql://127.0.0.1:3306/beans";
    private String user = "root";
    private String password = "root";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    public void insertBooking(Bookings booking) throws SQLException{

        String sql = "INSERT INTO bookings VALUES(?,?,?,?,?,?)";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1,booking.getBookingId());
        pstm.setString(2,booking.getGuestName());
        pstm.setInt(3,booking.getRoomNumber());
        pstm.setString(4, booking.getCheckInDate());
        pstm.setString(5,booking.getCheckOutDate());
        pstm.setDouble(6,booking.getTotalAmount());
        pstm.executeUpdate();

    }

    public List<Bookings> getAllBookings() throws SQLException{

        List<Bookings> bookings = new ArrayList<Bookings>();

        String sql = "SELECT * FROM bookings";

        Connection con = getConnection();

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){

            Bookings booking = new Bookings(rs.getInt("booking_id"),rs.getString("guest_name"),rs.getInt("room_number"),rs.getString("check_in_date"),rs.getString("check_out_date"),rs.getDouble("total_amount") );

            bookings.add(booking);
        }

        return  bookings;
    }

    public Bookings getBookingById(int id) throws SQLException{

        String sql = "select * from bookings where booking_id = ?";

        Connection con = getConnection();
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setInt(1,id);

        ResultSet rs = pstm.executeQuery();

        if(rs.next()){

            Bookings booking = new Bookings(rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getDouble(6));

            return booking;

        } else{


            return null;
        }

    }

    public boolean updateCheckOutById(int id,String date) throws  SQLException{

        String sql = "update bookings set check_out_date = ? where booking_id = ?";

        Connection con = getConnection();

        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1,date);
        pstm.setInt(2,id);

        int rowsUpdated = pstm.executeUpdate();

        if(rowsUpdated>0){

            return true;
        }else{

            return  false;
        }

    }

}
