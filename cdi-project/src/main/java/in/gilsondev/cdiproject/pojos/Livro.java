package in.gilsondev.cdiproject.pojos;

import in.gilsondev.cdiproject.enums.LivroStatus;

public class Livro {
    private String nome;

    private LivroStatus status;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LivroStatus getStatus() {
        return status;
    }

    public void setStatus(LivroStatus status) {
        this.status = status;
    }
}
