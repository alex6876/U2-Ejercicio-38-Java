Aquí tienes la actualización completa del `README.md` incorporando la clase `Main` para este proyecto de **Simulación de Generadores de Gráficos (Clases Abstractas y Polimorfismo en Java)**:

---

# 📊 Simulación de Generadores de Gráficos y Visualización (POO y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema flexible para la representación visual de datos estadísticos mediante diferentes formatos de gráficos (Barras, Circular y Lineal). Pone en práctica conceptos clave de la **Programación Orientada a Objetos (POO)** como **clases abstractas**, **herencia de atributos protegidos**, **colecciones dinámicas** y **polimorfismo** en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una superclase abstracta que centraliza la estructura de datos y múltiples implementaciones especializadas para cada estilo de visualización:

* **`GeneradorGrafico` (Clase Abstracta)**: Define la plantilla y los datos compartidos por cualquier tipo de gráfico.
* **Atributo protegido (`protected`)**: `ArrayList<Double> datos`, que almacena los valores numéricos a representar.
* **Método abstracto**: `renderizarGrafico()`, que obliga a las subclases a implementar su propia lógica de dibujo por consola.


* **`GraficoBarras`**: Modela la representación en barras estadísticas.
* **Comportamiento:** Valida si la lista está vacía y emite la cabecera correspondiente al gráfico de barras.


* **`GraficoCircular`**: Modela la visualización en sectores porcentuales (*pie chart*).
* **Comportamiento:** Itera sobre la colección de datos imprimiendo cada valor en formato de sector individual.


* **`GraficoLineal`**: Modela la representación de tendencias mediante puntos interconectados.
* **Comportamiento:** Recorre los datos numéricos simulando la conexión secuencial de puntos coordenados.


* **`Main`**: Punto de entrada de la aplicación. Inicializa una lista con datos numéricos de prueba (`ArrayList<Double>`), instancia de manera polimórfica los diferentes generadores utilizando una única variable de referencia (`GeneradorGrafico`) y ejecuta el renderizado secuencial de cada tipo de gráfico.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Validación Defensiva de Colecciones Vacías:** Antes de renderizar cualquier representación, cada clase concreta evalúa si el arreglo `datos` se encuentra vacío (`if (datos.isEmpty())`). Si es así, interrumpe el proceso informando que no hay información para mostrar, previniendo errores de ejecución.
2. **Reutilización de Constructores (`super`):** Todas las subclases heredan la inicialización del listado de datos mediante la llamada a `super(datos)`, asegurando un acoplamiento limpio y centralizado.
3. **Encapsulamiento de Datos Protegidos:** El uso del modificador `protected` permite que las clases hijas accedan directamente al arreglo de datos sin exponerlo públicamente al exterior.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main` con los valores de prueba (`5.0`, `3.0`, `7.0`), el programa genera el siguiente resultado:

```text
Grafico de barras
----------------
Grafico circular:
Sector: 5.0
Sector: 3.0
Sector: 7.0
----------------
Grafico lineal:
Punto: 5.0 ->
Punto: 3.0 ->
Punto: 7.0 ->

```

---

## 🚀 Conceptos de Programación Aplicados

* **Abstracción y Jerarquía:** La superclase `GeneradorGrafico` estandariza el manejo de colecciones numéricas para cualquier motor visual futuro.
* **Polimorfismo:** Permite reutilizar la variable `grafico` para almacenar y operar con objetos de clases completamente diferentes en tiempo de ejecución.
* **Principio Abierto/Cerrado (OCP):** Facilita la incorporación de nuevos tipos de gráficos estadísticos (ej. `GraficoDispersion`, `GraficoArea`) creando una nueva clase que extienda de `GeneradorGrafico`, sin alterar las implementaciones existentes ni el código del `Main`.
