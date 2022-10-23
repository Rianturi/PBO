class Main{
    int volume(int side)
    {
    return side * side * side;
    }
    int volume(int length, int breadth, int height)
    {
    return length*breadth*height;
    }
    double volume(int radius, int height)
    { return 3.14 * (radius * radius)* height / 3;
    }
    public static void main(String[] args)
    {
    Main oe = new Main();
    System.out.println("Volume of Cube " +oe.volume(10));
    System.out.println("Volume of Rectangular prism " +oe.volume(10,12,30));
    System.out.println("Volume of Cone "+oe.volume(5,10));
    } }