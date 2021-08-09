package com.AltshulerIO;
public class Starter
{
    private static final HTMLCreator htmlCreator = new HTMLCreator();
    public static void main(String[] args) throws Exception
    {
        ProjectInfo.initializeLinkNames();
        ProjectInfo.initializeLinkPages();
        ProjectInfo.initializeGroupNames();
        htmlCreator.createStartPage();
        htmlCreator.createTimetablePage(7);
    }
}