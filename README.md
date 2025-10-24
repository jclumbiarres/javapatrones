# 🧠 Patrones de Diseño en Java 21

Este proyecto demuestra la implementación de los patrones de diseño más comunes en Java 21,
cada uno en su propio paquete: Singleton, Factory, Builder, Adapter, Decorator, Strategy y Observer.

## 🧱 Singleton
Garantiza una única instancia global de una clase.

## 🧰 Factory
Crea objetos sin exponer la lógica de instanciación al cliente.

## 🧩 Builder
Facilita la creación de objetos complejos paso a paso.

##  Adapter
Permite que dos clases con interfaces incompatibles trabajen juntas.

## 🎨 Decorator
Agrega funcionalidades a objetos de forma dinámica sin modificar su clase original.

## ️ Strategy
Permite cambiar el algoritmo utilizado en tiempo de ejecución.

##  Observer
Define una relación uno-a-muchos entre objetos para notificaciones automáticas.

## 🚀 Ejecución
Compilar:
javac -d out $(find src -name "*.java")

Ejecutar:
java -cp out org.lumbi.app.Main