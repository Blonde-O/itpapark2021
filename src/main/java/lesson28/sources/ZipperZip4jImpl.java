package lesson28.sources;

import lesson28.Zipper;
import lombok.SneakyThrows;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

import java.io.File;

public class ZipperZip4jImpl implements Zipper {
    @SneakyThrows
    @Override
    public void pack() {
        ZipFile zipFile = new ZipFile("C:\\Users\\blond\\IdeaProjects\\itpapark2021\\src\\main\\java\\lesson28\\sources\\output3.zip");


        File file = new File("C:\\Users\\blond\\IdeaProjects\\itpapark2021\\src\\main\\java\\lesson28\\sources\\file.txt");


        ZipParameters parameters = new ZipParameters();
       parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
        parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
        parameters.setEncryptFiles(true);
        parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD);
        parameters.setPassword("test123!");
        zipFile.addFile(file,parameters);
    }
}
