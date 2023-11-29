# ARRAYS MULTIDIMENSIONALES O MATRICES

## Declarar
Declaración de un array de Strings:

    String[][] names

Lo más común es generar matrices, es decir, arrays bidimensionales. Pero en realidad se permiten crear más dimensiones.

    String[][][] multiArray = new String[5][4][3];

## Instanciar, inicializar y acceder a un array
Imaginemoslo como una tabla:
    names = new String[filas][columnasEnLafila];

### En el caso de matrices regulares:

La matriz la podemos imaginar como una tabla

Desglose de una matriz regular:
![Como es una matriz por dentro](/images/ArrayMultidimensional.png)



### En el caso de matrices irregulares:

Un array multidimensional o Matriz puede diferir entre los números de elementos de cada fila

### Ejemplo [MultiDimArrayDemo1](MultiDimArrayDemo1.java)

En este caso es posible definir únicamente la primera dimensión y la segunda, ir asignándola en función de la necesidad

    int[][] irregularMatrix = new int[2][];
    irregularMatrix[0] = new int[6];
    irregularMatrix[1] = new int[100];

Pero cuidado, que mientras no se instancie la dimension padre, no se puede instanciar la dimensión hija:

    int[][][] mat = new int[11][ ][ ]; // solo se conoce la primera dimensión 
    int[][][] mat = new int[11][3][ ]; // se conoce la primera i la segunda dimensión
    int[][][] mat = new int[11][ ][3]; // incorrecto

---

Para ver la longitud del array usamos:

    anArray.length;

Para ver la longitud de la matriz hacemos lo mismo:

    String[][] matrix = new String[5][4];
    matrix.length;  // Devuelve un 5, ya que tiene 5 filas
    matrix[0].length;  // Devuelve un 4, ya que tiene 4 columnas

## Recorrer arrays multidimensionales 

### Ejemplo [MatrixDemo](MatrixDemo.java)

## Clase Arrays

[VER API 17 Arrays](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Arrays.html)

Contiene métodos interesantes que permiten operar con matrices:

    deepToString, deepEquals...

Para resolver los alumnos:
#### Ejercicio 1: Probemos a utilizar el método deepToString
#### Ejercicio 2: Probemos a utilizar el método deepEquals
