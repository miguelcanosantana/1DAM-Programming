# La Colección HashSet.

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
  HashSet<String> set = new HashSet<String>(); 
  ```

  ### .add()
  Se usa para añadir elementos a un set.
  ```java
 set.add("Dragones"); 
set.add("Unicornios"); 
set.add("Sergales"); 
set.add("Dutch Angel Dragons");
  ```
