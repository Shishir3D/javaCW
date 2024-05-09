/**
 * This class's object store the details about the teacher 
 * 
 * @author Shishir Poudel
 * @version 17th Jan, 2024
 */
public class Teacher
{
    // declaring instance variables
    private int teacherId;
    private int workingHours;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    
    /**
     * Constructor for objects of class Teacher
     * 
     * @param teacherId, workingHours, teacherName, address, workingType, employmentStatus
     */    
    public Teacher(int teacherId, String teacherName,String address,String workingType,String employmentStatus, int workingHours)
    {
        this.teacherName = teacherName;
        this.teacherId = teacherId;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }
    
    /**
     * Acessor methods that return their respective instance variable 
     * Returns the instance variable of an object belonging to the class Teacher.
     * 
     * @returns teacherId, workingHours, teacherName, workingType, employmentStatus
     */    
    public int getTeacherId()
    {
        return this.teacherId;
    }
    
    public int getWorkingHours()
    {
        return this.workingHours;
    }
    
    public String getTeacherName()
    {
        return this.teacherName;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public String getWorkingType()
    {
        return this.workingType;
    }
    
    public String getEmploymentStatus()
    {
        return this.employmentStatus;
    }
    
    /**
     * Mutator method that takes workingHours as parameter and assigns it to the corresponding instance variable
     * 
     *@param workingHours 
     */
    public void setWorkingHours(int workingHours)
    {
        this.workingHours = workingHours;
    }
    
    /**
     * Method that outputs the teacherId, teacherName, address, workingType, and employmentStatus
     * 
     * It checks if workingHours is assigned or not and displays suitable message
     */
    public void displayTeacherDetails()
    {
        System.out.println("Id of the teacher is : " + getTeacherId());
        System.out.println("Name of the teacher is : " + getTeacherName());
        System.out.println("Address of the teacher is : " + getAddress());
        System.out.println("Working type of teacher is : " + getWorkingType());
        System.out.println("Working type of teacher is : " + getEmploymentStatus());
        
        // control structures that checks whether workingHours is 0 or not and displays suitable message
        if (getWorkingHours() == 0) {
            System.out.println("Working Hours has not been assigned yet");
        }
        else {
            System.out.println("Number of hours the teacher worked is : " + getWorkingHours());    
        }
        
    }
    
}