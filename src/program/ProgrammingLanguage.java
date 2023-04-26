package program;

import program.Language;

public class ProgrammingLanguage implements Language {


    @Override
    public void getName() {
        System.out.println("Java bir proqramlasdirma dilidir");
    }
}
