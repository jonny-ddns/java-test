package _past.j20201124_awt;
import java.awt.*;
public class AWT {
//예제소스.awt.배치관리
	public static void main(String[] args) {
		
		Frame f = new Frame();		
		
		// 프레임 셋팅
		f.setTitle("TEST");
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);				
		
		// 프레임의 레이아웃 설정
		f.setLayout(null);		
		
		// 컴포넌트 생성
		Button btn = new Button("버튼"); 
		Label lbl = new Label("라벨");
		Checkbox chkbox = new Checkbox("체크박스");
		CheckboxGroup chkGroup = new CheckboxGroup(); // 라디오
		Checkbox chk1 = new Checkbox("A", chkGroup, true); // 라디오 A값 추가
		Checkbox chk2 = new Checkbox("B", chkGroup, false); // 라디오 B값 추가
		Checkbox chk3 = new Checkbox("C", chkGroup, false); // 라디오 C값 추가, true는 최초 선택값
		Choice cho = new Choice(); // 콤보박스
		cho.addItem("1번 선택지"); // 콤보박스 추가
		cho.addItem("2번 선택지"); // 콤보박스 추가
		cho.addItem("3번 선택지"); // 콤보박스 추가
		TextArea txtarea = new TextArea("Textarea"); // Textarea (텍스트 여러줄 들어가는.. 메모장 생각)
		TextField txtfield = new TextField("textfield"); // Textfield (텍스트 한줄)

		// 컴포넌트 위치, 크기 설정
		//setBounds(x좌표, y좌표, 가로크기width, 세로크기height)
		btn.setBounds(50, 50, 50, 50);
		lbl.setBounds(150, 50, 50, 50);
		chkbox.setBounds(200, 50, 100, 50);
		chk1.setBounds(50, 100, 50, 50);
		chk2.setBounds(100, 100, 50, 50);
		chk3.setBounds(150, 100, 50, 50);
		cho.setBounds(50, 150, 100, 50);
		txtarea.setBounds(50, 200, 200, 50);
		txtfield.setBounds(50, 250, 200, 25);
		
		// 프레임에 컴포넌트를 붙인다
		f.add(btn);
		f.add(lbl);
		f.add(chkbox);
		f.add(chk1); // 라디오의 경우에는 만들어준 체크박스 1,2,3을 모두 붙여야 함
		f.add(chk2);
		f.add(chk3);
		f.add(cho);
		f.add(txtarea);
		f.add(txtfield);
	}
}