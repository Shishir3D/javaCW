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
    public static void setDisplayStyle(JTextField textFieldd){
        textFieldd.setFont(new Font("Arial", Font.BOLD, 25));
        textFieldd.setBackground(new Color(58, 53, 81));
        textFieldd.setForeground(Color.white);
        textFieldd.setEditable(false);
    }
    public static void minusLine()
    {
        System.out.println("-------------------------------------------------------------------------");
    }
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
        Font customFont = new Font("Comic Sans MS", Font.PLAIN, 40);
        label.setForeground(Color.white);
        label.setFont(customFont); 
        return label;
    }
    public static JLabel setCustomFont2(JLabel label)
    {
        Font customFont2 = new Font("Cascadia Code", Font.BOLD, 16);
        label.setForeground(new Color(217, 217, 217));
        label.setFont(customFont2); 
        return label;
    }
    public static JLabel setCustomFont3(JLabel label)
    {
        Font customFont3 = new Font("Comic Sans Ms", Font.BOLD, 22);
        label.setForeground(new Color(27, 35, 54));
        label.setFont(customFont3); 
        return label;
    }
    public static JLabel setCustomFont4(JLabel label)
    {
        Font customFont4 = new Font("Cascadia Code", Font.BOLD, 18);
        label.setForeground(new Color(224, 227, 233));
        label.setFont(customFont4); 
        return label;
    }
    public static JLabel setCustomFont5(JLabel label)
    {
        Font customFont5 = new Font("Cascadia Code", Font.BOLD, 36);
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

        Font customFont = new Font("Comic Sans MS", Font.BOLD, 40);
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
        teacherIdTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //teacher Name
        int teacherNameX = 250; int teacherNameY = 240;

        JLabel teacherNameLabel = new JLabel("Teacher Name");
        setCustomFont4(teacherNameLabel);
        teacherNameLabel.setBounds(teacherNameX,teacherNameY,200,18);

        JTextField teacherNameTextField = new JTextField();
        teacherNameTextField.setBounds(teacherNameX,teacherNameY + 20,300,40);
        teacherNameTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //Address
        int teacherAddressX = 250; int teacherAddressY = 340;

        JLabel teacherAddressLabel = new JLabel("Teacher Address");
        setCustomFont4(teacherAddressLabel);
        teacherAddressLabel.setBounds(teacherAddressX,teacherAddressY,200,18);

        JTextField teacherAddressTextField = new JTextField();
        teacherAddressTextField.setBounds(teacherAddressX,teacherAddressY + 20,300,40);
        teacherAddressTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //Employment Status
        int teacherEmploymentStatusX = 250; int teacherEmploymentStatusY = 440;

        JLabel teacherEmploymentStatusLabel = new JLabel("Employment Status");
        setCustomFont4(teacherEmploymentStatusLabel);
        teacherEmploymentStatusLabel.setBounds(teacherEmploymentStatusX,teacherEmploymentStatusY,200,18);

        JTextField teacherEmploymentStatusTextField = new JTextField();
        teacherEmploymentStatusTextField.setBounds(teacherEmploymentStatusX,teacherEmploymentStatusY + 20,300,40);
        teacherEmploymentStatusTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //working Type
        int teacherWorkingTypeX = teacherNameX+500; int teacherWorkingTypeY = teacherNameY;

        JLabel teacherWorkingTypeLabel = new JLabel("Working Type");
        setCustomFont4(teacherWorkingTypeLabel);
        teacherWorkingTypeLabel.setBounds(teacherWorkingTypeX,teacherWorkingTypeY,200,18);

        JTextField teacherWorkingTypeYTextField = new JTextField();
        teacherWorkingTypeYTextField.setBounds(teacherWorkingTypeX,teacherWorkingTypeY + 20,300,40);
        teacherWorkingTypeYTextField.setFont(new Font("Arial", Font.BOLD, 25));


        //Graded Score
        int teacherGradedScoreX = teacherNameX+500; int teacherGradedScoreY = teacherAddressY;

        JLabel teacherGradedScoreLabel = new JLabel("Graded Score");
        setCustomFont4(teacherGradedScoreLabel);
        teacherGradedScoreLabel.setBounds(teacherGradedScoreX,teacherGradedScoreY,200,18);

        JTextField teacherGradedScoreTextField = new JTextField();
        teacherGradedScoreTextField.setBounds(teacherGradedScoreX,teacherGradedScoreY + 20,300,40);
        teacherGradedScoreTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //Years of Experience
        int teacherYearsOfExperienceX = teacherAddressX+500; int teacherYearsOfExperienceY = teacherEmploymentStatusY;

        JLabel teacherYearsOfExperienceLabel = new JLabel("Years Of Experience");
        setCustomFont4(teacherYearsOfExperienceLabel);
        teacherYearsOfExperienceLabel.setBounds(teacherYearsOfExperienceX,teacherYearsOfExperienceY,250,18);

        JTextField teacherYearsOfExperienceTextField = new JTextField();
        teacherYearsOfExperienceTextField.setBounds(teacherYearsOfExperienceX,teacherYearsOfExperienceY + 20,300,40);
        teacherYearsOfExperienceTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //Working Hours
        int teacherWorkingHoursX = teacherEmploymentStatusX+500; int teacherWorkingHoursY = teacherEmploymentStatusY+100;

        JLabel teacherWorkingHoursLabel = new JLabel("Working Hours");
        setCustomFont4(teacherWorkingHoursLabel);
        teacherWorkingHoursLabel.setBounds(teacherWorkingHoursX,teacherWorkingHoursY,200,18);

        JTextField teacherWorkingHoursTextField = new JTextField();
        teacherWorkingHoursTextField.setBounds(teacherWorkingHoursX,teacherWorkingHoursY + 20,300,40);
        teacherWorkingHoursTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //department
        int teacherDepartmentX = teacherEmploymentStatusX; int teacherDepartmentY = teacherEmploymentStatusY+100;

        JLabel teacherDepartmentLabel = new JLabel("Department");
        setCustomFont4(teacherDepartmentLabel);
        teacherDepartmentLabel.setBounds(teacherDepartmentX,teacherDepartmentY,200,18);

        JTextField teacherDepartmentTextField = new JTextField();
        teacherDepartmentTextField.setBounds(teacherDepartmentX,teacherDepartmentY + 20,300,40);
        teacherDepartmentTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //green add Button
        int addButtonPanelX = teacherDepartmentX; int addButtonPanelY = 640;
        int addButtonPanelWidth = 300; int addButtonPanelHeight = 50;

        JButton addButton = new JButton("ADD");
        addButton.setBackground(new Color(193, 255, 114));
        addButton.setBounds(addButtonPanelX,addButtonPanelY,addButtonPanelWidth,addButtonPanelHeight);
        addButton.setFont(new Font("Arial", Font.BOLD, 18));
        addButton.setForeground(new Color(27, 35, 54));

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

                // for (Teacher  each : teacherInfoArrayList){
                //     Lecturer downCastedObject = (Lecturer) each;
                //     System.out.println("The graded score is : " + downCastedObject.getGradedScore());
                // }

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
        teacherIdTextField.setFont(new Font("Arial", Font.BOLD, 25));


        //teacher Name
        int teacherNameX = 250; int teacherNameY = 240;

        JLabel teacherNameLabel = new JLabel("Teacher Name");
        setCustomFont4(teacherNameLabel);
        teacherNameLabel.setBounds(teacherNameX,teacherNameY,200,18);

        JTextField teacherNameTextField = new JTextField();
        teacherNameTextField.setBounds(teacherNameX,teacherNameY + 20,300,40);
        teacherNameTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //Address
        int teacherAddressX = 250; int teacherAddressY = 340;

        JLabel teacherAddressLabel = new JLabel("Teacher Address");
        setCustomFont4(teacherAddressLabel);
        teacherAddressLabel.setBounds(teacherAddressX,teacherAddressY,200,18);

        JTextField teacherAddressTextField = new JTextField();
        teacherAddressTextField.setBounds(teacherAddressX,teacherAddressY + 20,300,40);
        teacherAddressTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //Employment Status
        int teacherEmploymentStatusX = 250; int teacherEmploymentStatusY = 440;

        JLabel teacherEmploymentStatusLabel = new JLabel("Employment Status");
        setCustomFont4(teacherEmploymentStatusLabel);
        teacherEmploymentStatusLabel.setBounds(teacherEmploymentStatusX,teacherEmploymentStatusY,200,18);

        JTextField teacherEmploymentStatusTextField = new JTextField();
        teacherEmploymentStatusTextField.setBounds(teacherEmploymentStatusX,teacherEmploymentStatusY + 20,300,40);
        teacherEmploymentStatusTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //Academic qualification
        int teacherAcademicQualificationX = 250; int teacherAcademicQualificationY = 540;

        JLabel teacherAcademicQualificationLabel = new JLabel("Academic Qualification");
        setCustomFont4(teacherAcademicQualificationLabel);
        teacherAcademicQualificationLabel.setBounds(teacherAcademicQualificationX,teacherAcademicQualificationY,250,18);

        JTextField teacherAcademicQualificationTextField = new JTextField();
        teacherAcademicQualificationTextField.setBounds(teacherAcademicQualificationX,teacherAcademicQualificationY + 20,300,40);
        teacherAcademicQualificationTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //working Type
        int teacherWorkingTypeX = teacherIdX+500; int teacherWorkingTypeY = teacherIdY;

        JLabel teacherWorkingTypeLabel = new JLabel("Working Type");
        setCustomFont4(teacherWorkingTypeLabel);
        teacherWorkingTypeLabel.setBounds(teacherWorkingTypeX,teacherWorkingTypeY,200,18);

        JTextField teacherWorkingTypeYTextField = new JTextField();
        teacherWorkingTypeYTextField.setBounds(teacherWorkingTypeX,teacherIdY + 20,300,40);
        teacherWorkingTypeYTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //Salary
        int teacherSalaryX = teacherNameX+500; int teacherSalaryY = teacherNameY;

        JLabel teacherSalaryLabel = new JLabel("Salary");
        setCustomFont4(teacherSalaryLabel);
        teacherSalaryLabel.setBounds(teacherSalaryX,teacherSalaryY,200,18);

        JTextField teacherSalaryTextField = new JTextField();
        teacherSalaryTextField.setBounds(teacherSalaryX,teacherSalaryY + 20,300,40);
        teacherSalaryTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //Specialization
        int teacherSpecializationX = teacherAddressX+500; int teacherSpecializationY = teacherAddressY;

        JLabel teacherSpecializationLabel = new JLabel("Specialization");
        setCustomFont4(teacherSpecializationLabel);
        teacherSpecializationLabel.setBounds(teacherSpecializationX,teacherSpecializationY,200,18);

        JTextField teacherSpecializationTextField = new JTextField();
        teacherSpecializationTextField.setBounds(teacherSpecializationX,teacherSpecializationY + 20,300,40);
        teacherSpecializationTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //Working Hours
        int teacherWorkingHoursX = teacherEmploymentStatusX+500; int teacherWorkingHoursY = teacherEmploymentStatusY;

        JLabel teacherWorkingHoursLabel = new JLabel("Working Hours");
        setCustomFont4(teacherWorkingHoursLabel);
        teacherWorkingHoursLabel.setBounds(teacherWorkingHoursX,teacherWorkingHoursY,200,18);

        JTextField teacherWorkingHoursTextField = new JTextField();
        teacherWorkingHoursTextField.setBounds(teacherWorkingHoursX,teacherWorkingHoursY + 20,300,40);
        teacherWorkingHoursTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //Performance Index
        int teacherPerformanceIndexX = teacherAcademicQualificationX+500; int teacherPerformanceIndexY = teacherAcademicQualificationY;

        JLabel teacherPerformanceIndexLabel = new JLabel("Performance Index");
        setCustomFont4(teacherPerformanceIndexLabel);
        teacherPerformanceIndexLabel.setBounds(teacherPerformanceIndexX,teacherPerformanceIndexY,200,18);

        JTextField teacherPerformanceIndexTextField = new JTextField();
        teacherPerformanceIndexTextField.setBounds(teacherPerformanceIndexX,teacherPerformanceIndexY + 20,300,40);
        teacherPerformanceIndexTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //green add Button
        int addButtonPanelX = teacherEmploymentStatusX; int addButtonPanelY = 640;
        int addButtonPanelWidth = 300; int addButtonPanelHeight = 50;

        JButton addButton = new JButton("ADD");
        addButton.setBackground(new Color(193, 255, 114));
        addButton.setBounds(addButtonPanelX,addButtonPanelY,addButtonPanelWidth,addButtonPanelHeight);
        addButton.setFont(new Font("Arial", Font.BOLD, 18));
        addButton.setForeground(new Color(27, 35, 54));

        //gray clear Button
        int clearButtonX = teacherWorkingHoursX; int clearButtonY = addButtonPanelY;
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
                String employmentStatus = teacherEmploymentStatusTextField.getText();
                String academicQualification = teacherAcademicQualificationTextField.getText();
                String workingType = teacherWorkingTypeYTextField.getText();
                Double salary = -1.0;
                String specialization = teacherSpecializationTextField.getText();
                int workingHours = -1;
                int performanceIndex = -1;
                
                try{
                    teacherId = Integer.parseInt(teacherIdTextField.getText());
                    salary = Double.parseDouble(teacherSalaryTextField.getText());
                    workingHours = Integer.parseInt(teacherWorkingHoursTextField.getText());
                    performanceIndex = Integer.parseInt(teacherPerformanceIndexTextField.getText());
                    
                    if (teacherId >= 0 && salary >= 0 && workingHours >= 0 && performanceIndex >= 0) {                        
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

                String shouldAddToArrayListFromTutor = shouldAddToArrayListFromTutor(isAvalidNumber,teacherId, teacherName, address, workingType, employmentStatus, workingHours, salary, specialization, academicQualification, performanceIndex);
                if (shouldAddToArrayListFromTutor == "yes"){
                    Tutor newTutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus, workingHours, salary, specialization, academicQualification, performanceIndex);
                    teacherInfoArrayList.add(newTutor);
                    JOptionPane.showMessageDialog(null, "The data that you entered has been sucessfully added!");               
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
                System.out.println("Tutor Clear Button is clicked");
                teacherIdTextField.setText("");
                teacherNameTextField.setText("");
                teacherAddressTextField.setText("");
                teacherWorkingTypeYTextField.setText("");
                teacherEmploymentStatusTextField.setText("");
                teacherSalaryTextField.setText("");
                teacherAcademicQualificationTextField.setText("");
                teacherWorkingHoursTextField.setText("");
                teacherSpecializationTextField.setText("");
                teacherPerformanceIndexTextField.setText("");
            }
        });

        yellowPanel.add(addTeacherYellowLabel);
        // greenPanel.add(displayGreenLabel);
        outerPanel.add(addButton);
        outerPanel.add(clearButton);
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
        outerPanel.add(teacherSalaryLabel);
        outerPanel.add(teacherSalaryTextField);
        outerPanel.add(teacherSpecializationLabel);
        outerPanel.add(teacherSpecializationTextField);
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
        addTeacherYellowLabel.setBounds(50,8,250,30);

        //teacher ID
        int teacherIDX = 160; int teacherIDY = 180;

        JLabel teaacherIdLabel = new JLabel("Teacher ID");
        setCustomFont4(teaacherIdLabel);
        teaacherIdLabel.setBounds(teacherIDX,teacherIDY,200,18);

        JTextField teacherIdTextField = new JTextField();
        teacherIdTextField.setBounds(teacherIDX,teacherIDY+20,300,40);
        teacherIdTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //graded score
        int gradedScoreX = 160; int gradedScoreY = 280;

        JLabel gradedScoreLabel = new JLabel("Graded Score");
        setCustomFont4(gradedScoreLabel);
        gradedScoreLabel.setBounds(gradedScoreX,gradedScoreY,200,18);

        JTextField gradedScoreTextField = new JTextField();
        gradedScoreTextField.setBounds(gradedScoreX,gradedScoreY+20,300,40);
        gradedScoreTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //department
        int departmentX = 160; int departmentY = 380;

        JLabel departmentLabel = new JLabel("Department");
        setCustomFont4(departmentLabel);
        departmentLabel.setBounds(departmentX,departmentY,200,18);

        JTextField departmentTextField = new JTextField();
        departmentTextField.setBounds(departmentX,departmentY+20,300,40);
        departmentTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //years of experience
        int yearsOfExperienceX = 160; int yearsOfExperienceY = 480;

        JLabel yearsOfExperienceLabel = new JLabel("Years Of Experience");
        setCustomFont4(yearsOfExperienceLabel);
        yearsOfExperienceLabel.setBounds(yearsOfExperienceX,yearsOfExperienceY,280,18);

        JTextField yearsOfExperienceTextField = new JTextField();
        yearsOfExperienceTextField.setBounds(yearsOfExperienceX,yearsOfExperienceY+20,300,40);
        yearsOfExperienceTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //green Panel
        int greenPanelX = 160; int greenPanelY = 600;
        int greenPanelWidth = 300; int greenPanelHeight = 50;

        JButton gradeItButton = new JButton("GRADE IT");
        gradeItButton.setBackground(new Color(193, 255, 114));
        gradeItButton.setBounds(greenPanelX,greenPanelY,greenPanelWidth,greenPanelHeight);
        gradeItButton.setFont(new Font("Arial", Font.BOLD, 18));
        gradeItButton.setForeground(new Color(27, 35, 54));

        gradeItButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                // Change the label color to white when the cursor enters the panel
                gradeItButton.setFont(new Font("Arial", Font.BOLD, 22));
                gradeItButton.setForeground(new Color(27, 35, 54));
    
                gradeItButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
    
            public void mouseExited(MouseEvent e) {
                // Change the label color back to the original color when the cursor exits the panel
                gradeItButton.setFont(new Font("Arial", Font.BOLD, 18));
                gradeItButton.setForeground(Color.BLACK);
                gradeItButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                gradeItButton.setBackground(new Color(193, 255, 114)); //change color of the green button to the previous color
            }
    
            public void mouseClicked(MouseEvent e){
               System.out.println("'GRADE IT' Button is clicked");
               int teacherIdI = -1;
               int gradedScoreI = -1;
               String departmentI = departmentTextField.getText();
               int yearsOfExperienceI = -1;
               try{  //makes sure that user enters a number   
                teacherIdI = Integer.parseInt(teacherIdTextField.getText());
                gradedScoreI = Integer.parseInt(gradedScoreTextField.getText());
                yearsOfExperienceI = Integer.parseInt(yearsOfExperienceTextField.getText());
               }
               catch (NumberFormatException numFormatErrorr){
                    JOptionPane.showMessageDialog(null, "Your Input is Invalid!!", "Error", JOptionPane.ERROR_MESSAGE);
               }

               if (teacherInfoArrayList.isEmpty()){ 
                    JOptionPane.showMessageDialog(null, "You have not added any lecturer or tutors!", "Empty", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    for (Teacher each : teacherInfoArrayList){
                        if (each instanceof Lecturer){
                            Lecturer eachLecturer = (Lecturer) each;
                            if (yearsOfExperienceI >= 5 && departmentI.equals(eachLecturer.getDepartment())){
                                JOptionPane.showMessageDialog(null, "Sucessfully Graded!!", "Sucessfully Graded", JOptionPane.INFORMATION_MESSAGE);
                                minusLine();
                                eachLecturer.gradeAssignment(gradedScoreI, departmentI, yearsOfExperienceI);
                                minusLine();
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Check you department and years of experience", "Could not Grade it", JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                }
            }
        });


        yellowPanel.add(addTeacherYellowLabel);
        outerPanel.add(yellowPanel);
        outerPanel.add(gradeItButton);
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
        addTeacherYellowLabel.setBounds(90,12,250,28);

        //Teacher ID
        int teacherIdX = 160; int teacherIdY = 180;

        JLabel teacherIdLabel = new JLabel("Teacher ID");
        setCustomFont4(teacherIdLabel);
        teacherIdLabel.setBounds(teacherIdX,teacherIdY,200,18);

        JTextField teacherIdTextField = new JTextField();
        teacherIdTextField.setBounds(teacherIdX,teacherIdY+20,300,40);
        teacherIdTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //new Salary
        int newSalaryX = 160; int newSalaryY = 280;

        JLabel newSalaryLabel = new JLabel("New Salary");
        setCustomFont4(newSalaryLabel);
        newSalaryLabel.setBounds(newSalaryX,newSalaryY,200,18);

        JTextField newSalaryTextField = new JTextField();
        newSalaryTextField.setBounds(newSalaryX,newSalaryY+20,300,40);
        newSalaryTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //performance Index
        int performanceIndexX = 160; int performanceIndexY = 380;

        JLabel performanceIndeLabel = new JLabel("Performance Index");
        setCustomFont4(performanceIndeLabel);
        performanceIndeLabel.setBounds(performanceIndexX,performanceIndexY,280,18);

        JTextField performanceIndexTextField = new JTextField();
        performanceIndexTextField.setBounds(performanceIndexX,performanceIndexY+20,300,40);
        performanceIndexTextField.setFont(new Font("Arial", Font.BOLD, 25));

        //green Set It Button
        int setItButtonPanelX = 160; int setItButtonPanelY = 500;
        int setItButtonPanelWidth = 300; int setItButtonPanelHeight = 50;

        JButton setItButton = new JButton("SET IT");
        setItButton.setBackground(new Color(193, 255, 114));
        setItButton.setBounds(setItButtonPanelX,setItButtonPanelY,setItButtonPanelWidth,setItButtonPanelHeight);
        setItButton.setFont(new Font("Arial", Font.BOLD, 18));
        setItButton.setForeground(new Color(27, 35, 54));

        setItButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                // Change the label color to white when the cursor enters the panel
                setItButton.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
                setItButton.setForeground(new Color(27, 35, 54));
                setItButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                // Change the label color back to the original color when the cursor exits the panel
                setItButton.setFont(new Font("Arial", Font.BOLD, 18));
                setItButton.setForeground(Color.BLACK);
                setItButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                setItButton.setBackground(new Color(193, 255, 114)); //change color of the green button to the previous color
            }

            public void mouseClicked(MouseEvent e){
                int teacherIdValue = -1;
                Double newSalaryValue = -1.0;
                int performanceIndexValue = -1;
                try{
                    teacherIdValue = Integer.parseInt(teacherIdTextField.getText());
                    newSalaryValue = Double.parseDouble(newSalaryTextField.getText());
                    performanceIndexValue = Integer.parseInt(performanceIndexTextField.getText());
                    int loopCounter = 0;
                    int tutorIndex = -1;
                    Teacher tutorWithNewSalary = null;
                    //checks if user entered value is Tutor or Lecturer
                    for (Teacher each : teacherInfoArrayList){
                        if (teacherIdValue == each.getTeacherId()){
                            if (!(each instanceof Tutor)){
                                JOptionPane.showMessageDialog(null, "There is no Tutor with that teacher ID.", "Not Tutor", JOptionPane.WARNING_MESSAGE);
                            }
                            else{ //this is valid when techer id entered is a tutor
                                Tutor newTutor = (Tutor) each;
                                newTutor.setSalaryAccordingToPerformance(newSalaryValue, performanceIndexValue);
                                tutorWithNewSalary = newTutor;
                                tutorIndex = loopCounter;
                                if (newTutor.getWorkingHours() < 21){
                                    JOptionPane.showMessageDialog(null, "The tutor's working hours should be more than 20.", "Working Hours Limit", JOptionPane.WARNING_MESSAGE);    
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "New Salary has been set according to the performance.", "Salary Changed", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
                        loopCounter = loopCounter + 1;
                    }
                    if (tutorWithNewSalary != null){
                        teacherInfoArrayList.set(tutorIndex, tutorWithNewSalary); //replaces the previous
                    }
                    

                } catch (NumberFormatException setSalaryException1){
                    JOptionPane.showMessageDialog(null, "Please Ensure that your input is Valid!", "Not Valid", JOptionPane.WARNING_MESSAGE);
                }

            }
        });


        yellowPanel.add(addTeacherYellowLabel);
        outerPanel.add(yellowPanel);
        outerPanel.add(setItButton);
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
        teacherIdTextField.setFont(new Font("Arial", Font.BOLD, 25));        

        //green add Button
        int removeButtonX = 110; int removeButtonY = 250;
        int removeButtonWidth = 300; int removeButtonHeight = 50;

        JButton removeButton = new JButton("Remove");
        removeButton.setBackground(new Color(193, 255, 114));
        removeButton.setBounds(removeButtonX,removeButtonY,removeButtonWidth,removeButtonHeight);
        removeButton.setFont(new Font("Arial", Font.BOLD, 18));
        removeButton.setForeground(new Color(27, 35, 54));

        yellowPanel.add(addTeacherYellowLabel);
        outerPanel.add(yellowPanel);
        outerPanel.add(teacherIdLabel);
        outerPanel.add(teacherIdTextField);
        outerPanel.add(removeButton);

        //logic for remove button
        removeButton.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent e) {
            // Change the label color to white when the cursor enters the panel
            removeButton.setFont(new Font("Arial", Font.BOLD, 22));
            removeButton.setForeground(new Color(27, 35, 54));

            removeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }

        public void mouseExited(MouseEvent e) {
            // Change the label color back to the original color when the cursor exits the panel
            removeButton.setFont(new Font("Arial", Font.BOLD, 18));
            removeButton.setForeground(Color.BLACK);
            removeButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            removeButton.setBackground(new Color(193, 255, 114)); //change color of the green button to the previous color
        }

        public void mouseClicked(MouseEvent e){
           System.out.println("Remove Tutor Button is clicked");
           int teacherId = -1;
           try{

               teacherId = Integer.parseInt(teacherIdTextField.getText());
           }
           catch (NumberFormatException numFormatErrorr){
            JOptionPane.showMessageDialog(null, "Please Enter a Valid Teacher ID", "Error", JOptionPane.ERROR_MESSAGE);
           }
           int loopCounter = 0;
           int idToRemove = -1;
            if (teacherInfoArrayList.isEmpty()){
                JOptionPane.showMessageDialog(null, "You have not added any lecturer or tutors!", "Empty", JOptionPane.WARNING_MESSAGE);
            }
            else{
                for (Teacher each : teacherInfoArrayList){
                    if (each instanceof Tutor){ 
                        if (each.getTeacherId() == teacherId){
                            Tutor eachTutor = (Tutor) each;
                            if (eachTutor.getIsCertified() == true){
                                JOptionPane.showMessageDialog(null, "The Tutor is Certified and cannot be removed!", "Tutor is Certified", JOptionPane.WARNING_MESSAGE);                                    
                            }
                            else{
                                idToRemove = loopCounter;
                                eachTutor.removeTutor();                            
                                JOptionPane.showMessageDialog(null, "The Tutor has been sucessfully removed!", "Sucessfully Removed", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }

                    }
                    else{
                        if(each.getTeacherId() == teacherId){
                            JOptionPane.showMessageDialog(null, "Entered teacher ID is a Lecutrer not a Tutor.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Entered teacher ID does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    loopCounter = loopCounter + 1;
                }
                if (idToRemove != -1){
                    teacherInfoArrayList.remove(idToRemove);    
                }
                
            }    
        }
    });

        return outerPanel;
    }

    

    //display Panels
    public static JPanel displayPanel()
    {
        int x = homeButtonWidth() + 550; int y = 380;
        int width = 500; int height = 350;      

        //a ghost panel that is of size : 1920 X 1080
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
        addTeacherYellowLabel.setBounds(70,8,250,30);

        //Teacher ID
        int teacherIdX = 110; int teacherIdY = 130;

        JLabel teacherIdLabel = new JLabel("Teacher ID");
        setCustomFont4(teacherIdLabel);
        teacherIdLabel.setBounds(teacherIdX,teacherIdY,200,18);

        JTextField teacherIdTextField = new JTextField();
        teacherIdTextField.setBounds(teacherIdX,teacherIdY+20,300,40);
        teacherIdTextField.setFont(new Font("Arial", Font.BOLD, 25));
    
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
        JPanel lecturerInfoDisplayPanel = new JPanel();
        lecturerInfoDisplayPanel.setLayout(null);
        lecturerInfoDisplayPanel.setVisible(false);
        lecturerInfoDisplayPanel.setBackground(new Color(58, 53, 81));
        lecturerInfoDisplayPanel.setBounds(x2,y2,width1,height1);
        
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
        setDisplayStyle(teacherIdTextField1);

        //teacher Name
        int teacherNameX = 250; int teacherNameY = 240;

        JLabel teacherNameLabel = new JLabel("Teacher Name");
        setCustomFont4(teacherNameLabel);
        teacherNameLabel.setBounds(teacherNameX,teacherNameY,200,18);

        JTextField teacherNameTextField = new JTextField();
        teacherNameTextField.setBounds(teacherNameX,teacherNameY + 20,300,40);
        setDisplayStyle(teacherNameTextField);

        //Address
        int teacherAddressX = 250; int teacherAddressY = 340;

        JLabel teacherAddressLabel = new JLabel("Teacher Address");
        setCustomFont4(teacherAddressLabel);
        teacherAddressLabel.setBounds(teacherAddressX,teacherAddressY,200,18);

        JTextField teacherAddressTextField = new JTextField();
        teacherAddressTextField.setBounds(teacherAddressX,teacherAddressY + 20,300,40);
        setDisplayStyle(teacherAddressTextField);

        //Employment Status
        int teacherEmploymentStatusX = 250; int teacherEmploymentStatusY = 440;

        JLabel teacherEmploymentStatusLabel = new JLabel("Employment Status");
        setCustomFont4(teacherEmploymentStatusLabel);
        teacherEmploymentStatusLabel.setBounds(teacherEmploymentStatusX,teacherEmploymentStatusY,200,18);

        JTextField teacherEmploymentStatusTextField = new JTextField();
        teacherEmploymentStatusTextField.setBounds(teacherEmploymentStatusX,teacherEmploymentStatusY + 20,300,40);
        setDisplayStyle(teacherEmploymentStatusTextField);

        //working Type
        int teacherWorkingTypeX = teacherNameX+500; int teacherWorkingTypeY = teacherNameY;

        JLabel teacherWorkingTypeLabel = new JLabel("Working Type");
        setCustomFont4(teacherWorkingTypeLabel);
        teacherWorkingTypeLabel.setBounds(teacherWorkingTypeX,teacherWorkingTypeY,200,18);

        JTextField teacherWorkingTypeTextField = new JTextField();
        teacherWorkingTypeTextField.setBounds(teacherWorkingTypeX,teacherWorkingTypeY + 20,300,40);
        setDisplayStyle(teacherWorkingTypeTextField);

        //Graded Score
        int teacherGradedScoreX = teacherNameX+500; int teacherGradedScoreY = teacherAddressY;

        JLabel teacherGradedScoreLabel = new JLabel("Graded Score");
        setCustomFont4(teacherGradedScoreLabel);
        teacherGradedScoreLabel.setBounds(teacherGradedScoreX,teacherGradedScoreY,200,18);

        JTextField teacherGradedScoreTextField = new JTextField();
        teacherGradedScoreTextField.setBounds(teacherGradedScoreX,teacherGradedScoreY + 20,300,40);
        setDisplayStyle(teacherGradedScoreTextField);

        //Years of Experience
        int teacherYearsOfExperienceX = teacherAddressX+500; int teacherYearsOfExperienceY = teacherEmploymentStatusY;

        JLabel teacherYearsOfExperienceLabel = new JLabel("Years Of Experience");
        setCustomFont4(teacherYearsOfExperienceLabel);
        teacherYearsOfExperienceLabel.setBounds(teacherYearsOfExperienceX,teacherYearsOfExperienceY,250,18);

        JTextField teacherYearsOfExperienceTextField = new JTextField();
        teacherYearsOfExperienceTextField.setBounds(teacherYearsOfExperienceX,teacherYearsOfExperienceY + 20,300,40);
        setDisplayStyle(teacherYearsOfExperienceTextField);

        //Working Hours
        int teacherWorkingHoursX = teacherEmploymentStatusX+500; int teacherWorkingHoursY = teacherEmploymentStatusY+100;

        JLabel teacherWorkingHoursLabel = new JLabel("Working Hours");
        setCustomFont4(teacherWorkingHoursLabel);
        teacherWorkingHoursLabel.setBounds(teacherWorkingHoursX,teacherWorkingHoursY,200,18);

        JTextField teacherWorkingHoursTextField = new JTextField();
        teacherWorkingHoursTextField.setBounds(teacherWorkingHoursX,teacherWorkingHoursY + 20,300,40);
        setDisplayStyle(teacherWorkingHoursTextField);

        //department
        int teacherDepartmentX = teacherEmploymentStatusX; int teacherDepartmentY = teacherEmploymentStatusY+100;

        JLabel teacherDepartmentLabel = new JLabel("Department");
        setCustomFont4(teacherDepartmentLabel);
        teacherDepartmentLabel.setBounds(teacherDepartmentX,teacherDepartmentY,200,18);

        JTextField teacherDepartmentTextField = new JTextField();
        teacherDepartmentTextField.setBounds(teacherDepartmentX,teacherDepartmentY + 20,300,40);
        setDisplayStyle(teacherDepartmentTextField);

        //gray back Button
        int backButtonX = teacherDepartmentX + 250; int backButtonY = 640;
        int clearButtonWidth = 300; int clearButtonHeight = 50;

        JButton lecturerBackButton = new JButton("Back");
        lecturerBackButton.setBackground(new Color(224, 227, 233));
        lecturerBackButton.setBounds(backButtonX,backButtonY,clearButtonWidth,clearButtonHeight);
        lecturerBackButton.setFont(new Font("Arial", Font.BOLD, 18));        

        //logic for back Button
        lecturerBackButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                // Change the label color to white when the cursor enters the panel
                lecturerBackButton.setFont(new Font("Arial", Font.BOLD, 22));
                lecturerBackButton.setForeground(new Color(27, 35, 54));
                lecturerBackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                // Change the label color back to the original color when the cursor exits the panel
                lecturerBackButton.setFont(new Font("Arial", Font.BOLD, 18));
                lecturerBackButton.setForeground(new Color(27, 35, 54));
                lecturerBackButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                lecturerBackButton.setBackground(new Color(224, 227, 233));
            }

            public void mouseClicked(MouseEvent e){
                //mouse on click event
                lecturerInfoDisplayPanel.setVisible(false);
                outerPanel.setVisible(true);
            }
        });
  
        yellowPanel1.add(addTeacherYellowLabel1);
        lecturerInfoDisplayPanel.add(lecturerBackButton);
        lecturerInfoDisplayPanel.add(yellowPanel1);
        lecturerInfoDisplayPanel.add(teacherIDLabel);
        lecturerInfoDisplayPanel.add(teacherIdTextField1);
        lecturerInfoDisplayPanel.add(teacherNameLabel);
        lecturerInfoDisplayPanel.add(teacherNameTextField);
        lecturerInfoDisplayPanel.add(teacherAddressLabel);
        lecturerInfoDisplayPanel.add(teacherAddressTextField);
        lecturerInfoDisplayPanel.add(teacherEmploymentStatusLabel);
        lecturerInfoDisplayPanel.add(teacherEmploymentStatusTextField);
        lecturerInfoDisplayPanel.add(teacherWorkingTypeLabel);
        lecturerInfoDisplayPanel.add(teacherWorkingTypeTextField);
        lecturerInfoDisplayPanel.add(teacherGradedScoreLabel);
        lecturerInfoDisplayPanel.add(teacherGradedScoreTextField);
        lecturerInfoDisplayPanel.add(teacherYearsOfExperienceLabel);
        lecturerInfoDisplayPanel.add(teacherYearsOfExperienceTextField);
        lecturerInfoDisplayPanel.add(teacherWorkingHoursLabel);
        lecturerInfoDisplayPanel.add(teacherWorkingHoursTextField);
        lecturerInfoDisplayPanel.add(teacherDepartmentLabel);
        lecturerInfoDisplayPanel.add(teacherDepartmentTextField);
        otuerPanelFrame.add(lecturerInfoDisplayPanel);

        //-----------------------lecturer info panel ends---------------------

        //-----------------------Tutor info panel starts----------------------

        int tutorX = homeButtonWidth() + 250; int tutorY = 200;
        int tutorWidth = 1300; int tutorHeight = 750;      

        //create the main outer panel
        JPanel tutorInfoDisplayPanel = new JPanel();
        tutorInfoDisplayPanel.setLayout(null);
        tutorInfoDisplayPanel.setVisible(false);
        tutorInfoDisplayPanel.setBackground(new Color(58, 53, 81));
        tutorInfoDisplayPanel.setBounds(tutorX,tutorY,tutorWidth,tutorHeight);
        
        //create the yellow panel
        int tutorYellowPanelX = 500; int tutorYellowPanelY = 40;
        int tutorYellowPanelWidth = 300; int tutorYellowPanelHeight = 50;

        JPanel tutorYellowPanel = new JPanel();
        tutorYellowPanel.setBackground(new Color(255, 222, 89));
        tutorYellowPanel.setBounds(tutorYellowPanelX,tutorYellowPanelY,tutorYellowPanelWidth,tutorYellowPanelHeight);
        tutorYellowPanel.setLayout(null);

        JLabel addTutorYellowLabel = new JLabel("Tutor Info");
        setCustomFont3(addTutorYellowLabel);
        addTutorYellowLabel.setBounds(88,18,150,20);
        
        //teacher ID
        int tutorTeacherIdX = 250; int tutorTeacherIdY = 140;        

        JLabel tutorTeacherIDLabel = new JLabel("Teacher ID");
        setCustomFont4(tutorTeacherIDLabel);
        tutorTeacherIDLabel.setBounds(tutorTeacherIdX,tutorTeacherIdY,200,18);

        JTextField tutorTeacherIdTextField = new JTextField();
        tutorTeacherIdTextField.setBounds(tutorTeacherIdX,tutorTeacherIdY+20,300,40);
        tutorTeacherIdTextField.setFont(new Font("Arial", Font.BOLD, 25));
        setDisplayStyle(tutorTeacherIdTextField);

        //teacher Name
        int tutorTeacherNameX = 250; int tutorTeacherNameY = 240;

        JLabel tutorTeacherNameLabel = new JLabel("Teacher Name");
        setCustomFont4(tutorTeacherNameLabel);
        tutorTeacherNameLabel.setBounds(tutorTeacherNameX,tutorTeacherNameY,200,18);

        JTextField tutorTeacherNameTextField = new JTextField();
        tutorTeacherNameTextField.setBounds(tutorTeacherNameX,tutorTeacherNameY + 20,300,40);
        tutorTeacherNameTextField.setFont(new Font("Arial", Font.BOLD, 25));
        setDisplayStyle(tutorTeacherNameTextField);

        //Address
        int tutorTeacherAddressX = 250; int tutotTeacherAddressY = 340;

        JLabel tutorTeacherAddressLabel = new JLabel("Teacher Address");
        setCustomFont4(tutorTeacherAddressLabel);
        tutorTeacherAddressLabel.setBounds(tutorTeacherAddressX,tutotTeacherAddressY,200,18);

        JTextField tutorTeacherAddressTextField = new JTextField();
        tutorTeacherAddressTextField.setBounds(tutorTeacherAddressX,tutotTeacherAddressY + 20,300,40);
        tutorTeacherAddressTextField.setFont(new Font("Arial", Font.BOLD, 25));
        setDisplayStyle(tutorTeacherAddressTextField);

        //Employment Status
        int tutorTeacherEmploymentStatusX = 250; int tutorTeacherEmploymentStatusY = 440;

        JLabel tutorTeacherEmploymentStatusLabel = new JLabel("Employment Status");
        setCustomFont4(tutorTeacherEmploymentStatusLabel);
        tutorTeacherEmploymentStatusLabel.setBounds(tutorTeacherEmploymentStatusX,tutorTeacherEmploymentStatusY,200,18);

        JTextField tutorTeacherEmploymentStatusTextField = new JTextField();
        tutorTeacherEmploymentStatusTextField.setBounds(tutorTeacherEmploymentStatusX,tutorTeacherEmploymentStatusY + 20,300,40);
        tutorTeacherEmploymentStatusTextField.setFont(new Font("Arial", Font.BOLD, 25));
        setDisplayStyle(tutorTeacherEmploymentStatusTextField);

        //Academic qualification
        int teacherAcademicQualificationX = 250; int teacherAcademicQualificationY = 540;

        JLabel teacherAcademicQualificationLabel = new JLabel("Academic Qualification");
        setCustomFont4(teacherAcademicQualificationLabel);
        teacherAcademicQualificationLabel.setBounds(teacherAcademicQualificationX,teacherAcademicQualificationY,250,18);

        JTextField teacherAcademicQualificationTextField = new JTextField();
        teacherAcademicQualificationTextField.setBounds(teacherAcademicQualificationX,teacherAcademicQualificationY + 20,300,40);
        teacherAcademicQualificationTextField.setFont(new Font("Arial", Font.BOLD, 25));
        setDisplayStyle(teacherAcademicQualificationTextField);

        //working Type
        int tutorTeacherWorkingTypeX = tutorTeacherIdX+500; int tutorTeacherWorkingTypeY = tutorTeacherIdY;

        JLabel tutorTeacherWorkingTypeLabel = new JLabel("Working Type");
        setCustomFont4(tutorTeacherWorkingTypeLabel);
        tutorTeacherWorkingTypeLabel.setBounds(tutorTeacherWorkingTypeX,tutorTeacherWorkingTypeY,200,18);

        JTextField tutorTeacherWorkingTypeYTextField = new JTextField();
        tutorTeacherWorkingTypeYTextField.setBounds(tutorTeacherWorkingTypeX,tutorTeacherIdY + 20,300,40);
        tutorTeacherWorkingTypeYTextField.setFont(new Font("Arial", Font.BOLD, 25));
        setDisplayStyle(tutorTeacherWorkingTypeYTextField);

        //Salary
        int teacherSalaryX = tutorTeacherNameX+500; int teacherSalaryY = tutorTeacherNameY;

        JLabel teacherSalaryLabel = new JLabel("Salary");
        setCustomFont4(teacherSalaryLabel);
        teacherSalaryLabel.setBounds(teacherSalaryX,teacherSalaryY,200,18);

        JTextField teacherSalaryTextField = new JTextField();
        teacherSalaryTextField.setBounds(teacherSalaryX,teacherSalaryY + 20,300,40);
        teacherSalaryTextField.setFont(new Font("Arial", Font.BOLD, 25));
        setDisplayStyle(teacherSalaryTextField);

        //Specialization
        int teacherSpecializationX = tutorTeacherAddressX+500; int teacherSpecializationY = tutotTeacherAddressY;

        JLabel teacherSpecializationLabel = new JLabel("Specialization");
        setCustomFont4(teacherSpecializationLabel);
        teacherSpecializationLabel.setBounds(teacherSpecializationX,teacherSpecializationY,200,18);

        JTextField teacherSpecializationTextField = new JTextField();
        teacherSpecializationTextField.setBounds(teacherSpecializationX,teacherSpecializationY + 20,300,40);
        teacherSpecializationTextField.setFont(new Font("Arial", Font.BOLD, 25));
        setDisplayStyle(teacherSpecializationTextField);

        //Working Hours
        int tutorTeacherWorkingHoursX = tutorTeacherEmploymentStatusX+500; int tutorTeacherWorkingHoursY = tutorTeacherEmploymentStatusY;

        JLabel tutorTeacherWorkingHoursLabel = new JLabel("Working Hours");
        setCustomFont4(tutorTeacherWorkingHoursLabel);
        tutorTeacherWorkingHoursLabel.setBounds(tutorTeacherWorkingHoursX,tutorTeacherWorkingHoursY,200,18);

        JTextField tutorTeacherWorkingHoursTextField = new JTextField();
        tutorTeacherWorkingHoursTextField.setBounds(tutorTeacherWorkingHoursX,tutorTeacherWorkingHoursY + 20,300,40);
        tutorTeacherWorkingHoursTextField.setFont(new Font("Arial", Font.BOLD, 25));
        setDisplayStyle(tutorTeacherWorkingHoursTextField);

        //Performance Index
        int teacherPerformanceIndexX = teacherAcademicQualificationX+500; int teacherPerformanceIndexY = teacherAcademicQualificationY;

        JLabel teacherPerformanceIndexLabel = new JLabel("Performance Index");
        setCustomFont4(teacherPerformanceIndexLabel);
        teacherPerformanceIndexLabel.setBounds(teacherPerformanceIndexX,teacherPerformanceIndexY,200,18);

        JTextField teacherPerformanceIndexTextField = new JTextField();
        teacherPerformanceIndexTextField.setBounds(teacherPerformanceIndexX,teacherPerformanceIndexY + 20,300,40);
        teacherPerformanceIndexTextField.setFont(new Font("Arial", Font.BOLD, 25));
        setDisplayStyle(teacherPerformanceIndexTextField);

        //green add Button
        int addButtonPanelX = tutorTeacherEmploymentStatusX; int addButtonPanelY = 640;
        int addButtonPanelWidth = 300; int addButtonPanelHeight = 50;

        JButton addButton = new JButton("ADD");
        addButton.setBackground(new Color(193, 255, 114));
        addButton.setBounds(addButtonPanelX,addButtonPanelY,addButtonPanelWidth,addButtonPanelHeight);
        addButton.setFont(new Font("Arial", Font.BOLD, 18));
        addButton.setForeground(new Color(27, 35, 54));

        //tutor gray back Button
        int tutorBackButtonX = tutorTeacherIdX + 250; int clearButtonY = addButtonPanelY;
        int tutorBackButtonWidth = 300; int tutorBackButtonHeight = 50;

        JButton tutorBackButton = new JButton("Back");
        tutorBackButton.setBackground(new Color(224, 227, 233));
        tutorBackButton.setBounds(tutorBackButtonX,clearButtonY,tutorBackButtonWidth,tutorBackButtonHeight);
        tutorBackButton.setFont(new Font("Arial", Font.BOLD, 18));

        //logic for back Button
        tutorBackButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                // Change the label color to white when the cursor enters the panel
                tutorBackButton.setFont(new Font("Arial", Font.BOLD, 22));
                tutorBackButton.setForeground(new Color(27, 35, 54));
                tutorBackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent e) {
                // Change the label color back to the original color when the cursor exits the panel
                tutorBackButton.setFont(new Font("Arial", Font.BOLD, 18));
                tutorBackButton.setForeground(new Color(27, 35, 54));
                tutorBackButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                tutorBackButton.setBackground(new Color(224, 227, 233));
            }

            public void mouseClicked(MouseEvent e){
                //mouse on click event
                tutorInfoDisplayPanel.setVisible(false);
                outerPanel.setVisible(true);
            }
        });

        tutorYellowPanel.add(addTutorYellowLabel);
        tutorInfoDisplayPanel.add(tutorBackButton);
        tutorInfoDisplayPanel.add(tutorYellowPanel);
        tutorInfoDisplayPanel.add(tutorTeacherIDLabel);
        tutorInfoDisplayPanel.add(tutorTeacherIdTextField);
        tutorInfoDisplayPanel.add(tutorTeacherNameLabel);
        tutorInfoDisplayPanel.add(tutorTeacherNameTextField);
        tutorInfoDisplayPanel.add(tutorTeacherAddressLabel);
        tutorInfoDisplayPanel.add(tutorTeacherAddressTextField);
        tutorInfoDisplayPanel.add(tutorTeacherEmploymentStatusLabel);
        tutorInfoDisplayPanel.add(tutorTeacherEmploymentStatusTextField);
        tutorInfoDisplayPanel.add(tutorTeacherWorkingTypeLabel);
        tutorInfoDisplayPanel.add(tutorTeacherWorkingTypeYTextField);
        tutorInfoDisplayPanel.add(teacherSalaryLabel);
        tutorInfoDisplayPanel.add(teacherSalaryTextField);
        tutorInfoDisplayPanel.add(teacherSpecializationLabel);
        tutorInfoDisplayPanel.add(teacherSpecializationTextField);
        tutorInfoDisplayPanel.add(tutorTeacherWorkingHoursLabel);
        tutorInfoDisplayPanel.add(tutorTeacherWorkingHoursTextField);
        tutorInfoDisplayPanel.add(teacherAcademicQualificationLabel);
        tutorInfoDisplayPanel.add(teacherAcademicQualificationTextField);
        tutorInfoDisplayPanel.add(teacherPerformanceIndexLabel);
        tutorInfoDisplayPanel.add(teacherPerformanceIndexTextField);
        otuerPanelFrame.add(tutorInfoDisplayPanel);

        //-----------------------Tutor info panel Ends----------------------



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
                int teacherIdValue = -1; //initializing here to got get error below the catch block
                System.out.println("Green Display button is clicked");
                // logic
                try{
                teacherIdValue = Integer.parseInt(teacherIdTextField.getText());
                } catch (NumberFormatException numException){
                    JOptionPane.showMessageDialog(null, "Enter a valid teacher ID", "Error", JOptionPane.ERROR_MESSAGE);
                }
                int isUserEnteredTeacherIdValid = displayButtonLogic(teacherIdValue);

                
                //if the teacherId entered is that of the lecturer, then this get the text and display it 
                for (Teacher element : teacherInfoArrayList){
                    if (teacherIdValue == element.getTeacherId()){
                        
                    
                        if (element instanceof Lecturer){
                            if (isUserEnteredTeacherIdValid != -1){
                                lecturerInfoDisplayPanel.setVisible(true);
                                lecturerInfoDisplayPanel.revalidate();
                                tutorInfoDisplayPanel.setVisible(false);
                                outerPanel.setVisible(false);
                            }    
                        Lecturer each = (Lecturer) element;
                            if (teacherIdValue == each.getTeacherId()){
                                System.out.println("Teacher id " + teacherIdValue + " is " + "Lecturer");
                                teacherIdTextField1.setText(String.valueOf(each.getTeacherId()));
                                teacherNameTextField.setText(String.valueOf(each.getTeacherName()));
                                teacherAddressTextField.setText(String.valueOf(each.getAddress()));
                                teacherEmploymentStatusTextField.setText(String.valueOf(each.getEmploymentStatus()));
                                teacherDepartmentTextField.setText(String.valueOf(each.getDepartment()));
                                teacherWorkingTypeTextField.setText(String.valueOf(each.getWorkingType()));
                                if (getGradedScoreInLetters(each.getGradedScore(), each.getHasGraded()) != "Q"){
                                    teacherGradedScoreTextField.setText(getGradedScoreInLetters(each.getGradedScore(), each.getHasGraded()));
                                }
                                else{
                                    teacherGradedScoreTextField.setText("Not Graded Yet");
                                }
                                teacherYearsOfExperienceTextField.setText(String.valueOf(each.getYearsOfExperience()));
                                teacherWorkingHoursTextField.setText(String.valueOf(each.getWorkingHours()));
                            }
                        }
                        else if (element instanceof Tutor){ //logic of display if item in the arrayList of type Tutor
                            System.out.println("Teacher id " + teacherIdValue + " is " + "Tutor");
                            Tutor each2 = (Tutor) element;
                            if (isUserEnteredTeacherIdValid != -1){
                                tutorInfoDisplayPanel.setVisible(true);
                                tutorInfoDisplayPanel.revalidate();
                                lecturerInfoDisplayPanel.setVisible(false);
                                outerPanel.setVisible(false);
                                System.out.println("The new SALARY is : " + each2.getSalary());                                
                            }
                            if (teacherIdValue == each2.getTeacherId()){
                                tutorTeacherIdTextField.setText(String.valueOf(each2.getTeacherId()));
                                tutorTeacherNameTextField.setText(String.valueOf(each2.getTeacherName()));
                                tutorTeacherAddressTextField.setText(String.valueOf(each2.getAddress()));
                                tutorTeacherEmploymentStatusTextField.setText(String.valueOf(each2.getEmploymentStatus()));
                                tutorTeacherWorkingTypeYTextField.setText(String.valueOf(each2.getWorkingType()));
                                teacherSalaryTextField.setText(String.valueOf(each2.getSalary()));
                                teacherSpecializationTextField.setText(String.valueOf(each2.getSpecialization()));
                                tutorTeacherWorkingHoursTextField.setText(String.valueOf(each2.getWorkingHours()));
                                teacherAcademicQualificationTextField.setText(String.valueOf(each2.getAcademicQualifications()));
                                teacherPerformanceIndexTextField.setText(String.valueOf(each2.getPerformanceIndex()));
                            }
                        }
                }
                    
                    
                }
            }
        });

        return otuerPanelFrame; //returns 1920 x 1080 panel
    }

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

    static String shouldAddToArrayListFromTutor(String isAvalidNumber, int teacherId, String teacherName, String address, String workingType, String employmentStatus, int workingHours, double salary, String specialization, String academicQualifications, int performanceIndex){
        String shouldAddToArrayListFromLecturer = "no";

        String isValid1 = "no";
        String isValid2 = "no";
        String isValid3 = "yes";

        if (teacherName != "" && address != "" && workingType != "" && employmentStatus != "" && specialization != "" && academicQualifications != ""){
            System.out.println("No Text Field for tutor is empty");  
            isValid1 = "yes";
        }
        if (isAvalidNumber == "yes"){
            System.out.println("The numbers in tutors are true");
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

    static String getGradedScoreInLetters(int gradedScore, boolean hasGraded){
        String result = "Q";

        if (hasGraded == true){
            if (gradedScore >=70) {
                result = "A";
            }
            else if (gradedScore >= 60){
                result = "B";
            }
            else if (gradedScore >= 50){
                result = "C";
            }
            else if (gradedScore >= 40){
                result = "D";
            }
            else if (gradedScore < 40){
                result = "E";
            }
        }
        
        return result;
    }


}