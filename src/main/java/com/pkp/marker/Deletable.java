package com.pkp.marker;

/*
  Marker Interface - has No Methods or Constants in it.
  They act like flags to convey information to the compiler or JVM (Java Virtual Machine)
  about a class's intended behavior.

  Sample Java Built-in marker interface - Serializable, Clonable, Remote

  Can we create our own Marker Interface? Yes see below - Deletable
  While marker interfaces are still used in some cases, the general preference leans
  towards Annotations for their improved readability and flexibility.
 */


public interface Deletable {
}
