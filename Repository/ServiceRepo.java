package Repository;

import java.lang.*;
import java.util.ArrayList;
import Entity.*;
import Interface.*;

public class ServiceRepo implements IServiceRepo
{
	DatabaseConnection dbc;
	
	public ServiceRepo()
	{
		dbc = new DatabaseConnection();
	}
	
	public void insertInDB(Service se)
	{
		String query = "INSERT INTO service VALUES ('"+se.getServiceId()+"','"+se.getsname()+"',"+se.getServiceDuration()+");";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public void deleteFromDB(String serviceId)
	{
		String query = "DELETE from service WHERE serviceId='"+serviceId+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	public void updateInDB(Service se)
	{
		String query = "UPDATE service SET serviceName='"+se.getsname()+"', serviceDuration = "+se.getServiceDuration()+" WHERE serviceId='"+se.getServiceId()+"'";
		
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public Service searchService(String serviceId)
	{
		Service se = null;
		String query = "SELECT `serviceName`, `serviceduration` FROM `service` WHERE `serviceId`='"+serviceId+"';";     
		try
		{
		
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		
			while(dbc.result.next())
			{
				
				String sname = dbc.result.getString("ServiceName");
				double sprice = dbc.result.getDouble("Price");
				double serviceDuration = dbc.result.getDouble("Duration");
				
		
				
				
				se = new Service();
			    se.setServiceId(serviceId);
				se.setName(sname);
				se.setPrice(sprice);
				se.setServiceDuration(serviceDuration);
			}
			
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		return se;
	}
	public String[][] getAllService()
	{
		ArrayList<Service> ar = new ArrayList<Service>();
		String query = "SELECT * FROM service;";  
		
		try
		{
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
			
		
			while(dbc.result.next())
			{
				String serviceId = dbc.result.getString("serviceid");
				String sname = dbc.result.getString("serviceName");
				double sprice = dbc.result.getDouble("price");
				double serviceDuration = dbc.result.getDouble("serviceDuration");
				
				Service se = new Service(serviceId,sname,sprice,serviceDuration);
				ar.add(se);
			}
		}
		catch(Exception e){System.out.println(e.getMessage());}
		dbc.closeConnection();
		
		
		Object obj[] = ar.toArray();
		String data[][] = new String [ar.size()][3];
		
		for(int i=0; i<obj.length; i++)
		{
			data[i][0] = ((Service)obj[i]).getServiceId();
			data[i][1] = ((Service)obj[i]).getsname();
			data[i][2] = (((Service)obj[i]).getServiceDuration())+"";
		}
		return data;
	}
}












































