public class RnaTranscription {
    String transcribe(String dnaStrand) {
        String rna = "";
        for(char c: dnaStrand.toCharArray()){
            switch (c) {
                case 'G' -> rna = rna + "C";
                case 'C' -> rna = rna + "G";
                case 'T' -> rna = rna + "A";
                case 'A' -> rna = rna + "U";
            }
        }
        return rna;
        // throw new IllegalArgumentException("Invalid input");
    }
}
