package br.com.ifba.prg03sgs;

import java.awt.GraphicsEnvironment;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Prg03sgsApplicationTests {

        @BeforeAll 
        public static void setUp() { 
            assumeFalse(GraphicsEnvironment.isHeadless(), "Skipping tests in headless environment"); 
        }
    
	@Test
	void contextLoads() {
	}

}