import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cr3GUI {

	private JFrame frame;
	private JTextField fn;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cr3GUI window = new Cr3GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cr3GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel fnl = new JLabel("first name");
		fnl.setBounds(10, 38, 48, 14);
		fnl.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(fnl);
		
		fn = new JTextField();
		fn.setBounds(66, 35, 86, 20);
		panel.add(fn);
		fn.setColumns(10);
		
		JLabel ln = new JLabel("last name");
		ln.setBounds(10, 70, 46, 14);
		panel.add(ln);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 67, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel ag = new JLabel("age");
		ag.setBounds(10, 104, 46, 14);
		panel.add(ag);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 101, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton sb = new JButton("Submit");
		sb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fnl = fn.getText();
				dis.setText("first name"+ fnl);
		
			}
		});
		sb.setBounds(313, 149, 89, 23);
		panel.add(sb);
		
		JLabel hby = new JLabel("hobby");
		hby.setHorizontalAlignment(SwingConstants.LEFT);
		hby.setBounds(10, 171, 48, 14);
		panel.add(hby);
		
		JLabel shl = new JLabel("school");
		shl.setHorizontalAlignment(SwingConstants.LEFT);
		shl.setBounds(10, 135, 48, 14);
		panel.add(shl);
		
		JButton rs = new JButton("reset");
		rs.setBounds(313, 195, 89, 23);
		panel.add(rs);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(66, 132, 86, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(66, 168, 86, 20);
		panel.add(textField_4);
	}
}
