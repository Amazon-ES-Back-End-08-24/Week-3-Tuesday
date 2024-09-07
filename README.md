# Week 3
# Tabla de Contenidos

- [Introducción a ArrayList, Interfaces, Clases Abstractas y BigDecimal](#introducción-a-arraylist-interfaces-clases-abstractas-y-bigdecimal)
    - [¿Por qué utilizar estos conceptos?](#por-qué-utilizar-estos-conceptos)
    - [Conceptos Básicos](#conceptos-básicos)
        - [ArrayList](#arraylist)
        - [Interfaces](#interfaces)
        - [Clases Abstractas](#clases-abstractas)
        - [BigDecimal](#bigdecimal)
    - [Notas Importantes](#notas-importantes)

- [Ejercicio Práctico: Implementación del Carrito de Compra](#ejercicio-práctico-implementación-del-carrito-de-compra)
    - [Descripción de la Tarea](#descripción-de-la-tarea)
    - [Estructura de Código Ejemplo](#estructura-de-código-ejemplo)
    - [Desafíos Adicionales](#desafíos-adicionales-si-el-tiempo-lo-permite)

- [Detalles Adicionales](#detalles-adicionales)
    - [Interfaz `Downloadable`](#interfaz-downloadable)
    - [Interfaz `Purchasable`](#interfaz-purchasable)
    - [Clase `AbstractProduct`](#clase-abstractproduct)
    - [Clases `Book` y `Electronics`](#clases-book-y-electronics)
    - [Uso de ArrayList y BigDecimal en el Carrito de Compras](#uso-de-arraylist-y-bigdecimal-en-el-carrito-de-compras)

## Introducción a ArrayList, Interfaces, Clases Abstractas y BigDecimal
¡Bienvenido a la lección de hoy! Nos adentraremos en cuatro conceptos poderosos en Java: ArrayList, interfaces, clases abstractas y BigDecimal. Estas herramientas son como las navajas suizas de la programación en Java: versátiles, eficientes y esenciales para cualquier desarrollador serio.

Imagina que estás organizando una caja de herramientas. ArrayList es como un compartimento expansible que puede contener cualquier tipo de herramienta. Las interfaces son como los planos para herramientas especializadas. Las clases abstractas son herramientas parcialmente construidas que puedes personalizar. ¿Y BigDecimal? Es la cinta métrica de precisión cuando necesitas medidas exactas hasta la fracción más pequeña.

### ¿Por qué utilizar estos conceptos?
Estos conceptos te ayudan a:
- Crear colecciones de datos flexibles y dinámicas (ArrayList)
- Diseñar contratos claros que las clases deben seguir (interfaces)
- Compartir código entre clases relacionadas permitiendo la personalización (clases abstractas)
- Realizar cálculos decimales precisos sin errores de redondeo (BigDecimal)

### Conceptos Básicos

1. ArrayList: Un array redimensionable que puede crecer o reducirse según sea necesario.
2. Interfaces: Un contrato que especifica qué métodos debe implementar una clase.
3. Clases Abstractas: Una implementación parcial de una clase que no puede instanciarse por sí sola.
4. BigDecimal: Una clase para realizar aritmética decimal precisa.

Exploremos cada uno en detalle.

### ArrayList
ArrayList es una implementación de array dinámico en Java. Te permite almacenar y manipular una colección de objetos.

Sintaxis:
```java
ArrayList<Type> listName = new ArrayList<>();
```

Ejemplo:
```java
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
System.out.println(fruits.get(0)); // Salida: Apple
```

### Interfaces
Una interfaz define un contrato de métodos que las clases que la implementen deben proporcionar. Establece un acuerdo sobre lo que una clase debe hacer, pero no cómo lo hace. Una clase puede implementar múltiples interfaces, lo que permite una forma de herencia múltiple

Sintaxis:
```java
public interface InterfaceName {
    returnType methodName(parameters);
}
```

Ejemplo:
```java
public interface Drawable {
    void draw();
}

public class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Dibujando un círculo");
    }
}
```

### Clases Abstractas
Las clases abstractas proporcionan una implementación parcial y no pueden instanciarse directamente. Puede tener métodos concretos y abstractos, así como variables y constructores.
Una subclase debe implementar todos los métodos abstractos de la clase abstracta, o también debe ser abstracta.

Sintaxis:
```java
public abstract class AbstractClassName {
    // Métodos concretos
    public void concreteMethod() {
        // Implementación
    }
    
    // Métodos abstractos
    public abstract void abstractMethod();
}
```

Ejemplo:
```java
public abstract class Shape {
    public abstract double area();
    
    public void displayArea() {
        System.out.println("Área: " + area());
    }
}

public class Square extends Shape {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double area() {
        return side * side;
    }
}
```

### BigDecimal
BigDecimal se utiliza para aritmética decimal precisa, especialmente importante en cálculos financieros.

Sintaxis:
```java
BigDecimal number = new BigDecimal("number");
```

Ejemplo:
```java
BigDecimal a = new BigDecimal("0.1");
BigDecimal b = new BigDecimal("0.2");
BigDecimal sum = a.add(b);
BigDecimal displayVal = sum.setScale(2, RoundingMode.HALF_EVEN);
System.out.println(displayVal);
```

### Notas Importantes
- ArrayList no es seguro para hilos. Usa Vector o Collections.synchronizedList() para operaciones seguras en hilos.
- Las interfaces pueden tener métodos por defecto y estáticos desde Java 8.
- Las clases abstractas pueden tener tanto métodos abstractos como concretos.
- Siempre utiliza el constructor de String para BigDecimal para evitar problemas de precisión.

### Ejercicio Práctico: Implementación del Carrito de Compra
#### Descripción de la Tarea:
1. Crea una interfaz `Downloadable` con el método `download()`.
2. Crea una interfaz `Purchasable` con el método `purchase()`.
3. Crea una clase abstracta `AbstractProduct` que implemente `Purchasable`.
4. Crea dos clases concretas `Book` y `Electronics` que extiendan `AbstractProduct`. La clase `Book` también debe implementar `Downloadable`.
5. Usa un ArrayList para almacenar los artículos del carrito y BigDecimal para los precios.

#### Estructura de Código Ejemplo:
```java
import java.math.BigDecimal;
import java.util.ArrayList;

public class classExercise.ShoppingCartSystemWithoutShoppingCartClass {
    public static void main(String[] args) {
        // TODO: Implementar el sistema de carrito de compras aquí
        // 1. Crear la interfaz Downloadable
        // 2. Crear la interfaz Purchasable
        // 3. Crear la clase AbstractProduct
        // 4. Crear las clases Book y Electronics
        // 5. Crear un ArrayList para almacenar los artículos del carrito
        // 6. Agregar algunos productos al carrito
        // 7. Calcular y mostrar el precio total
    }
}
```

#### Desafíos Adicionales (si el tiempo lo permite):
1. Implementa un sistema de descuentos usando BigDecimal.
2. Añade un método para eliminar artículos del carrito.
3. Implementa lógica adicional en la clase `Book` para simular la descarga de contenido cuando se llama al método `download()`.

Recuerda usar un manejo de excepciones adecuado al trabajar con la aritmética de BigDecimal. ¡Buena suerte!

### Detalles Adicionales

1. **Interfaz `Downloadable`**:
    - Métodos:
        - `download()`: Simula la acción de descargar contenido, que será implementada en la clase `Book`.

2. **Interfaz `Purchasable`**:
    - Métodos:
        - `purchase()`: Simula la acción de comprar un producto, implementado en todas las clases de productos.

3. **Clase `AbstractProduct`**:
    - Implementa la interfaz `Purchasable`.
    - Incluye atributos como `name` y `price`, y proporciona la implementación del método `purchase()` que maneja la lógica común para la compra de cualquier producto.

4. **Clases `Book` y `Electronics`**:
    - `Book` implementa tanto `Purchasable` como `Downloadable`. Su método `download()` simula la descarga de un libro.
    - `Electronics` implementa únicamente `Purchasable`.

5. **ArrayList**:
    - Se utilizará para almacenar instancias de productos en el carrito, permitiendo realizar operaciones como la suma del precio total.

Esta lección se basa en tu conocimiento previo de clases y objetos, mientras introduce conceptos más avanzados que serán cruciales para construir aplicaciones Java más grandes y complejas. En lecciones futuras, exploraremos cómo se utilizan estos conceptos en escenarios del mundo real y profundizaremos en los patrones de diseño que utilizan interfaces y clases abstractas.
