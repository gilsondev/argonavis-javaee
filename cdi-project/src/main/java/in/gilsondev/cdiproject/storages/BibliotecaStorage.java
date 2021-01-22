package in.gilsondev.cdiproject.storages;

import in.gilsondev.cdiproject.pojos.Livro;

public interface BibliotecaStorage {
    void atualizarStatus(Livro livro);
}
