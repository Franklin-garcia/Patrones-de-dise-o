/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Franklin Garcia
 */
import observer.Editor;
import observer.EmailNotificationListener;
import observer.LogOpenListener;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("abrir", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("guardar", new EmailNotificationListener("admin@ejempplo.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}