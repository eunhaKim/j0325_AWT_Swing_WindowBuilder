package t8_insa;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InsaSearch extends JFrame{
	private JTextField txtName;
	private JTextField txtAge;
	private final ButtonGroup btnGroupGender = new ButtonGroup();
	JComboBox cbYY, cbMM, cbDD;
	JButton btnInput, btnReset, btnExit;
	
	InsaDAO dao = new InsaDAO();
	InsaVO vo = null;
	int res = 0;
	
	public InsaSearch(InsaVO vo) {
		super("회원개별조회");
		setSize(800,600);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 446, 79);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원개별조회(수정/삭제처리)");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 422, 59);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBackground(new Color(255, 255, 255));
		pn2.setBounds(0, 76, 446, 389);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblName = new JLabel("성명");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("굴림", Font.PLAIN, 16));
		lblName.setBounds(12, 85, 164, 36);
		pn2.add(lblName);
		
		JLabel lblAge = new JLabel("나이");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("굴림", Font.PLAIN, 16));
		lblAge.setBounds(12, 131, 164, 36);
		pn2.add(lblAge);
		
		JLabel lblGender = new JLabel("성별");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("굴림", Font.PLAIN, 16));
		lblGender.setBounds(12, 177, 164, 36);
		pn2.add(lblGender);
		
		JLabel lblIpsail = new JLabel("입사일");
		lblIpsail.setHorizontalAlignment(SwingConstants.CENTER);
		lblIpsail.setFont(new Font("굴림", Font.PLAIN, 16));
		lblIpsail.setBounds(12, 224, 164, 36);
		pn2.add(lblIpsail);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setFont(new Font("굴림", Font.PLAIN, 16));
		txtName.setBounds(167, 85, 164, 36);
		pn2.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("굴림", Font.PLAIN, 16));
		txtAge.setColumns(10);
		txtAge.setBounds(167, 131, 164, 36);
		pn2.add(txtAge);
		
		JRadioButton rdGenderMale = new JRadioButton("남자");
		btnGroupGender.add(rdGenderMale);
		rdGenderMale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdGenderMale.setBounds(167, 185, 70, 23);
		pn2.add(rdGenderMale);
		
		JRadioButton rdGenderFemale = new JRadioButton("여자");
		btnGroupGender.add(rdGenderFemale);
		rdGenderFemale.setSelected(true);
		rdGenderFemale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdGenderFemale.setBounds(241, 184, 70, 23);
		pn2.add(rdGenderFemale);
		
		// 년도/월/일 초기값 생성하기
		String[] yy = new String[25];
		String[] mm = new String[12];
		String[] dd = new String[31];
		
		int imsi=0;
		for(int i=0; i<yy.length ; i++) {
			imsi = 2024-i;
			yy[i] = imsi + "";
		}
		for(int i=0; i<mm.length ; i++) {
			mm[i] = (i+1) + "";
		}
		for(int i=0; i<dd.length ; i++) {
			dd[i] = (i+1) + "";
		}
		
		// DB의 날짜 형식을 콤보상자의 날짜형식과 일치시켜서 비교하기 위한 작업
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-M-d");
		LocalDate date = LocalDate.parse(vo.getIpsail().substring(0,10), dtf);
		String strDate = date.format(dtf);
		
		String[] ymds = strDate.split("-");
		
		
		cbYY = new JComboBox(yy);
		cbYY.setFont(new Font("굴림", Font.PLAIN, 16));
		cbYY.setBounds(167, 230, 70, 23);
		cbYY.setSelectedItem(ymds[0]);
		pn2.add(cbYY);
		
		cbMM = new JComboBox(mm);
		cbMM.setFont(new Font("굴림", Font.PLAIN, 16));
		cbMM.setBounds(261, 230, 70, 23);
		cbMM.setSelectedItem(ymds[1]);
		pn2.add(cbMM);
		
		cbDD = new JComboBox(dd);
		cbDD.setFont(new Font("굴림", Font.PLAIN, 16));
		cbDD.setBounds(351, 230, 70, 23);
		cbDD.setSelectedItem(ymds[2]);
		pn2.add(cbDD);
		
		JLabel lblNewLabel_1 = new JLabel("년");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(237, 234, 28, 15);
		pn2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("월");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(334, 234, 28, 15);
		pn2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("일");
		lblNewLabel_1_2.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(424, 234, 28, 15);
		pn2.add(lblNewLabel_1_2);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 472, 446, 79);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnInput = new JButton("수정하기");
		
		btnInput.setBounds(38, 22, 97, 47);
		pn3.add(btnInput);
		
		btnReset = new JButton("삭제하기");
		
		btnReset.setBounds(173, 22, 97, 47);
		pn3.add(btnReset);
		
		btnExit = new JButton("창닫기");
		
		btnExit.setBounds(308, 22, 97, 47);
		pn3.add(btnExit);
		
		// vo에 담겨서 넘어온 회원의 정보를 검색창에 뿌려주도록 한다.
		txtName.setText(vo.getName());
		txtAge.setText(vo.getAge()+"");
		if(vo.getGender().equals("남자")) rdGenderMale.setSelected(true);
		else rdGenderFemale.setSelected(true);
		
		
		
		
		// ----------------------- 위쪽은 UI ----------------------------------------
		setLocationRelativeTo(null); // 윈도우 창 가운데 정렬
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 종료 버튼 활성화
		setVisible(true);
		// ----------------------- 아래쪽은 메소드 ------------------------------------
		
		// 가입하기
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name =txtName.getText().trim();
				String age = txtAge.getText().trim();
				String gender = "";
				String ipsail = cbYY.getSelectedItem()+"-"+cbMM.getSelectedItem()+"-"+cbDD.getSelectedItem();
				
				// 유효성 검사
				if(name.equals("")) {
					JOptionPane.showMessageDialog(null, "성명을 입력하세요");
					txtName.requestFocus();
				}
				else if(!Pattern.matches("^[0-9]+$", age)) {
					JOptionPane.showMessageDialog(null, "나이은 숫자로 입력하세요");
					txtAge.requestFocus();
				}
				else {
					if(rdGenderMale.isSelected()) gender = "남자";
					else gender = "여자";
					
					// 모든 체크가 끝나면 DB에 새로운 회원을 가입처리한다.
					// 회원명 중복처리
//					vo = dao.getNameSerch(name);
//					if(vo.getName() != null) {
//						JOptionPane.showMessageDialog(null, "이미 가입된 회원입니다. 다시 성명을 입력해주세요.");
//						txtName.requestFocus();
//					}
//					else {
//						// 정상적으로 자료가 입력되었다면 vo에 담아져 있는 겂을 DB에 저장한다.
//						vo.setName(name);
//						vo.setAge(Integer.parseInt(age));
//						vo.setGender(gender);
//						vo.setIpsail(ipsail);
//						
//						res = dao.setInsaInput(vo);
//						
//						if(res != 0) {
//							JOptionPane.showMessageDialog(null, "회원에 가입되셨습니다.");
//							dispose();
//							new InsaMain();
//						}
//						else {
//							JOptionPane.showMessageDialog(null, "회원에 가입실패입니다. 다시 가입해주세요.");
//							txtName.requestFocus();
//						}
//					}
				}
				
			}
		});
		
		// 다시입력
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtAge.setText("");
				txtName.requestFocus();
			}
		});
		
		// 종료
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
				dispose();
				new InsaMain();
			}
		});
		
		
	}
// 연습할때만 살려둔다.
//	public static void main(String[] args) {
//		new InsaSearch();
//	}
}
