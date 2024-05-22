package se.lexicon.SpringWorkshop.service;

import org.springframework.stereotype.Component;

@Component
public class ScannerInputService implements UserInputService{
    @Override
    public String getString() {
        return "";
    }

    @Override
    public int getInt() {
        return 0;
    }
}
