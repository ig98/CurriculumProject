package com.AltshulerIO;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Iterator;

public class HTMLCreator
{
    public void createStartPage() throws Exception
    {
        File firstFile=new File("C:\\ProgramData\\JetBrains\\CurriculumProject\\src\\main\\resources\\index.html");
        System.out.println(firstFile.createNewFile());
        PrintWriter pw=new PrintWriter(firstFile,"UTF-8");
        pw.write("<html><head><title>Start Page</title></head><style type=\"text/css\"> h1 {color: blue;} h2 {color: red} select{height: 24px; font-size: 20px, padding: 4px}" +
                "</style><body><div align=\"center\"><p><br><h1>Электронное расписание физико-математического факультета" +
                "</p></h1><hr></div>");
        pw.write("<div align=\"center\">");
        pw.write("<p><h2>Неделя</h2></p>");
        pw.write("<select><option disabled> Выберите неделю </option>");
        for (int i=1; i<19; i++)
        {
            pw.write("<option value=" + i + ">");
            pw.write(i + "</option>");
        }
        pw.write("</select>");
        pw.write("</div>");
        pw.write("<p><h2>Курс</h2></p>");
        pw.write("<div><p><select>");
        pw.write("<option disabled> Выберите курс </option>");
        for (int i=0; i<7; i++)
        {
            pw.write("<option value=" + ProjectInfo.getLinkPages().get(i) + ">");
            pw.write("<div><p><h3><a href=\""+ProjectInfo.getLinkPages().get(i)+"\">"+ ProjectInfo.getLinkNames().get(i)+"</a></p></h3></div>");
            pw.write("</option>");
        }
        pw.write("</select>");
        pw.write("</div>");
        pw.write("<p><h2>Группа</h2></p>");
        pw.write("<div><p><select>");
        pw.write("<option disabled> Выберите группу </option>");
        for (int i=0; i<ProjectInfo.getGroupNames().size(); i++)
        {
            pw.write("<option value=" + ProjectInfo.getGroupNames().get(i) + ">" +  ProjectInfo.getGroupNames().get(i));
            pw.write("</option>");
        }
        pw.write("</select>");
        pw.write("</div>");
        pw.write("</body></html>");
        pw.close();
    }
    public void createTimetablePage(int count) throws Exception
    {
        FileInputStream fileInputStream=new FileInputStream("C:\\ProgramData\\JetBrains\\Curriculum\\src\\main\\resources\\TimeTable.xls");
        HSSFWorkbook workbook=new HSSFWorkbook(fileInputStream);
        Iterator<Sheet> sheetIterator=workbook.iterator();
        int i=0;
        while (sheetIterator.hasNext())
        {
            Sheet sheet=sheetIterator.next();
            File htmlFile=new File(ProjectInfo.getLinkPages().get(i));
            System.out.println(htmlFile.createNewFile());
            PrintWriter pw=new PrintWriter(htmlFile, "UTF-8");
            pw.write("<html><head><title>TimeTable</title> <style type=\"text/css\">\n" +
                    "   TABLE {\n" +
                    "    background: white; /* Цвет фона таблицы */\n" +
                    "    color: white; /* Цвет текста */\n" +
                    "   }\n" +
                    "   TD, TH {\n" +
                    "    background-color: skyblue; /* Цвет фона ячеек */\n" +
                    "    color: black; /* Цвет текста ячеек */\n" +
                    "    padding: 5px; /* Поля вокруг текста */\n" +
                    "   }\n" +
                    "  </style></head><body><p>TimeTable</p></body></html>");
            pw.println("<table cellspacing=\"1\">");
            for (Row row: sheet)
            {
                pw.println("<tr>");
                for (Cell cell: row)
                {
                    pw.println("<td>");
                    pw.println(cell);
                    pw.println("</td>");
                }
                pw.println("</tr>");
            }
            pw.println("</table>");
            pw.close();
            i++;
            if (i>=count)
            {
                break;
            }
        }
    }
}