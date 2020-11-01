/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknikindustries.sms;
import com.teknikindustries.bulksms.SMS;

/**
 *
 * @author Mr__.Solanki
 */
public class SMSMessage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SMS smsTut = new SMS();
        smsTut.SendSMS("Username", "password", "Hello Sir, I am royal solanki", "0123456789", "Url");
        //Insert "Username", "password", "Text Message", "Mobile Number for Sending", "Url"
    }
    
}
