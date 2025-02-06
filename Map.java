
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import SGE.*;
public class Map
{
    private List<SGBild> maptiles;
    public Map(String pFile)
    {
        maptiles= new List<SGBild>();
        LoadMap(pFile);
    }

    public void LoadMap(String pFileName){

        File file = new File(pFileName);
        try 
        {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            int j=0;
            line = br.readLine();
            while(line != null){
                char[] arr=line.toCharArray();
                for(int i=0;i<arr.length;i++){
                    if(arr[i] != '0'){
                        
                        SGBild temp= new SGBild(18*i,18*j, "levels/tile_"+arr[i] +".png");
                        maptiles.append(temp);
                    }
                }
                j++;
                line = br.readLine();
            }
        }
        catch( Exception e )
        {
            System.out.println("Fehler beim Laden der Datei");
        }
    }
}
