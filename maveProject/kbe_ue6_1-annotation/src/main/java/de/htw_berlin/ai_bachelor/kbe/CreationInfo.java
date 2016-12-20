package de.htw_berlin.ai_bachelor.kbe;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(TYPE)
public @interface CreationInfo {
	String author() default "Wir";
	String description();
	String[] tags() default {};
	boolean baseclass() default true;
	boolean interfaces() default true;	
}
