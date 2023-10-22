public class Main {
    public static void main(String[] args) {

        if (args.length > 0 && args[0].toLowerCase().equals("-l")) {

            String text;
            switch (args[1]) {
                case "ar":
                text = "مرحبا بالعالم";
                break;

                case "en":
                    text = "hello world!";
                    break;
                
                    case "tr":
                    text = "Selam Dünya";
                    break;
                
                default:
                    text = "Sorry this language is not supported yet";
            }

            System.out.println(text);
        } else {
            System.out.println("Usage: java Main.java -l (lang)");
        }
    }
}