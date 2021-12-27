package a24_윈도우빌더.swing.frame;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import a24_윈도우빌더.swing.frame.panel.AccountsPanel;
import a24_윈도우빌더.swing.frame.panel.IndexPanel;
import a24_윈도우빌더.swing.frame.panel.SigninPanel;
import a24_윈도우빌더.swing.frame.panel.SignupPanel;
import a24_윈도우빌더.swing.frame.panel.WelcomePanel;

public class MainController extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel mainPanel;
	private CardLayout mainCard;

	public static void main(String[] args) {
		// 무명 클래스(== 익명 클래스 == 어나니머스 클래스)
		// 원래 interface 는 클래스에 구현해서 사용하는 것이지만, 한 번만 쓸 인터페이스라면 interface를 생성해서 바로 Override 해서 사용한다.
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
		setBounds(100, 100, 700, 400);
		
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainCard = new CardLayout();
		mainPanel.setLayout(mainCard);
		mainPanel.setSize(700, 400);
		setContentPane(mainPanel);
		
		JPanel welcomePanel = new WelcomePanel(mainPanel, mainCard);
		JPanel signinPanel = new SigninPanel(mainPanel, mainCard);
		JPanel signupPanel = new SignupPanel(mainPanel, mainCard);
		JPanel indexPanel = new IndexPanel(mainPanel, mainCard);
		JPanel accountsPanel = new AccountsPanel(mainPanel, mainCard);
		
		mainPanel.add(welcomePanel, "welcomePanel");
		mainPanel.add(signinPanel, "signinPanel");
		mainPanel.add(signupPanel, "signupPanel");
		mainPanel.add(indexPanel, "indexPanel");
		mainPanel.add(accountsPanel, "accountsPanel");
	}
	
	

}
