
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
public class Map
{
    public Map()
    {
        // Hallo
    }
    public void LoadMap(String pFileName){

        File file = new File(pFileName);
        try 
        {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                //process the line
                System.out.println(line);
            }
        }
        catch( Exception e )
        {
            System.out.println("Fehler beim Laden der Datei");
        }
    }
}
