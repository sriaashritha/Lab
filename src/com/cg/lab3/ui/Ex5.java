package com.cg.lab3.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\new\\keerthi.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String line; 
        int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
        int paragraphCount = 1; 
        int whitespaceCount = 0; 
        while((line = reader.readLine()) != null) {
        	if(line.equals("")) {
        		paragraphCount++; 
        	}else {
        		characterCount += line.length(); 
                String[] wordList = line.split("\\s+"); 
                  
                countWord += wordList.length; 
                whitespaceCount += countWord -1; 
                String[] sentenceList = line.split("[!?.:]+"); 
                  
                sentenceCount += sentenceList.length; 
        	}
        }
        System.out.println("Total word count = " + countWord); 
        System.out.println("Total number of sentences = " + sentenceCount); 
        System.out.println("Total number of characters = " + characterCount); 
        System.out.println("Number of paragraphs = " + paragraphCount); 
        System.out.println("Total number of whitespaces = " + whitespaceCount); 
        reader.close();
	}

}
