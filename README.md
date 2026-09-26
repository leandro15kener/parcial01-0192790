# Primer Parcial Práctico – Programación I

## Versión B

**Lenguaje:** Java  
**Modalidad:** Individual  
**Duración total:** 60 minutos  
**Valor:** 100 puntos  
**Temas:** arreglos unidimensionales, arreglos bidimensionales, ciclos, condicionales, contadores y acumuladores.

---

## Indicaciones generales

- Desarrolle los dos ejercicios en Java y desde consola.
- Cada ejercicio debe resolverse en un archivo independiente.
- Toda la solución debe estar dentro del método `main`.
- Puede utilizar `Scanner`, arreglos, matrices, ciclos y condicionales.
- No se permite utilizar `ArrayList`, colecciones, `Stream`, métodos de ordenamiento automático ni métodos creados por el estudiante.
- Los datos deben ser solicitados al usuario; no deben quedar escritos directamente en el código.
- Los resultados deben mostrarse de forma clara e identificable.
- Si se presenta un empate, debe reportarse la primera posición encontrada.

---

# Ejercicio 1 – Paquetes procesados por hora

**Tiempo sugerido:** 30 minutos  
**Valor:** 50 puntos

Un centro de distribución registró la cantidad de paquetes procesados durante **10 horas consecutivas**. Los valores son enteros y deben almacenarse en un arreglo unidimensional.

Construya un programa que:

1. Cree un arreglo de 10 posiciones.
2. Solicite la cantidad de paquetes procesados en cada hora y valide que no sea negativa. Si el dato es inválido, debe solicitarlo nuevamente.
3. Calcule y muestre:
   - El total de paquetes procesados.
   - El promedio de paquetes por hora.
   - El número de la hora con la menor cantidad procesada.
   - Cuántas horas tuvieron una producción inferior al promedio.
   - La racha más larga de horas consecutivas cuya producción fue inferior al promedio.
4. Muestre el listado final con el número de cada hora y su cantidad registrada.

## Aclaraciones

- Las horas se numeran del 1 al 10, aunque las posiciones del arreglo comiencen en 0.
- Una racha es una secuencia de posiciones consecutivas. Por ejemplo, si las horas 5, 6 y 7 están por debajo del promedio, existe una racha de longitud 3.
- Para determinar cuáles valores están por debajo del promedio será necesario recorrer nuevamente el arreglo después de calcularlo.

## Criterios de evaluación

| Criterio | Puntaje |
|---|---:|
| Lectura, almacenamiento y validación de los 10 valores | 10 |
| Cálculo correcto del total y del promedio | 10 |
| Identificación de la hora con menor producción | 10 |
| Conteo de horas por debajo del promedio | 8 |
| Cálculo correcto de la racha más larga | 8 |
| Claridad de la salida y organización del código | 4 |

---

# Ejercicio 2 – Registro de ventas de sucursales

**Tiempo sugerido:** 30 minutos  
**Valor:** 50 puntos

Una empresa tiene **4 sucursales** y desea analizar las unidades vendidas de **5 productos** durante una jornada. La información debe almacenarse en una matriz de 4 filas por 5 columnas:

- Cada fila representa una sucursal.
- Cada columna representa un producto.

Construya un programa que:

1. Cree una matriz de `4 x 5`.
2. Solicite las unidades vendidas de cada producto en cada sucursal y valide que ningún valor sea negativo.
3. Calcule y muestre:
   - El total de unidades vendidas por cada sucursal.
   - El total vendido de cada producto, sumando las cuatro sucursales.
   - La sucursal con la menor cantidad total de ventas.
   - El producto con la mayor cantidad total de unidades vendidas.
   - Cuántos registros de la matriz fueron superiores a 30 unidades.
4. Muestre la matriz completa, organizada por sucursales y productos.

## Aclaraciones

- Las sucursales se numeran del 1 al 4 y los productos del 1 al 5.
- Si dos sucursales tienen el mismo total mínimo, se reporta la primera.
- Si dos productos tienen el mismo total máximo, se reporta el primero.
- No es necesario crear arreglos adicionales para resolver el ejercicio, aunque puede utilizarlos si lo considera conveniente.

## Criterios de evaluación

| Criterio | Puntaje |
|---|---:|
| Lectura, almacenamiento y validación de la matriz | 10 |
| Cálculo del total de cada sucursal | 10 |
| Cálculo del total de cada producto | 10 |
| Identificación de la sucursal menor y el producto mayor | 10 |
| Conteo de registros superiores a 30 | 6 |
| Presentación de la matriz y organización del código | 4 |

---

## Entrega

Entregue los dos archivos `.java`, debidamente nombrados y capaces de compilar y ejecutarse sin errores.

**Analice primero y programe después. Java ejecuta exactamente lo escrito, incluso cuando la idea iba por otro camino.**

ESPECIFICACIONES DEL PARCIAL:

En el primer codigo(paquetes procesados por hora) no tuve que hacerle cambios ya que estaba terminado. Revise que tuviera la lectura de datos, los calculos y la muestra de resultados. Me faltaba era ejecutarlo para comprobar que funcionara, porque la terminal no lo procesaba.


Ya para el segundo codigo(registro de ventas sucursales) primero importe Scanner, que es lo que use para poder leer los datos que escribo por teclado. Despues, cree el lector y una matriz llamada unidadesVendidas de 4 filas y 5 columnas. En esa matriz guarde las unidades vendidas por cada sucursal y producto: cada fila representa una sucursal y cada columna, un producto.

Tambien cree dos arreglos: totalUnidadesSucursal para guardar el total vendido por cada sucursal y totalVendidosProducto para guardar el total de cada producto. Ademas, use cantidadMayoresA30 para contar cuantos datos de la matriz son mayores que 30.

Para pedir los datos, utilice dos ciclos for. El primero recorre las sucursales y el segundo recorre los productos de cada sucursal. En cada posicion de la matriz use un ciclo do while para leer las unidades y comprobar que no fueran negativas. Si escribo un numero negativo, el programa muestra un mensaje de error y me vuelve a pedir el dato.

Cuando el dato es valido, lo sumo al total de la sucursal y al total del producto. Tambien reviso si es mayor que 30; si lo es, aumento en uno el contador cantidadMayoresA30.

Despues busque la sucursal que vendio menos. Para eso guarde primero la posicion 0 como la menor y la compare con las demas. Hice algo parecido para encontrar el producto con mas unidades, empezando por la posicion 0. Al mostrar esos resultados sume uno a las posiciones, porque los arreglos empiezan en cero, pero las sucursales y los productos se numeran desde uno.

Al final mostre la matriz, los totales de cada sucursal, los totales de cada producto, cual fue la sucursal con menos ventas, cual fue el producto mas vendido y cuantos registros fueron mayores que 30. Para terminar, cerre el lector con lector.close().



