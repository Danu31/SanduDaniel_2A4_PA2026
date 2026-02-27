public class Main{
    void main() {

        IO.println(String.format("Hello and welcome!"));

        Image img1 = new Image();
        Image img2 = new Image(15);

        img2.drawRectangle(5,10);
        img2.printMatrix();

        img2.drawCircle(5);
        img2.printMatrixUnicode();

        Image largeImage = new Image(35000);


        long start = System.nanoTime();
        largeImage.drawRectangle(4789, 924);
        long end = System.nanoTime();
        System.out.println("Running time: " + (end-start)/1_000_000.0 + " ms");

    }

//    public static void main(String[] args) {
//        System.out.println(String.format("Hello, World!"));
//    }
}
