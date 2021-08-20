package java_basic02.thread.ex204_waitNotify.test03;

//���� ��ü
public class Propose {
    private String propose;

    //����ȭ �޼��� - �������� �ϱ�
    public synchronized void setPropose(String propose){
        //�̹� ������� �ߴٸ� ���
        if(this.propose != null){
            try {
                wait();     //�ڽ��� �Ͻ����� ���� - ö���� ������ ����� ��ٸ���
            } catch (InterruptedException ie){
                ie.getMessage();
            }
        }
        this.propose = propose;
        System.out.println("ö���� ��� : "+ propose);
        notify();           //���� �Ͻ����� ����
    }

    //����ȭ �޼��� - �������� �ޱ�
    public synchronized String getPropose(){
        //���� ������� ���� �ʾҴٸ� ���
        if(this.propose == null){
            try {
                wait();     //�ڽ��� �Ͻ����� ���� - ���� �ٸ� ���ڰ� ������ֱ� ��ٸ���
            } catch (InterruptedException ie){
                ie.getMessage();
            }
        }
        String answer = propose;
        System.out.println("������ ���� : "+ answer+ "\n");
        propose = null;     //�������� null �� ���� �ٽ� ���ޱ�
        notify();           //�ڽ��� �Ͻ����� ���� - ������ ���� �����
        return answer;
    }
}