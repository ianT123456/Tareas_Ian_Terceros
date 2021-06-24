package Proxy;

public class Client {
    public static void main (String[]args){
        Proxy create = new Proxy();

        create.retiro(new Cuenta(123,"Tilin","Bs", 10, 1));

        create.retiro(new Cuenta(321,"Onichan","Esloveno", 1000, 45));

    }
}
