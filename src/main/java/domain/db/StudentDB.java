package domain.db;

import domain.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDB {

    private List<Student> students = new ArrayList<>();

    public StudentDB() {
        this.createStudents();
    }


    private void createStudents() {
        Student greetje = new Student("Jongen", "Greetje", "Toegepaste Informatica", 23);
        Student kristien = new Student("Melaerts", "Kristien", "Chemie", 21);
        Student elke = new Student("Steegmans", "Elke", "Vroedkunde", 16);
        Student jan = new Student("Van Hee", "Jan", "Verpleegkunde", 18);


        students.add(greetje);
        students.add(kristien);
        students.add(elke);
        students.add(jan);

    }

    public List<Student> getAllStudents() {
        return Collections.unmodifiableList(students);
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }



    // Als ik het zo doe dan kan ik ni in de servlet kiezen in welke JSP ik terecht kom dus moet maar gewoon true of
    // false geven en dan in de servlet zelf de message zetten?? huuh???
    // Offf shieet da moet zelfs ni, de fucking jsp pagina moe da allemaal schrijven lool
    public String[] lookUpStudent(String voornaam, String achternaam) {
        // Check in alle student lijst dan returnt die als die wordt gevonden
        for (Student student : students) {
            if (student.getVoornaam().equals(voornaam) && student.getNaam().equals(achternaam)) {
                return new String[] { ("1"), ("Je vroeg naar de volgende gegevens: " + student.getNaam() + " "
                        + student.getVoornaam() + " (" + student.getLeeftijd() + " jaar): " + student.getStudierichting()) };
            }
        }
        // Anders zit die er niet in en kom je toch hier
        return new String[] { ("0"), ("Helaas, de student waarnaar je vraagt is niet gevonden.") };
    }


    public boolean isStudent(String voornaam, String achternaam) {
        // Check in alle student lijst dan returnt die als die wordt gevonden
        for (Student student : students) {
            if (student.getVoornaam().equals(voornaam) && student.getNaam().equals(achternaam)) {
                return true;
            }
        }
        // Anders zit die er niet in en kom je toch hier
        return false;
    }




}
