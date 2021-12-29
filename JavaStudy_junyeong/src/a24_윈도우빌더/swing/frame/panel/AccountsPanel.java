package a24_윈도우빌더.swing.frame.panel;

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

import a24_윈도우빌더.service.AccountsService;
import a24_윈도우빌더.session.Principal;
import a24_윈도우빌더.swing.dto.AccountsDto;
import lombok.Data;

@Data
public class AccountsPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel mainPanel;
	private CardLayout mainCard;
	
	private Principal principal;
	private AccountsService accountsService;

	private static AccountsPanel instance = new AccountsPanel();
	private JTextField nameText;
	private JPasswordField passwordText;
	private JPasswordField pwConfirmText;
	private JTextField emailText;	
	
	public static AccountsPanel getInstance() {
		if(instance == null) {
			instance = new AccountsPanel();
		}
		return instance;
	}
	
	public AccountsPanel() {
		setLayout(null);
		setSize(700, 400);
		
		principal = Principal.getInstance();
		accountsService = new AccountsService();
		
		JLabel titleLbl = new JLabel("\uD68C\uC6D0 \uC815\uBCF4 \uC218\uC815 \uD398\uC774\uC9C0");
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		titleLbl.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		titleLbl.setBounds(200, 10, 268, 44);
		add(titleLbl);
		
		JLabel nameLbl = new JLabel("\uC774\uB984");
		nameLbl.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		nameLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		nameLbl.setBounds(26, 132, 59, 30);
		add(nameLbl);
		
		nameText = new JTextField();
		nameText.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		nameText.setBounds(99, 132, 173, 30);
		add(nameText);
		nameText.setColumns(10);
		
		passwordText = new JPasswordField();
		passwordText.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		passwordText.setColumns(10);
		passwordText.setBounds(418, 132, 184, 30);
		add(passwordText);
		
		JLabel passwordLbl = new JLabel("\uBE44\uBC00\uBC88\uD638");
		passwordLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordLbl.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		passwordLbl.setBounds(312, 132, 92, 30);
		add(passwordLbl);
		
		pwConfirmText = new JPasswordField();
		pwConfirmText.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		pwConfirmText.setColumns(10);
		pwConfirmText.setBounds(418, 200, 184, 30);
		add(pwConfirmText);
		
		JLabel pwConfirmLbl = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		pwConfirmLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		pwConfirmLbl.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		pwConfirmLbl.setBounds(312, 200, 92, 30);
		add(pwConfirmLbl);
		
		emailText = new JTextField();
		emailText.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		emailText.setColumns(10);
		emailText.setBounds(99, 200, 173, 30);
		add(emailText);
		
		JLabel emailLbl = new JLabel("\uC774\uBA54\uC77C");
		emailLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		emailLbl.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		emailLbl.setBounds(26, 200, 59, 30);
		add(emailLbl);
		
		JButton modifyBtn = new JButton("\uC218\uC815\uD558\uAE30");
		modifyBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isEmpty(nameText.getText(), nameLbl.getText()) && !isEmpty(emailText.getText(), emailLbl.getText())) {
					AccountsDto accountsDto = new AccountsDto();
					accountsDto.setName(nameText.getText());
					accountsDto.setEmail(emailText.getText());
					if(accountsService.UpdateProfile(accountsDto)) {
						JOptionPane.showMessageDialog(null, "회원 정보 수정 완료", "완료", JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
		});
		modifyBtn.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		modifyBtn.setBounds(73, 277, 135, 30);
		add(modifyBtn);
		
		JButton goBackBtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		goBackBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nameText.setText("");
				emailText.setText("");
				passwordText.setText("");
				pwConfirmText.setText("");
				mainCard.show(mainPanel, "indexPanel");
			}
		});
		goBackBtn.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		goBackBtn.setBounds(12, 10, 97, 23);
		add(goBackBtn);
		
		JButton modifyPwBtn = new JButton("\uC218\uC815\uD558\uAE30");
		modifyPwBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String password = passwordText.getText();
				String pwConfirm = pwConfirmText.getText();
				
				if(password.equals(pwConfirm)) {
					String originPw = JOptionPane.showInputDialog(null, "기존의 비밀번호를 입력해주세요.", "비밀번호 인증", JOptionPane.INFORMATION_MESSAGE);
					
					if(originPw.equals(principal.getUser().getPassword())) {
						AccountsDto accountsDto = new AccountsDto();
						accountsDto.setPassword(password);
						accountsService.UpdatePassword(accountsDto);
						JOptionPane.showMessageDialog(null, "회원 정보 수정 완료", "완료", JOptionPane.PLAIN_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "기존의 비밀번호와 일치하지 않습니다.\n비밀번호를 다시 한번 확인해주세요. ", "비밀번호 오류", JOptionPane.WARNING_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "입력한 비밀번호가 서로 다릅니다.", "비밀번호 오류", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		modifyPwBtn.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		modifyPwBtn.setBounds(406, 283, 135, 30);
		add(modifyPwBtn);
		
		
	}
	
	public void setCard(JPanel mainPanel, CardLayout mainCard) {
		this.mainPanel = mainPanel;
		this.mainCard = mainCard;
	}
	
	public boolean isEmpty(String str, String label) {
		if(str.length() == 0) {
			JOptionPane.showMessageDialog(null, label + "은(는) 빈 값일 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
			return true;
		} else {
			return false;
		}
	}
}
