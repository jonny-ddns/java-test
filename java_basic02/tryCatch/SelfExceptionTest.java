package java_basic02.tryCatch;

public class SelfExceptionTest {
    void getWarning(int a) throws SelfException {
        if(a > 19){
            System.out.println("���尡���մϴ�");
        } else{
            throw new SelfException("�̼������Դϴ�");
        }
    }

    public static void main(String[] args) {
        SelfExceptionTest st = new SelfExceptionTest();
        try {
            st.getWarning(25);
            st.getWarning(15);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
