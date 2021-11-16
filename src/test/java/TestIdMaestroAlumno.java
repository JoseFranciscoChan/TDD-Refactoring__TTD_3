/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author J-CHAN
 */
public class TestIdMaestroAlumno {
    
    idMaestroAlumno idMAEjemplo = new idMaestroAlumno();
  
    //Test que deberian de dar un resultado correcto

    //Test correctos
    @Test
    public void testAlumno1() {
        assertEquals("Alumno", idMAEjemplo.valorMA(2,"al0100000"));
}
  @Test
    public void testAlumno2() {
        assertEquals("Alumno", idMAEjemplo.valorMA(2,"al0199999"));
}
      @Test
    public void testMaestro1() {
        assertEquals("Maestro", idMAEjemplo.valorMA(1,"1000"));
}
  @Test
    public void testMaestro2() {
        assertEquals("Maestro", idMAEjemplo.valorMA(1,"9999"));
}
        
  
    public TestIdMaestroAlumno(){
    }
}

