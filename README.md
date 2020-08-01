# BootCamp SENA para ADSI Fase 2
**Desarrollo del Bootcamp organizado el 1 de Agosto de 2020**

Proyecto desarrollado por *@GKentaurus*, *@Dannychan94* y *Veronica* (que no tiene GitHub aún).

## Caso 1:

Una fábrica de bombas hidráulicas tiene una matriz con los insumos necesarios para la producción de un conjunto de motores. 

*Por ejemplo*, suponiendo que la planta produce 7 motores y se utilizan 8 insumos en diferentes cantidades para su producción, la matriz sería:

>**Columnas:** Insumos (I)
>**Filas:** Motores (M)
>   x   |I-1|I-2|I-3|I-4|I-5|I-6|I-7|I-8
>-------|---|---|---|---|---|---|---|---
>**M-1**|10 |30 |20 |40 |0  |60 |10 |80
>**M-2**|0  |70 |0  |50 |40 |30 |0  |10
>**M-3**|5  |10 |15 |0  |10 |15 |5  |0
>**M-4**|10 |20 |10 |20 |10 |0  |10 |20
>**M-5**|4  |0  |8  |0  |6  |8  |4  |0
>**M-6**|0  |6  |9  |12 |15 |0  |1  |24
>**M-7**|20 |18 |0  |14 |0  |10 |8  |6>

Analizando la matriz anterior, podríamos ver que para producir un motor del tipo 3 es necesario utilizar 5 unidades del insumo 1, 10 unidades del insumo 2, 15 unidades del insumo 3, 10 unidades del insumo 5, 15 unidades del insumo 6 y 5 unidades del insumo 7. 

Por otro lado se tiene un arreglo con los costos unitarios en pesos de cada insumo:

>**Costo de Insumos**
>I-1 |I-2 |I-3 |I-4 |I-5 |I-6 |I-7 |I-8
>----|----|----|----|----|----|----|---
>3.5 |0.1 |2.0 |1.5 |6.0 |4.2 |2.5 |1.3

Se tiene otro arreglo con los pedidos a surtir en el presente mes:

>**Pedidos del mes de cada motor**
>M-1 |M-2 |M-3 |M-4 |M-5 |M-6 |M-7
>----|----|----|----|----|----|----
>100 |25  |75  |150 |80  |90  |10

También se tiene un último arreglo con la existencia actual de cada uno de los insumos:

>**Existencia de Insumos**
>M-1 |M-2 |M-3 |M-4 |M-5 |M-6 |M-7 |M-8
>----|----|----|----|----|----|----|-
>120 |0   |20  |60  |40  |90  |10  |0


***Elabore un programa para:***

1.	Leer el número m de motores que fabrica la planta (máximo 50).
2.	Leer el número n de insumos necesarios para la fabricación de los motores (máximo 50).
3.	Leer los datos de la matriz de Insumos/Motor.
4.	Leer los datos del arreglo de costos unitarios de insumos.
5.	Leer los datos del arreglo de pedidos del mes de cada motor.
6.	Leer los datos del arreglo de insumos existentes en la planta.
7.	Obtener e imprimir un arreglo de m elementos, con el costo de producción de cada motor.  Suponga que el costo de producción de un motor consiste en sumar el producto de insumos necesarios por el costo unitario de cada insumo.
8.	Obtener e imprimir un arreglo de n elementos, con la cantidad de unidades de cada insumo, necesaria para cumplir con los pedidos del mes.
9.	Obtener e imprimir un arreglo de n elementos,  cuyos datos indiquen cuál es el costo total por concepto de cada insumo para cumplir con los pedidos del mes.
10.	Obtenga e imprima el costo total (tomando en cuenta todos los insumos) para cumplir con la producción del mes.
1.	Obtenga e imprima un arreglo de n elementos, con la diferencia de los insumos necesarios para la producción mensual menos los insumos existentes en la planta, con el fin de poder surtir dichos insumos a tiempo.
