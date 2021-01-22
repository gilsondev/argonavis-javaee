package in.gilsondev.cdiproject;

import in.gilsondev.cdiproject.enums.LivroStatus;
import in.gilsondev.cdiproject.pojos.Livro;
import in.gilsondev.cdiproject.storages.BibliotecaNoSql;
import in.gilsondev.cdiproject.storages.BibliotecaStorage;

public class Main {
    public static void main(String[] args) {
        BibliotecaImpl biblioteca = new BibliotecaImpl(); // criando o componente
        BibliotecaStorage dao = new BibliotecaNoSql();    // criando a dependência
        biblioteca.setBibliotecaStorage(dao);             // injetando a dependencia no componente

        Livro livro = new Livro();
        livro.setNome("Java efetivo");
        livro.setStatus(LivroStatus.DISPONIVEL);

        biblioteca.emprestar(livro);
    }
}
