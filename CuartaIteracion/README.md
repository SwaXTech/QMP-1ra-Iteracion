# ¿Qué me pongo? Cuarta Iteración

> La tercera iteración fue el bonus de la 2da iteracion

## Diagrama de Clases

# Diagrama de Clases

![diagramaDeClases](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/SwaXTech/QueMePongo/main/CuartaIteracion/diagramaDeclases.plantuml)



## Puesta a punto

Se corrigen los errores de iteraciones anteriores

- Se usa el patron Builder
- Se usa Abstract Factory
- Se reifica el tipoDePrenda que conoce su categoría

## Repositorio de Servicios

Para que sea sencillo establecer varios servicios declima

## Clase Atuendo

Para que tenga comportamiento propio, como por ejemplo saber si es sugerible

## Clase Buenos Aires

Para reificar la ciudad, que se va a usar a lo largo del tp.

## Interfaz ciudad

La implementa Buenos Aires, pero pueden agregarse más ciudades.
Las ciudades deben saber, por ahora, su temperatura y su prob. de lluvia

## Interfaz ServicioClima

Para los distintos servicios, deben ser capaces de devolver temperatura,
la probabilidad de lluvia y el gasto acumulado por las peticiones.






