
package package1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BatchStudent extends Student {
    
    
    
    //Overided Method to calculate and return the Coursework Grade
    public String calcCWGrade()
    {
        if (super.Cwmarks >= 90.0 )
        {
            super.CWgrade = "A+";
            return super.CWgrade;
	}
        else if(super.Cwmarks >= 75.0)
	{
            super.CWgrade = "A";
            return super.CWgrade;
	}
	else if(super.Cwmarks >= 60.0)
	{
            super.CWgrade = "B+";
            return super.CWgrade;
	}
	else if(super.Cwmarks >= 50.0)
	{
            super.CWgrade = "B";
            return super.CWgrade;
	}
	else if(super.Cwmarks >= 40.0)
	{
            super.CWgrade = "C+";
            return super.CWgrade;
	}
	else if(super.Cwmarks >= 35.0)
	{
            super.CWgrade = "C";
            return super.CWgrade;
	}
	else 
	{
            super.CWgrade = "E";
            return super.CWgrade;
	}
    }
    
    //Overided Method to calculate and return the Written exam Grade
    public String calcWEGrade()
    {
        if (super.WEmarks >= 90.0 )
	{
            super.WEgrade = "A+";
            return super.WEgrade;
	}
	else if(super.WEmarks >= 75.0)
	{
            super.WEgrade = "A";
            return super.WEgrade;
	}
	else if(super.WEmarks >= 60.0)
	{
            super.WEgrade = "B+";
            return super.WEgrade;
	}
	else if(super.WEmarks >= 50.0)
	{
            super.WEgrade = "B";
            return super.WEgrade;
	}
	else if(super.WEmarks >= 40.0)
	{
            super.WEgrade = "C+";
            return super.WEgrade;
	}
	else if(super.WEmarks >= 35.0)
	{
            super.WEgrade = "C";
            return super.WEgrade;
	}
	else 
	{
            super.WEgrade = "E";
            return super.WEgrade;
	}
    }
    
    //Overided Method to calculate and return the FinalGrade
    public String calcFinalgrade()
    {
	if ( super.totalMarks >= 85.0 )
	{
            super.finalgrade = "A+";
            return super.finalgrade;
            
	}
	else if(super.totalMarks >= 75.0)
	{
            super.finalgrade = "A";
            return super.finalgrade;
            
	}
	else if(super.totalMarks >= 60.0)
	{
            super.finalgrade = "B+";
            return super.finalgrade;
            
	}
	else if(super.totalMarks >= 55.0)
	{
            super.finalgrade = "B";
            return super.finalgrade;
            
	}
	else if(super.totalMarks >= 40.0)
	{
            super.finalgrade = "C+";
            return super.finalgrade;
            
	}
	else if(super.totalMarks >= 35.0)
	{
            super.finalgrade = "C";
            return super.finalgrade;
            
	}
	else 
	{
            super.finalgrade = "E";
            return super.finalgrade;
            
	}
    }
    
    //Overided Method to calculate and return the GPA
    //uses Rule switch(we dont need to use "break" statement )
    public double calcGPA()
    {
        switch (super.finalgrade) {
            case "A+" -> {
                super.GPA =  4.0;
                return super.GPA;
            }
                
            case "A" -> {
                super.GPA = 4.0;
                return super.GPA;
            }
                
            case "B+" -> {
                super.GPA = 3.7;
                return super.GPA;
            }
                
            case "B" -> {
                super.GPA = 3.3;
                return super.GPA;
            }
                
            case "C+" -> {
                super.GPA = 2.8;
                return super.GPA;
            }
               
            case "C" -> {
                super.GPA = 2.0;
                return super.GPA;
            }
                
            default -> {
                super.GPA = 0.0;
                return super.GPA;
            }
        }
       
    }
    
    //methods related to the dataabase
    //method to add student grade to database 
    public void setExamGradeDB() throws SQLException
    {
        PreparedStatement psAddGrade = lg1.conn.prepareStatement("insert into ExaminationManagement.StudentGrades values (?,?,?,?,?,?,?,?);");
        
        psAddGrade.setString(1,stdID);
        psAddGrade.setString(2,exmID);
        psAddGrade.setString(3,CWgrade);
        psAddGrade.setString(4,WEgrade);
        psAddGrade.setString(5,finalgrade);
        psAddGrade.setDouble(6,GPA);
        psAddGrade.setDouble(7, totalMarks);
        
        psAddGrade.setString(8,PassFail);
  
        int status = psAddGrade.executeUpdate();
    }
    
        //method to get the grades from the database
    public void getGradefromDB() throws SQLException
    {
        PreparedStatement psGetgrade = lg1.conn.prepareStatement("Select * from ExaminationManagement.StudentGrades where stdId = ? AND exmNo = ? ;");
        
        psGetgrade.setString(1,stdID);
        psGetgrade.setString(2,exmID);
        
        ResultSet rs = psGetgrade.executeQuery();
        
        if(rs.next())
        {
            CWgrade = rs.getString(3);
            WEgrade = rs.getString(4);
            finalgrade = rs.getString(5);
            GPA = rs.getDouble(6);
            totalMarks = rs.getDouble(7);
            PassFail = rs.getString(8);
        }
    }
    
    
    
}
