package interface_;

public class test5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Photoshop p= new Photoshop();
		Circle c =new Circle();
		Rectangle r=new Rectangle();
		c.setRadius(5);
		r.setLineLength(5);
		r.setLineLength2(10);
		p.draw(c);
		p.draw(r);

	}
}

interface Shap{
	void draw();	
}
class Photoshop{
	
	public void draw(Shap s) {
		s.draw();
	}
}
class Circle implements Shap{
	private float radius;

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원 그리기 - 반지름 : "+radius);
		
	}
	}
class Rectangle implements Shap{
	private float LineLength;
	private float LineLength2;

	public void setLineLength(float lineLength) {
		LineLength = lineLength;
	}

	public void setLineLength2(float lineLength2) {
		LineLength2 = lineLength2;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("가로 :"+LineLength+" , 세로 :"+LineLength2+"사각형 그리기");
	}}

