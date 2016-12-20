package de.htw_berlin.ai_bachelor.kbe;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	CreationInfo creationInfo = ExtendedAnnotationTester.class.getAnnotation(CreationInfo.class);
    	    	
    	if (creationInfo != null)
    		printCreationInfo(creationInfo, ExtendedAnnotationTester.class);
    	else
    		System.out.println("Keine " + CreationInfo.class.getSimpleName() + "-Annotation vorhanden.");
    }
    
    
    
    private static <T> void printCreationInfo(CreationInfo creationInfo, Class<T> ref) 
    {
    	
    	System.out.println("author: " + creationInfo.author());
    	System.out.println("description: " + creationInfo.description());
    	System.out.println("tags: " + Arrays.toString(creationInfo.tags()));
    	if(creationInfo.baseclass())
    	{
    		System.out.println("baseclass: " + ref.getSuperclass());
    	}
    	
    	if(creationInfo.interfaces())
    	{
    		System.out.println("interfaces: " + Arrays.toString(ref.getInterfaces()));
    	}
    }
}
