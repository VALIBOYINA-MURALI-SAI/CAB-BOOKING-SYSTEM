package CabBooking;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
class CabProject 
{
CabProject ()
{
 JFrame frame = new JFrame("CAB BOOKING");
 frame.setSize(250, 350);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 //to add name
 
 JLabel nameLabel = new JLabel("NAME: ");
 frame.add(nameLabel); 
 final JTextField nameField = new JTextField(20); // increased size of the text field
 frame.add(nameField);
 //to add address
 
 JLabel addressLabel = new JLabel("ADDRESS: ");
 frame.add(addressLabel);
 
 final JTextField addressField = new JTextField(20); // increased size of the text field
 frame.add(addressField);
 
 //to add phone number
 
 JLabel phoneLabel = new JLabel("PHONE NUMBER: ");
 frame.add(phoneLabel);
 
 final JTextField phoneField = new JTextField(20); // increased size of the text field
 frame.add(phoneField);
 
 
 //to add email 
 JLabel EmailField = new JLabel("Email: ");
 frame.add(EmailField);
 
 final JTextField EmailField1 = new JTextField(20); // increased size of the text field
 frame.add(EmailField1);
 
 // to add members
 JLabel membersLabel = new JLabel("members: ");
 frame.add(membersLabel);
 
 final JTextField membersField = new JTextField(20); // increased size of the text field
 frame.add(membersField);
 final JLabel carsLabel = new JLabel("Car Type: ");
 frame.add(carsLabel);
 String[] carTypes = { "Maruthi Swift", "Mahindra XUX700", "Hyundai Creta", "Tata Nexa" };
 final JComboBox<String> carComboBox = new JComboBox<>(carTypes);
 frame.add(carComboBox);
 
 
 frame.getContentPane().setBackground(Color.green);
 frame.setLayout(new FlowLayout());
 frame.setVisible(true);
 carComboBox.addActionListener(new ActionListener() 
 {
 public void actionPerformed(ActionEvent e1)
 {
 String name = nameField.getText();
 String address = addressField.getText();
 String phone = phoneField.getText();
 String email = EmailField1.getText();
 String numPassengers = membersField.getText();
 String selectedCar = (String) carComboBox.getSelectedItem();
 JOptionPane.showMessageDialog(null,"Name: " + name + "\naddress: " + address + "\nPhoneNumber: " + phone + "\nEmail: " + email+ "\nNumber of passengers: " + numPassengers +"\nSelected car: " + selectedCar);
 try {
 FileWriter writer = new FileWriter("booking_details.txt", true);
 writer.write(name + "," + address + "," + phone + "," + email + "," + numPassengers + ","+ selectedCar + "\n");
 writer.close();
 JOptionPane.showMessageDialog(null, " YOUR CAR IS BOOKED!!!!!!!!!");
 } catch (IOException e) {
 e.printStackTrace();
 }
 }
 });
 
}
public void setVisible(boolean b) 
{
}
}
public class CabLast
{
public static void main (String args[])
{
new CabProject();
}
}