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
        
        CounterFactory.getCounterInstance(typ).increment();
        
    }
}
