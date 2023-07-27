package com.mycompany.trafficlightssystemlab;

public class TrafficLightsSystemLab {

    public static void main(String[] args) 
    {
        RedLightThread redThread = new RedLightThread();
        GreenLightThread greenThread = new GreenLightThread();
        YellowLightThread yellowThread = new YellowLightThread();
        
        redThread.start();
        greenThread.start();
        yellowThread.start();

        try {
            // Let the program run indefinitely
            while (true) {
                Thread.sleep(20000); // Wait for 20 seconds before restarting the loop
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

