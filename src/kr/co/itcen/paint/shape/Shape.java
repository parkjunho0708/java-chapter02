package kr.co.itcen.paint.shape;

import kr.co.itcen.paint.i.Drawable;
import kr.co.itcen.paint.i.Resizable;

public abstract class Shape implements Drawable, Resizable{
	private String lineColor;
	private String fillColor;

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
}
