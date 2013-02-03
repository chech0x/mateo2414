package cl.cenlimi.mateo2414

/**
 * Hello world!
 *
 */
object App 
{
    def main(args: Array[String]):Unit={
        println( "Hello World!" )
		val files = new java.io.File(".").listFiles
		for(file <- files) {
			val filename = file.getName
			//if(fileName.endsWith(".scala")) 
				println(file)
		}
    }
}
