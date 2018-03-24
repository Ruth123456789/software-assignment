import ReadFile.myFileReader;
import OutPutData.myOutputToConsole;
import WriteFile.myFileWriter;

/**
 *
 * @author user
 */
public class Facade {
    private myFileReader reader;
     private myFileWriter writer;
     private myOutputToConsole console;
  
public Facade(){
    this.reader = new myFileReader();
    this.writer = new myFileWriter();
    this.console = new myOutputToConsole();
    
}
    public static void main(String fileName) {
     return this.reader.readTextFile(fileName);
   
    
}
    public void OutputToConsol(String text){
        this.console.ConsolOutput(text);
    }
    public void WriteToFile(String fileName,String text){
        this.writer.writeTextTOFile(fileName,text);
    }
    public void ReadWrite(string fileName,String text){
        this.writer.writeTextToFile(fileName,text);
    }
    public void ReadAndWrite(string fileName,String text){
        string readed =this.ReadFile(fileName);
        this.OutputToConsol(fileName);
        this.WriteToFile(fileName, text);
    }
    
}