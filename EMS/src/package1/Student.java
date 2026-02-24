
package package1;
import java.sql.*;

//Abstract class Student to create two types of students Repeaters and BatchStudent of a particular Exam
public abstract class Student {
    //object from login frame to get the Connection
     frmlogin lg1 = new frmlogin();
     
    //attributes belonging to the class
    protected String name;
    protected int age;
    protected String stdID;
    protected String finalgrade;
    protected String WEgrade;
    protected String CWgrade;
    protected double GPA;
    protected String PassFail;
    protected double vivamarks ;
    protected double repmarks ;
    protected double WEmarks ;
    protected double Cwmarks ;
    protected double totalMarks ;
    
    //variable used to capture the returned exam ID value from Examination class methods
    protected String exmID ;
 
 
    
    //object of Written exam and Coursework class to access the methods
    WrittenExam ex1 = new WrittenExam();
  
    
   //setters
    //method to set Pass or fail
    public void setpassfail(String result)
    {
        this.PassFail = result;
    }
 
   
    //method to set the exam ID for the WrittenExam Object
    public void setexamID(String id)
    {
      ex1.setExamDetails(id);
      this.exmID = ex1.getexmID();
    }
    
    //method to set the values of vivaExam and Report and assign them to the corresponding attributes
    public void setCWMarks(double vMarks, double rMarks)
    {
        
        this.vivamarks = vMarks;
        this.repmarks = rMarks;       
        Cwmarks = vivamarks + repmarks;
    }
    
      //method to set the value of Written Exam Marks and assign them to the correponding attributes
    public void setWEMarks(double weMarks)
    {
        this.WEmarks = weMarks;      
    }
    
       //method to set the student details
    public void setStdDetails(String name,int age,String ID)
    {
        this.name = name;
        this.age = age;
        this.stdID = ID;
    }
    
       //Overloaded method to set only the student ID
    public void setStdDetails(String ID)
    {
        this.stdID = ID;
    }
    
        //setters to set the grade
    //setter to set the Written Exam Grade
    public void setWEGrade(String a)
    {
        this.WEgrade = a;
    }
    
    //setter to set the Coursework Grade
    public void setCWGrade(String b)
    {
        this.CWgrade = b;
    }
    
    //setter to set the GPA
    public void setGPA(double c)
    {
        this.GPA = c;
    }
    
    
    //Getters
    //method to get Coursework Grade
    public String getCWGrade()
    {
        return this.CWgrade;
    }
    
     //method to get Written EXam Grade
    public String getWEGrade()
    {
        return this.WEgrade;
    }
    
     //method to get Final Grade
    public String getFinalGrade()
    {
        return this.finalgrade;
    }
    
    // //method to get Total Marks
    public double getTotalMarks()
    {
        return this.totalMarks;
    }
    
    //method to get the GPA
    public double getGPA()
    {
        return this.GPA;
    }
    
    //method to get whether pass or fail
    public String getPassFail()
    {
        return this.PassFail;
    }
    
    //method to get vivaMarks
    public double getCWmarks()
    {
        return this.Cwmarks;
    }
    
 
    //method to get Written Exam MArks
      public double getWEmarks()
    {
        return this.vivamarks;
    }
    
  
    //Methods For Calculations
    //abstract method to calculate the Corsework Grade (Overrided in the BatchStudent and RepeatStudent class)
    public abstract String calcCWGrade();
    
    //abstract method to calculate the WrittenExam Grade (Overrided in the BatchStudent and RepeatStudent class)
    public abstract String calcWEGrade();
    
    //abstract method to calculate the FinalGrade (Overrided in the BatchStudent and RepeatStudent class)
    public abstract String calcFinalgrade();
    
    //abstract method to calculate the GPA (Overrided in the BatchStudent and RepeatStudent class)
    public abstract double calcGPA();
    
    //Method to calculate the total Coursework Marks
        public void calCWmarks()
    {
        Cwmarks = (vivamarks + repmarks)/2.0;
        
    }
    
        //Method to calculate the Total Marks
    public double calcTotalmarks()
    {
        totalMarks = (Cwmarks + WEmarks)/2.0;
        return totalMarks;
    }
    
    //Method to calculate Pass or Fail
        public String calcPassFail()
    {
        if (GPA >= 3.3)
        {
            this.PassFail = "Pass";
        }
        else
        {
            this.PassFail = "Fail";
        }
        
        return this.PassFail;    
    }
    

    //Methods Related with the Database
        
    //method to add the Student details to the database 
   public void addstdtoDB() throws SQLException
   {
      PreparedStatement psadd = lg1.conn.prepareStatement("insert into ExaminationManagement.Student values (?,?,?);");
      
      psadd.setString(1,this.stdID);
      psadd.setString(2,this.name);
      psadd.setInt(3,this.age);
      
      int status = psadd.executeUpdate();
     
   }

    //method to add the Marks of the student to the Database 
    public void addMarksDB() throws SQLException
    {
        PreparedStatement psaddmks = lg1.conn.prepareStatement("insert into ExaminationManagement.ExamMarks values (?,?,?,?,?);");
        
        psaddmks.setString(1,stdID);
        psaddmks.setString(2,exmID);
        psaddmks.setDouble(3,vivamarks);
        psaddmks.setDouble(4,repmarks);
        psaddmks.setDouble(5,WEmarks);
        
        int status = psaddmks.executeUpdate();
    }
    

    
    //method to get the marks from the database
    public void getMarksfromDB()throws SQLException
    {
        PreparedStatement psGetMark = lg1.conn.prepareStatement("Select * from ExaminationManagement.ExamMarks where stdId = ? AND exmNo = ? ;");
        
        psGetMark.setString (1,stdID);
        psGetMark.setString(2, exmID);
        
        ResultSet rs = psGetMark.executeQuery();
        
        if (rs.next())
        {
            this.vivamarks = rs.getDouble(3);
            this.repmarks = rs.getDouble(4);
            this.WEmarks = rs.getDouble(5);
        }
    }
    


    
    //Method to Update pass or Fail in the database 
    public void setPassFailfromDB() throws SQLException
    {
        PreparedStatement psSetPF = lg1.conn.prepareStatement("update ExaminationManagement.studentGrades set Pass_or_Fail = ? where stdID = ? AND exmNo = ?;");
        
        psSetPF.setString(1, PassFail);
        psSetPF.setString(2, stdID);
        psSetPF.setString(3, exmID);
        
        int status = psSetPF.executeUpdate();

    }
    
    //method to get the pass or Fail from the database
    public void getPassFailfromDB()throws SQLException
    {
        PreparedStatement psgetPF = lg1.conn.prepareStatement("Select * from ExaminationManagement.StudentGrades where stdID = ?");
        
        psgetPF.setString(1,stdID);
        
        ResultSet rs = psgetPF.executeQuery();
        
        if(rs.next())
        {
            this.PassFail = rs.getString(8);
        }
    }
 
}
