
package package1;


public abstract class Examination {
    //attributes
   	protected String name;
        protected String exNo;
        protected static String exID ;
        
        
        
        
        
        
        //setter
        //setter to set the exam details
	public void setExamDetails(String exName,String no)
	{
		this.name = exName;
                this.exNo = no;
	}
        
        //overloaded method to set only the Exam no
        public void setExamDetails(String no)
        {
            this.exNo = no;
            this.exID = no;
        }
        
        //getters
        //method to get the examID
        public String getexmID()
        {
         return this.exNo;
        }
        
        //method to get the exam name
        public String getName()
        {
            return this.name;
        }
        
        //method to get the exam marks
        public int getmarks()
        {
            return 0;
        }
    
}
