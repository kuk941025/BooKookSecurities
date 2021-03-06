package BooKookSecurities.Util;

import BooKookSecurities.String.Strings;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


/*
    생성자로 받는 사람 주소를 보냄.
    SendMail 메소드를 통해 회사이름 + 지난 일을 보내면 메일 발송.

    발송실패했을때 오류처리 필요
 */
public class EmailSender {
    private final String senderEmail = Strings.EmailSenderMail;
    private final String senderEmailPW = Strings.EmailSenderPW;
    private String recipient;
    private Properties prop = new Properties();

    public EmailSender(String recipient) {
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", 465);
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.ssl.enable", "true");
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        this.recipient = recipient;
    }

    public void SendMail(String CompanyName, int passedDays){

        Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderEmailPW);
            }
        });
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            message.setSubject("[알림]"+CompanyName+" 분석대상기간 경과 주의");
            message.setText(CompanyName+"이 최종 공표일로부터 " +passedDays+"일 경과하였습니다.");
            Transport.send(message);
            System.out.println("message sent successfully...");
        } catch(AddressException e) {
            e.printStackTrace();
        } catch(MessagingException e) {
            e.printStackTrace();
        }
    }


}
