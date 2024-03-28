package com.mdhyani.fileprocessor;


import com.mdhyani.fileprocessor.converter.StringConverter;
import com.mdhyani.fileprocessor.reader.FileReader;
import com.mdhyani.fileprocessor.writer.FileWriter;

public class FileProcessorApplication {

	private final FileReader fileReader;

	private final FileWriter fileWriter;

	public FileProcessorApplication(FileReader fileReader, FileWriter fileWriter) {
		this.fileReader = fileReader;
		this.fileWriter = fileWriter;
	}

	public  void process(String inputFile, String outputFile) {
		String fileContent = this.fileReader.readFile(inputFile);
		System.out.println("fileContent : " + fileContent);
		String reverseString = StringConverter.reverse(fileContent);
		System.out.println("reversed string : " + reverseString);
		FileWriter fileWriter = this.fileWriter;
		fileWriter.writeToFile(reverseString, outputFile);
	}

	public static void main(String[] args) {
		FileProcessorApplication fileProcessorApplication = new FileProcessorApplication(new FileReader(), new FileWriter());
		fileProcessorApplication.process("src/main/resources/demo.txt", "src/main/resources/output.txt");
	}

}
