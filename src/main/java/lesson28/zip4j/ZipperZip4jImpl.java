package lesson28.zip4j;

import lesson28.interfaces.Zipper;
import lombok.SneakyThrows;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Scanner;

@Component
public class ZipperZip4jImpl implements Zipper {
    @SneakyThrows
    @Override
    public void pack(String filePath, String zipPath) {
        Scanner in = new Scanner(System.in);
        System.out.println("Желаете защитить архив паролем? (да/нет)");
        String needPassword = in.nextLine();
        File file = new File(filePath);
        ZipFile zipFile = new ZipFile(zipPath);
        ZipParameters parameters = new ZipParameters();
        parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
        parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
        if (needPassword.equals("да")){
        parameters.setEncryptFiles(true);
        parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD);
            System.out.println("Ведите пароль");
            String password = in.nextLine();
        parameters.setPassword(password);}
        zipFile.addFile(file, parameters);
        System.out.println("Файл успешно заархивирован.");
    }
}
