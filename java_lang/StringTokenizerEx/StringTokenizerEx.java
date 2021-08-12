package java_lang.StringTokenizerEx;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    String str01 = "2021/06/20";
    String str02 = "철수:영희:길동:영수";
    StringTokenizer tokenizer01 = new StringTokenizer(str01, "/");
    StringTokenizer tokenizer02 = new StringTokenizer(str02, ":");
    StringTokenizer tokenizer03 = new StringTokenizer(str02, ":");
    StringTokenizer tokenizer04 = new StringTokenizer(str02, ":");

    public static void main(String[] args) {
        StringTokenizerEx st = new StringTokenizerEx();
        while(st.tokenizer01.hasMoreElements()){
            String str = st.tokenizer01.nextToken();
            System.out.println("token : "+ str);
        }

        while(st.tokenizer02.hasMoreTokens()){
            String str = st.tokenizer02.nextToken();
            System.out.println("token : "+ str);
        }

        while(st.tokenizer03.hasMoreTokens()){
            String str = st.tokenizer03.nextToken(":");
            System.out.println("token : "+ str);
        }

        while(st.tokenizer04.hasMoreTokens()){
            int count = st.tokenizer04.countTokens();
            String str = st.tokenizer04.nextToken(":");
            System.out.println(str + " 남은 토큰 개수 : "+count);
        }
    }
}
