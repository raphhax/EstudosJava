package LinkedList_Challenge;

public record Aldeia(String nomeAldeia) {
    public Aldeia(String nomeAldeia){
        this.nomeAldeia = nomeAldeia;
    }

    @Override
    public String nomeAldeia() {
        return nomeAldeia;
    }

    @Override
    public String toString() {
        return " || ALDEIA: " + nomeAldeia;
    }
}
