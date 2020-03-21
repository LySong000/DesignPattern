package com.lysong.开闭原则;

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
    }
}

/**
 * 这是一个用于绘图的类,使用方
 */
class GraphicEditor{
    /**
     * 接受一个shape对象，然后根据type绘制不同的图形
     * @param s
     */
    public void drawShape(Shape s){
        if(s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        }else if (s.m_type == 3){
            drawTriangle(s);
        }
    }
    public void drawRectangle(Shape r){
        System.out.println("矩形");
    }
    public void drawCircle(Shape r){
        System.out.println("圆形");
    }
    public void drawTriangle(Shape r){
        System.out.println("三角形");
    }
}
class Shape{
    int m_type;
}
class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }
}
class Circle extends Shape{
    Circle(){
        super.m_type = 2;
    }
}

/**
 * 增加一个三角形，修改多了
 */
class Triangle extends Shape{
    Triangle(){
        super.m_type = 3;
    }
}

