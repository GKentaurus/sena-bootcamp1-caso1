# sena-bootcamp1-caso1
Desarrollo del Bootcamp organizado el 1 de Agosto de 2020, desarrollando el caso 1

1.	Una fábrica de bombas hidráulicas tiene una matriz con los insumos necesarios para la producción de un conjunto de motores.  Por ejemplo, suponiendo que la planta produce 7 motores y se utilizan 8 insumos en diferentes cantidades para su producción, la matriz sería:
		Insumos
		1	2	3	4	5	6	7	8
M	1	10	20	30	40	0	60	10	80
o	2	0	70	0	50	40	30	0	10
t	3	5	10	15	0	10	15	5	0
o	4	10	20	10	20	10	0	10	20
r	5	4	0	8	0	6	8	4	0
e	6	0	6	9	12	15	0	1	24
s	7	20	18	0	14	0	10	8	6

Analizando la matriz anterior, podríamos ver que para producir un motor del tipo 3 es necesario utilizar 5 unidades del insumo 1, 10 unidades del insumo 2, 15 unidades del insumo 3, 10 unidades del insumo 5, 15 unidades del insumo 6 y 5 unidades del insumo 7. Por otro lado se tiene un arreglo con los costos unitarios en pesos de cada insumo:

Costo de Insumos
1	2	3	4	5	6	7	8
3.5	0.1	2.0	1.5	6.0	4.2	2.5	1.3

Se tiene otro arreglo con los pedidos a surtir en el presente mes:

Pedidos del mes de cada motor
1	2	3	4	5	6	7
100	25	75	150	80	90	10
También se tiene un último arreglo con la existencia actual de cada uno de los insumos:
Existencia de Insumos
1	2	3	4	5	6	7	8
120	0	20	60	40	90	10	0


Elabore un programa para:

a.	Leer el número m de motores que fabrica la planta (máximo 50).
b.	Leer el número n de insumos necesarios para la fabricación de los motores (máximo 50).
c.	Leer los datos de la matriz de Insumos/Motor.
d.	Leer los datos del arreglo de costos unitarios de insumos.
e.	Leer los datos del arreglo de pedidos del mes de cada motor.
f.	Leer los datos del arreglo de insumos existentes en la planta.
g.	Obtener e imprimir un arreglo de m elementos, con el costo de producción de cada motor.  Suponga que el costo de producción de un motor consiste en sumar el producto de insumos necesarios por el costo unitario de cada insumo.
h.	Obtener e imprimir un arreglo de n elementos, con la cantidad de unidades de cada insumo, necesaria para cumplir con los pedidos del mes.
i.	Obtener e imprimir un arreglo de n elementos,  cuyos datos indiquen cuál es el costo total por concepto de cada insumo para cumplir con los pedidos del mes.
j.	Obtenga e imprima el costo total (tomando en cuenta todos los insumos) para cumplir con la producción del mes.
k.	Obtenga e imprima un arreglo de n elementos, con la diferencia de los insumos necesarios para la producción mensual menos los insumos existentes en la planta, con el fin de poder surtir dichos insumos a tiempo.
