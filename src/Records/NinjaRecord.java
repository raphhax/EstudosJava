package Records;

public record NinjaRecord(String nome, String email, long telefone) {
    public String emailCaixaBaixa(){
        return email.toLowerCase();
    }

    public NinjaRecord(String email) {
        this("", email, 0);
    }

    public NinjaRecord(String nome, String email, long telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public String email() {
        return email;
    }

    @Override
    public long telefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return nome + " " + emailCaixaBaixa();
    }
}
