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
	private JTextField ln;
	private JTextField ag;
	protected JLabel dis;

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
		panel.setBounds(10, 0, 434, 261);
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
		
		JLabel lnl = new JLabel("last name");
		lnl.setBounds(10, 70, 46, 14);
		panel.add(lnl);
		
		ln = new JTextField();
		ln.setBounds(66, 67, 86, 20);
		panel.add(ln);
		ln.setColumns(10);
		
		JLabel agl = new JLabel("age");
		agl.setBounds(10, 104, 46, 14);
		panel.add(agl);
		
		ag = new JTextField();
		ag.setBounds(66, 101, 86, 20);
		panel.add(ag);
		ag.setColumns(10);
		
		JButton sb = new JButton("Submit");
		sb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String fn= fnl.setText("");
			String ln=  lnl.setText("");
			String ag=  agl.setText("");
		
			}
		});
		sb.setBounds(278, 53, 89, 23);
		panel.add(sb);
		
		JButton rs = new JButton("reset");
		rs.setBounds(278, 100, 89, 23);
		panel.add(rs);
	}
}
