package moveFile;

import java.io.File;

public class MoveFileImpl implements MoveFile {

    private File sourceFile;
    private String toFile;

    public MoveFileImpl() {
    }


    public MoveFileImpl(File sourceFile, String toFile) {
        this.sourceFile = sourceFile;
        this.toFile = toFile;
    }


    @Override
    public void run() {
        moveFile();
    }

    @Override
    public void moveFile(){
        String folderName = sourceFile.getName();
        String msg = "The thread :" + Thread.currentThread().getName()
                + " is moving file" + folderName;
        sourceFile.renameTo(new File(toFile + "\\" + folderName));
        System.out.println(msg);

    }

    public File getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public String getToFile() {
        return toFile;
    }

    public void setToFile(String toFile) {
        this.toFile = toFile;
    }
}
