package de.htw_berlin.ai_bachelor.kbe.counter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String typ = "triple";
        
        System.out.println(CounterFactory.getCounterInstance(typ).getCounter());
        
        CounterFactory.getCounterInstance(typ).increment();
        
        System.out.println(CounterFactory.getCounterInstance(typ).getCounter());        
    }
}
