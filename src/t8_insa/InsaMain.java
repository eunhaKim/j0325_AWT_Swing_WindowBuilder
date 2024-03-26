package t8_insa;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class InsaMain extends JFrame{
	JButton btnInput, btnSearch, btnList, btnExit;
	
	public InsaMain() {
		super("인사관리 메뉴");
		setSize(800,600);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 10, 464, 52);
		getContentPane().add(pn1);
		
		JLabel lblNewLabel = new JLabel("인사관리프로그램(v.1.0)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 61, 464, 409);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblMainImage = new JLabel("New label");
		lblMainImage.setIcon(new ImageIcon(InsaMain.class.getResource("/t8_insa/images/myImages/chun3.png")));
		lblMainImage.setBounds(0, 0, 452, 399);
		pn2.add(lblMainImage);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 468, 464, 93);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnInput = new JButton("사원등록");
		btnInput.setBounds(9, 20, 104, 55);
		pn3.add(btnInput);
		
		btnSearch = new JButton("개별조회");
		btnSearch.setBounds(122, 20, 104, 55);
		pn3.add(btnSearch);
		
		btnList = new JButton("전체조회");
		btnList.setBounds(235, 20, 104, 55);
		pn3.add(btnList);
		
		btnExit = new JButton("종료");
		btnExit.setBounds(348, 20, 104, 55);
		pn3.add(btnExit);
		
		// ----------------------- 위쪽은 UI ----------------------------------------
		setLocationRelativeTo(null); // 윈도우 창 가운데 정렬
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 종료 버튼 활성화
		setVisible(true);
		// ----------------------- 아래쪽은 메소드 ------------------------------------
		
		// 사원등록
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.exit(0); // 이렇게 닫으면 안된다!!
				dispose();
				new InsaInput();
			}
		});
		// 개별조회
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("검색할 성명을 입력하세요.");
				InsaDAO dao = new InsaDAO();
				InsaVO vo = dao.getNameSerch(name);
				
				if(vo.getName() == null) JOptionPane.showMessageDialog(null, "검색한 회원이 없습니다.");
				else {
					dispose();
					new InsaSearch(vo);					
				}
			}
		});
		// 전체조회
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		//종료
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		
	}
	public static void main(String[] args) {
		new InsaMain();
	}
}
