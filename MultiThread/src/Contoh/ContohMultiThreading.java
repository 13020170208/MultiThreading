/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoh;

/**
 *
 * @author AfdalMaulana
 */
public class ContohMultiThreading {
    public static void main(String[] args) {
        Runner1 r1 = new Runner1();
        Runner2 r2 = new Runner2();
        r1.start();
        r2.start();
        try{
            r1.join();
            r2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("-----Selesai-----");
    }
}
