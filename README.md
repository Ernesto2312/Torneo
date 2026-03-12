# Simulación de Torneo con Árbol Binario en Java

## Descripción

Este proyecto implementa una simulación de un torneo deportivo utilizando un **árbol binario** para representar las diferentes rondas de competición.

El sistema modela un torneo con **8 equipos**, comenzando desde los **cuartos de final**, pasando por las **semifinales**, y finalizando con la **final**, donde se determina el equipo campeón.

Cada nodo del árbol representa un partido entre dos equipos, donde el ganador avanza automáticamente a la siguiente ronda.

---

## Estructura del torneo

El árbol binario se organiza de la siguiente manera:

```
       Final
      /     \
   Semi1   Semi2
   /  \     /  \
 QF1 QF2  QF3 QF4
```

* 4 partidos de **cuartos de final**
* 2 partidos de **semifinal**
* 1 **final**

---

## Estructura del proyecto

El proyecto está compuesto por las siguientes clases:

### NodoBinario.java

Representa un nodo del árbol binario que contiene:

* Equipo 1
* Equipo 2
* Ganador del partido
* Ronda del torneo
* Referencias a los partidos anteriores (izquierda y derecha)

### ArbolTorneo.java

Clase controladora que gestiona la lógica del torneo:

* Construcción del árbol del torneo
* Simulación de los partidos
* Recorrido del árbol
* Determinación del campeón
* Visualización del bracket

### Main.java

Clase principal que ejecuta el programa y muestra los resultados del torneo.

---

## Funcionalidades

El sistema permite:

* Crear un torneo con 8 equipos.
* Simular automáticamente los partidos usando generación aleatoria.
* Avanzar a los ganadores entre rondas.
* Mostrar el torneo en formato de **bracket**.
* Determinar el **equipo campeón**.
