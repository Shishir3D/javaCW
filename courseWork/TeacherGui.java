import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class TeacherGui
{
    static ArrayList<Teacher> teacherInfoArrayList  = new ArrayList<Teacher>();
    // static Teacher obj1 = new Teacher(101, "Raam", "Kathmandu", "Full Time", "Employed", 10);
    
    
    public static void main(String[] args)
    {

        JFrame mainFrame = new JFrame("Shishir Poudel AI 4");
        mainFrame.setSize(1920,1080);
        mainFrame.setLayout(null);
        mainFrame.getContentPane().setBackground(new Color(27, 35, 54)); //setting background color for the frame        

        JPanel leftPanel = leftSideBar();
        JPanel homeButton = homeButton();
        JPanel topBar = topBar();
        JPanel noticeBoardPanel = noticeBoardPanel();
        JPanel addLectuerPanel = addLecturerPanel();
        JPanel addTutorPanel = addTutorPanel();
        JPanel setSalaryPanel = setSalaryPanel();
        JPanel removeTutorPanel = removeTutorPanel();
        JPanel displayPanel = displayPanel();
        JPanel gradeAssignmentPanel = gradeAssignmentPanel();
        JPanel addLecturerButtonPanel = addLecturerButtonPanel();
        JPanel addTutorButtonPanel = addTutorButtonPanel();
        JPanel gradeAssignmentButtonPanel = gradeAssignmentButtonPanel();
        JPanel setSalaryButtonPanel = setSalaryButtonPanel();
        JPanel removeTutorButtonPanel = removeTutorButtonPanel();
        JPanel displayButtonPanel = displayButtonPanel();

        mainFrame.add(addLecturerButtonPanel);
        mainFrame.add(addTutorButtonPanel);
        mainFrame.add(gradeAssignmentButtonPanel);
        mainFrame.add(setSalaryButtonPanel);
        mainFrame.add(removeTutorButtonPanel);
        mainFrame.add(displayButtonPanel);
        mainFrame.add(leftPanel);
        mainFrame.add(homeButton);
        mainFrame.add(topBar);
        mainFrame.add(noticeBoardPanel); noticeBoardPanel.setVisible(true);
        mainFrame.add(addLectuerPanel); addLectuerPanel.setVisible(false);
        mainFrame.add(addTutorPanel); addTutorPanel.setVisible(false);
        mainFrame.add(gradeAssignmentPanel); gradeAssignmentPanel.setVisible(false);
        mainFrame.add(setSalaryPanel); setSalaryPanel.setVisible(false);
        mainFrame.add(removeTutorPanel);removeTutorPanel.setVisible(false);
        mainFrame.add(displayPanel); displayPanel.setVisible(false);

        mainFrame.setVisible(true);

        //actionListner will show the 'add Lecturer' panel
        addLecturerButtonPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {                                                
                addLectuerPanel.setVisible(true);
                noticeBoardPanel.setVisible(false);
                addTutorPanel.setVisible(false);                
                gradeAssignmentPanel.setVisible(false);
                setSalaryPanel.setVisible(false);
                removeTutorPanel.setVisible(false);
                displayPanel.setVisible(false);

                System.out.println("Lecturer Button is clicked");
                mainFrame.repaint();
            }
        });

        //actionListner will show the 'add Tutor' panel
        addTutorButtonPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {                                                
                addLectuerPanel.setVisible(false);
                noticeBoardPanel.setVisible(false);
                addTutorPanel.setVisible(true);                
                gradeAssignmentPanel.setVisible(false);
                setSalaryPanel.setVisible(false);
                removeTutorPanel.setVisible(false);
                displayPanel.setVisible(false);

                System.out.println("Tutor Button is clicked");
                mainFrame.repaint();
            }
        });

        //actionListner will show the 'add grade Assignment' panel
        gradeAssignmentButtonPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {                                                
                addLectuerPanel.setVisible(false);
                noticeBoardPanel.setVisible(false);
                addTutorPanel.setVisible(false);                
                gradeAssignmentPanel.setVisible(true);
                setSalaryPanel.setVisible(false);
                removeTutorPanel.setVisible(false);
                displayPanel.setVisible(false);
                
                System.out.println("Grade Assignment Button is clicked");
                mainFrame.repaint();
            }
        });

        //actionListner will show the 'add grade Assignment' panel
        setSalaryButtonPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {                                                
                addLectuerPanel.setVisible(false);
                noticeBoardPanel.setVisible(false);
                addTutorPanel.setVisible(false);                
                gradeAssignmentPanel.setVisible(false);
                setSalaryPanel.setVisible(true);
                removeTutorPanel.setVisible(false);
                displayPanel.setVisible(false);
                
                System.out.println("Set Salary Button is clicked");
                mainFrame.repaint();
            }
        });

        //actionListner will show the 'add grade Assignment' panel
        removeTutorButtonPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {                                                
                addLectuerPanel.setVisible(false);
                noticeBoardPanel.setVisible(false);
                addTutorPanel.setVisible(false);                
                gradeAssignmentPanel.setVisible(false);
                setSalaryPanel.setVisible(false);
                removeTutorPanel.setVisible(true);
                displayPanel.setVisible(false);
                
                System.out.println("Set Salary Button is clicked");
                mainFrame.repaint();
            }
        });

        //actionListner will show the 'add grade Assignment' panel
        displayButtonPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {                                                
                addLectuerPanel.setVisible(false);
                noticeBoardPanel.setVisible(false);
                addTutorPanel.setVisible(false);                
                gradeAssignmentPanel.setVisible(false);
                setSalaryPanel.setVisible(false);
                removeTutorPanel.setVisible(false);
                displayPanel.setVisible(true);

                System.out.println("Display Button Button is clicked");
                mainFrame.repaint();
            }
        });


        //actionListner that will go back to home when clicked
        homeButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {                                                
                addLectuerPanel.setVisible(false);
                noticeBoardPanel.setVisible(true);                
                
                System.out.println("Home button is clicked");
                mainFrame.repaint();
            }
        });
          
    }

    //utility methods
    
    public static int homeButtonHeight()
    {
        int homeButtonHeight = 100; 
        return homeButtonHeight;
    }
    public static int homeButtonWidth()
    {
        int homeButtonWidth = 200; 
        return homeButtonWidth;
    }
    public static JLabel setCustomFont(JLabel label)
    {
        Font customFont = new Font("Ubuntu", Font.BOLD, 40);
        label.setForeground(Color.white);
        label.setFont(customFont); 
        return label;
    }
    public static JLabel setCustomFont2(JLabel label)
    {
        Font customFont2 = new Font("Arial", Font.BOLD, 16);
        label.setForeground(new Color(217, 217, 217));
        label.setFont(customFont2); 
        return label;
    }
    public static JLabel setCustomFont3(JLabel label)
    {
        Font customFont3 = new Font("Arial", Font.BOLD, 20);
        label.setForeground(new Color(27, 35, 54));
        label.setFont(customFont3); 
        return label;
    }
    public static JLabel setCustomFont4(JLabel label)
    {
        Font customFont4 = new Font("Arial", Font.BOLD, 18);
        label.setForeground(new Color(224, 227, 233));
        label.setFont(customFont4); 
        return label;
    }
    public static JLabel setCustomFont5(JLabel label)
    {
        Font customFont5 = new Font("Calibri", Font.BOLD, 36);
        label.setForeground(new Color(48, 59, 87));
        label.setFont(customFont5); 
        return label;
    }

    //stationary panels

    public static JPanel homeButton()
    {
        Color homeButtonColor = new Color(255, 222, 89);
        int x = 0; int y = 0;
        int width = 200; int height = homeButtonHeight();

        JPanel homeButtonPanel = new JPanel();
        homeButtonPanel.setBounds(x,y,width,height);
        homeButtonPanel.setBackground(homeButtonColor);
        homeButtonPanel.setLayout(null);

        Font customFont = new Font("Pacifico", Font.BOLD, 40);
        int labelx = 30; int labely = 30;
        int labelWidth = homeButtonWidth()- labelx; int labelHeight = 40;

        JLabel homeLabel = new JLabel("HOME");
        homeLabel.setBounds(labelx,labely,labelWidth, labelHeight);
        homeLabel.setFont(customFont);
        homeLabel.setForeground(new Color(27, 35, 54));

        //chagne home button color on hover
        homeButtonPanel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                // Change the background color of the panel when the mouse enters
                homeButtonPanel.setBackground(new Color(203, 180, 88)); // Example hover color
                homeButtonPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                // Change the background color back to the original when the mouse exits
                homeButtonPanel.setBackground(homeButtonColor);
                homeButtonPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        homeButtonPanel.add(homeLabel);
        homeButtonPanel.setVisible(true);
        return homeButtonPanel;
    }

    public static JPanel leftSideBar()
    {
        Color sideBarColor = new Color(48, 59, 87);
        int x = 0; int y = homeButtonHeight();        
        int width = 200; int height = 1080 - homeButtonHeight(); //height of the frame minus height of the homebutton

        JPanel sideBar = new JPanel();        
        sideBar.setBounds(x,y, width,height);
        sideBar.setBackground(sideBarColor);


        return sideBar;
    }

    public static JPanel topBar()
    {
        Color topBarColor = new Color(48, 59, 87);
        int x = homeButtonWidth(); int y = 0;
        int width = 1920 - homeButtonWidth(); int height = homeButtonHeight();
        
        JPanel topBar = new JPanel();
        topBar.setBounds(x,y,width,height);
        topBar.setBackground(topBarColor);
        topBar.setLayout(null);

        JLabel topTitle = new JLabel("TEACHER MANAGEMENT SYSTEM");
        setCustomFont(topTitle);
        topTitle.setBounds(480,30, 1200, 40);
        topBar.add(topTitle);

        return topBar;
    }

    //Button Panels

    public static JPanel addLecturerButtonPanel()
    {
        int panelx = 10; int panely = 200;
        int panelWidth = homeButtonWidth() - (2*panelx); int panelHeight = 40;
        int labelx = 10; int labely = 10;
        int labelWidth = panelWidth; int labelHeight = 20;
        Color panelBackgroundColor = new Color(48, 59, 87);

        JPanel teacherPanel = new JPanel();
        teacherPanel.setBackground(panelBackgroundColor);
        teacherPanel.setLayout(null);
        teacherPanel.setBounds(panelx,panely,panelWidth,panelHeight);

        JLabel addTeacherLabel = new JLabel("Lecturer");
        addTeacherLabel.setBounds(labelx,labely,labelWidth,labelHeight);;
        setCustomFont2(addTeacherLabel);
        
        //change the 'label' color to white when mouse hovers over the 'panel'
        teacherPanel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                // Change the label color to white when the cursor enters the panel
                addTeacherLabel.setFont(new Font("Arial", Font.BOLD, 18));
                addTeacherLabel.setForeground(Color.WHITE);
                teacherPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                // Change the label color back to the original color when the cursor exits the panel
                setCustomFont2(addTeacherLabel);
                teacherPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        
        teacherPanel.add(addTeacherLabel);
        return teacherPanel;
    }

    public static JPanel addTutorButtonPanel()
    {
        int panelx = 10; int panely = 250;
        int panelWidth = homeButtonWidth() - (2*panelx); int panelHeight = 40;
        int labelx = 10; int labely = 10;
        int labelWidth = panelWidth; int labelHeight = 20;
        Color panelBackgroundColor = new Color(48, 59, 87);

        JPanel tutorPanel = new JPanel();
        tutorPanel.setBackground(panelBackgroundColor);
        tutorPanel.setLayout(null);
        tutorPanel.setBounds(panelx,panely,panelWidth,panelHeight);

        JLabel addTeacherLabel = new JLabel("Tutor");
        addTeacherLabel.setBounds(labelx,labely,labelWidth,labelHeight);;
        setCustomFont2(addTeacherLabel);
        
        //change the 'label' color to white when mouse hovers over the 'panel'
        tutorPanel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                // Change the label color to white when the cursor enters the panel
                addTeacherLabel.setFont(new Font("Arial", Font.BOLD, 18));
                addTeacherLabel.setForeground(Color.WHITE);
                tutorPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                // Change the label color back to the original color when the cursor exits the panel
                setCustomFont2(addTeacherLabel);
                tutorPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });  
        
        tutorPanel.add(addTeacherLabel);
        return tutorPanel;
    }

    public static JPanel gradeAssignmentButtonPanel()
    {
        int panelx = 10; int panely = 290;
        int panelWidth = homeButtonWidth() - (2*panelx); int panelHeight = 40;
        int labelx = 10; int labely = 10;
        int labelWidth = panelWidth; int labelHeight = 20;
        Color panelBackgroundColor = new Color(48, 59, 87);

        JPanel tutorPanel = new JPanel();
        tutorPanel.setBackground(panelBackgroundColor);
        tutorPanel.setLayout(null);
        tutorPanel.setBounds(panelx,panely,panelWidth,panelHeight);

        JLabel addTeacherLabel = new JLabel("Grade Assignment");
        addTeacherLabel.setBounds(labelx,labely,labelWidth,labelHeight);;
        setCustomFont2(addTeacherLabel);
        
        //change the 'label' color to white when mouse hovers over the 'panel'
        tutorPanel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                // Change the label color to white when the cursor enters the panel
                addTeacherLabel.setFont(new Font("Arial", Font.BOLD, 17));
                addTeacherLabel.setForeground(Color.WHITE);
                tutorPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                // Change the label color back to the original color when the cursor exits the panel
                setCustomFont2(addTeacherLabel);
                tutorPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });  
        
        tutorPanel.add(addTeacherLabel);
        return tutorPanel;
    }

    public static JPanel setSalaryButtonPanel()
    {
        int panelx = 10; int panely = 330;
        int panelWidth = homeButtonWidth() - (2*panelx); int panelHeight = 40;
        int labelx = 10; int labely = 10;
        int labelWidth = panelWidth; int labelHeight = 20;
        Color panelBackgroundColor = new Color(48, 59, 87);

        JPanel tutorPanel = new JPanel();
        tutorPanel.setBackground(panelBackgroundColor);
        tutorPanel.setLayout(null);
        tutorPanel.setBounds(panelx,panely,panelWidth,panelHeight);

        JLabel addTeacherLabel = new JLabel("Set Salary");
        addTeacherLabel.setBounds(labelx,labely,labelWidth,labelHeight);;
        setCustomFont2(addTeacherLabel);
        
        //change the 'label' color to white when mouse hovers over the 'panel'
        tutorPanel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                // Change the label color to white when the cursor enters the panel
                addTeacherLabel.setFont(new Font("Arial", Font.BOLD, 17));
                addTeacherLabel.setForeground(Color.WHITE);
                tutorPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                // Change the label color back to the original color when the cursor exits the panel
                setCustomFont2(addTeacherLabel);
                tutorPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });  
        
        tutorPanel.add(addTeacherLabel);
        return tutorPanel;
    }

    public static JPanel removeTutorButtonPanel()
    {
        int panelx = 10; int panely = 370;
        int panelWidth = homeButtonWidth() - (2*panelx); int panelHeight = 40;
        int labelx = 10; int labely = 10;
        int labelWidth = panelWidth; int labelHeight = 20;
        Color panelBackgroundColor = new Color(48, 59, 87);

        JPanel tutorPanel = new JPanel();
        tutorPanel.setBackground(panelBackgroundColor);
        tutorPanel.setLayout(null);
        tutorPanel.setBounds(panelx,panely,panelWidth,panelHeight);

        JLabel addTeacherLabel = new JLabel("Remove Tutor");
        addTeacherLabel.setBounds(labelx,labely,labelWidth,labelHeight);;
        setCustomFont2(addTeacherLabel);
        
        //change the 'label' color to white when mouse hovers over the 'panel'
        tutorPanel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                // Change the label color to white when the cursor enters the panel
                addTeacherLabel.setFont(new Font("Arial", Font.BOLD, 17));
                addTeacherLabel.setForeground(Color.WHITE);
                tutorPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                // Change the label color back to the original color when the cursor exits the panel
                setCustomFont2(addTeacherLabel);
                tutorPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });  
        
        tutorPanel.add(addTeacherLabel);
        return tutorPanel;
    }

    public static JPanel displayButtonPanel()
    {
        int panelx = 10; int panely = 410;
        int panelWidth = homeButtonWidth() - (2*panelx); int panelHeight = 40;
        int labelx = 10; int labely = 10;
        int labelWidth = panelWidth; int labelHeight = 20;
        Color panelBackgroundColor = new Color(48, 59, 87);

        JPanel tutorPanel = new JPanel();
        tutorPanel.setBackground(panelBackgroundColor);
        tutorPanel.setLayout(null);
        tutorPanel.setBounds(panelx,panely,panelWidth,panelHeight);

        JLabel addTeacherLabel = new JLabel("Display");
        addTeacherLabel.setBounds(labelx,labely,labelWidth,labelHeight);;
        setCustomFont2(addTeacherLabel);
        
        //change the 'label' color to white when mouse hovers over the 'panel'
        tutorPanel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                // Change the label color to white when the cursor enters the panel
                addTeacherLabel.setFont(new Font("Arial", Font.BOLD, 17));
                addTeacherLabel.setForeground(Color.WHITE);
                tutorPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                // Change the label color back to the original color when the cursor exits the panel
                setCustomFont2(addTeacherLabel);
                tutorPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });  
        
        tutorPanel.add(addTeacherLabel);
        return tutorPanel;
    }

    //center panels
    public static JPanel noticeBoardPanel()
    {
        int x = homeButtonWidth() + 250; int y = 200;
        int width = 1300; int height = 750;

        JPanel outerPanel = new JPanel();
        outerPanel.setLayout(null);
        outerPanel.setVisible(true);
        outerPanel.setBackground(new Color(58, 53, 81));
        outerPanel.setBounds(x,y,width,height);

        //create the yellow panel
        int yellowPanelX = 500; int yellowPanelY = 40;
        int yellowPanelWidth = 300; int yellowPanelHeight = 50;

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(new Color(255, 222, 89));
        yellowPanel.setBounds(yellowPanelX,yellowPanelY,yellowPanelWidth,yellowPanelHeight);
        yellowPanel.setLayout(null);

        JLabel addTeacherYellowLabel = new JLabel("Notice Board");
        setCustomFont3(addTeacherYellowLabel);
        addTeacherYellowLabel.setBounds(75,18,150,20);

        //create green panel
        int greenPanelX = 150; int greenPanelY = 150;
        int greenPanelWidth = 1000; int greenPanelHeight = 500;
        
        JPanel greenPanel = new JPanel();
        greenPanel.setLayout(null);
        greenPanel.setBackground(new Color(224, 227, 233));
        greenPanel.setBounds(greenPanelX,greenPanelY,greenPanelWidth,greenPanelHeight);

        //bounds for the text label for line 1
        int line1x = 250; int line1y = 160;
        int line1Width = 550; int line1Height= 36;

        JLabel lineLabel1 = new  JLabel("Choose an option from the");
        setCustomFont5(lineLabel1);
        lineLabel1.setBounds(line1x, line1y, line1Width, line1Height);

        //bounds for the text label for line 2
        int line2x = 310; int line2y = 200;
        int line2Width = 550; int line2Height= 45;

        JLabel lineLabel2 = new  JLabel("left side bar to start");
        setCustomFont5(lineLabel2);
        lineLabel2.setBounds(line2x, line2y, line2Width, line2Height);

        //bounds for the text label for line 2
        int line3x = 420; int line3y = 240;
        int line3Width = 550; int line3Height= 45;

        JLabel lineLabel3 = new  JLabel("working");
        setCustomFont5(lineLabel3);
        lineLabel3.setBounds(line3x, line3y, line3Width, line3Height);

        
        greenPanel.add(lineLabel1);
        greenPanel.add(lineLabel2);
        greenPanel.add(lineLabel3);
        outerPanel.add(greenPanel);
        yellowPanel.add(addTeacherYellowLabel);
        outerPanel.add(yellowPanel);
        return outerPanel;
    }

    public static JPanel addLecturerPanel()
    {
        int x = homeButtonWidth() + 250; int y = 200;
        int width = 1300; int height = 750;      

        //create the main outer panel
        JPanel outerPanel = new JPanel();
        outerPanel.setLayout(null);
        outerPanel.setVisible(true);
        outerPanel.setBackground(new Color(58, 53, 81));
        outerPanel.setBounds(x,y,width,height);
        
        //create the yellow panel
        int yellowPanelX = 350; int yellowPanelY = 40;
        int yellowPanelWidth = 600; int yellowPanelHeight = 50;

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(new Color(255, 222, 89));
        yellowPanel.setBounds(yellowPanelX,yellowPanelY,yellowPanelWidth,yellowPanelHeight);
        yellowPanel.setLayout(null);

        JLabel addTeacherYellowLabel = new JLabel("Add Lecturer");
        setCustomFont3(addTeacherYellowLabel);
        addTeacherYellowLabel.setBounds(220,18,200,20);
        
        //teacher ID
        int teacherIdX = 500; int teacherIdY = 140;        

        JLabel teacherIDLabel = new JLabel("Teacher ID");
        setCustomFont4(teacherIDLabel);
        teacherIDLabel.setBounds(teacherIdX+80,teacherIdY,200,18);

        JTextField teacherIdTextField = new JTextField();
        teacherIdTextField.setBounds(teacherIdX,teacherIdY+20,300,40);

        //teacher Name
        int teacherNameX = 250; int teacherNameY = 240;

        JLabel teacherNameLabel = new JLabel("Teacher Name");
        setCustomFont4(teacherNameLabel);
        teacherNameLabel.setBounds(teacherNameX,teacherNameY,200,18);

        JTextField teacherNameTextField = new JTextField();
        teacherNameTextField.setBounds(teacherNameX,teacherNameY + 20,300,40);

        //Address
        int teacherAddressX = 250; int teacherAddressY = 340;

        JLabel teacherAddressLabel = new JLabel("Teacher Address");
        setCustomFont4(teacherAddressLabel);
        teacherAddressLabel.setBounds(teacherAddressX,teacherAddressY,200,18);

        JTextField teacherAddressTextField = new JTextField();
        teacherAddressTextField.setBounds(teacherAddressX,teacherAddressY + 20,300,40);

        //Employment Status
        int teacherEmploymentStatusX = 250; int teacherEmploymentStatusY = 440;

        JLabel teacherEmploymentStatusLabel = new JLabel("Employment Status");
        setCustomFont4(teacherEmploymentStatusLabel);
        teacherEmploymentStatusLabel.setBounds(teacherEmploymentStatusX,teacherEmploymentStatusY,200,18);

        JTextField teacherEmploymentStatusTextField = new JTextField();
        teacherEmploymentStatusTextField.setBounds(teacherEmploymentStatusX,teacherEmploymentStatusY + 20,300,40);

        //working Type
        int teacherWorkingTypeX = teacherNameX+500; int teacherWorkingTypeY = teacherNameY;

        JLabel teacherWorkingTypeLabel = new JLabel("Working Type");
        setCustomFont4(teacherWorkingTypeLabel);
        teacherWorkingTypeLabel.setBounds(teacherWorkingTypeX,teacherWorkingTypeY,200,18);

        JTextField teacherWorkingTypeYTextField = new JTextField();
        teacherWorkingTypeYTextField.setBounds(teacherWorkingTypeX,teacherWorkingTypeY + 20,300,40);

        //Graded Score
        int teacherGradedScoreX = teacherNameX+500; int teacherGradedScoreY = teacherAddressY;

        JLabel teacherGradedScoreLabel = new JLabel("Graded Score");
        setCustomFont4(teacherGradedScoreLabel);
        teacherGradedScoreLabel.setBounds(teacherGradedScoreX,teacherGradedScoreY,200,18);

        JTextField teacherGradedScoreTextField = new JTextField();
        teacherGradedScoreTextField.setBounds(teacherGradedScoreX,teacherGradedScoreY + 20,300,40);

        //Years of Experience
        int teacherYearsOfExperienceX = teacherAddressX+500; int teacherYearsOfExperienceY = teacherEmploymentStatusY;

        JLabel teacherYearsOfExperienceLabel = new JLabel("Years Of Experience");
        setCustomFont4(teacherYearsOfExperienceLabel);
        teacherYearsOfExperienceLabel.setBounds(teacherYearsOfExperienceX,teacherYearsOfExperienceY,250,18);

        JTextField teacherYearsOfExperienceTextField = new JTextField();
        teacherYearsOfExperienceTextField.setBounds(teacherYearsOfExperienceX,teacherYearsOfExperienceY + 20,300,40);

        //Working Hours
        int teacherWorkingHoursX = teacherEmploymentStatusX+500; int teacherWorkingHoursY = teacherEmploymentStatusY+100;

        JLabel teacherWorkingHoursLabel = new JLabel("Working Hours");
        setCustomFont4(teacherWorkingHoursLabel);
        teacherWorkingHoursLabel.setBounds(teacherWorkingHoursX,teacherWorkingHoursY,200,18);

        JTextField teacherWorkingHoursTextField = new JTextField();
        teacherWorkingHoursTextField.setBounds(teacherWorkingHoursX,teacherWorkingHoursY + 20,300,40);

        //department
        int teacherDepartmentX = teacherEmploymentStatusX; int teacherDepartmentY = teacherEmploymentStatusY+100;

        JLabel teacherDepartmentLabel = new JLabel("Department");
        setCustomFont4(teacherDepartmentLabel);
        teacherDepartmentLabel.setBounds(teacherDepartmentX,teacherDepartmentY,200,18);

        JTextField teacherDepartmentTextField = new JTextField();
        teacherDepartmentTextField.setBounds(teacherDepartmentX,teacherDepartmentY + 20,300,40);


        //green add Button
        int addButtonPanelX = teacherDepartmentX; int addButtonPanelY = 640;
        int addButtonPanelWidth = 300; int addButtonPanelHeight = 50;

        JButton addButton = new JButton("ADD");
        addButton.setBackground(new Color(193, 255, 114));
        addButton.setBounds(addButtonPanelX,addButtonPanelY,addButtonPanelWidth,addButtonPanelHeight);
        addButton.setFont(new Font("Arial", Font.BOLD, 18));
        addButton.setForeground(new Color(27, 35, 54));
        addButton.setFocusPainted(false); // Disabling the default border
        addButton.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50)); // Adding padding
        addButton.setContentAreaFilled(false); // Making content area transparent
        addButton.setOpaque(true); // Making the button opaque

        //gray clear Button
        int clearButtonX = teacherDepartmentX + 500; int clearButtonY = addButtonPanelY;
        int clearButtonWidth = 300; int clearButtonHeight = 50;

        JButton clearButton = new JButton("Clear");
        clearButton.setBackground(new Color(224, 227, 233));
        clearButton.setBounds(clearButtonX,clearButtonY,clearButtonWidth,clearButtonHeight);
        clearButton.setFont(new Font("Arial", Font.BOLD, 18));
       
        //logic for adding textField info to the arrayList
        addButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                // Change the label color to white when the cursor enters the panel
                addButton.setFont(new Font("Arial", Font.BOLD, 22));
                addButton.setForeground(new Color(27, 35, 54));

                addButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                // Change the label color back to the original color when the cursor exits the panel
                addButton.setFont(new Font("Arial", Font.BOLD, 18));
                addButton.setForeground(Color.BLACK);
                addButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                addButton.setBackground(new Color(193, 255, 114)); //change color of the green button to the previous color
            }

            public void mouseClicked(MouseEvent e){
                String isAvalidNumber = "no";
                int teacherId = -1;
                String teacherName = teacherNameTextField.getText();
                String address = teacherAddressTextField.getText();
                String workingType = teacherWorkingTypeYTextField.getText();
                String employmentStatus = teacherEmploymentStatusTextField.getText();
                String department = teacherDepartmentTextField.getText();
                int yearsOfExperience = -1;
                int workingHours = -1;
                int gradedScore = -1;
                
                try{
                    teacherId = Integer.parseInt(teacherIdTextField.getText());
                    yearsOfExperience = Integer.parseInt(teacherYearsOfExperienceTextField.getText());
                    workingHours = Integer.parseInt(teacherWorkingHoursTextField.getText());
                    gradedScore = Integer.parseInt(teacherGradedScoreTextField.getText());
                    
                    if (teacherId >= 0 && yearsOfExperience >= 0 && workingHours >= 0 && gradedScore >= 0) {                        
                        isAvalidNumber = "yes";
                    }
                    else{
                        String warningMessage = "Please 'DO NOT' enter any negative values!";
                        JOptionPane.showMessageDialog(null, warningMessage, "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(NumberFormatException f){
                    // String warningMessage = "Please make sure that you haven't entered any letters in 'TeacherID' or 'Years of Experience' or 'Working Hours' or 'Graded Score'. \n                                                                 Also ensure that none of the text field is left empty!";
                    // JOptionPane.showMessageDialog(null, warningMessage, "Warning", JOptionPane.WARNING_MESSAGE);
                    
                }

                String shouldAddToArrayListFromLecturer = shouldAddToArrayListFromLecturer(isAvalidNumber,teacherId, teacherName, address, workingType, employmentStatus, department);
                if (shouldAddToArrayListFromLecturer == "yes"){
                    Lecturer newLecturer = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus, department, yearsOfExperience, workingHours);
                    newLecturer.setGradedScore(gradedScore);                
                    teacherInfoArrayList.add(newLecturer);
                    JOptionPane.showMessageDialog(null, "The data that you entered has been sucessfully added!");               
                }

                for (Teacher  each : teacherInfoArrayList){
                    Lecturer downCastedObject = (Lecturer) each;
                    System.out.println("The graded score is : " + downCastedObject.getGradedScore());
                }

            }
        });

        //loggic for clear Button
        clearButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                // Change the label color to white when the cursor enters the panel
                clearButton.setFont(new Font("Arial", Font.BOLD, 22));
                clearButton.setForeground(new Color(27, 35, 54));
                clearButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                // Change the label color back to the original color when the cursor exits the panel
                clearButton.setFont(new Font("Arial", Font.BOLD, 18));
                clearButton.setForeground(new Color(27, 35, 54));
                clearButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                clearButton.setBackground(new Color(224, 227, 233)); //change color of the green button to the previous color
            }

            public void mouseClicked(MouseEvent e){
                teacherIdTextField.setText("");
                teacherNameTextField.setText("");
                teacherAddressTextField.setText("");
                teacherWorkingTypeYTextField.setText("");
                teacherEmploymentStatusTextField.setText("");
                teacherDepartmentTextField.setText("");
                teacherYearsOfExperienceTextField.setText("");
                teacherWorkingHoursTextField.setText("");
                teacherGradedScoreTextField.setText("");
            }
        });
        
        // outerPanel.revalidate();
        yellowPanel.add(addTeacherYellowLabel);
        outerPanel.add(addButton);
        outerPanel.add(clearButton);
        // outerPanel.add(displayButton);
        outerPanel.add(yellowPanel);
        outerPanel.add(teacherIDLabel);
        outerPanel.add(teacherIdTextField);
        outerPanel.add(teacherNameLabel);
        outerPanel.add(teacherNameTextField);
        outerPanel.add(teacherAddressLabel);
        outerPanel.add(teacherAddressTextField);
        outerPanel.add(teacherEmploymentStatusLabel);
        outerPanel.add(teacherEmploymentStatusTextField);
        outerPanel.add(teacherWorkingTypeLabel);
        outerPanel.add(teacherWorkingTypeYTextField);
        outerPanel.add(teacherGradedScoreLabel);
        outerPanel.add(teacherGradedScoreTextField);
        outerPanel.add(teacherYearsOfExperienceLabel);
        outerPanel.add(teacherYearsOfExperienceTextField);
        outerPanel.add(teacherWorkingHoursLabel);
        outerPanel.add(teacherWorkingHoursTextField);
        outerPanel.add(teacherDepartmentLabel);
        outerPanel.add(teacherDepartmentTextField);
        return outerPanel;
    }

    public static JPanel addTutorPanel()
    {
        int x = homeButtonWidth() + 250; int y = 200;
        int width = 1300; int height = 750;      

        //create the main outer panel
        JPanel outerPanel = new JPanel();
        outerPanel.setLayout(null);
        outerPanel.setVisible(true);
        outerPanel.setBackground(new Color(58, 53, 81));
        outerPanel.setBounds(x,y,width,height);
        
        //create the yellow panel
        int yellowPanelX = 500; int yellowPanelY = 40;
        int yellowPanelWidth = 300; int yellowPanelHeight = 50;

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(new Color(255, 222, 89));
        yellowPanel.setBounds(yellowPanelX,yellowPanelY,yellowPanelWidth,yellowPanelHeight);
        yellowPanel.setLayout(null);

        JLabel addTeacherYellowLabel = new JLabel("Add Tutor");
        setCustomFont3(addTeacherYellowLabel);
        addTeacherYellowLabel.setBounds(88,18,150,20);
        
        //teacher ID
        int teacherIdX = 250; int teacherIdY = 140;        

        JLabel teacherIDLabel = new JLabel("Teacher ID");
        setCustomFont4(teacherIDLabel);
        teacherIDLabel.setBounds(teacherIdX,teacherIdY,200,18);

        JTextField teacherIdTextField = new JTextField();
        teacherIdTextField.setBounds(teacherIdX,teacherIdY+20,300,40);

        //teacher Name
        int teacherNameX = 250; int teacherNameY = 240;

        JLabel teacherNameLabel = new JLabel("Teacher Name");
        setCustomFont4(teacherNameLabel);
        teacherNameLabel.setBounds(teacherNameX,teacherNameY,200,18);

        JTextField teacherNameTextField = new JTextField();
        teacherNameTextField.setBounds(teacherNameX,teacherNameY + 20,300,40);

        //Address
        int teacherAddressX = 250; int teacherAddressY = 340;

        JLabel teacherAddressLabel = new JLabel("Teacher Address");
        setCustomFont4(teacherAddressLabel);
        teacherAddressLabel.setBounds(teacherAddressX,teacherAddressY,200,18);

        JTextField teacherAddressTextField = new JTextField();
        teacherAddressTextField.setBounds(teacherAddressX,teacherAddressY + 20,300,40);

        //Employment Status
        int teacherEmploymentStatusX = 250; int teacherEmploymentStatusY = 440;

        JLabel teacherEmploymentStatusLabel = new JLabel("Employment Status");
        setCustomFont4(teacherEmploymentStatusLabel);
        teacherEmploymentStatusLabel.setBounds(teacherEmploymentStatusX,teacherEmploymentStatusY,200,18);

        JTextField teacherEmploymentStatusTextField = new JTextField();
        teacherEmploymentStatusTextField.setBounds(teacherEmploymentStatusX,teacherEmploymentStatusY + 20,300,40);

        //Academic qualification
        int teacherAcademicQualificationX = 250; int teacherAcademicQualificationY = 540;

        JLabel teacherAcademicQualificationLabel = new JLabel("Employment Status");
        setCustomFont4(teacherAcademicQualificationLabel);
        teacherAcademicQualificationLabel.setBounds(teacherAcademicQualificationX,teacherAcademicQualificationY,200,18);

        JTextField teacherAcademicQualificationTextField = new JTextField();
        teacherAcademicQualificationTextField.setBounds(teacherAcademicQualificationX,teacherAcademicQualificationY + 20,300,40);


        //working Type
        int teacherWorkingTypeX = teacherIdX+500; int teacherWorkingTypeY = teacherIdY;

        JLabel teacherWorkingTypeLabel = new JLabel("Working Type");
        setCustomFont4(teacherWorkingTypeLabel);
        teacherWorkingTypeLabel.setBounds(teacherWorkingTypeX,teacherWorkingTypeY,200,18);

        JTextField teacherWorkingTypeYTextField = new JTextField();
        teacherWorkingTypeYTextField.setBounds(teacherWorkingTypeX,teacherIdY + 20,300,40);

        //Graded Score
        int teacherGradedScoreX = teacherNameX+500; int teacherGradedScoreY = teacherNameY;

        JLabel teacherGradedScoreLabel = new JLabel("Salary");
        setCustomFont4(teacherGradedScoreLabel);
        teacherGradedScoreLabel.setBounds(teacherGradedScoreX,teacherGradedScoreY,200,18);

        JTextField teacherGradedScoreTextField = new JTextField();
        teacherGradedScoreTextField.setBounds(teacherGradedScoreX,teacherGradedScoreY + 20,300,40);

        //Years of Experience
        int teacherYearsOfExperienceX = teacherAddressX+500; int teacherYearsOfExperienceY = teacherAddressY;

        JLabel teacherYearsOfExperienceLabel = new JLabel("Specialization");
        setCustomFont4(teacherYearsOfExperienceLabel);
        teacherYearsOfExperienceLabel.setBounds(teacherYearsOfExperienceX,teacherYearsOfExperienceY,200,18);

        JTextField teacherYearsOfExperienceTextField = new JTextField();
        teacherYearsOfExperienceTextField.setBounds(teacherYearsOfExperienceX,teacherYearsOfExperienceY + 20,300,40);

        //Working Hours
        int teacherWorkingHoursX = teacherEmploymentStatusX+500; int teacherWorkingHoursY = teacherEmploymentStatusY;

        JLabel teacherWorkingHoursLabel = new JLabel("Working Hours");
        setCustomFont4(teacherWorkingHoursLabel);
        teacherWorkingHoursLabel.setBounds(teacherWorkingHoursX,teacherWorkingHoursY,200,18);

        JTextField teacherWorkingHoursTextField = new JTextField();
        teacherWorkingHoursTextField.setBounds(teacherWorkingHoursX,teacherWorkingHoursY + 20,300,40);

        //Performance Index
        int teacherPerformanceIndexX = teacherAcademicQualificationX+500; int teacherPerformanceIndexY = teacherAcademicQualificationY;

        JLabel teacherPerformanceIndexLabel = new JLabel("Performance Index");
        setCustomFont4(teacherPerformanceIndexLabel);
        teacherPerformanceIndexLabel.setBounds(teacherPerformanceIndexX,teacherPerformanceIndexY,200,18);

        JTextField teacherPerformanceIndexTextField = new JTextField();
        teacherPerformanceIndexTextField.setBounds(teacherPerformanceIndexX,teacherPerformanceIndexY + 20,300,40);

        //green Panel
        int greenPanelX = 580; int greenPanelY = 640;
        int greenPanelWidth = 150; int greenPanelHeight = 50;

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(36, 248, 108));
        greenPanel.setBounds(greenPanelX,greenPanelY,greenPanelWidth,greenPanelHeight);
        greenPanel.setLayout(null);

        JLabel displayGreenLabel = new JLabel("ADD");
        setCustomFont3(displayGreenLabel);
        displayGreenLabel.setBounds(50,16,150,20);

        yellowPanel.add(addTeacherYellowLabel);
        greenPanel.add(displayGreenLabel);
        outerPanel.add(greenPanel);
        outerPanel.add(yellowPanel);
        outerPanel.add(teacherIDLabel);
        outerPanel.add(teacherIdTextField);
        outerPanel.add(teacherNameLabel);
        outerPanel.add(teacherNameTextField);
        outerPanel.add(teacherAddressLabel);
        outerPanel.add(teacherAddressTextField);
        outerPanel.add(teacherEmploymentStatusLabel);
        outerPanel.add(teacherEmploymentStatusTextField);
        outerPanel.add(teacherWorkingTypeLabel);
        outerPanel.add(teacherWorkingTypeYTextField);
        outerPanel.add(teacherGradedScoreLabel);
        outerPanel.add(teacherGradedScoreTextField);
        outerPanel.add(teacherYearsOfExperienceLabel);
        outerPanel.add(teacherYearsOfExperienceTextField);
        outerPanel.add(teacherWorkingHoursLabel);
        outerPanel.add(teacherWorkingHoursTextField);
        outerPanel.add(teacherAcademicQualificationLabel);
        outerPanel.add(teacherAcademicQualificationTextField);
        outerPanel.add(teacherPerformanceIndexLabel);
        outerPanel.add(teacherPerformanceIndexTextField);
        return outerPanel;
    }
    
    public static JPanel gradeAssignmentPanel()
    {
        int x = homeButtonWidth() + 550; int y = 200;
        int width = 600; int height = 750;      

        //create the main outer panel
        JPanel outerPanel = new JPanel();
        outerPanel.setLayout(null);
        outerPanel.setVisible(true);
        outerPanel.setBackground(new Color(58, 53, 81));
        outerPanel.setBounds(x,y,width,height);
        
        //create the yellow panel
        int yellowPanelX = 165; int yellowPanelY = 40;
        int yellowPanelWidth = 300; int yellowPanelHeight = 50;

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(new Color(255, 222, 89));
        yellowPanel.setBounds(yellowPanelX,yellowPanelY,yellowPanelWidth,yellowPanelHeight);
        yellowPanel.setLayout(null);

        JLabel addTeacherYellowLabel = new JLabel("Grade Assignment");
        setCustomFont3(addTeacherYellowLabel);
        addTeacherYellowLabel.setBounds(50,18,250,20);

        //teacher ID
        int teacherIDX = 160; int teacherIDY = 180;

        JLabel teaacherIdLabel = new JLabel("Teacher ID");
        setCustomFont4(teaacherIdLabel);
        teaacherIdLabel.setBounds(teacherIDX,teacherIDY,200,18);

        JTextField teacherIdTextField = new JTextField();
        teacherIdTextField.setBounds(teacherIDX,teacherIDY+20,300,40);

        //graded score
        int gradedScoreX = 160; int gradedScoreY = 280;

        JLabel gradedScoreLabel = new JLabel("Graded Score");
        setCustomFont4(gradedScoreLabel);
        gradedScoreLabel.setBounds(gradedScoreX,gradedScoreY,200,18);

        JTextField gradedScoreTextField = new JTextField();
        gradedScoreTextField.setBounds(gradedScoreX,gradedScoreY+20,300,40);

        //department
        int departmentX = 160; int departmentY = 380;

        JLabel departmentLabel = new JLabel("Department");
        setCustomFont4(departmentLabel);
        departmentLabel.setBounds(departmentX,departmentY,200,18);

        JTextField departmentTextField = new JTextField();
        departmentTextField.setBounds(departmentX,departmentY+20,300,40);

        //years of experience
        int yearsOfExperienceX = 160; int yearsOfExperienceY = 480;

        JLabel yearsOfExperienceLabel = new JLabel("Years Of Experience");
        setCustomFont4(yearsOfExperienceLabel);
        yearsOfExperienceLabel.setBounds(yearsOfExperienceX,yearsOfExperienceY,280,18);

        JTextField yearsOfExperienceTextField = new JTextField();
        yearsOfExperienceTextField.setBounds(yearsOfExperienceX,yearsOfExperienceY+20,300,40);

        //green Panel
        int greenPanelX = 160; int greenPanelY = 600;
        int greenPanelWidth = 300; int greenPanelHeight = 50;

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(36, 248, 108));
        greenPanel.setBounds(greenPanelX,greenPanelY,greenPanelWidth,greenPanelHeight);
        greenPanel.setLayout(null);

        JLabel displayGreenLabel = new JLabel("Grade it");
        setCustomFont3(displayGreenLabel);
        displayGreenLabel.setBounds(100,16,300,20);

        yellowPanel.add(addTeacherYellowLabel);
        greenPanel.add(displayGreenLabel);
        outerPanel.add(yellowPanel);
        outerPanel.add(greenPanel);
        outerPanel.add(teaacherIdLabel);
        outerPanel.add(teacherIdTextField);
        outerPanel.add(gradedScoreLabel);
        outerPanel.add(gradedScoreTextField);
        outerPanel.add(departmentLabel);
        outerPanel.add(departmentTextField);
        outerPanel.add(yearsOfExperienceLabel);
        outerPanel.add(yearsOfExperienceTextField);

        return outerPanel;
    }

    public static JPanel setSalaryPanel()
    {
        int x = homeButtonWidth() + 550; int y = 200;
        int width = 600; int height = 750;      

        //create the main outer panel
        JPanel outerPanel = new JPanel();
        outerPanel.setLayout(null);
        outerPanel.setVisible(true);
        outerPanel.setBackground(new Color(58, 53, 81));
        outerPanel.setBounds(x,y,width,height);
        
        //create the yellow panel
        int yellowPanelX = 165; int yellowPanelY = 40;
        int yellowPanelWidth = 300; int yellowPanelHeight = 50;

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(new Color(255, 222, 89));
        yellowPanel.setBounds(yellowPanelX,yellowPanelY,yellowPanelWidth,yellowPanelHeight);
        yellowPanel.setLayout(null);

        JLabel addTeacherYellowLabel = new JLabel("Set Salary");
        setCustomFont3(addTeacherYellowLabel);
        addTeacherYellowLabel.setBounds(90,18,250,20);

        //Teacher ID
        int teacherIdX = 160; int teacherIdY = 180;

        JLabel teacherIdLabel = new JLabel("Teacher ID");
        setCustomFont4(teacherIdLabel);
        teacherIdLabel.setBounds(teacherIdX,teacherIdY,200,18);

        JTextField teacherIdTextField = new JTextField();
        teacherIdTextField.setBounds(teacherIdX,teacherIdY+20,300,40);

        //new Salary
        int newSalaryX = 160; int newSalaryY = 280;

        JLabel newSalaryLabel = new JLabel("New Salary");
        setCustomFont4(newSalaryLabel);
        newSalaryLabel.setBounds(newSalaryX,newSalaryY,200,18);

        JTextField newSalaryTextField = new JTextField();
        newSalaryTextField.setBounds(newSalaryX,newSalaryY+20,300,40);

        //performance Index
        int performanceIndexX = 160; int performanceIndexY = 380;

        JLabel performanceIndeLabel = new JLabel("Performance Index");
        setCustomFont4(performanceIndeLabel);
        performanceIndeLabel.setBounds(performanceIndexX,performanceIndexY,280,18);

        JTextField performanceIndexTextField = new JTextField();
        performanceIndexTextField.setBounds(performanceIndexX,performanceIndexY+20,300,40);

        //green Panel
        int greenPanelX = 160; int greenPanelY = 500;
        int greenPanelWidth = 300; int greenPanelHeight = 50;

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(36, 248, 108));
        greenPanel.setBounds(greenPanelX,greenPanelY,greenPanelWidth,greenPanelHeight);
        greenPanel.setLayout(null);

        JLabel displayGreenLabel = new JLabel("Set it");
        setCustomFont3(displayGreenLabel);
        displayGreenLabel.setBounds(100,16,300,20);

        yellowPanel.add(addTeacherYellowLabel);
        greenPanel.add(displayGreenLabel);
        outerPanel.add(yellowPanel);
        outerPanel.add(greenPanel);
        outerPanel.add(teacherIdLabel);
        outerPanel.add(teacherIdTextField);
        outerPanel.add(newSalaryLabel);
        outerPanel.add(newSalaryTextField);
        outerPanel.add(performanceIndeLabel);
        outerPanel.add(performanceIndexTextField);

        return outerPanel;
    }

    public static JPanel removeTutorPanel()
    {
        int x = homeButtonWidth() + 550; int y = 380;
        int width = 500; int height = 350;      

        //create the main outer panel
        JPanel outerPanel = new JPanel();
        outerPanel.setLayout(null);
        outerPanel.setVisible(true);
        outerPanel.setBackground(new Color(58, 53, 81));
        outerPanel.setBounds(x,y,width,height);
        
        //create the yellow panel
        int yellowPanelX = 105; int yellowPanelY = 40;
        int yellowPanelWidth = 300; int yellowPanelHeight = 50;

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(new Color(255, 222, 89));
        yellowPanel.setBounds(yellowPanelX,yellowPanelY,yellowPanelWidth,yellowPanelHeight);
        yellowPanel.setLayout(null);

        JLabel addTeacherYellowLabel = new JLabel("Remove Tutor");
        setCustomFont3(addTeacherYellowLabel);
        addTeacherYellowLabel.setBounds(70,18,250,20);

        //Teacher ID
        int teacherIdX = 110; int teacherIdY = 130;

        JLabel teacherIdLabel = new JLabel("Teacher ID");
        setCustomFont4(teacherIdLabel);
        teacherIdLabel.setBounds(teacherIdX,teacherIdY,200,18);

        JTextField teacherIdTextField = new JTextField();
        teacherIdTextField.setBounds(teacherIdX,teacherIdY+20,300,40);

        //green Panel
        int greenPanelX = 110; int greenPanelY = 250;
        int greenPanelWidth = 300; int greenPanelHeight = 50;

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(36, 248, 108));
        greenPanel.setBounds(greenPanelX,greenPanelY,greenPanelWidth,greenPanelHeight);
        greenPanel.setLayout(null);

        JLabel displayGreenLabel = new JLabel("Remove");
        setCustomFont3(displayGreenLabel);
        displayGreenLabel.setBounds(100,16,300,20);

        yellowPanel.add(addTeacherYellowLabel);
        greenPanel.add(displayGreenLabel);
        outerPanel.add(yellowPanel);
        outerPanel.add(teacherIdLabel);
        outerPanel.add(teacherIdTextField);
        outerPanel.add(greenPanel);

        return outerPanel;
    }

    //display Panels
    public static JPanel displayPanel()
    {
        int x = homeButtonWidth() + 550; int y = 380;
        int width = 500; int height = 350;      

        //bigger frame
        JPanel otuerPanelFrame = new JPanel();
        otuerPanelFrame.setLayout(null);
        otuerPanelFrame.setVisible(true);
        otuerPanelFrame.setBackground(new Color(27, 35, 54));
        otuerPanelFrame.setBounds(0,0,1920,1080);

        //create the main outer panel
        JPanel outerPanel = new JPanel();
        outerPanel.setLayout(null);
        outerPanel.setVisible(true);
        outerPanel.setBackground(new Color(58, 53, 81));
        outerPanel.setBounds(x,y,width,height);
        
        //create the yellow panel
        int yellowPanelX = 105; int yellowPanelY = 40;
        int yellowPanelWidth = 300; int yellowPanelHeight = 50;

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(new Color(255, 222, 89));
        yellowPanel.setBounds(yellowPanelX,yellowPanelY,yellowPanelWidth,yellowPanelHeight);
        yellowPanel.setLayout(null);

        JLabel addTeacherYellowLabel = new JLabel("Display Info");
        setCustomFont3(addTeacherYellowLabel);
        addTeacherYellowLabel.setBounds(70,18,250,20);

        //Teacher ID
        int teacherIdX = 110; int teacherIdY = 130;

        JLabel teacherIdLabel = new JLabel("Teacher ID");
        setCustomFont4(teacherIdLabel);
        teacherIdLabel.setBounds(teacherIdX,teacherIdY,200,18);

        JTextField teacherIdTextField = new JTextField();
        teacherIdTextField.setBounds(teacherIdX,teacherIdY+20,300,40);
    
        //green display Button
        int displayButtonX =  110; int displayButtonY = 230;
        int displayButtonWidth = 300; int displayButtonHeight = 50;

        JButton displayButton = new JButton("Display");
        displayButton.setBackground(new Color(193, 255, 114));
        displayButton.setBounds(displayButtonX,displayButtonY,displayButtonWidth,displayButtonHeight);
        displayButton.setFont(new Font("Arial", Font.BOLD, 18));

        yellowPanel.add(addTeacherYellowLabel);
        outerPanel.add(displayButton);
        outerPanel.add(yellowPanel);
        outerPanel.add(teacherIdLabel);
        outerPanel.add(teacherIdTextField);
        otuerPanelFrame.add(outerPanel);

        //-----------------------lecturer info panel starts---------------------
        int x2 = homeButtonWidth() + 250; int y2 = 200;
        int width1 = 1300; int height1 = 750;      

        //create the main outer panel
        JPanel outerPanel1 = new JPanel();
        outerPanel1.setLayout(null);
        outerPanel1.setVisible(false);
        outerPanel1.setBackground(new Color(58, 53, 81));
        outerPanel1.setBounds(x2,y2,width1,height1);
        
        //create the yellow panel
        int yellowPanelX1 = 350; int yellowPanelY1 = 40;
        int yellowPanelWidth1 = 600; int yellowPanelHeight1 = 50;

        JPanel yellowPanel1 = new JPanel();
        yellowPanel1.setBackground(new Color(255, 222, 89));
        yellowPanel1.setBounds(yellowPanelX1,yellowPanelY1,yellowPanelWidth1,yellowPanelHeight1);
        yellowPanel1.setLayout(null);

        JLabel addTeacherYellowLabel1 = new JLabel("Lecturer Info");
        setCustomFont3(addTeacherYellowLabel1);
        addTeacherYellowLabel1.setBounds(220,18,200,20);
        
        //teacher ID
        int teacherIdX1 = 500; int teacherIdY1 = 140;        

        JLabel teacherIDLabel = new JLabel("Teacher ID");
        setCustomFont4(teacherIDLabel);
        teacherIDLabel.setBounds(teacherIdX1+80,teacherIdY1,200,18);

        JTextField teacherIdTextField1 = new JTextField();
        teacherIdTextField1.setBounds(teacherIdX1,teacherIdY1+20,300,40);

        //teacher Name
        int teacherNameX = 250; int teacherNameY = 240;

        JLabel teacherNameLabel = new JLabel("Teacher Name");
        setCustomFont4(teacherNameLabel);
        teacherNameLabel.setBounds(teacherNameX,teacherNameY,200,18);

        JTextField teacherNameTextField = new JTextField();
        teacherNameTextField.setBounds(teacherNameX,teacherNameY + 20,300,40);

        //Address
        int teacherAddressX = 250; int teacherAddressY = 340;

        JLabel teacherAddressLabel = new JLabel("Teacher Address");
        setCustomFont4(teacherAddressLabel);
        teacherAddressLabel.setBounds(teacherAddressX,teacherAddressY,200,18);

        JTextField teacherAddressTextField = new JTextField();
        teacherAddressTextField.setBounds(teacherAddressX,teacherAddressY + 20,300,40);

        //Employment Status
        int teacherEmploymentStatusX = 250; int teacherEmploymentStatusY = 440;

        JLabel teacherEmploymentStatusLabel = new JLabel("Employment Status");
        setCustomFont4(teacherEmploymentStatusLabel);
        teacherEmploymentStatusLabel.setBounds(teacherEmploymentStatusX,teacherEmploymentStatusY,200,18);

        JTextField teacherEmploymentStatusTextField = new JTextField();
        teacherEmploymentStatusTextField.setBounds(teacherEmploymentStatusX,teacherEmploymentStatusY + 20,300,40);

        //working Type
        int teacherWorkingTypeX = teacherNameX+500; int teacherWorkingTypeY = teacherNameY;

        JLabel teacherWorkingTypeLabel = new JLabel("Working Type");
        setCustomFont4(teacherWorkingTypeLabel);
        teacherWorkingTypeLabel.setBounds(teacherWorkingTypeX,teacherWorkingTypeY,200,18);

        JTextField teacherWorkingTypeTextField = new JTextField();
        teacherWorkingTypeTextField.setBounds(teacherWorkingTypeX,teacherWorkingTypeY + 20,300,40);

        //Graded Score
        int teacherGradedScoreX = teacherNameX+500; int teacherGradedScoreY = teacherAddressY;

        JLabel teacherGradedScoreLabel = new JLabel("Graded Score");
        setCustomFont4(teacherGradedScoreLabel);
        teacherGradedScoreLabel.setBounds(teacherGradedScoreX,teacherGradedScoreY,200,18);

        JTextField teacherGradedScoreTextField = new JTextField();
        teacherGradedScoreTextField.setBounds(teacherGradedScoreX,teacherGradedScoreY + 20,300,40);

        //Years of Experience
        int teacherYearsOfExperienceX = teacherAddressX+500; int teacherYearsOfExperienceY = teacherEmploymentStatusY;

        JLabel teacherYearsOfExperienceLabel = new JLabel("Years Of Experience");
        setCustomFont4(teacherYearsOfExperienceLabel);
        teacherYearsOfExperienceLabel.setBounds(teacherYearsOfExperienceX,teacherYearsOfExperienceY,250,18);

        JTextField teacherYearsOfExperienceTextField = new JTextField();
        teacherYearsOfExperienceTextField.setBounds(teacherYearsOfExperienceX,teacherYearsOfExperienceY + 20,300,40);

        //Working Hours
        int teacherWorkingHoursX = teacherEmploymentStatusX+500; int teacherWorkingHoursY = teacherEmploymentStatusY+100;

        JLabel teacherWorkingHoursLabel = new JLabel("Working Hours");
        setCustomFont4(teacherWorkingHoursLabel);
        teacherWorkingHoursLabel.setBounds(teacherWorkingHoursX,teacherWorkingHoursY,200,18);

        JTextField teacherWorkingHoursTextField = new JTextField();
        teacherWorkingHoursTextField.setBounds(teacherWorkingHoursX,teacherWorkingHoursY + 20,300,40);

        //department
        int teacherDepartmentX = teacherEmploymentStatusX; int teacherDepartmentY = teacherEmploymentStatusY+100;

        JLabel teacherDepartmentLabel = new JLabel("Department");
        setCustomFont4(teacherDepartmentLabel);
        teacherDepartmentLabel.setBounds(teacherDepartmentX,teacherDepartmentY,200,18);

        JTextField teacherDepartmentTextField = new JTextField();
        teacherDepartmentTextField.setBounds(teacherDepartmentX,teacherDepartmentY + 20,300,40);

        //gray back Button
        int backButtonX = teacherDepartmentX + 250; int backButtonY = 640;
        int clearButtonWidth = 300; int clearButtonHeight = 50;

        JButton backButton = new JButton("Back");
        backButton.setBackground(new Color(224, 227, 233));
        backButton.setBounds(backButtonX,backButtonY,clearButtonWidth,clearButtonHeight);
        backButton.setFont(new Font("Arial", Font.BOLD, 18));

        //logic for back Button
        backButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                // Change the label color to white when the cursor enters the panel
                backButton.setFont(new Font("Arial", Font.BOLD, 22));
                backButton.setForeground(new Color(27, 35, 54));
                backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                // Change the label color back to the original color when the cursor exits the panel
                backButton.setFont(new Font("Arial", Font.BOLD, 18));
                backButton.setForeground(new Color(27, 35, 54));
                backButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                backButton.setBackground(new Color(224, 227, 233));
            }

            public void mouseClicked(MouseEvent e){
                //mouse on click event
                outerPanel1.setVisible(false);
                outerPanel.setVisible(true);
            }
        });
  
        yellowPanel1.add(addTeacherYellowLabel1);
        outerPanel1.add(backButton);
        outerPanel1.add(yellowPanel1);
        outerPanel1.add(teacherIDLabel);
        outerPanel1.add(teacherIdTextField1);
        outerPanel1.add(teacherNameLabel);
        outerPanel1.add(teacherNameTextField);
        outerPanel1.add(teacherAddressLabel);
        outerPanel1.add(teacherAddressTextField);
        outerPanel1.add(teacherEmploymentStatusLabel);
        outerPanel1.add(teacherEmploymentStatusTextField);
        outerPanel1.add(teacherWorkingTypeLabel);
        outerPanel1.add(teacherWorkingTypeTextField);
        outerPanel1.add(teacherGradedScoreLabel);
        outerPanel1.add(teacherGradedScoreTextField);
        outerPanel1.add(teacherYearsOfExperienceLabel);
        outerPanel1.add(teacherYearsOfExperienceTextField);
        outerPanel1.add(teacherWorkingHoursLabel);
        outerPanel1.add(teacherWorkingHoursTextField);
        outerPanel1.add(teacherDepartmentLabel);
        outerPanel1.add(teacherDepartmentTextField);
        otuerPanelFrame.add(outerPanel1);

        //-----------------------lecturer info panel ends---------------------

         //logic for display Button
         displayButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                // Change the label color to white when the cursor enters the panel
                displayButton.setFont(new Font("Arial", Font.BOLD, 22));
                displayButton.setForeground(new Color(27, 35, 54));
                displayButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                // Change the label color back to the original color when the cursor exits the panel
                displayButton.setFont(new Font("Arial", Font.BOLD, 18));
                displayButton.setForeground(new Color(27, 35, 54));
                displayButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                displayButton.setBackground(new Color(193, 255, 114)); //change color of the display button to the previous color
            }

            public void mouseClicked(MouseEvent e){
                //mouse on click event
                System.out.println("mouse button is clicked");
                // logic
                int teacherIdValue = Integer.parseInt(teacherIdTextField.getText());
                int isUserEnteredTeacherIdValid = displayButtonLogic(teacherIdValue);

                if (isUserEnteredTeacherIdValid != -1){
                    outerPanel1.setVisible(true);
                    outerPanel.setVisible(false);

                    //if the teacherId entered is that of the lecturer, then this get the text and display it 
                    for (Teacher element : teacherInfoArrayList){
                        Lecturer each = (Lecturer) element;
                        if (each instanceof Lecturer){
                            if (teacherIdValue == each.getTeacherId()){
                                teacherIdTextField1.setText(String.valueOf(each.getTeacherId()));
                                teacherNameTextField.setText(String.valueOf(each.getTeacherName()));
                                teacherAddressTextField.setText(String.valueOf(each.getAddress()));
                                teacherEmploymentStatusTextField.setText(String.valueOf(each.getEmploymentStatus()));
                                teacherDepartmentTextField.setText(String.valueOf(each.getDepartment()));
                                teacherWorkingTypeTextField.setText(String.valueOf(each.getWorkingType()));
                                teacherGradedScoreTextField.setText(String.valueOf(each.getGradedScore()));
                                teacherYearsOfExperienceTextField.setText(String.valueOf(each.getYearsOfExperience()));
                                teacherWorkingHoursTextField.setText(String.valueOf(each.getWorkingHours()));
                            }

                        }
                    }
                }
            }
        });



        return otuerPanelFrame;
    }

    // public static JPanel displayPanelLecturerInfo(JPanel upperOuterPanel)
    // {
    //     int x = homeButtonWidth() + 250; int y = 200;
    //     int width = 1300; int height = 750;      

    //     //create the main outer panel
    //     JPanel outerPanel = new JPanel();
    //     outerPanel.setLayout(null);
    //     outerPanel.setVisible(true);
    //     outerPanel.setBackground(new Color(58, 53, 81));
    //     outerPanel.setBounds(x,y,width,height);
        
    //     //create the yellow panel
    //     int yellowPanelX = 350; int yellowPanelY = 40;
    //     int yellowPanelWidth = 600; int yellowPanelHeight = 50;

    //     JPanel yellowPanel = new JPanel();
    //     yellowPanel.setBackground(new Color(255, 222, 89));
    //     yellowPanel.setBounds(yellowPanelX,yellowPanelY,yellowPanelWidth,yellowPanelHeight);
    //     yellowPanel.setLayout(null);

    //     JLabel addTeacherYellowLabel = new JLabel("Lecturer Info");
    //     setCustomFont3(addTeacherYellowLabel);
    //     addTeacherYellowLabel.setBounds(220,18,200,20);
        
    //     //teacher ID
    //     int teacherIdX = 500; int teacherIdY = 140;        

    //     JLabel teacherIDLabel = new JLabel("Teacher ID");
    //     setCustomFont4(teacherIDLabel);
    //     teacherIDLabel.setBounds(teacherIdX+80,teacherIdY,200,18);

    //     JTextField teacherIdTextField = new JTextField();
    //     teacherIdTextField.setBounds(teacherIdX,teacherIdY+20,300,40);

    //     //teacher Name
    //     int teacherNameX = 250; int teacherNameY = 240;

    //     JLabel teacherNameLabel = new JLabel("Teacher Name");
    //     setCustomFont4(teacherNameLabel);
    //     teacherNameLabel.setBounds(teacherNameX,teacherNameY,200,18);

    //     JTextField teacherNameTextField = new JTextField();
    //     teacherNameTextField.setBounds(teacherNameX,teacherNameY + 20,300,40);

    //     //Address
    //     int teacherAddressX = 250; int teacherAddressY = 340;

    //     JLabel teacherAddressLabel = new JLabel("Teacher Address");
    //     setCustomFont4(teacherAddressLabel);
    //     teacherAddressLabel.setBounds(teacherAddressX,teacherAddressY,200,18);

    //     JTextField teacherAddressTextField = new JTextField();
    //     teacherAddressTextField.setBounds(teacherAddressX,teacherAddressY + 20,300,40);

    //     //Employment Status
    //     int teacherEmploymentStatusX = 250; int teacherEmploymentStatusY = 440;

    //     JLabel teacherEmploymentStatusLabel = new JLabel("Employment Status");
    //     setCustomFont4(teacherEmploymentStatusLabel);
    //     teacherEmploymentStatusLabel.setBounds(teacherEmploymentStatusX,teacherEmploymentStatusY,200,18);

    //     JTextField teacherEmploymentStatusTextField = new JTextField();
    //     teacherEmploymentStatusTextField.setBounds(teacherEmploymentStatusX,teacherEmploymentStatusY + 20,300,40);

    //     //working Type
    //     int teacherWorkingTypeX = teacherNameX+500; int teacherWorkingTypeY = teacherNameY;

    //     JLabel teacherWorkingTypeLabel = new JLabel("Working Type");
    //     setCustomFont4(teacherWorkingTypeLabel);
    //     teacherWorkingTypeLabel.setBounds(teacherWorkingTypeX,teacherWorkingTypeY,200,18);

    //     JTextField teacherWorkingTypeYTextField = new JTextField();
    //     teacherWorkingTypeYTextField.setBounds(teacherWorkingTypeX,teacherWorkingTypeY + 20,300,40);

    //     //Graded Score
    //     int teacherGradedScoreX = teacherNameX+500; int teacherGradedScoreY = teacherAddressY;

    //     JLabel teacherGradedScoreLabel = new JLabel("Graded Score");
    //     setCustomFont4(teacherGradedScoreLabel);
    //     teacherGradedScoreLabel.setBounds(teacherGradedScoreX,teacherGradedScoreY,200,18);

    //     JTextField teacherGradedScoreTextField = new JTextField();
    //     teacherGradedScoreTextField.setBounds(teacherGradedScoreX,teacherGradedScoreY + 20,300,40);

    //     //Years of Experience
    //     int teacherYearsOfExperienceX = teacherAddressX+500; int teacherYearsOfExperienceY = teacherEmploymentStatusY;

    //     JLabel teacherYearsOfExperienceLabel = new JLabel("Years Of Experience");
    //     setCustomFont4(teacherYearsOfExperienceLabel);
    //     teacherYearsOfExperienceLabel.setBounds(teacherYearsOfExperienceX,teacherYearsOfExperienceY,250,18);

    //     JTextField teacherYearsOfExperienceTextField = new JTextField();
    //     teacherYearsOfExperienceTextField.setBounds(teacherYearsOfExperienceX,teacherYearsOfExperienceY + 20,300,40);

    //     //Working Hours
    //     int teacherWorkingHoursX = teacherEmploymentStatusX+500; int teacherWorkingHoursY = teacherEmploymentStatusY+100;

    //     JLabel teacherWorkingHoursLabel = new JLabel("Working Hours");
    //     setCustomFont4(teacherWorkingHoursLabel);
    //     teacherWorkingHoursLabel.setBounds(teacherWorkingHoursX,teacherWorkingHoursY,200,18);

    //     JTextField teacherWorkingHoursTextField = new JTextField();
    //     teacherWorkingHoursTextField.setBounds(teacherWorkingHoursX,teacherWorkingHoursY + 20,300,40);

    //     //department
    //     int teacherDepartmentX = teacherEmploymentStatusX; int teacherDepartmentY = teacherEmploymentStatusY+100;

    //     JLabel teacherDepartmentLabel = new JLabel("Department");
    //     setCustomFont4(teacherDepartmentLabel);
    //     teacherDepartmentLabel.setBounds(teacherDepartmentX,teacherDepartmentY,200,18);

    //     JTextField teacherDepartmentTextField = new JTextField();
    //     teacherDepartmentTextField.setBounds(teacherDepartmentX,teacherDepartmentY + 20,300,40);

    //     //gray back Button
    //     int backButtonX = teacherDepartmentX + 250; int backButtonY = 640;
    //     int clearButtonWidth = 300; int clearButtonHeight = 50;

    //     JButton backButton = new JButton("Back");
    //     backButton.setBackground(new Color(224, 227, 233));
    //     backButton.setBounds(backButtonX,backButtonY,clearButtonWidth,clearButtonHeight);
    //     backButton.setFont(new Font("Arial", Font.BOLD, 18));

    //     //logic for back Button
    //     backButton.addMouseListener(new MouseAdapter() {
    //         public void mouseEntered(MouseEvent e) {
    //             // Change the label color to white when the cursor enters the panel
    //             backButton.setFont(new Font("Arial", Font.BOLD, 22));
    //             backButton.setForeground(new Color(27, 35, 54));
    //             backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    //         }

    //         public void mouseExited(MouseEvent e) {
    //             // Change the label color back to the original color when the cursor exits the panel
    //             backButton.setFont(new Font("Arial", Font.BOLD, 18));
    //             backButton.setForeground(new Color(27, 35, 54));
    //             backButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    //             backButton.setBackground(new Color(224, 227, 233));
    //         }

    //         public void mouseClicked(MouseEvent e){
    //             //mouse on click event
    //             outerPanel.setVisible(false);
    //             upperOuterPanel.setVisible(true);
    //         }
    //     });
  
    //     yellowPanel.add(addTeacherYellowLabel);
    //     outerPanel.add(backButton);
    //     outerPanel.add(yellowPanel);
    //     outerPanel.add(teacherIDLabel);
    //     outerPanel.add(teacherIdTextField);
    //     outerPanel.add(teacherNameLabel);
    //     outerPanel.add(teacherNameTextField);
    //     outerPanel.add(teacherAddressLabel);
    //     outerPanel.add(teacherAddressTextField);
    //     outerPanel.add(teacherEmploymentStatusLabel);
    //     outerPanel.add(teacherEmploymentStatusTextField);
    //     outerPanel.add(teacherWorkingTypeLabel);
    //     outerPanel.add(teacherWorkingTypeYTextField);
    //     outerPanel.add(teacherGradedScoreLabel);
    //     outerPanel.add(teacherGradedScoreTextField);
    //     outerPanel.add(teacherYearsOfExperienceLabel);
    //     outerPanel.add(teacherYearsOfExperienceTextField);
    //     outerPanel.add(teacherWorkingHoursLabel);
    //     outerPanel.add(teacherWorkingHoursTextField);
    //     outerPanel.add(teacherDepartmentLabel);
    //     outerPanel.add(teacherDepartmentTextField);
    //     return outerPanel;
    // }


    //This only checks if the tteacher id entered exists in the arrayList or not.
    static int displayButtonLogic(int userEnteredTeacherId)
    {
        String teacherIdFound = "no";
        for (Teacher each : teacherInfoArrayList){
            if (each.getTeacherId() == userEnteredTeacherId){
                teacherIdFound = "yes";
            }        
        }
        if (teacherIdFound == "no"){
            String warningMessage = "The Teacher ID you have entered does not exist.";
            JOptionPane.showMessageDialog(null, warningMessage, "WARNING", JOptionPane.WARNING_MESSAGE);    
        }
        else{
            return userEnteredTeacherId;
        }
        return -1;
    }

    //logical methods
    static String shouldAddToArrayListFromLecturer(String isAvalidNumber, int teacherId,String teacherName,String address, String workingType, String employmentStatus, String department){
        String shouldAddToArrayListFromLecturer = "no";

        String isValid1 = "no";
        String isValid2 = "no";
        String isValid3 = "yes";

        if (teacherName != "" || address != "" || workingType != "" || employmentStatus != "" && department != ""){
            System.out.println("None of the String Text Field are empty");  
            isValid1 = "yes";
        }
        if (isAvalidNumber == "yes"){
            System.out.println("input in the number text field are valid");
            isValid2 = "yes";
        }

        for(Teacher teacherinfo : teacherInfoArrayList){
            if (teacherinfo.getTeacherId() == teacherId){
                isValid3 = "no";
            }
        }
        if (isValid1 == "yes" && isValid2 == "yes" && isValid3 == "yes"){
            shouldAddToArrayListFromLecturer = "yes";
        }
        else{
            if (isValid3 == "no"){
                String warningMessage = "The teacher id that you entered already exists.\n Please enter some other teacherID";
            JOptionPane.showMessageDialog(null, warningMessage, "WARNING", JOptionPane.WARNING_MESSAGE);    
            }
            else{
                String warningMessage = "Please make sure that you have only entered numbers in\n'TeacherID' or 'Years of Experience' or 'Working Hours' or 'Graded Score'. \n Also ensure that none of the text field are empty!";
                JOptionPane.showMessageDialog(null, warningMessage, "WARNING", JOptionPane.WARNING_MESSAGE);
            }
        }

        return shouldAddToArrayListFromLecturer;
    }

}