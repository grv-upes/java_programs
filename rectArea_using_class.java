import java.util.Scanner;
class Rectangle{
    int length,width,area;
    
    Rectangle(int x,int y){
        length=x;
        width=y;
    }
    void rectArea(){
        area = length * width;
        System.out.println("Area of the rectangle is: " + area);
    }
}
class Main{
    public static void main(String args[]){
        int len ,wid;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the length and width of the desired RECTANGLE: ");
        len=obj.nextInt();
        wid=obj.nextInt();
        Rectangle obj1 = new Rectangle(len,wid);
        obj1.rectArea();
    }
    
}
