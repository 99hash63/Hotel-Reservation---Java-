package Hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HotelDBUtil {

	private static boolean trueFalse;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static boolean addHotel(String name, String address, String contact, String director, String owner, String rating, String noOfHalls) {
    	
    	try {
    		con = ConnectDB.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into hotel values ('"+name+"','"+address+"','"+contact+"','"+director+"','"+owner+"','"+rating+"','"+noOfHalls+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			trueFalse = true;
    		} else {
    			trueFalse = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return trueFalse;
    }


public static List<Hotel> getHotel(String search) {
	
	ArrayList<Hotel> hotel = new ArrayList<>();

	try {
		con = ConnectDB.getConnection();
		stmt = con.createStatement();
		String sql = "select * from hotel where name='"+search+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
	
			String name = rs.getString(1);
			String address = rs.getString(2);
			String contact = rs.getString(3);
			String director = rs.getString(4);
			String owner = rs.getString(5);
			String rating = rs.getString(6);
			String noOfHalls = rs.getString(6);
			
			Hotel h = new Hotel(name, address, contact, director, owner, rating, noOfHalls);
			hotel.add(h);
			
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return hotel;	
}



public static boolean updatetHotel(String name, String address, String contact, String director, String owner, String rating, String noOfHalls) {
	
	try {
		
		System.out.println(name);
		con = ConnectDB.getConnection();
		stmt = con.createStatement();
		String sql = "update hotel set address='"+address+"',contact='"+contact+"',director='"+director+"',owner='"+owner+"',rating='"+rating+"',num_of_halls='"+noOfHalls+"' where name='"+name+"'";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			trueFalse = true;
		}
		else {
			trueFalse = false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return trueFalse;
}




public static boolean deleteHotel(String name) {
	
	try {
		
		con = ConnectDB.getConnection();
		stmt = con.createStatement();
		String sql = "delete from hotel where name='"+name+"'";
		int r = stmt.executeUpdate(sql);
		
		if (r > 0) {
			trueFalse = true;
		}
		else {
			trueFalse = false;
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return trueFalse;
}



public static boolean addPackage(String hName, String pName, String bPrice, String noOfMeals,String pCharges, String gCharges, String liq, String timeDu) {
	
	try {
		con = ConnectDB.getConnection();
		stmt = con.createStatement();
	    String sql = "insert into hotel_packages values (0,'"+pName+"','"+bPrice+"','"+noOfMeals+"','"+pCharges+"','"+gCharges+"','"+liq+"','"+timeDu+"','"+hName+"')";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			trueFalse = true;
			System.out.println("true");
		} else {
			trueFalse = false;
			System.out.println("false");
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return trueFalse;
}


public static List<Packages> getPackage(String search) {
	
	ArrayList<Packages> pack = new ArrayList<>();

	try {
		con = ConnectDB.getConnection();
		stmt = con.createStatement();
		String sql = "select * from hotel_packages where hotel_name='"+search+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			
			 int packId = rs.getInt(1);
			 String packageName = rs.getString(2);
			 float buffetPrice = rs.getFloat(3);
			 int numberOfMeals = rs.getInt(4); 
			 float poolCharges = rs.getFloat(5); 
			 float gymCharges = rs.getFloat(6);
			 float liquor = rs.getFloat(7); 
			 String timeDuration = rs.getString(8);
			 String hotelName = rs.getString(9);
			
			 Packages p = new Packages(packId, packageName, buffetPrice, numberOfMeals, poolCharges, gymCharges, liquor, timeDuration, hotelName);
			pack.add(p);
			
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return pack;	
}



public static boolean updatePackage(String packId, String packageName, String buffetPrice, String numberOfMeals, String poolCharges,String gymCharges, String liquor, String timeDuration){
	
	try {
		
		con = ConnectDB.getConnection();
		stmt = con.createStatement();
		String sql = "update hotel_reservation.hotel_packages set name='"+packageName+"',buffet_price='"+buffetPrice+"',no_of_meals='"+numberOfMeals+"',pool_charges='"+poolCharges+"',gym='"+gymCharges+"',liquor='"+liquor+"',pack_time='"+timeDuration+"' where pack_id='"+packId+"'";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			trueFalse = true;
		}
		else {
			trueFalse = false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return trueFalse;
}

public static boolean deletePackage(int packId) {
	
	try {
		
		con = ConnectDB.getConnection();
		stmt = con.createStatement();
		String sql = "delete from hotel_packages where pack_id='"+packId+"'";
		int r = stmt.executeUpdate(sql);
		
		if (r > 0) {
			trueFalse = true;
		}
		else {
			trueFalse = false;
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return trueFalse;
}



public static List<Packages> getPackByID(int search) {
	
	ArrayList<Packages> pack = new ArrayList<>();

	try {
		con = ConnectDB.getConnection();
		stmt = con.createStatement();
		String sql = "select * from hotel_packages where pack_id='"+search+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			
			 int packId = rs.getInt(1);
			 String packageName = rs.getString(2);
			 float buffetPrice = rs.getFloat(3);
			 int numberOfMeals = rs.getInt(4); 
			 float poolCharges = rs.getFloat(5); 
			 float gymCharges = rs.getFloat(6);
			 float liquor = rs.getFloat(7); 
			 String timeDuration = rs.getString(8);
			 String hotelName = rs.getString(9);
			
			 Packages p = new Packages(packId, packageName, buffetPrice, numberOfMeals, poolCharges, gymCharges, liquor, timeDuration, hotelName);
			pack.add(p);
			
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return pack;	
}

}