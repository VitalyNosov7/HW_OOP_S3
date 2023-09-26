/*
// Домашнее задание.
========================================================================
// Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
========================================================================

// V    1. Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim).
// V    2. Создать по два класса наследника Animal, умеющих летать, плавать, бегать.
// V    3. Добиться того, чтобы не умеющие летать не могли этого делать, либо как-то оповещали об этом пользователя.

// САМАЯ ВАЖНАЯ ЧАСТЬ:
// В файле readme.md в репозитории гитхаб описать
// какие проблемы в таком проектировании Вы увидели, а также там же написать возникшие при выполнении дз вопросы
// (если они есть)
========================================================================
*/

package animal;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner alex = new Owner("Alexey");
        Vaccination chumka = new Vaccination("chumka", LocalDate.of(2010, 12, 5));

        Animal barsik = new Cat("barsik", 10.0, alex, LocalDate.now(), List.of(chumka), Color.BLACK, false, "siamskiy");
        Dog barbos = new Dog("barbos", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, true, "Такса");
        Turtle Donatelo = new Turtle("Donatelo", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, true, "Морская черепаха");
        Bat Aero = new Bat("Aero", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, false, "летучая мышь");
        Cat pushok = new Cat("pushok", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, true, "Сфинкс");
        Bird Kesha = new Bird("Kesha", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, false, "Попугай");
        Rat Larisa = new Rat("Larisa", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, true, "Крыса Сирийская");

        Donatelo.fly();
        barsik.fly();
        barbos.fly();
        Aero.fly();
        pushok.fly();
        Kesha.fly();
        Larisa.fly();

    }
}