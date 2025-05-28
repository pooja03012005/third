
class RectanglePerimeter{
    double length,breadth;

    RectanglePerimeter(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void show(){
        System.out.println("length:"+length+"breadth:"+breadth+(2*length+breadth));
    }
    public static void main(String[] args){
        RectanglePerimeter r1=new RectanglePerimeter(2.5,2.5);
        r1.show();
    }
}