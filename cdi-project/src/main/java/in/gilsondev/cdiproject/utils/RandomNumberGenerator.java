package in.gilsondev.cdiproject.utils;

import javax.enterprise.inject.Produces;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;
import java.util.Random;

@ApplicationScoped
public class RandomNumberGenerator {
    private Random random = new Random(System.currentTimeMillis());

    @Produces
    @Named
    public int getRandomNumber() {
        return random.nextInt(100);
    }
}
