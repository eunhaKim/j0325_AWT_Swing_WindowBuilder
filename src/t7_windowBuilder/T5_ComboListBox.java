package t7_windowBuilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class T5_ComboListBox extends JFrame{
	JButton btnCombo, btnExit, btnList1, btnList2;
	JComboBox comboJob;
	JLabel lblMessage;
	
	public T5_ComboListBox() {
		super("콤보상자 연습");
		getContentPane().setBackground(new Color(0, 0, 0));
		setSize(600,500);
		getContentPane().setLayout(null);
		
		JPanel pn4 = new JPanel();
		pn4.setBounds(0, 384, 584, 77);
		getContentPane().add(pn4);
		pn4.setLayout(null);
		
		lblMessage = new JLabel("출력메시지");
		lblMessage.setFont(new Font("굴림", Font.PLAIN, 16));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(12, 10, 560, 57);
		pn4.add(lblMessage);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 341, 584, 46);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnCombo = new JButton("콤보출력");
		btnCombo.setBounds(12, 16, 90, 23);
		pn3.add(btnCombo);
		
		btnExit = new JButton("종료버튼");
		btnExit.setBounds(390, 16, 97, 23);
		pn3.add(btnExit);
		
		btnList1 = new JButton("리스트상자출력1");
		btnList1.setBounds(114, 16, 128, 23);
		pn3.add(btnList1);
		
		btnList2 = new JButton("리스트상자출력2");
		btnList2.setBounds(250, 16, 128, 23);
		pn3.add(btnList2);
		
		JPanel pn1 = new JPanel();
		pn1.setBackground(new Color(255, 255, 255));
		pn1.setBounds(0, 10, 285, 325);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("직업을 선택하세요");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 10, 268, 27);
		pn1.add(lblNewLabel);
		
		comboJob = new JComboBox();
		comboJob.setBackground(new Color(255, 255, 255));
		comboJob.setForeground(new Color(0, 0, 0));
		comboJob.setModel(new DefaultComboBoxModel(new String[] {"학생", "회사원", "군인", "변호사", "의사", "선생님", "공무원", "기타"}));
		comboJob.setFont(new Font("굴림", Font.PLAIN, 16));
		comboJob.setBounds(12, 49, 268, 23);
		pn1.add(comboJob);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 83, 268, 150);
		pn1.add(scrollPane_1);
		
		JTextArea txtaMemo = new JTextArea();
		scrollPane_1.setViewportView(txtaMemo);
		
		JPanel pn2 = new JPanel();
		pn2.setBackground(new Color(255, 128, 128));
		pn2.setBounds(292, 10, 292, 325);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JList listJob = new JList();
		listJob.setModel(new AbstractListModel() {
			String[] values = new String[] {"학생", "의사", "변호사", "회계사", "판사", "군인", "공무원", "간호사", "역무원", "기타"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listJob.setBounds(12, 10, 189, 131);
		pn2.add(listJob);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 159, 256, 131);
		pn2.add(scrollPane);
		
		JList listJob2 = new JList();
		listJob2.setModel(new AbstractListModel() {
			String[] values = new String[] {"학생", "의사", "변호사", "회계사", "판사", "군인", "공무원", "간호사", "역무원", "기타"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(listJob2);

		
		// ----------------------- 위쪽은 UI ----------------------------------------
		setLocationRelativeTo(null); // 윈도우 창 가운데 정렬
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 종료 버튼 활성화
		setVisible(true);
		// ----------------------- 아래쪽은 메소드 ------------------------------------
		
		
		// 콤보상자의 내용 출력하는 부분
		btnCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = comboJob.getSelectedItem().toString()+"("+comboJob.getSelectedIndex()+")";
				lblMessage.setText(msg);
				
			}
		});
		
		// 리스트상자출력1...버튼
		btnList1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
//				Object[] jobs = listJob.getSelectedValues();
				Object[] jobs = listJob.getSelectedValuesList().toArray();
				for(Object job :jobs) {
					msg += job+"/";
				}
				msg = msg.substring(0,msg.length()-1);
				lblMessage.setText(msg);
			}
		});
		
		/* // 리스트상자 출력2...버튼 
		btnList2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
				Object[] jobs = listJob2.getSelectedValuesList().toArray();
				for(Object job : jobs) {
//					msg += job + "\n"; 
					msg += job + "\n"; 
				}
//				msg = msg.substring(0,msg.length()-1);
				txtaMemo.setText(msg);
				
			}
		}); */
		
		// 리스트상자 출력2...버튼 
		btnList2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtaMemo.append(listJob2.getSelectedValue()+"\n");
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
		new T5_ComboListBox();
	}
}
