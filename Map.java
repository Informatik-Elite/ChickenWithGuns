
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
public class Map
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Map
     */
    public Map()
    {
        // Instanzvariable initialisieren
        x = 0;
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
