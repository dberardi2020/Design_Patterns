package edu.wpi.cs3733.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Message class to hold clear text; you must implement the rest of the class
 */
public class Message implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    private String getText() {
        return message;
    }

    public void setText(String text) {
        message = "";
        if (text.length() < 140 && validChars(text)) {
            message = text;
        }
        notifyObservers();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.notify(getText());
        }
    }

    private boolean validChars(String text) {
        return text.matches("^[a-zA-Z\\s]*$");
    }
}
