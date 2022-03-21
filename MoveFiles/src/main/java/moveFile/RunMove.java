package moveFile;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunMove {

    private static ExecutorService threadPool;

    public static void main(String[] args) {
        File sourceFolder = new File("C:\\Users\\HP\\Desktop\\f1");
        String toFile = "D:\\f5";
        File fileList[] = sourceFolder.listFiles();
        threadPool = Executors.newCachedThreadPool();
        for (int i = 0; i <= fileList.length - 1; i++) {
            threadPool.execute(new MoveFileImpl(fileList[i], toFile));
        }
    }
}
