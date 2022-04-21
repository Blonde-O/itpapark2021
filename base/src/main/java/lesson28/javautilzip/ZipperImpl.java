package lesson28.javautilzip;

import lesson28.interfaces.Zipper;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//Имплементация запаковки архива инструментами java.util.zip
//@Component
public class ZipperImpl implements Zipper {

    @SneakyThrows
    @Override
    public void pack(String zipPath) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите адрес файла");
        String filePath = in.nextLine();
        FileOutputStream fos = new FileOutputStream(zipPath);
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        File fileToZip = new File(filePath);
        FileInputStream fis = new FileInputStream(fileToZip);
        ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
        zipOut.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zipOut.write(bytes, 0, length);
        }
        zipOut.close();
        fis.close();
        fos.close();
    }
}