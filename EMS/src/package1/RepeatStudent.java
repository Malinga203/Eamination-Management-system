
package package1;


import java.sql.*;


public class RepeatStudent extends Student {
    
    //Overided Method to calculate and return the Coursework Grade
    public String calcCWGrade()
    {
        if (super.Cwmarks >= 60)
        {
            CWgrade = "Pass";
            return super.CWgrade;
        }
        else 
        {
            CWgrade ="Fail";
            return super.CWgrade;
        }
    }
    
    //Overided Method to calculate and return the Written exam Grade
    public String calcWEGrade()
    {
        if (super.WEmarks >= 60)
        {
           super.WEgrade =  "Pass";
           return super.WEgrade;
        }
        else 
        {
            super.WEgrade = "Fail";
            return super.WEgrade;
        }
    }
    
    //Overided Method to calculate and return the FinalGrade
    public String calcFinalgrade()
    {
        if (super.WEmarks + super.Cwmarks/2 >= 70 )
        {
           super.finalgrade =  "Pass";
           return super.finalgrade;
        }
        
        else
        {
            super.finalgrade =  "Fail";
            return super.finalgrade;
        }
    }
    
    //Overided Method to calculate and return the GPA
    //uses Rule switch(we dont need to use "break" statement )
    public double calcGPA()
    {
        switch(super.finalgrade){
            case "Pass" -> {
                super.GPA = 3.3;
                return super.GPA;
            }
            case "Fail" -> {
                super.GPA = 0.0;
                return super.GPA;
            }
            default -> {
                super.GPA = 0.0;
                return super.GPA;
            }
        }
                
                    
    }
    
    //method to update repeat examination details overided 
     public void setExamGradeDB() throws SQLException
    {
        PreparedStatement psAddGrade = lg1.conn.prepareStatement("update ExaminationManagement.StudentGrades set CWgrade = ?,WEgrade = ?,finalgrade =?,GPA = ?, totalmarks = ?,pass_or_fail = ? where stdID = ? AND exmNO = ?);");
        
        psAddGrade.setString(7,stdID);
        psAddGrade.setString(8,exmID);
        psAddGrade.setString(1,CWgrade);
        psAddGrade.setString(2,WEgrade);
        psAddGrade.setString(3,finalgrade);
        psAddGrade.setDouble(4,GPA);
        psAddGrade.setDouble(5, totalMarks);
        psAddGrade.setString(6,finalgrade);
      
        
    }
     
    //method to set the Reattempt Marks to the database
     //used by the student to apply for Reattempt
    public void stdsetReattemptDetailstoDB() throws SQLException
    {
        PreparedStatement psreattempt = lg1.conn.prepareStatement("insert into examinationManagement.ReattemptMarks (stdID,exmNo) values (?,?)");
        
        psreattempt.setString(1, super.stdID);
        psreattempt.setString(2,super.exmID);
        
        int status = psreattempt.executeUpdate();
    }
    
    //method to set the Reattempt details to the database
    //used by the admin to update the details inserted by the student and insert marks
     public void AdminsetReattemptDetailstoDB() throws SQLException
     {
         PreparedStatement ps = lg1.conn.prepareStatement("Update examinationManagement.ReattemptMarks set  vivaMarks = ? ,  RepMarks= ? , WEMarks = ?  where stdID = ? AND exmNo = ? ");
         
         ps.setString(4, super.stdID);
         ps.setString(5, super.exmID);
         
         ps.setDouble(1,super.vivamarks);
         ps.setDouble(2,super.repmarks);
         ps.setDouble(3,super.WEmarks);
         
         int status = ps.executeUpdate();
         
     }
     
     //getting the reattempt details from the database
     public void getReattemntDetfromDB() throws SQLException
     {
         PreparedStatement ps = lg1.conn.prepareStatement("select * from ExaminationManagement.ReattemptMarks where stdID = ? AND exmNo = ?;");
         
         ps.setString(1,stdID);
         ps.setString(2, exmID);
         
         ResultSet rs = ps.executeQuery();
         
         if(rs.next())
         {
             
             super.vivamarks = rs.getInt(3);
             super.repmarks = rs.getInt(4);
             super.WEmarks = rs.getInt(5);
             
         }
     }
}
