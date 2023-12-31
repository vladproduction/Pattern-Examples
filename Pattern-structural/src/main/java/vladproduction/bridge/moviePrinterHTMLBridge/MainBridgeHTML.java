package vladproduction.bridge.moviePrinterHTMLBridge;

public class MainBridgeHTML {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);
        String printedItem = moviePrinter.print(printFormatter);
        System.out.println(printedItem);

        System.out.println("-------------");
        HTMLFormatter htmlFormatter = new HTMLFormatter();
        String printedItemHTML = moviePrinter.print(htmlFormatter);
        System.out.println(printedItemHTML);
    }
}
