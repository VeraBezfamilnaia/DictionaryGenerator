public class Main {
    public static void main(String[] args) {
        String aboriginalPhrase = "hola de dónde eres que te trajo hola a nosotros";
        Dictionary dictionary = DictionaryGenerator.generateFromPhrase(aboriginalPhrase);
        System.out.println(dictionary.getForeignWords());
    }
}
