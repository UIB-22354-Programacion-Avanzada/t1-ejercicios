# t1-ejercicios — Tema 1: POO, Principios SOLID y Diseño

Esqueleto de los **28 ejercicios** del Tema 1 de *Programación Avanzada (22354)*, Grado en
Ingeniería Telemática, UIB-EPS. Los enunciados están en la
[página de ejercicios del tema](https://uib-22354-programacion-avanzada.github.io/website/es/ejercicios/tema1.html);
aquí tienes el código sobre el que trabajar.

Es un proyecto **Maven** para **Java 25** con pruebas en **JUnit 5**, preparado para **GitHub
Codespaces**. El esqueleto **compila desde el primer momento**, pero casi todas las pruebas
fallan: tu trabajo consiste en ponerlas en verde.

## Cómo empezar

1. Pulsa **Use this template** → **Create a new repository** y créalo en **tu cuenta personal**.
2. En tu copia, **Code** → **Codespaces** → **Create codespace on main**.
3. En el terminal:

```bash
java -version    # debe empezar por: openjdk version "25
mvn test         # verás muchos fallos: es lo esperado al empezar
```

A partir de ahí, resuelve los ejercicios en el orden que quieras y vuelve a ejecutar `mvn test`.
Cada `push` los ejecuta también en GitHub Actions, y la marca ✓ o ✗ junto al *commit* te dice
cómo vas.

> **Recuerda detener el Codespace** cuando termines (**Code → Codespaces → ⋯ → Stop codespace**):
> mientras está encendido consume tu cuota mensual gratuita.

## Cómo está organizado

```text
t1-ejercicios/
├── pom.xml                       ← proyecto Maven (Java 25, JUnit 5)
├── servicios.txt                 ← configuración de ejemplo del monitor
├── umbrales.txt                  ← datos para el ejercicio 1.1.6
├── umbrales-con-error.txt        ← ídem, con un error deliberado
└── src/
    ├── main/java/es/uib/prgava/tema1/
    │   ├── poo/          ← ejemplos del tema, ya escritos (base del ejercicio 1.1.4)
    │   ├── monitor/      ← el monitor del tema, ya escrito; puedes modificarlo
    │   └── ejercicios/   ← tus clases
    └── test/java/es/uib/prgava/tema1/
        ├── monitor/      ← pruebas de las clases que amplían el monitor
        └── ejercicios/   ← pruebas del resto
```

Las clases que **implementan una interfaz del monitor** (`FallosEnVentana`, `NotificadorFichero`,
`SondaConRegistro`, y el `ServicioPing` que crearás en 1.1.5) viven en el paquete `monitor`, junto
a sus compañeras. Todas las demás, en `ejercicios`. Cada fichero ya está en su sitio.

## Cómo leer el esqueleto

Cada clase que tienes que escribir trae su firma completa, su documentación y un cuerpo con
`// TODO N.X.k` y un `throw new UnsupportedOperationException(...)`. **Borra ese `throw`** al
implementar el método; mientras esté, la prueba correspondiente falla con ese mensaje, que además
te dice a qué ejercicio pertenece.

Algunas clases **ya están escritas y son parte del enunciado**: son las que tienes que
diagnosticar, refactorizar o ampliar. No las borres.

| Clase ya escrita | Ejercicio | Qué hacer con ella |
|---|---|---|
| `Etiqueta` | 1.1.3 | tiene un defecto: encuéntralo y corrígelo |
| `RegistroSensores` | 1.2.1 | sepárala en dos clases con una responsabilidad cada una |
| `ListaSoloLecturaHeredada` | 1.2.3 | diagnostica la violación de Liskov; no la corrijas |
| `GestorDispositivos` | 1.2.4 | divídela en tres interfaces por rol |
| `InformeDiarioAcoplado` | 1.2.5 | no la toques; escribe `InformeDiario` bien diseñada |
| `Borrado` | 1.3.4 | descomenta sus líneas y explica por qué no compilan |
| `CopiasEjercicio.fusionar` | 1.3.3 | corrige sus firmas aplicando PECS |
| `DetectorDeCaidas` | 1.4.5 | refactorízala en su propio fichero para poder probarla |

## Pruebas: qué hay y qué falta

En las secciones 1.1, 1.2 y 1.3 las pruebas **ya están escritas** y son tu criterio de corrección.
En la sección 1.4 **las pruebas son el entregable**: encontrarás clases con un único método
`pendiente()` que falla a propósito; bórralo cuando escribas las tuyas.

Tres detalles que conviene conocer de antemano:

- Los ejercicios 1.4.1 y 1.4.2 consisten en probar a fondo `FallosEnVentana` y `DireccionIpv4`.
  Para que no te quedes sin comprobación mientras tanto, la plantilla incluye unas pruebas
  mínimas de ambas en `FallosEnVentanaBasicoTest` y `DireccionIpv4BasicoTest`. No las repitas.
- El ejercicio **1.1.5** (añadir `ServicioPing` a la interfaz sellada) tiene su prueba
  **entera comentada** en `ServicioPingTest`, porque no puede compilar hasta que crees la clase.
  Descoméntala al terminar. Lo mismo ocurre con la última prueba de `CopiasEjercicioTest`, que
  no compila hasta que corrijas las firmas de `fusionar` (1.3.3).
- Varios ejercicios piden **justificar una decisión en un comentario**. Eso no lo comprueba
  ninguna prueba, pero es lo que se pregunta en el Examen Parcial: no lo dejes en blanco.

## Órdenes útiles

```bash
mvn test                              # todas las pruebas
mvn -Dtest=HistorialTest test         # solo una clase
mvn -Dtest='Informes*' test           # todas las que empiecen por Informes
mvn -q compile                        # solo compilar
java -cp target/classes es.uib.prgava.tema1.ejercicios.DemoEtiqueta
```

También puedes usar el icono de matraz (*Testing*) de la barra lateral de VS Code, que muestra las
pruebas en árbol y permite ejecutar una sola con un clic, y depurarlas poniendo puntos de ruptura.

## Codespaces y GitHub Actions

`.devcontainer/devcontainer.json` describe el contenedor en el que se abre el Codespace: JDK 25 de
Temurin, Maven y las extensiones de Java de VS Code. `.github/workflows/pruebas.yml` ejecuta
`mvn test` en cada `push`, de modo que junto a cada *commit* aparece una marca ✓ o ✗ en GitHub.
Ambos vienen ya configurados; no tienes que tocarlos.

## Integridad académica

El uso de asistentes de IA en estos ejercicios se rige por las **condiciones de uso de la IA** de
la [guía docente](https://uib-22354-programacion-avanzada.github.io/website/es/informaciones/guia-docente.html).
En resumen: puedes pedir explicaciones y revisión, pero entregar código que no sabes explicar,
justificar ni modificar se considera uso indebido. Estos ejercicios son la base de los Talleres y
del Examen Parcial, donde no hay asistente que valga.
