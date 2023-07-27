package com.mycompany.trafficlightssystemlab;

public class GreenLightThread extends Thread
{
    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(5000); // Green light follows after 5 seconds of Red light
                System.out.println("Green light");
                Thread.sleep(10000); // Green light duration is 10 seconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
