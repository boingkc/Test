/**
 * Created by BOINGKC on 10/08/2017 AD.
 */
public class People {
    public String name_surname ;
    public String ocupation;
    public int age;

    People(String name, String ocupation, int age){
        this.age = age;
        this.name_surname = name;
        this.ocupation = ocupation;
    }


    public String getName_surname() {
        return name_surname;
    }

    public String getOcupation() {
        return ocupation;
    }

    public int getAge() {
        return age;
    }
}
