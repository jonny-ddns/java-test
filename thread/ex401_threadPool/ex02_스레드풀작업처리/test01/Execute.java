package thread.ex401_threadPool.ex02_������Ǯ�۾�ó��.test01;

public class Execute {
    public static void main(String[] args) {
        for(int i=0;i<20; i++){
            new ToDo().start();
        }
    }
}
