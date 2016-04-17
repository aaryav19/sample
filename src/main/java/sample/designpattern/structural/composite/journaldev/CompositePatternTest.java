/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.designpattern.structural.composite.journaldev;

/**
 * Important Points about Composite Pattern. 1. Composite pattern should be
 * applied only when the group of objects should behave as the single object. 2.
 * Composite pattern can be used to create a tree like structure.
 * java.awt.Container#add(Component) is a great example of Composite pattern in
 * java and used a lot in Swing.
 *
 * @author kumar saurabh
 */
public class CompositePatternTest {

    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }

}
