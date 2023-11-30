# Algoritmos de ordenación de arrays

Trabajar con datos que se han ordenado previamente, suele ser más sencillo y eficiente.
Podemos ordenar los vectores que conocemos, pero en realidad podemos ordenar cualquier elemento que tenga cualidades 
ordenables.

## Burbuja
Sencillo para empezar, pero poco óptimo.

Funciona revisando cada elemento de la lista que va a ser ordenada con el siguiente, intercambiándolos de posición si están en el orden equivocado. Es necesario revisar varias veces toda la lista hasta que no se necesiten más intercambios, lo cual significa que la lista está ordenada.

[Enlace a Aula en la nube](https://www.youtube.com/watch?v=7qvFbFzmqBk&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=85)

## Quicksort
Utiliza la estrategia divide y vencerás. Es uno de los más rápidos, aunque depende de la estructura que vayamos 
a utilizar.

Funcionamiento básico:
1. Elegir un elemento del conjunto de elementos a ordenar, al que llamaremos pivote. 
2. Resituar los demás elementos de la lista a cada lado del pivote, de manera que a un lado queden todos los menores que él, y al otro los mayores. Los elementos iguales al pivote pueden ser colocados tanto a su derecha como a su izquierda, dependiendo de la implementación deseada. En este momento, el pivote ocupa exactamente el lugar que le corresponderá en la lista ordenada. 
3. La lista queda separada en dos sublistas, una formada por los elementos a la izquierda del pivote, y otra por los elementos a su derecha. 
4. Repetir este proceso de forma recursiva para cada sublista mientras estas contengan más de un elemento. Una vez 
   terminado este proceso todos los elementos estarán ordenados.

La eficiencia del algoritmo depende de la posición en la que termine el pivote elegido.

[Enlace a Aula en la nube](https://www.youtube.com/watch?v=Xx84_1aWV60&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=86)
[Curiosidad: Algoritmo Quicksort implementado en diferentes lenguajes](https://rosettacode.org/wiki/Sorting_algorithms/Quicksort)

## Mergesort y Heapsort
Comparables a Quicksort.
https://aulaenlanube.com/los-mejores-algoritmos-ordenacion-quicksort-mergesort-heapsort/
[Enlace a Aula en la nube](https://www.youtube.com/watch?v=Xx84_1aWV60&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=86)
[Curiosidad: Algoritmo Mergesort implementado en diferentes lenguajes](https://rosettacode.org/wiki/Sorting_algorithms/Merge_sort)
