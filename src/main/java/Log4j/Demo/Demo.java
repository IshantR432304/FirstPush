package Log4j.Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo 
{
	public static Logger log=LogManager.getLogger(Demo.class.getName());
	
	public static void main(String[] args) 
	{
		//DOMConfigurator.configure("log4j.xml");
		log.error("This is Error msg");
		log.fatal("This is fatal msg");
		log.info("This is info msg");
		log.debug("This is debug msg");
		log.trace("This is trace msg");
		log.error("This is Error msg");
		log.fatal("This is fatal msg");
		log.info("This is info msg");
		log.debug("This is debug msg");
		log.trace("This is trace msg");
	}

	
}
