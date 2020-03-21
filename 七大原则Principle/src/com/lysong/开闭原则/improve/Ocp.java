package com.lysong.开闭原则.improve;

/**
 * @Author: LySong
 * @Date: 2020/3/21 12:30
 */
public class Ocp {
    public static void main(String[] args) {
        //存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

/**
 * 这是一个用于绘图的类,使用方
 */
class GraphicEditor {
    /**
     * 接受一个shape对象，然后根据type绘制不同的图形
     *
     * @param s
     */
    public void drawShape(Shape s) {
        s.draw();
    }

}
abstract class Shape{
    int m_type;
    public abstract void draw();//抽象方法
}

class Rectangle extends Shape {
    Rectangle(){
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

class Circle extends Shape {
    Circle(){
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("圆形");
    }
}

/**
 * 增加一个三角形，修改多了
 */
class Triangle extends Shape {
    Triangle(){
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("三角形");
    }
}

/**
 * 新增一个图形
 */
class OtherGraphic extends Shape{
    OtherGraphic(){
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println("其他图形");
    }
}

