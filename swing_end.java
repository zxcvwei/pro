import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class swing_end extends JFrame {
	private JButton jbtnExit = new JButton("Exit");
	private JButton jbtnStart = new JButton("Start");
	private boolean Start = true;
	private JLabel jlb1 = new JLabel("kill pandas");
	private JButton jbtEasy = new JButton("Easy");
	private JButton jbtMiddle = new JButton("Middle");
	private JButton jbtHard = new JButton("Hard");
	private Container cp;

	public swing_end() {
		initComp();
	}

	public void initComp() {
		cp = this.getContentPane();
		this.setBounds(150, 100, 600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(null);

		jlb1.setBounds(220, 70, 250, 25);
		jlb1.setFont(new Font(null, 1, 24));
		cp.add(jlb1);

		jbtnExit.setBounds(220, 135, 125, 30);
		cp.add(jbtnExit);
		jbtnExit.setFont(new Font(null, 0, 18));
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent aa) {
				System.exit(0);
			}
		});
		jbtnStart.setBounds(220, 100, 125, 30);
		cp.add(jbtnStart);
		jbtnStart.setFont(new Font(null, 0, 18));
		jbtnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Start) {
					jbtnStart.setText("Pause");
				} else {
					jbtnStart.setText("Start");
				}
				Start = !Start;
			}
		});
		
		jbtEasy.setBounds(220, 170, 125, 30);
		jbtEasy.setFont(new Font(null, 0, 18));
		cp.add(jbtEasy);
		
		jbtMiddle.setBounds(220, 205, 125, 30);
		jbtMiddle.setFont(new Font(null, 0, 18));
		cp.add(jbtMiddle);
		
		jbtHard.setBounds(220, 240, 125, 30);
		jbtHard.setFont(new Font(null, 0, 18));
		cp.add(jbtHard);

	}
}
