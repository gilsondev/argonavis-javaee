package in.gilsondev.cdiproject;

import in.gilsondev.cdiproject.enums.LivroStatus;
import in.gilsondev.cdiproject.pojos.Livro;
import in.gilsondev.cdiproject.storages.BibliotecaStorage;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Main {
//    @Inject
//    BibliotecaImpl biblioteca;
//
//    @Inject
//    BibliotecaStorage dao;

    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        BibliotecaImpl biblioteca = container.select(BibliotecaImpl.class).get();
        BibliotecaStorage dao = container.select(BibliotecaStorage.class).get();

        Livro livro = new Livro();
        livro.setNome("Java efetivo");
        livro.setStatus(LivroStatus.DISPONIVEL);

        biblioteca.emprestar(livro);

        container.shutdown();
    }
}
