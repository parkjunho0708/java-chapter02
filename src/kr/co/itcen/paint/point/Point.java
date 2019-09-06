package kr.co.itcen.paint.point;

import kr.co.itcen.paint.i.Drawable;

// 리펙토링 : 결과는 동일하게 하면서 코드를 좀 더 효율적으로 바꾸는 과정
public class Point  implements Drawable{
	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println(
				"점[x=" + x + ", y=" + y + "] 를 그렸습니다.");
	}

	// 메소드 오버로딩
	public void show(boolean visible) {
		if (visible) {
			show();
		} else {
			System.out.println(
					"점[x=" + x + ", y=" + y + "] 를 지웠습니다.");
		}
	}

	@Override
	public void draw() {
		show();
	}

//	public void disappear() {
//		// TODO Auto-generated method stub
//		System.out.println(
//				"점[x=" + x + ", y=" + y + "] 를 지웠습니다.");
//	}
}
