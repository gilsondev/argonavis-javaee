package in.gilsondev.cdiproject.storages;

import in.gilsondev.cdiproject.pojos.Livro;

import javax.enterprise.inject.Default;

@Default
public class BibliotecaNoSql implements BibliotecaStorage {
    public void atualizarStatus(Livro livro) {
        System.out.println("Atualizando banco NoSQL");
    }
}

