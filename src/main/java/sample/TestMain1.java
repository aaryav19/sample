/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author kumar saurabh
 */
public class TestMain1 {

    //private TestMain1 TM1 = new TestMain1("Class Level intit");
    private TestMain1 TM1 = new TestMain1();

    public TestMain1() {
    }

    public TestMain1(String msg) {
        System.out.println("-------->" + msg);
    }

    public static void main(String[] args) {
        TestMain1 tm = new TestMain1();
    }
}
