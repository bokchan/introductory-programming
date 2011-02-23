package ch4.horoscope;

import java.util.Date;

public class Sign {
	private String name;
	private Date dateFrom;
	private Date dateTo;
	private String horoscope = "This is a horoscope";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	
	public Sign(String name, Date dateFrom, Date dateTo) {
		super();
		this.name = name;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
	}

	public Sign() {
		// TODO Auto-generated constructor stub
	}

	public void setHoroscope(String horoscope) {
		this.horoscope = horoscope;
	}

	public String getHoroscope() {
		return horoscope;
	}
	
}
