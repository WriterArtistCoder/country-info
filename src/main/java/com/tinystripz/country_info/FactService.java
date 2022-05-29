public class FactSerivce {
    private String[] facts = {"Near Germany", "Teeny", "Red in flag"};
    private int factNo = 0;

    public void nextFact() {
        return facts[factNo++];
    }
}