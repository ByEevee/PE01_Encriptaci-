# Xifrat de missatges en Java

Aquest projecte és un exercici didàctic per practicar diferents tècniques de xifratge en Java.
Inclou una implementació moderna amb AES i una versió antiga basada en un algorisme personalitzat.

## Què fa el programa

El programa demana una clau i un missatge, els xifra i després intenta recuperar el text original amb una clau de desencriptació.

## Important: el símbol `?`

Si en el missatge xifrat apareix un `?`, no significa necessàriament que el xifratge hagi fallat. Pot passar que la terminal no pugui mostrar algun caràcter i el substitueixi per `?`.

## Com funciona

1. Introdueix la clau per xifrar.
2. Escriu el missatge que vols xifrar.
3. Observa el missatge xifrat generat pel programa.
4. Introdueix la clau correcta per desencriptar-lo.
5. Respon `s` per tornar a repetir el procés o qualsevol altra cosa per sortir.

## Estructura del projecte

```text
src/
├── ClasseAES.java               # Xifratge i desxifratge amb AES
├── ProgramaPrincipalAES.java    # Interacció amb l'usuari (versió AES)
└── Propi/
    ├── ClasseCriptografica.java # Versió antiga de xifratge personalitzat
    └── ProgramaPrincipal.java  # Interacció amb l'usuari (versió antiga)
```

## Versions incloses

### 1. Versió AES

És la implementació principal i més moderna del projecte. Fa servir Java Cryptography Architecture (JCA) amb `Cipher` i `SecretKeySpec`.

### 2. Versió antiga

La carpeta `src/Propi` conté una implementació didàctica més senzilla basada en un desplaçament de caràcters. Serveix per entendre el concepte de xifratge amb una clau, però no és adequada per a ús real de seguretat.

## Execució

### Versió AES

```bash
javac -d bin src/ClasseAES.java src/ProgramaPrincipalAES.java
java -cp bin ProgramaPrincipalAES
```

### Versió antiga

```bash
javac -d bin src/Propi/*.java
java -cp bin Propi.ProgramaPrincipal
```

## Notes

> Aquest projecte és un exercici acadèmic. No l'hi hauries d'utilitzar per protegir informació real de manera segura.
