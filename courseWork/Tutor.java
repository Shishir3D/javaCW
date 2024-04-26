public class Tutor extends Teacher
{
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    
    public Tutor (int teacherId, String teacherName, String address, String workingType, String employmentStatus, int workingHours, double salary, String specialization, String academicQualifications, int performanceIndex) 
    {
        //this constructor takes in 10 parameters
        super(teacherId, teacherName, address, workingType, employmentStatus, workingHours);
        super.setWorkingHours(workingHours);
        
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;        
    }
    
    public double getSalary()
    {
        return this.salary;
    }
    
    public String getSpecialization()
    {
        return this.specialization;
    }
    
    public String getAcademicQualifications()
    {
        return this.academicQualifications;
    }
    
    public int getPerformanceIndex()
    {
        return this.performanceIndex;
    }
    
    public boolean getIsCertified()
    {
        return this.isCertified;
    }
    
    public void setSalaryAccordingToPerformance(double newSalary, int newPerformanceIndex)
    {
        if (this.isCertified == false) {
            double appraisalPercent = 0;        
            
            if (newPerformanceIndex >= 5 && super.getWorkingHours() > 20) {
                
                if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7) {
                    appraisalPercent = 5.0/100.0;
                }
                else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9) {
                    appraisalPercent = 10.0/100.0;            
                }
                else if (newPerformanceIndex == 10) {
                    appraisalPercent = 20.0/100.0;
                }
                this.salary = newSalary + (appraisalPercent * newSalary);
                this.isCertified = true;
            }
            else {
                System.out.println("The tutor has not been certified yet and the salary cannot be approved");
                
            }        
        }
        
    }
    
    public void removeTutor()
    {
     if (this.isCertified == false) {
        this.salary = 0;
        this.specialization = "";
        this.academicQualifications = "";
        this.performanceIndex = 0;
        this.isCertified = false;
     }
    }
    
    public void displayTeacherDetails()
    {

        if (isCertified == false) {
            super.displayTeacherDetails();            
        }
        else {
            System.out.println("The salary of tutor is : " + getSalary());
            System.out.println("The field where turor specializes is : " + getSpecialization());
            System.out.println("The academic qualification of tutor is : " + getAcademicQualifications());
            System.out.println("The performance index of tutor is : " + getPerformanceIndex());
            System.out.println("The tutor is certified ");
            super.displayTeacherDetails();            
        }
        
    }
}