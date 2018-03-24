import ReadFile.myFileReader;
import OutPutData.myOutputToConsole;
import WriteFile.myFileWriter;



public class Program {
    public static void main(String[] args) {
        String fileName = "test.txt";
        String readed = new myFileReader().readTextFile(fileName);
        new myOutputToConsole().ConsolOutput(readed);
        new myFileWriter().writeTextToFile(fileName,"A new text"); 
        Facade f = new Facade();
        String readed = r.ReadFile(fileName);
        f.OutputToConsole(readed);
        f.writeToFole(fileName,"text to append");
    
    
    }
    
    
}
