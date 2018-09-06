/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan6;

/**
 *
 * @author Taka
 */
public class Test implements Cloneable{
    @Override
    public Test clone() throws CloneNotSupportedException{
        return (Test) super.clone();
    }
        public static void main(String[] args) {
        try {
            new Test().clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
