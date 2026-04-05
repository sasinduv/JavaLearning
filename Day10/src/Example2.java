
class Box{
    int length;
    int width;
    int height;

//    public void printBox(){
//        int vol=length*width*height;
//        System.out.println("Volume is :"+vol);
//    }

    public int printBox(){
        int vol=length*width*height;
        return vol;
    }

//    public void setSize(int l,int w,int h){
//        length=l;
//        width=w;
//        height=h;
//    }

    public void setSize(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
}

public class Example2 {
    public static void main(String[] args) {
        Box box=new Box();
//        box.height=12;
//        box.width=5;
//        box.length=10;
        box.setSize(12,5,6);
        int volume = box.printBox();
        System.out.println(volume+ " in main");
    }
}
