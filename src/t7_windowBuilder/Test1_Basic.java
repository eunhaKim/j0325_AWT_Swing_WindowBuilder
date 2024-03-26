package t7_windowBuilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Test1_Basic extends JFrame {

	private JPanel contentPane; // 기본 프레임
	private JTextField txtName, txtKor, txtEng, txtMat;
	private JButton btnInput, btnReset, btnExit;

	public Test1_Basic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 350);
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("그린중학교 성적표");
		lblTitle.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(12, 26, 210, 37);
		getContentPane().add(lblTitle);
		
		JLabel lblName = new JLabel("성명");
		lblName.setBounds(19, 85, 57, 15);
		getContentPane().add(lblName);
		
		JLabel lblKor = new JLabel("국어점수");
		lblKor.setBounds(19, 121, 57, 15);
		getContentPane().add(lblKor);
		
		JLabel lblEng = new JLabel("영어점수");
		lblEng.setBounds(19, 155, 57, 15);
		getContentPane().add(lblEng);
		
		JLabel lblMat = new JLabel("수학점수");
		lblMat.setBounds(19, 191, 57, 15);
		getContentPane().add(lblMat);
		
		txtName = new JTextField();
		txtName.setBounds(106, 79, 116, 21);
		getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtKor = new JTextField();
		txtKor.setColumns(10);
		txtKor.setBounds(106, 115, 116, 21);
		getContentPane().add(txtKor);
		
		txtEng = new JTextField();
		txtEng.setColumns(10);
		txtEng.setBounds(106, 149, 116, 21);
		getContentPane().add(txtEng);
		
		txtMat = new JTextField();
		txtMat.setColumns(10);
		txtMat.setBounds(106, 185, 116, 21);
		getContentPane().add(txtMat);
		
		btnInput = new JButton("입력");
		
		btnInput.setBounds(12, 241, 97, 23);
		getContentPane().add(btnInput);
		
		btnReset = new JButton("다시입력");
		
		btnReset.setBounds(125, 241, 97, 23);
		getContentPane().add(btnReset);
		
		btnExit = new JButton("종료");
		
		btnExit.setBounds(12, 266, 210, 23);
		getContentPane().add(btnExit);
		
		// 위쪽은 디자인
		setVisible(true);
		// 아래쪽은 메소드
		
		// 입력 버튼
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		// 다시입력 버튼
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtKor.setText("");
				txtEng.setText("");
				txtMat.setText("");
				txtName.requestFocus();
			}
		});
		
		// 종료 버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(null, "작업을 종료하시겠습니까?","",JOptionPane.YES_NO_OPTION);
				if(ans == 0) System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new Test1_Basic();
	}
}
