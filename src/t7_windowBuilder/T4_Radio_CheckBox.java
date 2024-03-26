package t7_windowBuilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;

public class T4_Radio_CheckBox extends JFrame{
	JRadioButton rdMale, rdFemale;
	JCheckBox ckHobby1, ckHobby2, ckHobby3, ckHobby4;
	JButton btnGender,btnHobby, btnExit;
	JLabel lblMessage;
	private JLabel lblNewLabel_2;
	private final ButtonGroup btnGroupGender = new ButtonGroup();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public T4_Radio_CheckBox() {
		super("라디오/체크박스 연습");
		setSize(600, 400);
	
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBackground(new Color(0, 64, 64));
		pn1.setBounds(0, 21, 584, 40);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("라디오 체크박스연습");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(12, 10, 572, 20);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBackground(new Color(255, 255, 255));
		pn2.setBounds(0, 57, 584, 216);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("성별");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(42, 50, 75, 45);
		pn2.add(lblNewLabel_1);
		
		rdMale = new JRadioButton("남자");
		btnGroupGender.add(rdMale);
		rdMale.setBackground(new Color(255, 255, 255));
		rdMale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdMale.setBounds(136, 61, 75, 23);
		pn2.add(rdMale);
		
		rdFemale = new JRadioButton("여자");
		btnGroupGender.add(rdFemale);
		rdFemale.setBackground(new Color(255, 255, 255));
		rdFemale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdFemale.setBounds(244, 61, 75, 23);
		pn2.add(rdFemale);
		
		JLabel lblNewLabel_1_1 = new JLabel("취미");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(42, 90, 75, 45);
		pn2.add(lblNewLabel_1_1);
		
		ckHobby1 = new JCheckBox("등산");
		buttonGroup.add(ckHobby1);
		ckHobby1.setBackground(new Color(255, 255, 255));
		ckHobby1.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby1.setBounds(136, 101, 57, 23);
		pn2.add(ckHobby1);
		
		ckHobby2 = new JCheckBox("낚시");
		buttonGroup.add(ckHobby2);
		ckHobby2.setBackground(new Color(255, 255, 255));
		ckHobby2.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby2.setBounds(244, 101, 57, 23);
		pn2.add(ckHobby2);
		
		ckHobby3 = new JCheckBox("수영");
		buttonGroup.add(ckHobby3);
		ckHobby3.setBackground(new Color(255, 255, 255));
		ckHobby3.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby3.setBounds(352, 101, 57, 23);
		pn2.add(ckHobby3);
		
		ckHobby4 = new JCheckBox("바둑");
		buttonGroup.add(ckHobby4);
		ckHobby4.setBackground(new Color(255, 255, 255));
		ckHobby4.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby4.setBounds(460, 101, 57, 23);
		pn2.add(ckHobby4);
		
		lblMessage = new JLabel("메시지출력");
		lblMessage.setForeground(new Color(0, 64, 64));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("굴림", Font.BOLD, 16));
		lblMessage.setBounds(0, 161, 584, 45);
		pn2.add(lblMessage);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(39, 300, 483, 40);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnGender = new JButton("성별출력");
		btnGender.setBounds(48, 10, 97, 23);
		pn3.add(btnGender);
		
		btnHobby = new JButton("취미출력");
		btnHobby.setBounds(193, 10, 97, 23);
		pn3.add(btnHobby);
		
		btnExit = new JButton("종료");
		btnExit.setBounds(338, 10, 97, 23);
		pn3.add(btnExit);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(0, 0, 584, 23);
		getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(T4_Radio_CheckBox.class.getResource("/t7_windowBuilder/images/img1.jpg")));
		
		
		// ----------------------- 위쪽은 UI ----------------------------------------
		setLocationRelativeTo(null); // 윈도우 창 가운데 정렬
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 종료 버튼 활성화
		setVisible(true);
		// ----------------------- 아래쪽은 메소드 ------------------------------------
		
		// 성별출력버튼
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "선택하신 성별은 : ";
				if(rdMale.isSelected()) gender += rdMale.getText();
				else gender += rdFemale.getText();
				
				lblMessage.setText(gender);
			}
		});
		// 취미출력버튼
		btnHobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hobby = "";
				if(ckHobby1.isSelected()) hobby += ckHobby1.getText() + " / "; 
				if(ckHobby2.isSelected()) hobby += ckHobby2.getText() + " / "; 
				if(ckHobby3.isSelected()) hobby += ckHobby3.getText() + " / "; 
				if(ckHobby4.isSelected()) hobby += ckHobby4.getText() + " / ";
				
				hobby = hobby.substring(0,hobby.length()-3);
				
				lblMessage.setText("선택하신 취미는 ?" + hobby);
				JOptionPane.showMessageDialog(null, "선택된 취미는" + hobby);
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
		new T4_Radio_CheckBox();
	}
}
