package ui.controller;

import domain.db.StudentDB;
import domain.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ZoekServlet")
public class ZoekServlet extends HttpServlet {

    private StudentDB studentDatabase = new StudentDB();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("zit in post");

//        if ( (request.getParameter("naam") != null) ) {
        if ( (request.getParameter("naam") != null) && (request.getParameter("voornaam") != null) &&  (request.getParameter("leeftijd") != null) && ( request.getParameter("studieRichting") != null)) {
            Student newStudent = new Student(
                    request.getParameter("naam"),
                    request.getParameter("voornaam"),
                    request.getParameter("studieRichting"),
                    Integer.parseInt(request.getParameter("leeftijd")) );
            studentDatabase.addStudent(newStudent);
            request.setAttribute("newDB", studentDatabase);
            RequestDispatcher view = request.getRequestDispatcher("studentInfoOverzichtUpdate.jsp");
            view.forward(request, response);
        }
        else {
                String result = "U vulde niet alle velden in";
                request.setAttribute("result", result);
                RequestDispatcher view = request.getRequestDispatcher("studentForm.jsp");
                view.forward(request, response);

            }



        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("zit in gett");


        String voornaamRequest = request.getParameter("voornaam");
        System.out.println("Je vroeg om " + voornaamRequest);

        String naaamRequest = request.getParameter("vaam");
        System.out.println("Je vroeg om " + naaamRequest);

        // Perfect werkt zo al goooed!!

        // Nu checken of ze in de DB zitten
        String[] result = studentDatabase.lookUpStudent(voornaamRequest, naaamRequest);

        String resultMessage = result[1];
        request.setAttribute("result", resultMessage);
        RequestDispatcher view;
        if (result[0].equals("1")) {
            // Dan zit die er in en ga naar gevonden jsp
            view = request.getRequestDispatcher("gevonden.jsp");
        }
        else {
            // Dan niet in en ga naar nietgevonden jsp
            view = request.getRequestDispatcher("nietgevonden.jsp");
        }

        view.forward(request, response);




    }
}
