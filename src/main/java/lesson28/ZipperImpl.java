package lesson28;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipperImpl implements Zipper{

    private String fileName;

    public ZipperImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void pack() {
        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("C:\\Users\\blond\\IdeaProjects\\itpapark2021\\src\\main\\java\\lesson28\\sources\\output.zip"));
            FileInputStream fis= new FileInputStream(fileName))
        {
            ZipEntry entry1=new ZipEntry("notes.txt");
            zout.putNextEntry(entry1);
            // считываем содержимое файла в массив byte
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            // добавляем содержимое к архиву
            zout.write(buffer);
            // закрываем текущую запись для новой записи
            zout.closeEntry();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
