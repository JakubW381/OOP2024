public class main
{
    public static void main(String[] args)
    {
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,0);
        Segment s = new Segment(p1,p2);
        System.out.println(s.length());
    }
}
