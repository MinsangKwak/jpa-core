import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EntityTest {

    EntityManagerFactory emf;
    EntityManager em; // 2. 얘가 만들어짐

    @BeforeEach
    void setUp() {
        emf = Persistence.createEntityManagerFactory("memo"); // 이 memo는 <persistence-unit name="memo"> 의 이름이다.
        em = emf.createEntityManager(); // 1. 얘로 인해서
    }

    @Test
    void test1() {

    }
}