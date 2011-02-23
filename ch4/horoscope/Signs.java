package ch4.horoscope;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;


public class Signs {
	private static Calendar c = Calendar.getInstance();
	private static final String HOROSCOPE_REST_API = "http://widgets.fabulously40.com/horoscope.xml";
	private static Sign sign;
	public static Sign getSign() {
		return sign;
	}

	public static void setSign(Sign sign) {
		Signs.sign = sign;
	}

	public static List<Sign> star_Signs = new ArrayList<Sign>();
	 
	public static void initStarSigns() {
		Sign sign ;
		sign = new Sign(
				"Aquarius", 
				new Date(c.YEAR, 1, 20),
				new Date(c.YEAR, 2, 18)
				);
		
		star_Signs.add(sign);
		
		sign = new Sign(
				"Pisces", 
				new Date(c.YEAR, 2, 19),
				new Date(c.YEAR, 3, 19)
				);
		
		star_Signs.add(sign);
		
		sign = new Sign(
				"Aries", 
				new Date(c.YEAR, 3, 20),
				new Date(c.YEAR, 4, 19)
				);
		
		star_Signs.add(sign);
		
		sign = new Sign(
				"Taurus", 
				new Date(c.YEAR, 4, 20),
				new Date(c.YEAR, 5, 19)
				);
		
		star_Signs.add(sign);

		sign = new Sign(
				"Gemini", 
				new Date(c.YEAR, 5, 21),
				new Date(c.YEAR, 6, 20)
				);
		
		star_Signs.add(sign);
		
		sign = new Sign(
				"Cancer", 
				new Date(c.YEAR, 6, 21),
				new Date(c.YEAR, 7, 21)
				);
		
		star_Signs.add(sign);
		
		sign = new Sign(
				"Leo", 
				new Date(c.YEAR, 7, 22),
				new Date(c.YEAR, 8, 22)
				);
		
		star_Signs.add(sign);
		
		sign = new Sign(
				"Virgo", 
				new Date(c.YEAR, 8, 23),
				new Date(c.YEAR, 9, 22)
				);
		
		star_Signs.add(sign);

		sign = new Sign(
				"Libra", 
				new Date(c.YEAR, 9, 23),
				new Date(c.YEAR, 10, 22)
				);
		
		star_Signs.add(sign);
		
		sign = new Sign(
				"Scorpio", 
				new Date(c.YEAR, 10, 23),
				new Date(c.YEAR, 11, 21)
				);
		
		star_Signs.add(sign);
		
		sign = new Sign(
				"Sagittarius", 
				new Date(c.YEAR, 11, 22),
				new Date(c.YEAR, 12, 20)
				);
		
		star_Signs.add(sign);
		
		sign = new Sign(
				"Capricorn", 
				new Date(c.YEAR, 12, 21),
				new Date(c.YEAR, 1, 19)
				);
		
		star_Signs.add(sign);
		
	}
	
	public static String getHoroscope(Date birthDay) {
		
		return getStarSign(birthDay).getHoroscope();  
	} 
	
	public static String getHoroscope(int month, int  day) {
		Date birthDay = new Date(c.YEAR, month, day);
		Sign s = getStarSign(birthDay);
		sign = s;
		return s.getName() + ": " + getWSHoroscope(s.getName().toLowerCase());   
	} 
	
	private static Sign getStarSign(Date birthDay) {
		
		for (Sign s : star_Signs) {
			if (birthDay.after(s.getDateFrom()) && 
					birthDay.before(s.getDateTo())) {
				return (Sign) s;				
			}
		}
		return null;
	}
	
	private static String getWSHoroscope(String sign) {
		try {
			URL apiEndPoint = new URL(HOROSCOPE_REST_API + "?sign=" + sign);
			
	        URLConnection connection = apiEndPoint.openConnection();
	        BufferedReader in = new BufferedReader(
	                                new InputStreamReader(
	                                connection.getInputStream()));
	
	        StringBuilder builder = new StringBuilder();
	        String inputLine;
	        while ((inputLine = in.readLine()) != null) {
	        	builder.append(inputLine);
	        	builder.append("\n");
	        }
	        in.close();
			
	        Document doc = DocumentHelper.parseText(builder.toString());
	        Node node = doc.node(0);
	        Element el = (Element) node;
	        return el.attributeValue("horoscope");	        
			
		} catch (MalformedURLException e) {
			throw new RuntimeException("Url of the API is not correct.");
		} catch (IOException e) {
			throw new RuntimeException("Cannot communicate with the server.");
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
		return "Horoscope not found";
	}
}

