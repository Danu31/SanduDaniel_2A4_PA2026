public class Image{

    private int n;
    private int[][] matrix;

    //constructori
    public Image(){
        this(10);
    }

    public Image(int n){
        this.n = n;
        matrix = new int[n][n];
    }

    private void setBackground(int c){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = c;
            }
        }
    }

    public void printMatrix(){
        for(int i = 0; i < n; i++){
            System.out.println('\n');
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println('\n');

    }

    public void drawRectangle(int height, int width){

        setBackground(255);

        if(height <= n && width <= n){

            int startRow = (n - height) / 2;
            int startCol = (n - width) / 2;

            for(int i = startRow; i < startRow + height; i++){
                for(int j = startCol; j < startCol + width; j++){
                    matrix[i][j] = 0;
                }
            }

        }
        else{
            System.out.println("Invalid rectangle (size is out of bounds)");
        }

    }

    public void drawCircle(int radius){

        setBackground(0);

        if(radius <= n / 2){
            int cx = n / 2;
            int cy = n / 2;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int dx = i - cx;
                    int dy = j - cy;
                    if (dx * dx + dy * dy <= radius * radius) {
                        matrix[i][j] = 255;
                    }
                }
            }


        }
        else{
            System.out.println("Invalid circle (size is out of bounds)");
        }
    }

    public void printMatrixUnicode(){

        for(int i = 0; i < n; i++){
            System.out.println('\n');
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 255)
                    System.out.print("⬜");
                if(matrix[i][j] == 0)
                    System.out.print("⬛");

            }
        }
        System.out.println('\n');
    }

}
