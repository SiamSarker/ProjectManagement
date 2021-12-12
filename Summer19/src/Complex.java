class Complex{

    int real;
    int img;
    Complex(int real, int img){
        this.real = real;
        this.img = img;
    }

    Complex(Complex c1) {
        this.real = c1.real;
        this.img = c1.img;
    }


    public static void main(String[] args) {
        Complex c1 = new Complex(10,15);
        Complex c2 = new Complex(c1);
        System.out.println(c1.real+" "+c1.img);
        System.out.println(c2.real+" "+c2.img);

    }
}