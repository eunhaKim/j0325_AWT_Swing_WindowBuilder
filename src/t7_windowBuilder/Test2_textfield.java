package t7_windowBuilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class Test2_textfield extends JFrame {
	private JTextField txtMid, txtName, txtAge;
	JButton btnSubmit, btnReset, btnExit;
	private JPasswordField txtPwd;
	
	private String regAge = "^[0-9]+$";

	public Test2_textfield() {
		super("회원가입");
		setSize(600, 480);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBackground(new Color(0, 0, 0));
		pn1.setBounds(12, 10, 560, 62);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("회 원 가 입");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel.setBackground(new Color(255, 128, 128));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 536, 42);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 88, 560, 279);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblMid = new JLabel("아이디");
		lblMid.setForeground(new Color(255, 255, 255));
		lblMid.setHorizontalAlignment(SwingConstants.CENTER);
		lblMid.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblMid.setBounds(35, 28, 124, 34);
		pn2.add(lblMid);
		
		JLabel lblPwd = new JLabel("비밀번호");
		lblPwd.setForeground(new Color(255, 255, 255));
		lblPwd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPwd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblPwd.setBounds(35, 90, 124, 34);
		pn2.add(lblPwd);
		
		JLabel lblName = new JLabel("성 명");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblName.setBounds(35, 152, 124, 34);
		pn2.add(lblName);
		
		txtMid = new JTextField();
		txtMid.setFont(new Font("굴림", Font.PLAIN, 18));
		txtMid.setBounds(209, 23, 276, 41);
		pn2.add(txtMid);
		txtMid.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("굴림", Font.PLAIN, 18));
		txtName.setColumns(10);
		txtName.setBounds(209, 151, 276, 41);
		pn2.add(txtName);
		
		txtPwd = new JPasswordField();
		txtPwd.setBackground(new Color(255, 255, 255));
		txtPwd.setBounds(209, 79, 276, 45);
		pn2.add(txtPwd);

		JLabel lblAge = new JLabel("나 이");
		lblAge.setForeground(new Color(255, 255, 255));
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblAge.setBounds(35, 214, 124, 34);
		pn2.add(lblAge);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("굴림", Font.PLAIN, 18));
		txtAge.setColumns(10);
		txtAge.setBounds(209, 215, 276, 41);
		pn2.add(txtAge);
		
		JLabel lblImage = new JLabel("");
//		lblImage.setIcon(new ImageIcon("D:\\javaclass\\java\\works\\j0325_AWT_Swing_WindowBuilder\\myImages\\img1.jpg"));
//		lblImage.setIcon(new ImageIcon("./myImages/img1.jpg"));
		lblImage.setIcon(new ImageIcon(Test2_textfield.class.getResource("images/chun1.png")));
		lblImage.setBounds(12, 10, 536, 259);
		pn2.add(lblImage);
		
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 381, 560, 50);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnSubmit = new JButton("회원가입");
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setIcon(new ImageIcon(Test2_textfield.class.getResource("/t7_windowBuilder/images/btn.gif")));
		
		btnSubmit.setFont(new Font("굴림", Font.PLAIN, 18));
		btnSubmit.setBounds(43, 10, 86, 30);
		pn3.add(btnSubmit);
		
		btnReset = new JButton("다시입력");
		
		btnReset.setFont(new Font("굴림", Font.PLAIN, 18));
		btnReset.setBounds(218, 10, 118, 30);
		pn3.add(btnReset);
		
		btnExit = new JButton("종료");
		
		btnExit.setFont(new Font("굴림", Font.PLAIN, 18));
		btnExit.setBounds(394, 10, 118, 30);
		pn3.add(btnExit);
		
		// ----------------------- 위쪽은 UI ----------------------------------------
		setLocationRelativeTo(null); // 윈도우 창 가운데 정렬
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 종료 버튼 활성화
		setVisible(true);
		// ----------------------- 아래쪽은 메소드 ------------------------------------
		
		// 회원가입 버튼
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtMid.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요.");
					txtMid.requestFocus();
				}
				else if(txtPwd.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요.");
					txtPwd.requestFocus();
				}
				else if(txtName.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "성명를 입력하세요.");
					txtName.requestFocus();
				}
//				else if(txtAge.getText().trim().equals("")) {
//					JOptionPane.showMessageDialog(null, "나이를 입력하세요.");
//					txtAge.requestFocus();
//				}
				else if(!Pattern.matches(regAge, txtAge.getText().trim())) {
					JOptionPane.showMessageDialog(null, "나이는 숫자만 입력하세요.");
					txtAge.requestFocus();
				}
				else {
					JOptionPane.showMessageDialog(null, "회원가입완료!!");
				}
			}
		});
		// 다시입력
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMid.setText("");
				txtPwd.setText("");
				txtName.setText("");
				txtAge.setText("");
				txtMid.requestFocus();
			}
		});
		// 종료버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Test2_textfield();
	}
}
