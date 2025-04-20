
class Message {
    protected String text;

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return "Text: " + text;
    }
}

class SMS extends Message {
    private String recipientContactNo;

    public void setRecipientContactNo(String number) {
        this.recipientContactNo = number;
    }

    public String getRecipientContactNo() {
        return recipientContactNo;
    }

    public String toString() {
        return "SMS to: " + recipientContactNo + "\n" + super.toString();
    }
}

class Email extends Message {
    private String sender;
    private String receiver;
    private String subject;

    public void setDetails(String sender, String receiver, String subject) {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }

    public String toString() {
        return "Email from: " + sender + "\nTo: " + receiver + "\nSubject: " + subject + "\n" + super.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        SMS sms = new SMS();
        sms.setText("Hello, this is an SMS!");
        sms.setRecipientContactNo("0333-1234567");
        System.out.println(sms);

        Email email = new Email();
        email.setText("This is the email content.");
        email.setDetails("ali@example.com", "ahmed@example.com", "Meeting Update");
        System.out.println(email);

        System.out.println("\nContains 'SMS'? " + containsKeyword(sms, "SMS"));
    }

    public static boolean containsKeyword(Message m, String keyword) {
        return m.text != null && m.text.contains(keyword);
    }
}
