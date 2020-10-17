package com.fengkuang.java.Java基础类库07.正则表达式75;
import java.util.regex.*;
public class MatchesTest {
    public static void main(String[] args) {
        String[] mails =
                {
                        "kongyeeku@163.com",
                        "kongyeeku@gmail.com",
                        "ligang@crazyit.org",
                        "wawa@abc.xx"
                };
        var mailRegEx = "\\w{3,20}@\\w+\\.(com|org|cn|net|gov)";
        var mailPattern = Pattern.compile(mailRegEx);
        Matcher matcher = null;
        for (var mail : mails) {
            if (matcher == null) {
                matcher = mailPattern.matcher(mail);
            } else {
                matcher.reset(mail);
            }
            String result = mail + (matcher.matches() ? "是" : "不是") + "一个有效的邮件地址！";
            System.out.println(result);
        }
    }
}