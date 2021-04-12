import java.io.File;
import p2utils.LinkedList;

/**
 * Run with:
 * javac ListRec.java && (java -ea ListRec ../; rm ListRec.class)
 */
public class ListRec2 {
    public static void main(String[] args) {
        assert args.length > 0 : "Run with arguments: java -ea ListRec <dir>";
        String dirPath = args.length>=1 ? args[0] : "./";
        LinkedList<File> list = new LinkedList<File>();
        try{
            File dir = new File(dirPath);
            listRec(list, dir);
            list.print();
        } catch(NullPointerException e) {
            System.err.println("Invalid Path");
            System.exit(2);
        }  
    }

    public static void listRec(LinkedList<File> list, File dir){
        File[] dirList = dir.listFiles();
        for (int i = 0; i < dirList.length; i++) {
            if(dirList[i].isDirectory()) {
                list.addLast(dirList[i]);
                listRec(list, dirList[i]);
            }else if(dirList[i].isFile()){
                list.addLast(dirList[i]);
                //System.out.println(dirList[i].getPath());
            }
        }
    }
}
