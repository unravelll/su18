package lab02;
/** A class that represents a path via pursuit curves. */
public class Path {

    // TODO
	public Point curr =new Point(400,400);
	public Point next =new Point() ;
	
	public Path (double  x , double  y) {
		next.x =  x;
		next.y =  y;
 	}
	public void iterate (double dx ,double dy) {
		curr = next;
		Point next =new Point (curr.x+dx,curr.y+dy);
		
	}

}
