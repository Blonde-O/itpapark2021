package lesson28.zip4j;

import lesson28.interfaces.Unzipper;
import lombok.SneakyThrows;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class UnzipperZip4jImpl implements Unzipper {
    @SneakyThrows
    @Override
    public void unpack(String zipPath, String unzipPath) {
        Scanner in = new Scanner(System.in);
        try {
            ZipFile zipFile = new ZipFile(zipPath);
            if (zipFile.isEncrypted()) {
                System.out.println("Архив защищен паролем. Введите пароль");
                String pswd = in.nextLine();
                zipFile.setPassword(pswd);
            }
            zipFile.extractAll(unzipPath);
            System.out.println("Архив успешно распакован!");
        } catch (ZipException e) {
            e.printStackTrace();
        }
    }
}