import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

import javax.swing.JFileChooser;

public class Main

{

    public static void main(String args[])

    {

        final JFileChooser file_chooser = new JFileChooser();

        int returnVal = file_chooser.showOpenDialog(null);

        File file=file_chooser.getSelectedFile();

        int line_count = 0;
        int word_count = 0;
        int character_count = 0;

        String line = "";

        try
        {

            Scanner read=new Scanner(file);

            while(read.hasNextLine())

            {

                line=read.nextLine();

                String words[]=line.split(" ");

                character_count=character_count+line.length();
                word_count=word_count+words.length;
                line_count=line_count+1;

            }
        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        System.out.printf("File Name: %s \n Characters: %d \n Words: %d \n Lines: %d \n",file.getName(),character_count,word_count,line_count);

    }

}