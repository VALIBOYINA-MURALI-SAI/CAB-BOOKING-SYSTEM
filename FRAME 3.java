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
public class Transaction extends JFrame implements ActionListener 
{
 JLabel lblDate, lblAmount, lblDescription,lblotp,lblphn;
 JTextField txtDate, txtAmount, txtDescription,txtotp,txtphn;
 JButton btnSave, btnCancel,next;
 Transaction() 
 {
 lblDate = new JLabel("Date (MM/DD/YYYY): ");
 lblAmount = new JLabel("Amount: ");
 lblDescription = new JLabel("Description: ");
 lblphn = new JLabel("Phn no: ");
 lblotp = new JLabel("OTP: ");
 txtDate = new JTextField(20);
 txtAmount = new JTextField(20);
 txtDescription = new JTextField(20);
 txtphn = new JTextField(20);
 txtotp = new JTextField(20);
 btnSave = new JButton("Save");
 btnCancel = new JButton("Cancel");
 String selected;
 String email;
 JPanel panel = new JPanel(new GridLayout(6, 2));
 panel.add(lblDate);
 panel.add(txtDate);
 panel.add(lblAmount);
 panel.add(txtAmount);
 panel.add(lblDescription);
 panel.add(txtDescription);
 panel.add(lblphn);
 panel.add(txtphn);
 panel.add(lblotp);
 panel.add(txtotp);
 panel.add(btnSave);
 panel.add(btnCancel);
 add(panel);
 setTitle("Transaction Details");
 setSize(400, 200);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);
 btnSave.addActionListener(this);
 btnCancel.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e)
 {
 if (e.getSource() == btnSave) 
 {
 
 // Save the transaction details
 String date = txtDate.getText();
 String amount = txtAmount.getText();
 String description = txtDescription.getText();
 String phn = txtphn.getText();
 String otp = txtotp.getText();
 // You can perform further actions with the entered data here
 String message="Transaction details saved successfully.";
 JOptionPane.showMessageDialog(this,message); 
 int result = JOptionPane.showConfirmDialog(this, message, "transaction Details", JOptionPane.OK_CANCEL_OPTION);
 if (result == JOptionPane.OK_OPTION)
 {
 
 next = new JButton("Next");
 next.setPreferredSize(new Dimension(10, 10));
 JPanel buttonPanel = new JPanel(new 
BorderLayout());
 buttonPanel.add(next, BorderLayout.CENTER);
 add(buttonPanel, BorderLayout.CENTER);
 next.addActionListener(this);
 validate(); 
 }
 } 
 if(e.getSource()==next)
 {
 CabProject x= new CabProject();
 x.setVisible(true);
 
 }
 else if (e.getSource() == btnCancel) 
 {
 dispose();
 }
 }
 public static void main(String[] args) 
 {
 new Transaction();
 }
}