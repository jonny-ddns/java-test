package thread.ex401_threadPool.ex02_������Ǯ�۾�ó��.test04_��������Ű��;

public class Todo implements Runnable {

    String st = null;
    Todo(String st){
        this.st = st;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " run ����");
        int changed = changeInteger(st);
        System.out.println("���� : "+ changed);
    }

    //���� �߻���Ű�� �ڵ�
    int changeInteger(String str){
        return Integer.parseInt(str);
    }
}
