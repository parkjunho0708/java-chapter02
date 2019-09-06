package kr.co.itcen.paint.main;

import kr.co.itcen.paint.i.Drawable;
import kr.co.itcen.paint.i.Resizable;
import kr.co.itcen.paint.point.ColorPoint;
import kr.co.itcen.paint.point.Point;
import kr.co.itcen.paint.shape.Circle;
import kr.co.itcen.paint.shape.Rect;
import kr.co.itcen.paint.shape.Shape;
import kr.co.itcen.paint.shape.Triangle;
import kr.co.itcen.paint.text.GraphicText;

/*
 SOLID  - 객체지향의 설계 원칙
 OCP(Open Close) - 개방 폐쇄 원칙
 
 <패키지 구성>
kr.co.itcen.paint.shape
Shape
Rect
Triangle
 
kr.co.itcen.paint.point
 
kr.co.itcen.paint.text
 
kr.co.itcen.paint.main
 
 kr.co.itcen.paint.i
 */
public class Main {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(10);
		p1.setY(20);
		draw(p1);
		p1.show(false);
		
		draw(new Point(100, 200));
		draw(new ColorPoint(300, 200, "yellow"));
		draw(new Triangle());
		draw(new Rect());
		draw(new Circle());
		draw(new GraphicText("Hello"));
		
		Shape s1 = new Triangle();
		// Down Casting : 명시적(Explicity)
		((Triangle)s1).setX1(10);
		
		// Up Casting : 암시적(Implicity)
		Rect rect = new Rect();
		Shape s2 = rect; //(Shape) 생략가능
		
		// instanceof 연산자
		Shape s = new Circle();
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Rect);
		System.out.println(s instanceof Triangle);
		System.out.println(s instanceof Drawable);
		System.out.println(s instanceof Runnable);
		
		Circle circle = new Circle();
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		// 게층관계가 성립하지 않으면 연산자를 사용할 수 없다.
		// System.out.println(circle instanceof Triangle);
		
		
		
		
		
	}


	public static void resize(Drawable drawable) {
		if( drawable instanceof Resizable ) {
			((Resizable)drawable).resize();
		}
	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}

//	public static void draw(Shape shape) {
//		shape.draw();
//	}

//	public static void drawPoint(Point point) {
//		point.show();
//	}
	
//	public static void draw(Triangle triangle) {
//		triangle.draw();
//	}
//	
//	public static void draw(Rect rect) {
//		rect.draw();
//	}
//	
//	public static void draw(Circle circle) {
//		circle.draw();
//	}
}
