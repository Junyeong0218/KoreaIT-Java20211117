package a24_윈도우빌더.swing.frame.panel;

import java.awt.CardLayout;
import java.awt.Color;
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
import javax.swing.border.LineBorder;

import a24_윈도우빌더.service.AuthService;
import a24_윈도우빌더.session.Principal;
import a24_윈도우빌더.swing.dto.SigninDto;

public class SigninPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private AuthService authService;
	private JTextField usernameText;
	private JPasswordField passwordText;
	private Principal principal;
	private IndexPanel indexPanel;

	public SigninPanel(JPanel mainPanel, CardLayout mainCard) {
		
		authService = new AuthService();
		principal = Principal.getInstance();
		indexPanel = IndexPanel.getInstance();
		
		setLayout(null);
		setSize(700, 400);
		
		JLabel signinTitle = new JLabel("JAVA \uC2A4\uC719 \uC218\uC5C5");
		signinTitle.setHorizontalAlignment(SwingConstants.CENTER);
		signinTitle.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		signinTitle.setBounds(268, 50, 150, 60);
		add(signinTitle);
		
		JPanel signinItems = new JPanel();
		signinItems.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		signinItems.setBackground(Color.WHITE);
		signinItems.setBounds(200, 120, 290, 170);
		add(signinItems);
		signinItems.setLayout(null);
		
		JLabel usernameLbl = new JLabel("\uC544\uC774\uB514");
		usernameLbl.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		usernameLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		usernameLbl.setBounds(31, 34, 57, 15);
		signinItems.add(usernameLbl);
		
		usernameText = new JTextField();
		usernameText.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		usernameText.setBounds(97, 31, 154, 21);
		signinItems.add(usernameText);
		usernameText.setColumns(10);
		
		JLabel passwordLbl = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		passwordLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordLbl.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		passwordLbl.setBounds(32, 67, 57, 15);
		signinItems.add(passwordLbl);
		
		passwordText = new JPasswordField();
		passwordText.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		passwordText.setBounds(97, 64, 154, 21);
		signinItems.add(passwordText);
		
		JButton signinBtn = new JButton("\uB85C\uADF8\uC778");
		signinBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SigninDto signinDto = new SigninDto(usernameText.getText(), passwordText.getText());
				int result = authService.signin(signinDto);
				
				if(result == 2) {
					// 로그인 성공
					usernameText.setText("");
					passwordText.setText("");
					JOptionPane.showMessageDialog(null, principal.getUser().getName() + "님 환영합니다.", "로그인 성공", JOptionPane.PLAIN_MESSAGE);
					indexPanel.getProfileBtn().setText(principal.getUser().getUsername() + "님의 회원정보");
					mainCard.show(mainPanel, "indexPanel");
				} else if(result == 0) {
					JOptionPane.showMessageDialog(null, "존재하지 않는 아이디입니다.", "아이디 오류", JOptionPane.WARNING_MESSAGE);
					//JOptionPane.showConfirmDialog(null, "존재하지 않는 아이디입니다.", "아이디 오류", JOptionPane.WARNING_MESSAGE); // yes == 0 | no == 1
					//JOptionPane.showInputDialog(null, "존재하지 않는 아이디입니다.", "아이디 오류", JOptionPane.WARNING_MESSAGE); // yes == input text -> String
				} else if(result == 1) {
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.", "비밀번호 오류", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		signinBtn.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		signinBtn.setBounds(97, 113, 97, 23);
		signinItems.add(signinBtn);

	}
}
