package attempts.interactiveShell;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.impl.completer.StringsCompleter;
import org.jline.terminal.Terminal;
import org.springframework.context.annotation.Lazy;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.List;

@ShellComponent
public class UserInteraction {



        private final List<String> OPTIONS = List.of("create", "update", "delete");
        private final Terminal terminal;

        public UserInteraction(@Lazy final Terminal terminal) {
            this.terminal = terminal;
        }

        @ShellMethod (value= "somthing", key = "s")
        public String completeSelect() {
            LineReader lineReader = LineReaderBuilder.builder()
                    .terminal(this.terminal)
                    .completer(new StringsCompleter(this.OPTIONS))
                    .build();
            /* Important: This allows completion on an empty buffer, rather than inserting a tab! */
            lineReader.unsetOpt(LineReader.Option.INSERT_TAB);

            String desription = "select on of this options: " + OPTIONS + "\n"
                    + " use TAB (twice) to select them\n";
            String input = lineReader.readLine(desription + "input: ").trim();
            return "you selected \"" + input + "\"";
        }
    }

