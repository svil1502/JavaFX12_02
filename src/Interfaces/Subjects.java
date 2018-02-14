package Interfaces;

import Objects.Subject;
import javafx.collections.ObservableList;

public interface Subjects {
    boolean add(Subject subject);
    boolean update(Subject subject);
    boolean delete(Subject subject);
   // ObservableList<Subject> findAll();

   // ObservableList<Subject> find(String text);
}
