package ru.avalon.java.dev.j10.labs.models;


import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import java.util.Date;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
class Passport {
    private String seria_number;
    private String name;
    private String last_name;
    private String father_name;
    private String second_name;
    private Date birthday;
    private Date release_date;
    private String organ;
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
    public Passport(String name, String second_name, String last_name, String father_name){
        this.name = name;
        this.second_name = second_name;
        this.last_name = last_name;
        this.father_name = father_name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public String getFather_name() {
        return father_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getName() {
        return name;
    }

    public String getOrgan() {
        return organ;
    }

    public String getSecond_name() {
        return second_name;
    }

    public String getSeria_number() {
        return seria_number;
    }
    public String getFullName(){
        String full_name = String.join(" ", this.last_name, this.name);
        if (this.father_name == null && this.second_name != null) full_name = this.name + " " + this.second_name.substring(0,1) + ". " + this.last_name;
        else if (this.father_name != null) full_name = String.join(" ", this.last_name, this.name, this.father_name);

        return full_name;
    }
}
