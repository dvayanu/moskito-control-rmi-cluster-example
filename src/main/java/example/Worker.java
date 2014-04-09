package example;


import net.anotheria.moskito.aop.annotation.Monitor;

/**
 * This class is actually doing some work. Or at least we say so.
 *
 * @author lrosenberg
 * @since 09.04.14 23:10
 */
@Monitor
public class Worker {
 	public void doSomeWork(){
		//lets assume they do some work.
	}
}
