public class Main {
    public static void main(String[] args) {
        TwoDFigure rectangle = new Rectangle(4,4);
        ThreeDShape adaptedShape = new TwoDToThreeDAdapter(rectangle,4);
        System.out.println("area is "+rectangle.calculateArea());
        System.out.println("volume is "+adaptedShape.calculateVolume());
    }
}