import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class problem_5 {
  public static void main(String[] args) throws IOException {

    System.out.print("Enter filename: ");
    try (final Stream<String> lines = Files.lines(Paths.get("F:/Compiler/src/antor.txt"))
                                           .map(line -> line.split("[\\s]+"))
                                           .flatMap(Arrays::stream)
                                           .distinct()
                                           .sorted()) {
      final String uniqueWords = lines.collect(joining(", "));
      System.out.println(uniqueWords);
    }

  }
}