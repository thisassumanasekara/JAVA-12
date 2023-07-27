package com.mycompany.trafficlightssystemlab;

public class RedLightThread extends Thread
{
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Red light");
                Thread.sleep(5000); // Red light duration is 5 seconds
            }
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}
