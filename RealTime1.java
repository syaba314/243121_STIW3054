/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realtime1;

/**
 *
 * @author ASUS
 */
public class RealTime1  extends Thread {

    public static void main(String[] args) {
        
        new Thread(new RealTime1()).start();
    }

    @Override
    public void run() {
        try {
            for (int x = 1; x < 100; x++) {
              x=x+4;
              if(x%2==0)
              {
                System.out.println(x +"A");
              }
              else
              {
                 System.out.println(x);
              }
               
                sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}