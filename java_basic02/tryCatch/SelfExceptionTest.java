package java_basic02.tryCatch;

public class SelfExceptionTest {
    void getWarning(int a) throws SelfException {
        if(a > 19){
            System.out.println("입장가능합니다");
        } else{
            throw new SelfException("미성년자입니다");
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
