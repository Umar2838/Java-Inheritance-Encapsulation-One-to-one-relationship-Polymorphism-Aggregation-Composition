/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab06exercise03;

/**
 *
 * @author Umar
 */
class Message {
    protected String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

   
    public String toString() {
        return text;
    }
}

class SMS extends Message {
    private String recipientContactNo;

    public SMS(String text, String recipientContactNo) {
        super(text);
        this.recipientContactNo = recipientContactNo;
    }

    public String getRecipientContactNo() {
        return recipientContactNo;
    }

    public void setRecipientContactNo(String recipientContactNo) {
        this.recipientContactNo = recipientContactNo;
    }

 
    public String toString() {
        return "SMS{" +
                "text='" + text + '\'' +
                ", recipientContactNo='" + recipientContactNo + '\'' +
                '}';
    }
}

class Email extends Message {
    private String sender;
    private String receiver;
    private String subject;

    
    public Email(String text, String sender, String receiver, String subject) {
        super(text);
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

  
    public String toString() {
        return "Email{" +
                "text='" + text + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}


public class Lab06exercise03 {

    public static void main(String[] args) {
       SMS sms = new SMS("Hello, this is a test message.", "123-456-7890");
        Email email = new Email("This is the body of the email.", "sender@example.com", "receiver@example.com", "Subject of the email");

        // Test ContainsKeyword method
        System.out.println(ContainsKeyword(sms, "test"));  // Should return true
        System.out.println(ContainsKeyword(email, "body"));  // Should return true
        System.out.println(ContainsKeyword(email, "missing"));  // Should return false

        // Encode a message
        String message = "This is Java";
        String encodedMessage = encodeMessage(message);
        System.out.println("Original Message: " + message);
        System.out.println("Encoded Message: " + encodedMessage);
    }

    public static boolean ContainsKeyword(Message messageObject, String keyword) {
        return messageObject.toString().indexOf(keyword) >= 0;
    }

    public static String encodeMessage(String message) {
        StringBuilder encoded = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                encoded.append((char) ((ch - 'A' + 1) % 26 + 'A'));
            } else if (ch >= 'a' && ch <= 'z') {
                encoded.append((char) ((ch - 'a' + 1) % 26 + 'a'));
            } else {
                encoded.append(ch);
            }
        }
        return encoded.toString();
    }
}
