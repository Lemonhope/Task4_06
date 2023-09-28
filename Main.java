//Створіть проект з класом Main.java.
//Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil.
// У тілі класу створіть методи void study(), void read(), void write(), void relax().
// Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil і
// перевизначте кожен із методів, залежно від успішності учня.
// Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися з 4 учнів.
// Передбачте можливість, що користувач може передати 2 або 3 аргументи.
// Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.
package Task4_06;

public class Main {
    public static void main(String[] args) {
        ExcellentPupil exPupil=new ExcellentPupil();
        BadPupil badPupil=new BadPupil();
        GoodPupil goodPupil=new GoodPupil();
        ClassRoom newClass=new ClassRoom(badPupil, exPupil, goodPupil);
        newClass.showInfo();
    }
}
