package lesson28;

import lesson28.sources.ZipperZip4jImpl;

public class ZipRunner {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\blond\\IdeaProjects\\itpapark2021\\src\\main\\java\\lesson28\\sources\\file.txt";
        Zipper zipper = new ZipperZip4jImpl();
        zipper.pack();
        /*Unzipper unzipper = new UnzipperImpl();
        unzipper.unpack();*/
    }
}
