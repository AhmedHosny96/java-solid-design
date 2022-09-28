package com.hosny.ocp;

public class MobileNotification implements NotificationService{

    @Override
    public void sendOTP(String medium) {
        // twilio api integration logic to send sms via phone
    }


    @Override
    public void sendTransactionReport(String medium) {

        // twilio api integration logic

    }
}
