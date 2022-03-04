/*
package lesson29;

import lesson29.interfaces.Unzipper;
import lesson29.interfaces.Zipper;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.impl.completer.StringsCompleter;
import org.jline.terminal.Terminal;
import org.springframework.context.annotation.Lazy;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.List;

@ShellComponent
public class Interaction {

    private final Zipper zipper;
    private final Unzipper unzipper;
    private final Terminal terminal;
    private String zipPath;
    private final List<String> OPTIONS = List.of("да", "нет", "delete");

    public Interaction(Zipper zipper, Unzipper unzipper, @Lazy final Terminal terminal) {
        this.zipper = zipper;
        this.unzipper = unzipper;
        this.terminal = terminal;
    }

    @ShellMethod(value = "Запаковываем архив", key = {"zip", "z"})
    public void zip (String zipPath, String filePath){
        LineReader lineReader = LineReaderBuilder.builder()
                .terminal(this.terminal)
                .completer(new StringsCompleter(this.OPTIONS))
                .build();
        */
/* Important: This allows completion on an empty buffer, rather than inserting a tab! *//*

        lineReader.unsetOpt(LineReader.Option.RECOGNIZE_EXACT);
        String desription = "Желаете защитить архив паролем: " + OPTIONS + "\n";
        String input = lineReader.readLine(desription + "input: ").trim();
        this.zipPath=zipPath;
        zipper.pack(this.zipPath, filePath, input);
    }
    @ShellMethod(value = "Распаковываем архив", key = {"unzip", "uz"})
    public void unzip (String unzipPath){
        unzipper.unpack(zipPath, unzipPath);
    }
}
*/
