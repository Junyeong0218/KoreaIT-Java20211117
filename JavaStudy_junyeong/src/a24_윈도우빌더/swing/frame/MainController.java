package a24_���������.swing.frame;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import a24_���������.swing.frame.panel.AccountsPanel;
import a24_���������.swing.frame.panel.IndexPanel;
import a24_���������.swing.frame.panel.SigninPanel;
import a24_���������.swing.frame.panel.SignupPanel;
import a24_���������.swing.frame.panel.WelcomePanel;

public class MainController extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel mainPanel;
	private CardLayout mainCard;

	public static void main(String[] args) {
		// ���� Ŭ����(== �͸� Ŭ���� == ��ϸӽ� Ŭ����)
		// ���� interface �� Ŭ������ �����ؼ� ����ϴ� ��������, �� ���� �� �������̽���� interface�� �����ؼ� �ٷ� Override �ؼ� ����Ѵ�.
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainController frame = new MainController();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainController() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 400);
		setLocationRelativeTo(null);
		
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainCard = new CardLayout();
		mainPanel.setLayout(mainCard);
		mainPanel.setBounds(0, 0, 700, 400);
		setContentPane(mainPanel);
		
		JPanel welcomePanel = new WelcomePanel(mainPanel, mainCard);
		JPanel signinPanel = new SigninPanel(mainPanel, mainCard);
		SignupPanel signupPanel = SignupPanel.getInstance();
		signupPanel.setCard(mainPanel, mainCard);
		IndexPanel indexPanel = IndexPanel.getInstance();
		indexPanel.setCard(mainPanel, mainCard);
		AccountsPanel accountsPanel = AccountsPanel.getInstance();
		accountsPanel.setCard(mainPanel, mainCard);
		
		mainPanel.add(welcomePanel, "welcomePanel");
		mainPanel.add(signinPanel, "signinPanel");
		mainPanel.add(signupPanel, "signupPanel");
		mainPanel.add(indexPanel, "indexPanel");
		mainPanel.add(accountsPanel, "accountsPanel");
	}
	
	

}
