# LinearSupportVectorMachine

Todavia estamos investigando sobre el tema y programa, cualquier cosa pregunten

### ¿Que son las maquinas de vectores de soporte?
Una maquina de vectores de soporte (SVM) es un algoritmo de aprendizaje supervisado que se utiliza para muchos problemas de clasificacion y regresion, incluidas aplicaciones medicas de procesamiento de señales, procesamiento de lenguaje natural y reconocimiento de voz e imagenes.

### ¿Como funciona?
El objetivo del algoritmo SVM es encontrar un hiperplano que en la mejor medida posible separe los puntos de datos de una clase de los de la otra, para separar dos clases de datos hay muchos hiperplanos posibles. El objetivo del algoritmo es encontrar el que esté a mayor distancia entre los datos de ambas clases.

![image](https://user-images.githubusercontent.com/71536847/118163879-56c4a300-b3d7-11eb-8822-d90dc460ca03.png)


Para obtener el plano mas alejado de los dos conjuntos de clases se tiene que calcular la distancia perpendicular de cada observación a un determinado hiperplano. La menor de estas distancias (conocida como margen) determina como de alejado está el hiperplano de las observaciones de entrenamiento.

![image](https://user-images.githubusercontent.com/71536847/118164867-71e3e280-b3d8-11eb-8879-6cb31256d99a.png)

Los puntos que se encuentran el las fronteras de los margenes son conocidos como vectores de soporte, SVM busca maximizar el margen entre los puntos y el hiperplano.

La función que nos ayudará a maximizar el margen es la siguiente:

![image](https://user-images.githubusercontent.com/71536847/118167198-49a9b300-b3db-11eb-991b-976d32501b6c.png)
