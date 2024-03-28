package com.mdhyani.fileprocessor.fileprocessor;


import com.mdhyani.fileprocessor.FileProcessorApplication;
import com.mdhyani.fileprocessor.reader.FileReader;
import com.mdhyani.fileprocessor.writer.FileWriter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class FileProcessorApplicationTests {

	private FileReader fileReader;

	private FileWriter fileWriter;

	private FileProcessorApplication fileProcessorApplication;

	@BeforeEach
	public void setUp() {
		fileReader = mock(FileReader.class);
		fileWriter = mock(FileWriter.class);
		fileProcessorApplication = new FileProcessorApplication(fileReader, fileWriter);
	}

	@Test
	public void testFileProcessor() {
		doReturn("ABC").when(fileReader).readFile(anyString());
		doNothing().when(fileWriter).writeToFile(anyString(), anyString());
		fileProcessorApplication.process("abc.txt", "test.txt");
	}


}
