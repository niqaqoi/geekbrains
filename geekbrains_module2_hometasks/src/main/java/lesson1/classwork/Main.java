package lesson1.classwork;

import lesson1.classwork.enums.GeometryMath;
import lesson1.classwork.enums.GeometryShape;
import lesson1.classwork.printer.NetworkPrinter;
import lesson1.classwork.printer.PdfPrinter;
import lesson1.classwork.printer.Printer;
import lesson1.classwork.printer.StdoutPrinter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        doEnumDemo();
    }

    static void doEnumDemo() {
        System.out.println(GeometryMath.calcPerimeter(GeometryShape.SQUARE));
        System.out.println(GeometryMath.calcPerimeter(GeometryShape.TRIANGLE));
        System.out.println(GeometryShape.SQUARE.name());
        System.out.println(Arrays.toString(GeometryShape.values()));
        System.out.println(GeometryShape.SQUARE.getLatinName());
        System.out.println(GeometryShape.TRIANGLE.getLatinName());

    }


        static void doInterfaceDemo() {
        Printer[] printers = getPrinters();

        for (int i = 0; i < printers.length; i++) {
            printers[i].print();
        }
    }

    static Printer[] getPrinters() {

        return new Printer[] {new StdoutPrinter(), new PdfPrinter(), new NetworkPrinter()};
    }
}
