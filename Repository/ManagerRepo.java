package Repository;

import java.lang.*;
import java.util.ArrayList;
import Entity.*;
import Interface.*;

public class ManagerRepo implements ImanagerRepo
{
	DatabaseConnection dbc;
	
	public ManagerRepo()
	{
		dbc = new DatabaseConnection();
	}
	
	public void insertInDB(Manager m)
	{
		String query = "INSERT INTO manager VALUES ('"+m.getMID()+"','"+m.getMName()+"','"+m.getMdesignation()+"',"+m.getMSalary()+");";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public void deleteFromDB(String mid)
	{
		String query = "DELETE from employees WHERE empId='"+mid+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	
	public void updateInDB(Manager m)
	{
		String query = "UPDATE employees SET mname='"+m.getMName()+"', designation = '"+m.getMdesignation()+"', salary = "+m.getMSalary()+" WHERE empId='"+m.getMID()+"'";
		
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public Manager searchManager(String mid)
	{
		Manager m = null;
		String query = "SELECT `mname`, `designation`, `msalary` FROM `employees` WHERE `empId`='"+mid+"';";     
		try
		{
		
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		
			while(dbc.result.next())
			{
				
				String mname = dbc.result.getString("managerName");
				String designation = dbc.result.getString("designation");
				double msalary = dbc.result.getDouble("salary");
				
				m = new Manager();
				m.setMID(mid);
				m.setMName(mname);
				m.setMdesignation(designation);
				m.setMSalary(msalary);
			}
			
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		return m;
	}
	public String[][] getAllManager()
	{
		ArrayList<Manager> ar = new ArrayList<Manager>();
		String query = "SELECT * FROM manager;";  
		
		try
		{
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
			
		
			while(dbc.result.next())
			{
				String mid = dbc.result.getString("mid");
				String mname = dbc.result.getString("managerName");
				String designation = dbc.result.getString("designation");
				double msalary = dbc.result.getDouble("salary");
				
				Manager m = new Manager(mid,mname,designation,msalary);
				ar.add(m);
			}
		}
		catch(Exception e){System.out.println(e.getMessage());}
		dbc.closeConnection();
		
		
		Object obj[] = ar.toArray();
		String data[][] = new String [ar.size()][4];
		
		for(int i=0; i<obj.length; i++)
		{
			data[i][0] = ((Manager)obj[i]).getMID();
			data[i][1] = ((Manager)obj[i]).getMName();
			data[i][2] = ((Manager)obj[i]).getMdesignation();
			data[i][3] = (((Manager)obj[i]).getMSalary())+"";
		}
		return data;
	}
}












































