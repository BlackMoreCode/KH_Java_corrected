package 제네릭프린터;

public class GenericMainEx {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        powderPrinter.printing();

        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();
        plasticGenericPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticGenericPrinter.getMaterial();
        System.out.println(plastic.toString());
        plastic.doPrinting();

        GenericPrinter<Nylon> nylonPrinter = new GenericPrinter<>();
        nylonPrinter.setMaterial(new Nylon());
        nylonPrinter.printing();
    }
}
