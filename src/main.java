public class main
{
    public static void Main(String[] args)
    {
        Point P1 = new Point(0,0);
        Point P2 = new Point(3,0);
        Segment S = new Segment(P1,P2);
        System.out.println(S.length());
    }
}
