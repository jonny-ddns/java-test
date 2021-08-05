package _past.j20210620_java_lang.StringTokenizerEx;

import java.util.StringTokenizer;

public class SplitAndStringTokenizerEx {
    public static void main(String[] args) {
        String animals = "ȣ����-����--�����-----�Ǿ�--�䳢--��";
        String delim = "-";

        StringTokenizer tokenizer = new StringTokenizer(animals, delim);

        SplitAndStringTokenizerEx spToken = new SplitAndStringTokenizerEx();
        while (tokenizer.hasMoreTokens()){
            String str = tokenizer.nextToken(delim);
            System.out.println("token "+ str);
        }
        System.out.println("--StringTokenizer ��");


        String[] strArr = animals.split(delim);
        for(String st : strArr){
            System.out.println("token "+ st);
        }
        System.out.println("--split ��");
    }
}
