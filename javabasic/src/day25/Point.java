package day25;

class Point implements Comparable<Point>
{
	float x,y;
	Point()
	{}
	Point(float x, float y)
	{
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x)
			return Float.compare(this.y, o.y);
		return Float.compare(this.x, o.x);
	}
}

