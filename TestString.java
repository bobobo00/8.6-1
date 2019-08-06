package day19;

import java.util.Scanner;

/**
 * @ClassName TestString
 * @Description TODO
 * @Auther danni
 * @Date 2019/8/6 0:12]
 * @Version 1.0
 **/

public class TestString {
    public static void main(String[] args) {
        char num='1';
        System.out.println("请输入要处理的字符串");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        char[] m=s.toCharArray();
        for (int i = 0; i <m.length-1 ; i++) {
            char c=m[i];
            for (int j = i+1; j <m.length ; j++) {
                char temp=m[j];
                if(c==temp){
                    num++;
                }
                else{
                    break;
                }
            }
            if(num!='1'){
                m[i]=num;
                for (char j ='1'; j <num-1 ; j++) {
                    m[++i]='*';
                }
                num='1';
            }
        }
        s="";
        for (int i = 0; i <m.length ; i++) {
            if(m[i]!='*'){
            s+=m[i];
            }
        }
        System.out.printf("%s",s);
    }
}
