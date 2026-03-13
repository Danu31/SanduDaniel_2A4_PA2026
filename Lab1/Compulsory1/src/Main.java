
void main() {

    IO.println(String.format("Hello World!"));

    String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

    int n = (int) (Math.random() * 1_000_000);

    n*=3;

    String binary = "10101";
    int binaryInt = Integer.parseInt(binary, 2);
    n+=binaryInt;

    String hexNum = "FF";
    int hexInt = Integer.parseInt(hexNum, 16);
    System.out.println(hexInt);
    n+=hexInt;

    n*=6;

    System.out.println(String.format("N = %d", n));

    while(n>9) {

        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        n = sum;
    }


    System.out.println(String.format("Suma = %d", n));

    System.out.println(String.format("Willy-nilly, this semester I will learn %s", languages[n]));
}
