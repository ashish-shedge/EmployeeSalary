package at.allianz.employee;

public class Salary {
	
	private double basic;
	
	private double hra;
	
	private double ta;
	
	private boolean IsOptedForNPS;

	public Salary(double basic, double hra, double ta, boolean isOptedForNPS) {
		super();
		this.basic = basic;
		this.hra = hra;
		this.ta = ta;
		IsOptedForNPS = isOptedForNPS;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

	public boolean isIsOptedForNPS() {
		return IsOptedForNPS;
	}

	public void setIsOptedForNPS(boolean isOptedForNPS) {
		IsOptedForNPS = isOptedForNPS;
	}

	

}
