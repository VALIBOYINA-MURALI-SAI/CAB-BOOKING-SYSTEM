package CabBooking;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
class Cab implements ActionListener
{
 final JButton button;
 Cab()
 {
 JFrame frame = new JFrame("CAB BOOKING");
 frame.setSize(250, 350);
 
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 //to add name
 
 JLabel nameLabel = new JLabel("NAME: ");
 frame.add(nameLabel); 
 final JTextField nameField = new JTextField(20); 
 frame.add(nameField);
 
 frame.setLayout(new FlowLayout());
 frame.setVisible(true);
 
 
 //to add phone number
 
 JLabel phoneLabel = new JLabel("PHONE NUMBER: ");
 frame.add(phoneLabel);
 
 final JTextField phoneField = new JTextField(20); 
 frame.add(phoneField);
 frame.setLayout(new FlowLayout());
 frame.setVisible(true);
 
 //to add email 
 JLabel EmailField = new JLabel("Email: ");
 frame.add(EmailField);
 
 final JTextField EmailField1 = new JTextField(20); // increased size of the text field
 frame.add(EmailField1);
 
 
 button= new JButton("enter");
 button.addActionListener(this);
 frame.add(button);
 
 frame.setLayout(new FlowLayout());
 frame.setVisible(true);
 
 frame.getContentPane().setBackground(Color.orange);
 ImageIcon imageIcon = new ImageIcon("C:\\Users\\aasim\\OneDrive\\Desktop\\img1.png");
 JLabel imageLabel = new JLabel(imageIcon);
 // add the JLabel to the JFrame
 frame.add(imageLabel); 
 
 }
@Override
public void actionPerformed(ActionEvent e) 
{
if(e.getSource()==button)
{
MySlide slide= new MySlide();
slide.setVisible(true);
}
}
 
 }
public class First 
{
public static void main(String args[])
{
new Cab();
}
}