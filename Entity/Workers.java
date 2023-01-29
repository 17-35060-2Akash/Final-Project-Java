package Entity;

import java.lang.*;


public class Workers 
{
	private String workerId;
	private String wname;
	private String wdesignation;
	private double wsalary;
	private double serviceDuration;
	
	

	
	public Workers()
	{
		System.out.println("Empty W");
	}
	public Workers(String workerId,String wname,String wdesignation,double wsalary, double serviceDuration)
	{
		this.workerId = workerId;
		this.wname = wname;
		this.wdesignation = wdesignation;
		this.wsalary = wsalary;
		this.serviceDuration = serviceDuration;
	}
	
	
	public void setWorkerId(String workerId)
	{
		this.workerId = workerId;
	}
	
	
	
	public void setServiceDuration(double serviceDuration)
	{
		this.serviceDuration = serviceDuration;
	}
	public void setWName(String wname)
	{
		this.wname = wname;
	}
	public void setWdesignation(String wdesignation){this.wdesignation = wdesignation;}
	public void setWSalary(double wsalary)
	{
	this.wsalary = wsalary;	
	}
	
	
	public String getWorkerId(){return workerId;}
	public String getWName(){return wname;}
	public String getWdesignation(){return wdesignation;}
	public double getWSalary(){return wsalary;}

	public double getServiceDuration(){return serviceDuration;}


}