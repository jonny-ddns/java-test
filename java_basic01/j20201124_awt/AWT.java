package _past.j20201124_awt;
import java.awt.*;
public class AWT {
//�����ҽ�.awt.��ġ����
	public static void main(String[] args) {
		
		Frame f = new Frame();		
		
		// ������ ����
		f.setTitle("TEST");
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);				
		
		// �������� ���̾ƿ� ����
		f.setLayout(null);		
		
		// ������Ʈ ����
		Button btn = new Button("��ư"); 
		Label lbl = new Label("��");
		Checkbox chkbox = new Checkbox("üũ�ڽ�");
		CheckboxGroup chkGroup = new CheckboxGroup(); // ����
		Checkbox chk1 = new Checkbox("A", chkGroup, true); // ���� A�� �߰�
		Checkbox chk2 = new Checkbox("B", chkGroup, false); // ���� B�� �߰�
		Checkbox chk3 = new Checkbox("C", chkGroup, false); // ���� C�� �߰�, true�� ���� ���ð�
		Choice cho = new Choice(); // �޺��ڽ�
		cho.addItem("1�� ������"); // �޺��ڽ� �߰�
		cho.addItem("2�� ������"); // �޺��ڽ� �߰�
		cho.addItem("3�� ������"); // �޺��ڽ� �߰�
		TextArea txtarea = new TextArea("Textarea"); // Textarea (�ؽ�Ʈ ������ ����.. �޸��� ����)
		TextField txtfield = new TextField("textfield"); // Textfield (�ؽ�Ʈ ����)

		// ������Ʈ ��ġ, ũ�� ����
		//setBounds(x��ǥ, y��ǥ, ����ũ��width, ����ũ��height)
		btn.setBounds(50, 50, 50, 50);
		lbl.setBounds(150, 50, 50, 50);
		chkbox.setBounds(200, 50, 100, 50);
		chk1.setBounds(50, 100, 50, 50);
		chk2.setBounds(100, 100, 50, 50);
		chk3.setBounds(150, 100, 50, 50);
		cho.setBounds(50, 150, 100, 50);
		txtarea.setBounds(50, 200, 200, 50);
		txtfield.setBounds(50, 250, 200, 25);
		
		// �����ӿ� ������Ʈ�� ���δ�
		f.add(btn);
		f.add(lbl);
		f.add(chkbox);
		f.add(chk1); // ������ ��쿡�� ������� üũ�ڽ� 1,2,3�� ��� �ٿ��� ��
		f.add(chk2);
		f.add(chk3);
		f.add(cho);
		f.add(txtarea);
		f.add(txtfield);
	}
}