package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	ArrayList <String> al = new ArrayList <String>();
	public static void main(String[] args) {
		// Create a GUI with two buttons. One button reads "Add Name" and the other
		// button reads "View Names".
		// When the add name button is clicked, display an input dialog that asks the
		// user to enter a name. Add
		// that name to an ArrayList. When the "View Names" button is clicked, display a
		// message dialog that displays
		// all the names added to the list. Format the list as follows:
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners
     GuestBook gb = new GuestBook();
		
	}
	public GuestBook(){
		
	
		JFrame jf1 = new JFrame();
		jf1.setVisible(true);
		jf1.setSize(250, 70);
		JPanel jp1 = new JPanel();
		jp1.add(jb1);
		jp1.add(jb2);
		jf1.add(jp1);
		jb1.setText("Add Name");
		jb2.setText("View Name");
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jb1) {
			String anb = JOptionPane.showInputDialog("Enter the name of the person that you would like to invite in the text box below.");
			al.add(anb);
		}
		else if (e.getSource() == jb2) {
			String x = "";
			for (int i = 0; i < al.size(); i++) {
				String s = al.get(i);
				System.out.println(s);
				x+="Guest #" + (i+1) + " " + s + "\n";
				System.out.println(x);
			}
			JOptionPane.showMessageDialog(null, x);
			
		}
		else {
			//
		}
	}
	}

