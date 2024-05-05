package JUNIT.Junit.Java;

import org.junit.jupiter.api.*;

import java.util.Random;

public class nodesTest {

    nodes<Integer> chain;
    Random rd = new Random();

    @BeforeEach
    void testBuild() {
        System.out.println("@BeforeEach->testBuild");
        chain = new nodes<>();
        int size = rd.nextInt(43);
        for (int i = 0; i < size; i++) {
            chain.add(i);
        }
    }

    @AfterEach
    void testClean() {
        System.out.println("@AfterEach->testClean");
        System.out.println(chain);
        chain = null;
        System.out.println(chain);
    }

    @Test
    void testPrint() {
        System.out.println("@Test->testPrint");
        Node<Integer> temp = chain.getHead();
        while (temp != null) {
            System.out.print(temp.getValue() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    @Test
    void testAdd() {
        System.out.println("@Test->testAdd");
        chain.add(666);
        Node<Integer> temp = chain.getHead();
        while (temp != null) {
            System.out.print(temp.getValue() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("null");

    }


    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll->afterAll");

    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll->beforeAll");

    }
}
