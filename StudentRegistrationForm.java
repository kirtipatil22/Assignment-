import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends JFrame {
    // Labels
    private JLabel nameLabel = new JLabel("Name:");
    private JLabel ageLabel = new JLabel("Age:");
    private JLabel genderLabel = new JLabel("Gender:");
    private JLabel courseLabel = new JLabel("Course:");

    // Text Fields
    private JTextField nameField = new JTextField(20);
    private JTextField ageField = new JTextField(5);

    // Radio Buttons
    private JRadioButton maleRadioButton = new JRadioButton("Male");
    private JRadioButton femaleRadioButton = new JRadioButton("Female");
    private ButtonGroup genderGroup = new ButtonGroup();

    // Combo Box
    private String[] courses = {"Mathematics", "Physics", "Chemistry", "Biology"};
    private JComboBox<String> courseComboBox = new JComboBox<>(courses);

    // Button
    private JButton registerButton = new JButton("Register");

    public StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2));

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(genderLabel);
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        panel.add(genderPanel);
        panel.add(courseLabel);
        panel.add(courseComboBox);
        panel.add(new JLabel()); // Placeholder for spacing
        panel.add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                String gender = maleRadioButton.isSelected() ? "Male" : "Female";
                String course = (String) courseComboBox.getSelectedItem();

                // Perform registration process (for now, let's just print the details)
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Gender: " + gender);
                System.out.println("Course: " + course);
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistrationForm();
            }
        });
    }
}
