package in.gilsondev.cdiproject;

import in.gilsondev.cdiproject.enums.LivroStatus;
import in.gilsondev.cdiproject.pojos.Livro;
import in.gilsondev.cdiproject.storages.BibliotecaStorage;

import javax.inject.Inject;
import javax.inject.Named;

@Named("biblioteca")
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

    @Inject
    public void setBibliotecaStorage(BibliotecaStorage ref) {
        this.dao = ref;
    }
}
