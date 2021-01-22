package in.gilsondev.cdiproject;

import in.gilsondev.cdiproject.enums.LivroStatus;
import in.gilsondev.cdiproject.pojos.Livro;
import in.gilsondev.cdiproject.storages.BibliotecaStorage;

public class BibliotecaImpl implements Biblioteca {
    private BibliotecaStorage dao; // uma dependência!

    public void emprestar(Livro livro) {
        livro.setStatus(LivroStatus.EMPRESTADO);
        dao.atualizarStatus(livro);
    }

    public void devolver(Livro livro) {
        livro.setStatus(LivroStatus.DISPONIVEL);
        dao.atualizarStatus(livro);
    }

    public void setBibliotecaStorage(BibliotecaStorage ref) {
        this.dao = ref;
    }
}
