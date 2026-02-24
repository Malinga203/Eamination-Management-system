
package package1;
import java.sql.*;
public class WrittenExam extends Examination {
        
    //login page object to get the static connection from the login page
        frmlogin lg1 = new frmlogin();
        
        //attributes
	private String date;

        //method to get the Written exam date
	public String getWEDate()
        {
            return this.date;
        }
	
        //method to set the Written Exam date
	public void setDateWE (String exDate)
	{
		this.date = exDate;
	}
	
	//method to change the written exam date
	public void changeDate(String newDate)
	{
		this.date = newDate;
	}
        
        //database related methods
        //method to add the Examination details to the database
        public void addToDBWE() throws SQLException
        {
            PreparedStatement ps = lg1.conn.prepareStatement("insert into `ExaminationManagement`.`Examination`(exmNo,exmName,WEDate) values (?,?,?);");
            
            ps.setString(1,super.exNo);
            ps.setString(2,super.name);
            ps.setString(3,this.date);
            
            int status = ps.executeUpdate();

        }
        
        //method to get the data from the database
        public void getFromDBWE()throws SQLException
        {
            PreparedStatement psget = lg1.conn.prepareStatement("Select * from ExaminationManagement.Examination where exmNo = ?");
            
            psget.setString(1,super.exNo);
             
            ResultSet rs = psget.executeQuery();
            
            if (rs.next())
            {
            super.name = rs.getString(2);
            this.date = rs.getString(5);
           
            }
        }
        
        //method to update the Written exam Date in the database
        public void updateDBWE() throws SQLException
        {
            PreparedStatement psup = lg1.conn.prepareStatement("update EXaminationManagement.Examination set WEDate = ? where exmNo = ? ");
            
            psup.setString(1,this.date );
            psup.setString(2, super.exNo);
             int status = psup.executeUpdate();
        }
    
}
