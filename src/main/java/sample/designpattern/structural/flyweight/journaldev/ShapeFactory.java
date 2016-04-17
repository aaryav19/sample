/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.designpattern.structural.flyweight.journaldev;

import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author kumar saurabh
 */
public class ShapeFactory {

    private static final Map<ShapeType, Shape> shapes = new EnumMap<>(ShapeType.class);

    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);

        if (shapeImpl == null) {
            switch (type) {
                case OVAL_FILL:
                    shapeImpl = new Oval(true);
                    break;
                case OVAL_NOFILL:
                    shapeImpl = new Oval(false);
                    break;
                case LINE:
                    shapeImpl = new Line();
                    break;
                default:
                    break;
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }

    public static enum ShapeType {
        OVAL_FILL, OVAL_NOFILL, LINE;
    }
}
