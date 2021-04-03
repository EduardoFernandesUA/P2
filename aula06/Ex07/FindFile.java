import java.io.File;

/**
 * Run with:
 * javac FindFile.java && (java -ea FindFile run.sh ../..; rm FindFile.class)
 */
public class FindFile {
    public static void main(String[] args) {
        assert args.length == 2 : "Run with arguments: java -ea FindFile <file> <dir>";
        String fileName = args[0];
        String dirPath = args[1];
        try{
            File dir = new File(dirPath);
            findFile(dir, fileName);
        } catch(NullPointerException e) {
            System.err.println("Invalid Path");
            System.exit(2);
        }  
    }

    public static void findFile(File dir, String fileName){
        File[] dirList = dir.listFiles();
        for (int i = 0; i < dirList.length; i++) {
            if(dirList[i].isDirectory()) {
                findFile(dirList[i], fileName);
            }else if(dirList[i].isFile()){
                if(dirList[i].getName().indexOf(fileName)!=-1){  // a) if(dirList[i].getName().equals(fileName))
                    System.out.println(dirList[i].getPath());
                }
            }
        }
    }
}
