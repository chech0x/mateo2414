package cl.cenlimi.mateo2414

import org.junit.Test
import org.junit.Assert._

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigourous Test :-)
     */
    @Test
    def testApp():Unit={
		println("Imprimiendo archivos en Test")
		val files = new java.io.File(".").listFiles
		for(file <- files) {
			val filename = file.getName
			//if(fileName.endsWith(".scala")) 
				println(file)
		}
        assertTrue( true )
    }
}
