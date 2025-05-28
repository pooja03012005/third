public class CircleArea {
    int radius;
    final double pi=3.142;

    CircleArea(int radius){
        this.radius=radius;
    }
    void area(){
        System.out.println("the area of circle is:"+(pi*radius*radius));
    }
    void perimeter(){
        System.out.println("the perimeter of circle is:"+(2*pi*radius));
    }
    public static void main(String[] args) {
        CircleArea c=new CircleArea(4);
        c.area();
        c.perimeter();
    }
}
