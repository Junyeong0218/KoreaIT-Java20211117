package a24_À©µµ¿ìºô´õ.swing.frame.panel;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class WelcomePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public WelcomePanel(JPanel mainPanel, CardLayout mainCard) {
		setLayout(null);
		setSize(700, 400);
		
		JLabel welcomeTitle = new JLabel("JAVA \uC2A4\uC719 \uC218\uC5C5");
		welcomeTitle.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		welcomeTitle.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeTitle.setBounds(268, 87, 150, 60);
		add(welcomeTitle);
		
		JButton startBtn = new JButton("\uC2DC\uC791\uD558\uAE30");
		startBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "signinPanel");
			}
		});
		startBtn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		startBtn.setBounds(288, 209, 97, 23);
		add(startBtn);

	}
}
