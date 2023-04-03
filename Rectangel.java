public class Rectangel{

    private double length;
    private double width;

    public Rectangel(double length,double width){
        this.length=length;
        this.width=width;
    }

    public double getarea(){
        return length*width;
    }

    public double getparemeter(){
        return 2*(length*width);
    }

    public static void main(String[]args){
        Rectangel rect = new Rectangel(5,7);
        System.out.println("area is "+ rect.getarea());
        System.out.println("paremeter is "+ rect.getparemeter());

    }
}