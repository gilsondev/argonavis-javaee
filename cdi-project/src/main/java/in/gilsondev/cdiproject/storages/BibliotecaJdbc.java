package in.gilsondev.cdiproject.storages;

import in.gilsondev.cdiproject.pojos.Livro;

import javax.enterprise.inject.Alternative;

@Alternative
public class BibliotecaJdbc implements BibliotecaStorage {
    public void atualizarStatus(Livro livro) {
        System.out.println("Atualizando banco JDBC");
    }
}
