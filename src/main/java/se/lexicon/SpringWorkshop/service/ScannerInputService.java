package se.lexicon.SpringWorkshop.service;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ScannerInputService implements UserInputService{
    @Autowired
    private Scanner scanner;

    @Override
    public String getString() {
        System.out.println("Ange student Namn: ");
        return scanner.nextLine();
    }
    @Override
    public int getInt() {
        return 0;
    }
}
