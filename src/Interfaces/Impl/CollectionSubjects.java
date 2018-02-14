package Interfaces.Impl;

import DB.FirebirdConnection;
import Interfaces.Subjects;
import Objects.Subject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CollectionSubjects implements Subjects {
    private ObservableList<Subject> subjectlist = FXCollections.observableArrayList();
    //private ObservableList<Subject> subjectlist2 = FXCollections.observableArrayList();
    //private ObservableList<Subject> subjectlist3 = FXCollections.observableArrayList();
    private FirebirdConnection dc;

    @Override
    public boolean add(Subject subject) {
        throw new UnsupportedOperationException("Not implemented, yet");
    }
    @Override
    public boolean update(Subject subject) {
        throw new UnsupportedOperationException("Not implemented, yet");
    }
    @Override
    public boolean delete(Subject subject) {
        throw new UnsupportedOperationException("Not implemented, yet");
    }

    public ObservableList<Subject> getSubjectlist() {
        return subjectlist;
    }

    public void print() {
        // int number=0;
        for (Subject subject : subjectlist) {
            // number++;
            System.out.println(subject.getId() + ")" + subject.getSubject());
        }
    }
//
//    @Override
//    public ObservableList<Subject> findAll() {
//
//        try (Connection con = FirebirdConnection.getConnection();
//             Statement statement = con.createStatement();
//             ResultSet rs = statement.executeQuery("select * from subject");) {
//            while (rs.next()) {
//                Subject subject = new Subject(" ", " ");
//                subject.setId(rs.getString("id"));
//                subject.setSubject(rs.getString("subject"));
//                subjectlist.add(subject);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(CollectionSubjects.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return subjectlist;
//    }
//
//


    public void print2() {
        // int number=0;
        for (Subject subject : subjectlist) {
            // number++;
            System.out.println(subject.getId() + ")" + subject.getSubject());
        }
    }

    public void fillTestData() {
        subjectlist.add(new Subject("1", "Математика"));
        subjectlist.add(new Subject("2", "История"));
        subjectlist.add(new Subject("3", "Химия"));
        subjectlist.add(new Subject("4", "Физика"));
        subjectlist.add(new Subject("5", "География"));
        subjectlist.add(new Subject("6", "Физкультура"));

    }


    public void loadDataFromDatabase() {
        try {
            //dc.Connector() = null;

            Connection con = FirebirdConnection.Connector();
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from subject");


           // Connection conn = dc.Connector();
           // subjectlist2 = FXCollections.observableArrayList();
            //conn = FirebirdConnection.Connector();

            // Execute query and store result in a resultset
           // ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM subject");
            while (rs.next()) {
                //get string from db,whichever way
                subjectlist.add(new Subject(rs.getString(1), rs.getString(2)));

            }

        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }


    }

}