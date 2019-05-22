package com.car.util;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
 
public class SendmailUtils {
	public static void main(String[] args) {
		Integer code  =  (int)((Math.random()*9+1)*100000);  //产生验证码	
		System.out.println(code);		
		send("1595330860@qq.com",code);
	}
	
    public static void send(String mail,int code)  {        
        Properties prop = new Properties();
        prop.setProperty("mail.host", "smtp.163.com");
        prop.setProperty("mail.transport.protocol", "smtp");
        prop.setProperty("mail.smtp.auth", "true");
        
        //使用JavaMail发送邮件的5个步骤
        //1、创建session
        Session session = Session.getInstance(prop);
        //开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
        session.setDebug(true);
        //2、通过session得到transport对象
        Transport ts;
		try {
			ts = session.getTransport();
		
        //3、使用邮箱的用户名和密码连上邮件服务器，发送邮件时，发件人需要提交邮箱的用户名和密码给smtp服务器，用户名和密码都通过验证之后才能够正常发送邮件给收件人。
        ts.connect("smtp.163.com", "18166228594", "qq1595330860");
        //4、创建邮件
        Message message = createSimpleMail(session,code,mail);
        //5、发送邮件
        ts.sendMessage(message, message.getAllRecipients());
        ts.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
    * @Description: 创建一封只包含文本的邮件
    */ 
    public static MimeMessage createSimpleMail(Session session,int code,String mail)
            throws Exception {
        //创建邮件对象
        MimeMessage message = new MimeMessage(session);
        //指明邮件的发件人
        message.setFrom(new InternetAddress("18166228594@163.com"));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(mail));
        //邮件的标题
        message.setSubject("汽车整合系统");
        //邮件的文本内容
        message.setContent("激活码："+code, "text/html;charset=UTF-8");
        //返回创建好的邮件对象
        return message;
    }
}