import entity.Car;
import entity.Passport;
import entity.Person;
import entity.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("connect");
        EntityManager manager = factory.createEntityManager();

        Person roman = Person.builder().Fname("Roman").Lname("Hlodan").age(24).build();
        Person olya = Person.builder().Fname("Olya").Lname("Kuch").age(23).build();
        Person petro = Person.builder().Fname("Petro").Lname("Ivanciv").age(25).build();
        Person sanja = Person.builder().Fname("Sanja").Lname("Samol").age(18).build();
        Person lida = Person.builder().Fname("Lida").Lname("Ciko").age(22).build();
        Person ivan = Person.builder().Fname("Ivan").Lname("Sabat").age(25).build();
        Person volodia = Person.builder().Fname("Volodia").Lname("Panasenko").age(32).build();
        Person katia = Person.builder().Fname("Katia").Lname("Vinskov").age(24).build();
        Person ira = Person.builder().Fname("Ira").Lname("Zeml").age(20).build();

        Passport passport1 = Passport.builder().SerialNumber("ED43684").build();
        Passport passport2 = Passport.builder().SerialNumber("LF44322").build();
        Passport passport3 = Passport.builder().SerialNumber("LF43112").build();
        Passport passport4 = Passport.builder().SerialNumber("VF54098").build();
        Passport passport5 = Passport.builder().SerialNumber("FR32189").build();
        Passport passport6 = Passport.builder().SerialNumber("OI76903").build();
        Passport passport7 = Passport.builder().SerialNumber("QA66542").build();
        Passport passport8 = Passport.builder().SerialNumber("LP76438").build();
        Passport passport9 = Passport.builder().SerialNumber("DD33670").build();

        Car opel = Car.builder().brand("Opel").model("Astra J").graduation_year(2012).build();
        Car reno = Car.builder().brand("Renault").model("Megane 4").graduation_year(2017).build();
        Car kia = Car.builder().brand("KIA").model("Ceed 2").graduation_year(2015).build();
        Car bmw = Car.builder().brand("BMW").model("520").graduation_year(2008).build();
        Car audi = Car.builder().brand("Audi").model("A7").graduation_year(2011).build();
        Car jeep = Car.builder().brand("Jeep").model("Grand Cheroki").graduation_year(2019).build();
        Car vw = Car.builder().brand("VW").model("Golf 7").graduation_year(2014).build();
        Car mers = Car.builder().brand("Mers").model("S500").graduation_year(2018).build();
        Car mini = Car.builder().brand("Mini").model("Cuntreman").graduation_year(2010).build();


        Service renaultServ = Service.builder().title("Renault").staff(10).location("Drohobych").build();
        Service kiaServ = Service.builder().title("Kia").staff(15).location("Lviv").build();
        Service bukivServ = Service.builder().title("STO").staff(3).location("Bukiv").build();
        Service luxserv = Service.builder().title("LuxService").staff(7).location("Stebnyk").build();
        Service stobestServ = Service.builder().title("STOBast").staff(9).location("Kiev").build();

        manager.getTransaction().begin();

        manager.persist(olya);
        manager.persist(roman);
        manager.persist(petro);
        manager.persist(sanja);
        manager.persist(lida);
        manager.persist(ira);
        manager.persist(katia);
        manager.persist(ivan);
        manager.persist(volodia);

        manager.persist(passport1);
        manager.persist(passport2);
        manager.persist(passport3);
        manager.persist(passport4);
        manager.persist(passport5);
        manager.persist(passport6);
        manager.persist(passport7);
        manager.persist(passport8);
        manager.persist(passport9);

        Person person = manager.find(Person.class, 9);
        Passport passport = manager.find(Passport.class, 6);
        passport.setPerson(person);

        manager.persist(opel);
        manager.persist(reno);
        manager.persist(bmw);
        manager.persist(kia);
        manager.persist(mers);
        manager.persist(jeep);
        manager.persist(vw);
        manager.persist(audi);
        manager.persist(mini);

        Car car16 = manager.find(Car.class, 16);
        Car car13 = manager.find(Car.class, 13);
        Person person1 = manager.find(Person.class, 1);
        car13.setPerson(person1);
        car16.setPerson(person1);

        Car car11 = manager.find(Car.class, 11);
        Car car12 = manager.find(Car.class, 12);
        Car car15 = manager.find(Car.class, 15);
        Person person2 = manager.find(Person.class, 2);
        car12.setPerson(person2);
        car11.setPerson(person2);
        car15.setPerson(person2);

        Car car1 = manager.find(Car.class, 1);
        Car car3 = manager.find(Car.class, 3);
        Person person3 = manager.find(Person.class, 3);
        car1.setPerson(person3);
        car3.setPerson(person3);

        Car car14 = manager.find(Car.class, 14);
        Person person4 = manager.find(Person.class, 4);
        car14.setPerson(person4);

        Car car9 = manager.find(Car.class, 9);
        Car car5 = manager.find(Car.class, 5);
        Car car17 = manager.find(Car.class, 17);
        Person person5 = manager.find(Person.class, 5);
        car5.setPerson(person5);
        car9.setPerson(person5);
        car17.setPerson(person5);

        Car car18 = manager.find(Car.class, 18);
        Person person6 = manager.find(Person.class, 6);
        car18.setPerson(person6);

        Car car4 = manager.find(Car.class, 4);
        Car car7 = manager.find(Car.class, 7);
        Person person7 = manager.find(Person.class, 7);
        car4.setPerson(person7);
        car7.setPerson(person7);

        Car car6 = manager.find(Car.class, 6);
        Car car10 = manager.find(Car.class, 10);
        Person person8 = manager.find(Person.class, 8);
        car6.setPerson(person8);
        car10.setPerson(person8);

        Car car8 = manager.find(Car.class, 8);
        Person person9 = manager.find(Person.class, 9);
        car8.setPerson(person9);

        manager.persist(bukivServ);
        manager.persist(kiaServ);
        manager.persist(renaultServ);
        manager.persist(stobestServ);
        manager.persist(luxserv);

        List<Car> cars = manager.createQuery("select c from Car c where c.brand='Opel' ", Car.class).getResultList();
        Service service = manager.find(Service.class, 2);
        service.setCar(cars);



        manager.getTransaction().commit();

        TypedQuery<Person> query = manager.createQuery("select p from Person p", Person.class);
        List<Person> resultList = query.getResultList();
        for (Person person10 : resultList) {
            System.out.println(person10 + " " + person10.getPassport());
        };

        List<Person> resultList1 = manager.createQuery("select distinct p from Person p left join fetch p.passport left join fetch p.car", Person.class).getResultList();
        for (Person person11 : resultList) {
            System.out.println(person11 + " " + person11.getPassport() + " " + person11.getCar());
        }

        manager.close();
        factory.close();
    }
}
