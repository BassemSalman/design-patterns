package Structural.Proxy;

public class ImageProxy implements Image{
    private String filename;
    private RealImage real;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        /* call realImage display, only accept png */
        if(real == null){
            if(!correctFormat()) {
                System.out.println("NOT png! fel men hon");
                return;
            }
            real = new RealImage(filename);
            System.out.println("Creating Real image in proxy");
        }
        real.display();
        /* load it when need it */
    }

    public boolean correctFormat(){
        return filename.split(".")[1].equals("png");
        // return filename.endsWith("png")
    }
}
