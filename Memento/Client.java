package Memento;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main (String []argsss ){
        DataBase dataBase = new DataBase();
        Originator originator = new Originator();

        Persona person1 = new Persona("Cristian", 1234567, 27);
        Persona person2 = new Persona("Miguel", 7777777, 45);
        Persona person3 = new Persona("Tilin", 3333333, 46);
        Persona person4 = new Persona("Julio" , 1111111, 70);
        Persona person5 = new Persona("Andres", 7777775, 54);
        Persona person6 = new Persona("Sebastian", 9999999, 76);
        Persona person7 = new Persona("Hermaphrodite", 0000000, 78);
        Persona person8 = new Persona("Esterel", 3334567, 90);
        Persona person9 = new Persona("Esternocleidomastoideo", 3456789, 56);
        Persona person10 = new Persona("Matias", 5465435, 24);
        Persona person11 = new Persona("Onichan", 1236789, 49);
        Persona person12= new Persona("Senpai", 4444444, 34);
        Persona person13 = new Persona("Taki", 5555555, 21);
        Persona person14 = new Persona("patricio", 6578987, 20);
        Persona person15 = new Persona("mauricio", 3456765, 20);

        List<Persona> list1 = new LinkedList<Persona>();
        list1.add(person1);
        list1.add(person2);
        list1.add(person3);

        List<Persona> list2 = new LinkedList<Persona>();
        list2.add(person4);
        list2.add(person5);
        list2.add(person6);

        List<Persona> list3 = new LinkedList<Persona>();
        list3.add(person7);
        list3.add(person8);
        list3.add(person9);

        List<Persona> list4 = new LinkedList<Persona>();
        list4.add(person10);
        list4.add(person11);
        list4.add(person12);

        List<Persona> list5 = new LinkedList<Persona>();
        list5.add(person13);
        list5.add(person14);
        list5.add(person15);

        BackUp backUp;
        backUp= new BackUp("BackupMarzo", list1);
        originator.setState(backUp);
        dataBase.addBackup(originator.createBackUp());

        backUp= new BackUp("BackupMayo", list2);
        originator.setState(backUp);
        dataBase.addBackup(originator.createBackUp());

        backUp= new BackUp("BackupJulio", list3);
        originator.setState(backUp);
        dataBase.addBackup(originator.createBackUp());

        backUp= new BackUp("BackupSeptiembre", list4);
        originator.setState(backUp);
        dataBase.addBackup(originator.createBackUp());

        backUp= new BackUp("BackupNoviembre", list5);
        originator.setState(backUp);
        dataBase.addBackup(originator.createBackUp());

        originator.restoreFromMemento(dataBase.getMemento(1));
    }
}