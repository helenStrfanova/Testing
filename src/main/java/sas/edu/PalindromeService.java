package sas.edu;

public class PalindromeService {

    private String string;
    private static final String regex = "[^a-zA-Z]";

    public PalindromeService(String string) {
        this.string = string;
    }

    public PalindromeService() {
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    private void toLowerCase() {
        this.string.toLowerCase();
    }

    private String getCleanedString() {
        return this.string.replaceAll(regex, "");
    }

    private String getReversed() {
        return new StringBuilder(string).reverse().toString();
    }

    public boolean isValid(){
        String original = this.getString();
        toLowerCase();
        getCleanedString();
        return original.equals(this.getReversed());
    }
}
