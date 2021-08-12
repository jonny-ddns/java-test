package collectionFrameWork;

import java.util.Enumeration;
import java.util.Properties;

public class Test04_Properties {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.put("usage", "calculater");
        properties.setProperty("userId", "sudo");
        properties.setProperty("userPw", "QWERTY");

        //�Ӽ� key������ value ��������
        String user = properties.getProperty("usage");
        String id = properties.getProperty("userId");
        String pw = properties.getProperty("userPw");
        String test = properties.getProperty("scannerTest");

        System.out.println(user);   //calculater
        System.out.println(id);     //sudo
        System.out.println(pw);     //QWERTY
        System.out.println(test);   //null

        //Enumeration ���·� key�� ��������
        Enumeration keys = properties.propertyNames();
        while (keys.hasMoreElements()){
            System.out.print(keys.nextElement() + " "); //userId usage userPw
        }        
        System.out.println();
        
        //��½�Ʈ���� ����� �Ӽ���� ����ϱ�
        properties.list(System.out);
        /*
        -- listing properties --
        userId=sudo
        usage=calculater
        userPw=QWERTY
         */
    }
}
