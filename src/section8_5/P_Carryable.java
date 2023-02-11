package section8_5;

/*
 * Interfaces are special types (NOT classes, NOT objects)
 * that are 100% abstract (exclusions apply)
 * which serve the purpose of sharing specific
 * characteristics (abstract methods) among different classes.
 * The classes do not have to be related.
 * Interfaces are NOT extended (extends)
 * Interfaces are implemented (implements)
 * Interfaces are pure 'contracts'
 */

public interface P_Carryable {
	
	abstract void carryAround();

}
