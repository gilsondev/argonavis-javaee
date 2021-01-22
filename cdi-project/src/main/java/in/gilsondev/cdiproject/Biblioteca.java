package in.gilsondev.cdiproject;

import in.gilsondev.cdiproject.pojos.Livro;

public interface Biblioteca {
    void emprestar(Livro livro);

    void devolver(Livro livro);
}
