
package package1;
 import java.sql.*;

public class Coursework extends Examination {
    //creating a Login page Object to get the static Connection conn
    frmlogin lg1 = new frmlogin();
    //Attributes of Courework class
    private String vivaDate;
    private String subDate;

                
        //Seters
    //method to set the Coursework Date
	public void setDateCW (String vDate , String sDate)
	{
		this.vivaDate = vDate;
		this.subDate = sDate;
	}
        //method to set the Submission Date
        public String getSubDate()
        {
            return this.subDate;
        }
        
        //method to get the vivadate
        public String getVivaDate()
        {
            return this.vivaDate;
        }
	
        //method to change the vivadate
	public void changeDateviva(String newvDate)
	{
		this.vivaDate = newvDate;
	}
	
        //method to change the submission date
	public void changeDatesub(String newsubDate)
	{
		this.subDate = newsubDate;
	}
        
        //database related methods
        //method to add the Coursework details to the Database
        public void addToDBCW() throws SQLException
        {
            PreparedStatement ps = frmlogin.conn.prepareStatement("update `ExaminationManagement`.`examination` set vivaDate = (?), subDate = (?) where exmNo = (?) " );
            
            ps.setString(1,this.vivaDate);
            ps.setString(2,this.subDate);
            ps.setString(3,super.exNo);
            
           int status =  ps.executeUpdate();
            
        }
        
        //method to get the Coursework details from the database
         public void getFromDBCW()throws SQLException
        {
            PreparedStatement psget = lg1.conn.prepareStatement("Select * from ExaminationManagement.Examination where exmNo = ?");
            
            psget.setString(1,super.exNo);
             
            ResultSet rs = psget.executeQuery();
            
            if (rs.next())
            {
            super.name = rs.getString(2);
            this.vivaDate = rs.getString(3);
            this.subDate = rs.getString(4);
           
            }
        }
         
         
        //method to update the submission date in the database     
        public void updatesubDBCW() throws SQLException
        {
            PreparedStatement psup = lg1.conn.prepareStatement("update EXaminationManagement.Examination set SubDate = ? where exmNo = ? ");
            
            psup.setString(1,this.subDate );
            psup.setString(2, super.exNo);
             int status = psup.executeUpdate();
        }
        
        //method to update the Viva date in the database
         public void updatevivaDBCW() throws SQLException
        {
            PreparedStatement psup = lg1.conn.prepareStatement("update EXaminationManagement.Examination set vivaDate = ? where exmNo = ? ");
            
            psup.setString(1,this.vivaDate );
            psup.setString(2, super.exNo);
             int status = psup.executeUpdate();
        }
}
