import java.io.File;

public class Ex04 {
    public static void main(String[] args) {
        String dirPath = args.length>=1 ? args[0] : "./";
        try{
            File dir = new File(dirPath);
            listFiles(dir);
        } catch(NullPointerException e) {
            System.err.println("Invalid Path");
            System.exit(2);
        }        
    }

    public static void listFiles(File dir){
        File[] dirList = dir.listFiles();
        for (int i = 0; i < dirList.length; i++) {
            String perms = "";
            if(dirList[i].isDirectory()) perms += "D";
            else perms += "F";
            if(dirList[i].canRead()) perms += "R";
            else perms += "-";
            if(dirList[i].canWrite()) perms += "W";
            else perms += "-";
            System.out.println(perms+"\t"+dirList[i].getPath());
        }
    }
}