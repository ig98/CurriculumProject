package com.AltshulerIO;
import java.util.ArrayList;

public class ProjectInfo
{
    private static final ArrayList<String> linkNames=new ArrayList<>();
    private static final ArrayList<String> linkPages=new ArrayList<>();
    private static final ArrayList<String> groupNames=new ArrayList<>();
    public static ArrayList<String> getGroupNames()
    {
        return groupNames;
    }
    public static void initializeLinkNames()
    {
        linkNames.add("1 курс");
        linkNames.add("2 курс");
        linkNames.add("3 курс");
        linkNames.add("4 курс");
        linkNames.add("5 курс");
        linkNames.add("Магистратура");
        linkNames.add("Магистратура ВЕБ");
    }
    public static void initializeLinkPages()
    {
        linkPages.add("C:\\ProgramData\\JetBrains\\CurriculumProject\\src\\main\\resources\\timeTable1.html");
        linkPages.add("C:\\ProgramData\\JetBrains\\CurriculumProject\\src\\main\\resources\\timeTable2.html");
        linkPages.add("C:\\ProgramData\\JetBrains\\CurriculumProject\\src\\main\\resources\\timeTable3.html");
        linkPages.add("C:\\ProgramData\\JetBrains\\CurriculumProject\\src\\main\\resources\\timeTable4.html");
        linkPages.add("C:\\ProgramData\\JetBrains\\CurriculumProject\\src\\main\\resources\\timeTable5.html");
        linkPages.add("C:\\ProgramData\\JetBrains\\CurriculumProject\\src\\main\\resources\\magistrature.html");
        linkPages.add("C:\\ProgramData\\JetBrains\\CurriculumProject\\src\\main\\resources\\magistratureWEB.html");
    }
    public static void initializeGroupNames()
    {
        groupNames.add("МИ-11");
        groupNames.add("ФИ-11");
        groupNames.add("ЭК-11");
        groupNames.add("ПМ-11");
        groupNames.add("КФ-11");
        groupNames.add("МИ-21");
        groupNames.add("МИ-22");
        groupNames.add("ФИ-21");
        groupNames.add("МИ-31");
        groupNames.add("МИ-32");
        groupNames.add("МИ-33");
        groupNames.add("ФИ-31");
        groupNames.add("ФИ-32");
        groupNames.add("МИ-41");
        groupNames.add("МИ-42");
        groupNames.add("ФИ-41");
        groupNames.add("ФИ-42");
    }
    public static ArrayList<String> getLinkNames()
    {
        return linkNames;
    }
    public static ArrayList<String> getLinkPages()
    {
        return linkPages;
    }
}