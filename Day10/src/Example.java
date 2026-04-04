class Brick{
    public void setSize(int length,int width, int height){
        int size = length*width*height;
        System.out.println("Size:" +size);
    }
}

public class Example {
    public static void main(String[] args) {
        Brick b1 = new Brick();
        b1.setSize(10,10,10);

        Brick b2 = new Brick();
        b2.setSize(15,15,15);
    }
}
