package a24_À©µµ¿ìºô´õ.swing.frame.panel;

import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import a24_À©µµ¿ìºô´õ.session.Principal;
import lombok.Data;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@Data
public class IndexPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JButton profileBtn;
	private JPanel mainPanel;
	private CardLayout mainCard;
	
	private AccountsPanel accountsPanel;
	
	private Principal principal;
	
	private static IndexPanel instance = new IndexPanel();
	
	public IndexPanel() {
		setLayout(null);
		setSize(700, 400);
		
		accountsPanel = AccountsPanel.getInstance();
		principal = Principal.getInstance();
		
		JLabel indexTitleLbl = new JLabel("JAVA \uC2A4\uC719 \uC218\uC5C5");
		indexTitleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		indexTitleLbl.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		indexTitleLbl.setBounds(12, 10, 129, 29);
		add(indexTitleLbl);
		
		profileBtn = new JButton();
		profileBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				accountsPanel.getNameText().setText(principal.getUser().getName());
				accountsPanel.getEmailText().setText(principal.getUser().getEmail());
				mainCard.show(mainPanel, "accountsPanel");
			}
		});
		profileBtn.setBounds(345, 10, 170, 29);
		add(profileBtn);
		
		JButton logoutBtn = new JButton("\uB85C\uADF8\uC544\uC6C3");
		logoutBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				principal.setUser(null);
				mainCard.show(mainPanel, "signinPanel");
			}
		});
		logoutBtn.setBounds(542, 10, 120, 29);
		add(logoutBtn);
	}
	
	public static IndexPanel getInstance() {
		if(instance == null) {
			instance = new IndexPanel();
		}
		return instance;
	}

	public void setCard(JPanel mainPanel, CardLayout mainCard) {
		this.mainPanel = mainPanel;
		this.mainCard = mainCard;
	}
}
