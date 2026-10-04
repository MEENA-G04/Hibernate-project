package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Configuration con = new Configuration();

        con.setProperty("hibernate.connection.driver_class",
                "com.mysql.cj.jdbc.Driver");

        con.setProperty("hibernate.connection.url",
                "jdbc:mysql://db01.dbhost.dev:5051/db_4555yscbr");

        con.setProperty("hibernate.connection.username",
                "user_4555yscbr");

        con.setProperty("hibernate.connection.password",
                "p4555yscbr");

        con.setProperty("hibernate.hbm2ddl.auto", "update");
        con.setProperty("hibernate.show_sql", "true");

        con.addAnnotatedClass(StudentApp.class);

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();

        
        session.beginTransaction();

        session.persist(new StudentApp(
            1,
            "Arun",
            "arun@gmail.com",
            "Artificial Intelligence"
        ));

        session.persist(new StudentApp(
            2,
            "Kumar",
            "kumar@gmail.com",
            "Computer Science"
        ));

        session.persist(new StudentApp(
            3,
            "Meena",
            "meena@gmail.com",
            "Artificial Intelligence"
        ));

        session.persist(new StudentApp(
            4,
            "Priya",
            "priya@gmail.com",
            "Biotechnology"
        ));

        session.persist(new StudentApp(
            5,
            "Vijay",
            "vijay@gmail.com",
            "Data Science"
        ));

        session.persist(new StudentApp(
            6,
            "Divya",
            "divya@gmail.com",
            "Artificial Intelligence"
        ));

        session.persist(new StudentApp(
            7,
            "Karthik",
            "karthik@gmail.com",
            "Computer Science"
        ));

        session.persist(new StudentApp(
            8,
            "Naveen",
            "naveen@gmail.com",
            "Information Technology"
        ));

        session.persist(new StudentApp(
            9,
            "Swetha",
            "swetha@gmail.com",
            "Biotechnology"
        ));

        session.persist(new StudentApp(
            10,
            "Praveen",
            "praveen@gmail.com",
            "Data Science"
        ));

        session.getTransaction().commit();

        System.out.println("10 Students inserted successfully!");

        session.close();
        factory.close();
    }
}
