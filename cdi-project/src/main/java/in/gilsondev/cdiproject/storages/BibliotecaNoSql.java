package in.gilsondev.cdiproject.storages;

import in.gilsondev.cdiproject.pojos.Livro;

public class BibliotecaNoSql implements BibliotecaStorage {
    public void atualizarStatus(Livro livro) {
        System.out.println("Atualizando banco NoSQL");
    }
}

