package a24_���������.swing.frame.panel;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import a24_���������.service.AuthService;
import a24_���������.swing.dto.SignupDto;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class SignupPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel mainPanel;
	private CardLayout mainCard;
	private AuthService authService;

	private static SignupPanel instance = new SignupPanel();
	private JTextField usernameText;
	private JPasswordField passwordText;
	private JTextField nameText;
	private JTextField emailText;
	private boolean usernameCheckFlag = false;
	
	public SignupPanel() {
		authService = new AuthService();
		
		setLayout(null);
		setSize(700, 400);
		
		JLabel titleLbl = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		titleLbl.setFont(new Font("���� ���", Font.BOLD, 16));
		titleLbl.setBounds(234, 27, 197, 45);
		add(titleLbl);
		
		JLabel checkUsernameLbl = new JLabel("");
		checkUsernameLbl.setForeground(Color.BLACK);
		checkUsernameLbl.setFont(new Font("���� ���", Font.PLAIN, 12));
		checkUsernameLbl.setBounds(279, 93, 183, 15);
		add(checkUsernameLbl);
		
		JLabel usernameLbl = new JLabel("ID");
		usernameLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		usernameLbl.setFont(new Font("���� ���", Font.BOLD, 12));
		usernameLbl.setBounds(170, 110, 97, 25);
		add(usernameLbl);
		
		usernameText = new JTextField();
		usernameText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				usernameCheckFlag = false;
				checkUsernameLbl.setForeground(new Color(255, 0, 0));
				checkUsernameLbl.setText("���̵� �ߺ� üũ�� ���ּ���!");
			}
		});
		usernameText.setHorizontalAlignment(SwingConstants.LEFT);
		usernameText.setFont(new Font("���� ���", Font.PLAIN, 12));
		usernameText.setBounds(279, 110, 97, 25);
		add(usernameText);
		usernameText.setColumns(10);
		
		passwordText = new JPasswordField();
		passwordText.setHorizontalAlignment(SwingConstants.LEFT);
		passwordText.setFont(new Font("���� ���", Font.PLAIN, 12));
		passwordText.setColumns(10);
		passwordText.setBounds(279, 145, 183, 25);
		add(passwordText);
		
		JLabel passwordLbl = new JLabel("Password");
		passwordLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordLbl.setFont(new Font("���� ���", Font.BOLD, 12));
		passwordLbl.setBounds(170, 145, 97, 25);
		add(passwordLbl);
		
		nameText = new JTextField();
		nameText.setHorizontalAlignment(SwingConstants.LEFT);
		nameText.setFont(new Font("���� ���", Font.PLAIN, 12));
		nameText.setColumns(10);
		nameText.setBounds(279, 180, 183, 25);
		add(nameText);
		
		JLabel nameLbl = new JLabel("Name");
		nameLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		nameLbl.setFont(new Font("���� ���", Font.BOLD, 12));
		nameLbl.setBounds(170, 180, 97, 25);
		add(nameLbl);
		
		emailText = new JTextField();
		emailText.setHorizontalAlignment(SwingConstants.LEFT);
		emailText.setFont(new Font("���� ���", Font.PLAIN, 12));
		emailText.setColumns(10);
		emailText.setBounds(279, 215, 183, 25);
		add(emailText);
		
		JLabel emailLbl = new JLabel("Email");
		emailLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		emailLbl.setFont(new Font("���� ���", Font.BOLD, 12));
		emailLbl.setBounds(170, 215, 97, 25);
		add(emailLbl);
		
		JButton signupBtn = new JButton("\uAC00\uC785\uD558\uAE30");
		signupBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isEmpty(usernameText.getText(), usernameLbl) && 
				   !isEmpty(passwordText.getText(), passwordLbl) && 
				   !isEmpty(nameText.getText(), nameLbl) && 
				   !isEmpty(emailText.getText(), emailLbl)) {
					
					if(usernameCheckFlag) {
						SignupDto signupDto = new SignupDto();
						signupDto.setUsername(usernameText.getText());
						signupDto.setPassword(passwordText.getText());
						signupDto.setName(nameText.getText());
						signupDto.setEmail(emailText.getText());
						
						authService.signup(signupDto);
						
						JOptionPane.showMessageDialog(null, usernameText.getText() + "���� ������ ȯ���մϴ�.\n�����Ͻ� ���̵�� �α������ּ���.", "ȸ������ ����", JOptionPane.PLAIN_MESSAGE);
						usernameText.setText("");
						passwordText.setText("");
						nameText.setText("");
						emailText.setText("");
						mainCard.show(mainPanel, "signinPanel");
					} else {
						JOptionPane.showMessageDialog(null, "���̵� �ߺ� üũ�� ���� �ʾҰų� �ߺ��� ���̵��Դϴ�.", "���̵� �ߺ� üũ ����", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		signupBtn.setFont(new Font("���� ���", Font.BOLD, 12));
		signupBtn.setBounds(279, 301, 97, 23);
		add(signupBtn);
		
		JButton checkUsernameBtn = new JButton("\uC911\uBCF5\uCCB4\uD06C");
		checkUsernameBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(authService.checkUsername(usernameText.getText())) {
					JOptionPane.showMessageDialog(null, usernameText.getText() + "�� ���� ������ ���̵��Դϴ�.", "���� ����", JOptionPane.PLAIN_MESSAGE);
					checkUsernameLbl.setForeground(new Color(0, 0, 255));
					checkUsernameLbl.setText("���̵� �ߺ� üũ �Ϸ�!");
					usernameCheckFlag = true;
				} else {
					JOptionPane.showMessageDialog(null, usernameText.getText() + "�� �ߺ��� ���̵��Դϴ�.\n���ο� ���̵� �Է����ּ���.", "���̵� �ߺ� ����", JOptionPane.WARNING_MESSAGE);
					usernameCheckFlag = false;
				}
			}
		});
		checkUsernameBtn.setFont(new Font("���� ���", Font.PLAIN, 11));
		checkUsernameBtn.setBounds(381, 110, 81, 25);
		add(checkUsernameBtn);
		
		JButton goBackBtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		goBackBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "signinPanel");
			}
		});
		goBackBtn.setFont(new Font("���� ���", Font.BOLD, 12));
		goBackBtn.setBounds(12, 10, 97, 23);
		add(goBackBtn);
	}
	
	public static SignupPanel getInstance() {
		if(instance == null) {
			instance = new SignupPanel();
		}
		return instance;
	}
	
	public void setCard(JPanel mainPanel, CardLayout mainCard) {
		this.mainPanel = mainPanel;
		this.mainCard = mainCard;
	}
	
	private boolean isEmpty(String str, JLabel lbl) {
		if(str == null || str.equals("")) {
			JOptionPane.showMessageDialog(null, lbl.getText() + "�� �Էµ��� �ʾҽ��ϴ�.", "ȸ������ ����", JOptionPane.WARNING_MESSAGE);
			return true;
		} else {
			return false;
		}
	}
}
