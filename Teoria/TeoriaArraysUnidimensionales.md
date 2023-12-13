# ARRAYS UNIDIMENSIONALES

## Declarar
Declaración de un array de integers:

    int[] anArray;

Al igual que las declaraciones de variables de otros tipos, una declaración de array tiene dos componentes:
- El **tipo**, que se escribe como se escribe como tipo[], donde tipo es el tipo de datos de los elementos que va a 
  contener
- El **nombre**, que puede ser el que se desee mientras siga las convenciones habituales
 
Como ocurre con las variables de otros tipos, la declaración en realidad no crea una matriz; simplemente le dice al compilador que esta variable contendrá una matriz del tipo especificado.

Podemos declarar arrays de cualquier tipo que ya conocemos:

    byte[] anArrayOfBytes;
    short[] anArrayOfShorts;
    long[] anArrayOfLongs;
    float[] anArrayOfFloats;
    double[] anArrayOfDoubles;
    boolean[] anArrayOfBooleans;
    char[] anArrayOfChars;
    String[] anArrayOfStrings;

Aunque se permite poner los corchetes después del nombre de variable, esta forma ESTA DESACONSEJADA:

    float anArrayOfFloats[];

## Instanciar, inicializar y acceder a un array

Crear un array de integers:

    anArray = new int[10];

Esta sentencia crea y reserva suficiente espacio en memoria para un array de 10 integers
Si no se crea de esta manera el compilador falla y da un error como el siguiente:

    ArrayDemo.java:4: Variable anArray may not have been initialized.

Ahora inicializamos valores a cada elemento del array, mediante su índice numérico:

    anArray[0] = 100; 
    anArray[1] = 200; 
    anArray[2] = 300; ...

La declaración e inicialización puede hacerse también: 

    int[] anArray = {
       100, 200, 300,
       400, 500, 600,
       700, 800, 900, 1000
    };
En este caso la longitud se determina a través del número de elementos que le indicamos, separados por comas:

Un array ya inicializado con un número de elementos, no puede añadir o eliminar nuevos elementos: Son ESTÁTICOS.

    anArray = new int[20]; // Pierdo la referencia anterior y se crea una nueva asignación


Y accedemos a los valores de esas posiciones:

    System.out.println("Element 1 at index 0: " + anArray[0]);
    System.out.println("Element 2 at index 1: " + anArray[1]);
    System.out.println("Element 3 at index 2: " + anArray[2]);

Para ver la longitud del array usamos:

    anArray.length;

Si usamos un valor como índice de acceso a una posición del array, fuera de su longitud se lanzará la excepción: 
__ArrayIndexOutOfBoundsException__.

### Ejemplo [Demo1](ArraysDemo.java)

---

## Bucles foreach
El uso de bucles ForEach nos permite recorrer la lista de elementos de una forma más compacta.

    for (int i : anArray){}

### Ejemplo [Demo2](ArraysDemo.java)


### Ventajas for-each
- Más legible y fácil de escribir
- Más seguro, ya que no se pueden cometer errores como acceder a un índice fuera de los límites del arreglo o 
  de la colección.
- Más eficiente en términos de rendimiento, porque no se requiere el uso de un índice para iterar.

### Desventajas for-each
- Es sólo es de lectura, por lo que no se pueden modificar los elementos de la colección durante la iteración.
- No se puede conocer la posición actual del elemento en la colección durante la iteración, si es necesario conocer 
  la posición debe usar el ciclo “for” tradicional.
- No soporta la iteración en sentido inverso, si es necesario iterar en sentido inverso debe usar el ciclo “for” 
  tradicional.

### Ejemplo [DemoNotaMedia](DemoNotaMedia.java)

## Los vectores son objetos MUTABLES

### Ejemplo [DemoMutables](DemoMutables.java)

## Clase Arrays

[VER API 17 Arrays](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Arrays.html)
 
Contiene métodos interesantes que permiten operar con arrays: 

    asList, binarySearch, copyOf, copyOfRange, deepEquals, deepHasCode, 
    deepToString, equals, fill, hashCode, sort, toString

Para resolver los alumnos:
#### Ejercicio 1: Probemos a utilizar el método toString
#### Ejercicio 2: Probemos a utilizar el método copyOf
#### Ejercicio 3: Probemos a utilizar el método copyOfRange
#### Ejercicio 4: Probemos a utilizar el método equals
#### Ejercicio 5: Probemos a utilizar el método sort
#### Ejercicio 6: Probemos a utilizar el método sort con índices: fromIndex, toIndex

[SOLUCIÓN DemoClaseArrays](DemoClaseArrays.java)

## Tenemos otra forma de COPIAR ARRAYS

    System.arraycopy(Object src, int srcPos,Object dest, int destPos, int length)

[VER API 17 System](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/System.html#arraycopy
(java.lang.Object,int,java.lang.Object,int,int))

### Ejemplo [DemoCopiaArrays](DemoCopiaArrays.java)

## COLECCIÓN ArrayList
Aunque lo veremos en colecciones puede ser interesante ahora mismo, ya que:

¿Y si necesitamos añadir elementos a un array una vez creado?
### Ejemplo [DemoDetectaPalindromoList](DemoDetectaPalindromo2.java)

[API Java 17 ArrayList](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html)
