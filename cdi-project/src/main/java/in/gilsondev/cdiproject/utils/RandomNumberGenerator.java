package in.gilsondev.cdiproject.utils;

import in.gilsondev.cdiproject.qualifiers.Random;

import javax.enterprise.inject.Produces;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
public class RandomNumberGenerator {
    private java.util.Random random = new java.util.Random(System.currentTimeMillis());

    @Produces
    @Named
    @Random
    public int getRandomNumber() {
        return random.nextInt(100);
    }
}
