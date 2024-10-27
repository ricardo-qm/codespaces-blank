# My Project

This is a basic Java Maven project with a package `miPrincipal`.

## Project Structure

```
mi-proyecto
├── src
│   ├── main
│   │   ├── java
│   │   │   └── miPrincipal
│   │   │       └── App.java
│   │   └── resources
│   └── test
│       ├── java
│       │   └── miPrincipal
│       │       └── AppTest.java
│       └── resources
├── pom.xml
└── README.md
```

## Usage

To run the application, execute the `App` class in the `miPrincipal` package.

To run the tests, execute the `AppTest` class in the `miPrincipal` package.

## Dependencies

This project uses Maven for dependency management. The dependencies are defined in the `pom.xml` file.

## Diagrama de Clases

```mermaid
classDiagram
    class App {
        +main(String[] args)
        -performArithmeticOperations(Calculadora calc)
    }

    class Calculadora {
        +double sumar(double a, double b)
        +double restar(double a, double b)
        +double multiplicar(double a, double b)
        +double dividir(double a, double b)
        +double exponencial(double a)
    }

    App --> Calculadora
```

## Diagrama de Secuencia

```mermaid
sequenceDiagram
    participant User
    participant App
    participant Calculadora

    User->>App: main()
    App->>Calculadora: sumar(a, b)
    Calculadora-->>App: resultadoSuma
    App->>Calculadora: restar(a, b)
    Calculadora-->>App: resultadoResta
    App->>Calculadora: multiplicar(a, b)
    Calculadora-->>App: resultadoMultiplicacion
    App->>Calculadora: dividir(a, b)
    Calculadora-->>App: resultadoDivision
    App->>Calculadora: exponencial(a)
    Calculadora-->>App: resultadoExponencial
    App-->>User: mostrarResultados()

```
## License

This project is licensed under the [MIT License](LICENSE).
```

Please let me know if you need any further assistance.
