package by.tms;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.getUserByLogin("test");
    }
}
