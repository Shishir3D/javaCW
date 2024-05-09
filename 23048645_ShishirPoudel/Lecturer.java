public class Lecturer extends Teacher
{
    // Instance variables for Lecturer
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    
    // Constructor for Lecturer
    public Lecturer(int teacherId, String teacherName, String address, String workingType, String employmentStatus, String department, int yearsOfExperience, int workingHours) 
    {        
        super(teacherId, teacherName, address, workingType, employmentStatus, workingHours);
        super.setWorkingHours(workingHours); 
        
        // Initializing instance variables
        this.gradedScore = 0;
        this.yearsOfExperience = yearsOfExperience;
        this.hasGraded = false;     
        this.department = department;
    }
    
    // Getter methods
    public String getDepartment() {
        return this.department;
    }
    
    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }
    
    public int getGradedScore() {
        return this.gradedScore;
    }
    
    public boolean getHasGraded() { 
        return this.hasGraded;
    }
    
    // Setter methods
    public void setGradedScore(int gradedScore) {
        this.gradedScore = gradedScore;
    }
    
    //this function is not required by the question. I am writing this to make it eaier to change value of "hasGraded" 
    public void setHasGraded(boolean hasGraded) {
        this.hasGraded = hasGraded;
    }
    
    /**
     * Grades the assignment of students who have submitted their assignments on time
     */
    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience) 
    {
        String result = "";

        if (yearsOfExperience >= 5 && department.equals(this.department)) {
            
            //not asked in the question but I am setting the gradedScore so that I can output it in the 'displayTeacherDetails' method
            setGradedScore(gradedScore);
            
            if (gradedScore >=70) {
                result = "Result of grades assignment is: A";
                System.out.println(result);
            }
            else if (gradedScore >= 60){
                result = "Result of grades assignment is: B";
                System.out.println(result);
            }
            else if (gradedScore >= 50){
                result = "Result of grades assignment is: C";
                System.out.println(result);
            }
            else if (gradedScore >= 40){
                result = "Result of grades assignment is: D";
                System.out.println(result);
            }
            else if (gradedScore < 40){
                result = "Result of grades assignment is: E";
                System.out.println(result);
            }
            setHasGraded(true);
        }
        else {
            result =  "The assignment has not been graded yet";
            System.out.println(result);
        }                 
    }
    
    
    // Method to display teacher details
    public void displayTeacherDetails() 
    {
        super.displayTeacherDetails();
        System.out.println("Department of Teacher is : " + getDepartment());
        System.out.println("Experience of Teacher is : " + getYearsOfExperience());
        
        if (getHasGraded() == false){
            System.out.println("The score has not been graded yet");
        }
        else{
            System.out.println("The graded score is : "+ getGradedScore());
        }
        
    }
}