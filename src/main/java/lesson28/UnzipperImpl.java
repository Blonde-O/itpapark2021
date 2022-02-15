package lesson28;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipperImpl implements Unzipper{
    @Override
    public void unpack() {
        try(ZipInputStream zin = new ZipInputStream(new FileInputStream("C:\\Users\\blond\\IdeaProjects\\itpapark2021\\src\\main\\java\\lesson28\\sources\\output.zip")))
        {
            ZipEntry entry;
            String name;
            long size;
            while((entry=zin.getNextEntry())!=null){

                name = entry.getName(); // получим название файла
                size=entry.getSize();  // получим его размер в байтах
                System.out.printf("File name: %s \t File size: %d \n", name, size);

                // распаковка
                FileOutputStream fout = new FileOutputStream("C:\\Users\\blond\\IdeaProjects\\itpapark2021\\src\\main\\java\\lesson28\\sources\\unpacked" + name);
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
