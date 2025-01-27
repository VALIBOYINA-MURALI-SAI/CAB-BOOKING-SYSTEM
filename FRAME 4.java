package CabBooking;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
public class MySlide extends JFrame implements ActionListener
{
 private JLabel pickupLabel, dropLabel, budgetTypeLabel,pickupTimeLabel;
 private JComboBox<String> pickupComboBox, dropComboBox, budgetTypeComboBox,pickupTimeComboBox;
 private JCheckBox sharingCheckBox;
 private JCheckBox privateCheckBox;
 private JButton bookButton;
 private JButton next;
 
 public MySlide()
 {
 
 setTitle("Cab Booking Details");
 setSize(500, 400);
 this.getContentPane().setBackground(Color.yel9low);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLocationRelativeTo(null);
 
 
 pickupLabel = new JLabel("Select Pickup address:");
 dropLabel = new JLabel("Select Drop address:");
 pickupTimeLabel =new JLabel("select pickup time:");
 budgetTypeLabel = new JLabel("Select Budget Range:");
 
 String[] pickup = {"Guntur", "Vijayawada", "Vizag","Hyderabad"};
 pickupComboBox = new JComboBox<>(pickup);
 
 String[] drop = {"Guntur ", "Vijayawada", "Vizag","Hyderabad"};
 dropComboBox = new JComboBox<>(drop);
 
 String[] pickupTime = { "6:00 AM","7:00 AM","8:00 AM","10:00 AM","11:00 AM","12:00 PM"};
 pickupTimeComboBox = new JComboBox<>(pickupTime);
 
 String[] budgetTypes = { "500-1000","1000-2000","2000 and above"};
 budgetTypeComboBox = new JComboBox<>(budgetTypes);
 sharingCheckBox = new JCheckBox("Sharing");
 privateCheckBox = new JCheckBox("private");
 
 bookButton = new JButton("Book Now");
 bookButton.addActionListener(this);
 
 
 setLayout(new GridLayout(8, 5, 10, 10));
 add(pickupLabel);
 add(pickupComboBox);
 add(dropLabel);
 add(dropComboBox);
 add(pickupTimeLabel);
 add(pickupTimeComboBox);
 add(budgetTypeLabel);
 add(budgetTypeComboBox);
 add(sharingCheckBox);
 add(privateCheckBox);
 add(new JLabel());
 add(new JLabel());
 add(bookButton);
 setVisible(true);
 }
 
 public void actionPerformed(ActionEvent e) 
 {
 if (e.getSource() == bookButton)
 {
 String pickup = (String) pickupComboBox.getSelectedItem();
 String drop = (String) dropComboBox.getSelectedItem();
 String pickupTime = (String) pickupTimeComboBox.getSelectedItem();
 String budgetType = (String) budgetTypeComboBox.getSelectedItem();
 boolean sharing = sharingCheckBox.isSelected();
 boolean privatee = privateCheckBox.isSelected();
 String message = "You have booked the following:\n";
 message += "pickup address: " + pickup + "\n";
 message += "Drop address: " + drop + "\n";
 message += "Budget Type: " + budgetType + "\n";
 message += "Sharing: " + (sharing ? "YES" : "NO") + "\n";
 message += "private: " + (privatee ? "YES" : "NO") + "\n";
 JOptionPane.showMessageDialog(this, message);
 int result = JOptionPane.showConfirmDialog(this, message, "Booking Details", JOptionPane.OK_CANCEL_OPTION);
 if (result == JOptionPane.OK_OPTION)
 {
 next = new JButton("Next");
 add(next);
 next.addActionListener(this);
 validate(); 
 }
 
 }
 if(e.getSource()==next)
 {
 Transaction t= new Transaction();
 t.setVisible(true);
 
 }
 }
 
 public static void main(String[] args) 
 {
 new MySlide();
 }
}