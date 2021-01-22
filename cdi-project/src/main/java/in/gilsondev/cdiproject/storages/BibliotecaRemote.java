package in.gilsondev.cdiproject.storages;

import in.gilsondev.cdiproject.pojos.Livro;

public class BibliotecaRemote implements BibliotecaStorage {
    public void atualizarStatus(Livro livro) {
        System.out.println("Atualizando dados via rede");
    }
}
