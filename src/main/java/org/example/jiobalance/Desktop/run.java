package org.example.jiobalance.Desktop;

import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class run {
    public static void main(String [] args) throws MalformedURLException, InterruptedException {
      String otp=  getOTP.getOtp();
        System.out.println(otp);
    }
}
