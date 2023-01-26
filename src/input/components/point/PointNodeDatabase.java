package input.components.point;

import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;

import utilities.math.MathUtilities;


public class PointNodeDatabase {
	Set<PointNode> _points;
	
	public PointNodeDatabase() 
	{
		_points = new LinkedHashSet<PointNode>();
	}
	
	public PointNodeDatabase(List<PointNode> points) 
	{
	    if(points == null) {_points = new LinkedHashSet<PointNode>();} 
	    else {_points = new LinkedHashSet<PointNode>(points);}
	}
	
	public void put(PointNode point)
	{
		_points.add(point);
	}
	
	public boolean contains(PointNode point)
	{
		return _points.contains(point);
	}
	
	public boolean contains(double x, double y)
	{
		for (PointNode point:_points)
		{
			PointNode point1 = getPoint(x,y);
			//checking for if the point with the given x and y exists
			if (point1.equals(point)) {return true;}
		}
		return false;
	}
	
	public String getName(PointNode point)
	{
		return point._name;
	}
	
	public String getName(double x, double y)
	{
		PointNode point1 = getPoint(x,y);
		if (point1.equals(null)) {return null;}
		return point1.getName();
	}
	
	public PointNode getPoint(PointNode point)
	{
		if(_points.contains(point)) {return point;}
		else {return null;}
	}

	public PointNode getPoint(double x, double y)
	{
		PointNode point1 = new PointNode(x, y);
		if (_points.contains(point1)) {return point1;}
		return null;
	}
	
}
