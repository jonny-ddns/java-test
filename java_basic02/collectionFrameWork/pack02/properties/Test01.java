package java_basic02.collectionFrameWork.pack02.properties;

import java.util.Enumeration;
import java.util.Properties;

public class Test01 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.put("usage", "calculater");
        properties.setProperty("userId", "sudo");
        properties.setProperty("userPw", "QWERTY");

        //속성 key값으로 value 가져오기
        String user = properties.getProperty("usage");
        String id = properties.getProperty("userId");
        String pw = properties.getProperty("userPw");
        String test = properties.getProperty("java_basic02/scannerTest");

        System.out.println(user);   //calculater
        System.out.println(id);     //sudo
        System.out.println(pw);     //QWERTY
        System.out.println(test);   //null

        //Enumeration 형태로 key값 가져오기
        Enumeration keys = properties.propertyNames();
        while (keys.hasMoreElements()){
            System.out.print(keys.nextElement() + " "); //userId usage userPw
        }        
        System.out.println();
        
        //출력스트림을 사용해 속성목록 출력하기
        properties.list(System.out);
        /*
        -- listing properties --
        userId=sudo
        usage=calculater
        userPw=QWERTY
         */
    }
}
