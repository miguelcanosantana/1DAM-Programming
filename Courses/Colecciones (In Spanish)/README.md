# La Colección HashSet

He decidido explicar de todas las opciones posibles la Colección HashSet.

## Definición Básica
HashSet es un tipo de **colección** la cuál permite almacenar **elementos** que **no** sean **duplicados** de manera desordenada, es decir, **sin un orden específico**.

## Características de HashSet

* **No** permite **elementos repetidos**, pero **permite nulos**.
* Está **respaldado** por **HashMap**.
* **No** mantiene el **orden** de inserción.
* **No** es **multihilo**.

## Funcionamiento

  ### Creación del HashSet
  Se importan los siguientes paquetes:
  ```java
  import java.io.*; 
  import java.util.HashSet; 
  ```
  Se crea un HashSet vacío
  ```java
  HashSet<String> setEjemplo = new HashSet<String>(); 
  ```

  ### .add()
  Se usa para añadir elementos a un set.
  ```java
  setEjemplo.add("Dragones"); 
  setEjemplo.add("Unicornios"); 
  setEjemplo.add("Sergales"); 
  setEjemplo.add("Dutch Angel Dragons");
  ```
  
  ### .contains()
  Se usa para comprobar que haya x elemento en un set.
  Se puede usa de varias maneras, una de ellas es print.
  ```java
  System.out.println("¿El set contiene 'Unicornios'? " + setEjemplo.contains("Unicornios"));
  ```
  
  ### .remove()
  Se usa para quitar elementos de un set.
  ```java
  setEjemplo.remove("Sergales");
  ```
  
  ### .clear()
  Se usa para borrar todos los elementos de un set, sin borrar en sí el set.
  ```java
  setEjemplo.clear();
  ```
  Se usa sin parámetros
  
  ### .size()
  Se usa para obtener el tamaño del set, siendo este el número de elementos que tiene.
  Se puede usa de varias maneras, una de ellas es print.
  ```java
  System.out.println("El set es de tamaño: " + setEjemplo.size());
  ```
  Se usa sin parámetros
  
  ### .isEmpty()
  Se usa para saber si el set está vacío o tiene algún elemento.
  Una alternativa podría ser el uso de ```.size() == 0```.
  Se puede usa de varias maneras, una de ellas es print.
  ```java
  System.out.println("El set es de tamaño: " + setEjemplo.size());
  ```
  Se usa sin parámetros
  
  ### .iterator()
  Se usa para obtener de manera desordenada los elementos del set.
  Primero, se crea el iterator.
  ```java
  Iterator valor = set.iterator(); 
  ```
  Luego se usa un bucle while para recorrer el HashSet
  ```java
  System.out.println("Los valores son: "); 
  while (valor.hasNext()) { 
    System.out.println(valor.next()); 
  }
  ```
  
  ### Imprimir HashSet
  ```java
  System.out.println(setEjemplo);
  ```
