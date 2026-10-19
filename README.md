# Tarea 3 · La factura bajo el microscopio
Pareja: Maximiliano y Roberto · GitHub: maximilianoabilahoud-dotcom, usuario2

## Reto 1 · Compilar desde la terminal
- Comando usado y resultado (captura: capturas/reto1.png)
- ¿Qué es Factura.java? ¿Y Factura.class? ¿Quién ejecuta el .class?
- ¿Por qué no se ha generado Factura.class la primera vez?

## Reto 2 · Errores de compilación
| Nº | Línea | Mensaje de javac                             | Tipo (léxico / sintaxis / semántica) | Corrección                                     |
|----|-------|----------------------------------------------|--------------------------------------|------------------------------------------------|
| 1  |  15   |double precio# = sc.nextDouble();             |Hay un error de tipo lexico           |double precio = sc.nextDouble();                |
| 2  |  17   |int cantidad = sc.nextInt()                   |Hay un error de tipo Sintaxis         |int cantidad = sc.nextInt();                    |
| 3  |  29   |int total = (base - descuento) * (1 + IVA);   |Hay un error de tipo semantico        |double total = (base - descuento) * (1 + IVA);  |
Captura del programa funcionando: capturas/reto2.png

## Reto 3 · Depuración del error lógico
| Variable | Valor esperado | Valor real |
|----------|----------------|------------|
| descuento |    30.00      |   10.00    |
| total     |    205.70     |   229.90   |
- Línea del error y explicación: Línea 27. Se usa descuento = base * 0.05;, que sobrescribe el 10 % calculado antes en lugar de sumarle el 5 % de socio.
- Corrección: descuento += base * 0.05;
- Mi propia prueba (producto, precio, cantidad, socio → total): Mesa, 40, 3, s → base 120, descuento 18.00, total 123.42 €
Captura del depurador: capturas/reto3.png
Captura del depurador: capturas/reto3.png

## Reto 4 · Reutilización
- Métodos creados y para qué sirve cada uno:
- ¿Qué ventaja tiene frente al código anterior?

## Reto 5 · ¿Qué lenguaje elegirías?
- Caso A (web de la tienda):
- Caso B (propuesta en ensamblador):