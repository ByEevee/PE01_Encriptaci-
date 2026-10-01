# Xifrat de missatges

Programa Java d'exemple per xifrar un missatge amb una clau i, tot seguit, provar de recuperar-lo amb una altra clau.

## Important: el símbol `?`

Si en el missatge xifrat apareix un `?`, **no vol dir necessàriament que el xifratge hagi fallat**. El programa pot estar intentant mostrar un caràcter que la terminal no sap representar. En aquest cas, la terminal el substitueix per `?`.

## Com funciona

1. Introdueix la clau per xifrar.
2. Escriu el missatge que vols xifrar.
3. Consulta el missatge xifrat que mostra el programa.
4. Introdueix una clau per desencriptar-lo. Per recuperar el missatge original, fes servir la mateixa clau del xifratge.
5. Respon `s` si vols repetir el procés; qualsevol altra resposta tanca el programa.

## Estructura del projecte

```text
src/Propi/
├── ClasseCriptografica.java   # Xifratge i desxifratge
└── ProgramaPrincipal.java    # Interacció amb l'usuari
```

## Execució

Obre el projecte amb Visual Studio Code i executa `ProgramaPrincipal.java` des de l'extensió de Java. També pots compilar-lo i executar-lo des d'un terminal amb el JDK instal·lat:

```bash
javac -d bin src/Propi/*.java
java -cp bin Propi.ProgramaPrincipal
```

> Aquest projecte és un exercici didàctic; no utilitzis aquest mètode per protegir informació real.
