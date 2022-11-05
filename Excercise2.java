package Exception;

import java.io.FileReader;

public class Excercise2 { 
	public static void main(String args[])throws Exception{    
    FileReader fr=new FileReader("C:\\Users\\user\\Desktop\\filereader.txt");    
    int i;    
    while((i=fr.read())!=-1)    
    System.out.print((char)i);    
    fr.close();    
}    
}    


