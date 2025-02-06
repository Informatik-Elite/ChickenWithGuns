
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import SGE.*;
public class Map
{
    private List<SGBild> maptiles;
    public Map()
    {
        maptiles= new List<SGBild>();
        LoadMap("levels/Level.1.txt");
    }

    public void LoadMap(String pFileName){

        File file = new File(pFileName);
        try 
        {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            int j=0;
            while((line = br.readLine()) != null){
                char [] arr=line.toCharArray();
                for(int i=0;i<0;i++){
                    if(arr[i]!='0'){
                        SGBild temp= new SGBild(18*i,18*j, "tile_"+arr[i] +".png");
                        maptiles.append(temp);
                    }
                }
                j++;

            }
        }
        catch( Exception e )
        {
            System.out.println("Fehler beim Laden der Datei");
        }
    }
}
