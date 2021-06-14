package MediatorWasap;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Wasap wp = new Wasap();

        User u1 = new UsuarioWasap(wp, "Nicole");
        User u2 = new UsuarioWasap(wp, "Senpai");
        User u3 = new UsuarioWasap(wp, "ANdre");
        User u4 = new UsuarioWasap(wp, "Onichan");
        User u5 = new UsuarioWasap(wp, "lalita");
        User u6 = new UsuarioWasap(wp, "Debest");
        User u7 = new UsuarioWasap(wp, "Alfea");
        User u8 = new UsuarioWasap(wp, "Rotis");
        User u9 = new UsuarioWasap(wp, "Luciano");
        User u10 = new UsuarioWasap(wp, "Fabian");

        List<User> l1 = new LinkedList<User>();

        l1.add(u1);
        l1.add(u2);
        l1.add(u3);
        l1.add(u4);
        l1.add(u5);
        l1.add(u6);
        l1.add(u7);
        l1.add(u8);
        l1.add(u9);
        l1.add(u10);

        UsersGroup g1 = new UsersGroup("Panas");

        g1.setGrupo(l1);

        wp.addGrupo(g1);

        u1.sendPerson("hola buenas!", u2);

        u10.sendGroup("chek1", g1.getNombre());

    }
}