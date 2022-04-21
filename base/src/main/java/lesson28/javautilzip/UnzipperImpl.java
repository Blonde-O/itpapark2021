package lesson28.javautilzip;

import lesson28.interfaces.Unzipper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
//Имплементация распаковки архива инструментами java.util.zip
//@Component
public class UnzipperImpl implements Unzipper {
    @Override
    public void unpack(String zipPath, String unzipPath) {
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(zipPath))) {
            ZipEntry entry;
            String name;
            long size;
            while ((entry = zin.getNextEntry()) != null) {

                name = entry.getName();
                size = entry.getSize();
                System.out.printf("File name: %s \t File size: %d \n", name, size);
                FileOutputStream fout = new FileOutputStream("C:\\hw28\\unpacked" + name);
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}