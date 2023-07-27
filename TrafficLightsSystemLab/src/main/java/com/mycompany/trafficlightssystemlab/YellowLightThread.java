package com.mycompany.trafficlightssystemlab;

public class YellowLightThread extends Thread
{
    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(15000); // Yellow light follows after 15 seconds of Green light
                System.out.println("Yellow light");
                Thread.sleep(2000); // Yellow light duration is 2 seconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
