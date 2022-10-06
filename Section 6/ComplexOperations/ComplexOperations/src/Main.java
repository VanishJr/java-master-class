public class Main {
    public static void main(String[] args) {
        ComplexNumber cn = new ComplexNumber(4, 10);
        ComplexNumber dn = new ComplexNumber(10, 5);
        System.out.println("Imaginary number = " + cn.getImaginary());
        System.out.println("Real number = " + cn.getReal());
        cn.add(dn);
        System.out.println("Imaginary number = " + cn.getImaginary());
        System.out.println("Real number = " + cn.getReal());

        dn.subtract(cn);
        System.out.println("Imaginary number = " + dn.getImaginary());
        System.out.println("Real number = " + dn.getReal());
    }
}