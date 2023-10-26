# LUCAZPARCIAL

# Arquitectura

Cliente spark que usa HTML5 y JavaScript, el cliente recibe un número y muestra la secuencia de Lucaz generada a partir de ese número


# Instalación

Para clonar el proyecto, use el siguiente comando:

```
git clone https://github.com/Andres7498/LUCAZPARCIAL
```

Para compilar el proyecto use el siguient comando:

```
mvn clean install
```

Para ejecutar el proyecto, ejecute el siguiente comando:


Windows:
```
java -cp "target/classes;target/dependency/*" com.example.LucazService
```

Mac o distribuciones de Linux:
```
java -cp "target/classes:target/dependency/*" com.example.LucazService
```

# Ejecutarlo en AWS

para ejecutarlo en AWS, asegurese de tener el zip con las clases y dependencias en la maquina, la instancia EC2 debe permitir el puerto 4567 de entrada, luego, ejecute el siguiente comando:

```
java -cp "target/classes:target/dependency/*" com.example.LucazService
```

Ahora puede ver el servicio en funcionamiento en su Web Browser favorito en la siguiente URL:
```
http://ec2-54-235-57-76.compute-1.amazonaws.com:4567/index.html
```

# Prueba de funcionamiento en local

Funcionamiento de la aplicación

Hello:
![image](https://github.com/Andres7498/LUCAZPARCIAL/blob/main/demo/src/main/resources/images/local.png)

Lucaz:
![image](https://github.com/Andres7498/LUCAZPARCIAL/blob/main/demo/src/main/resources/images/lucaslocal.png)



# Prueba de funcionamiento en AWS

Funcionamiento de la aplicación

Hello:
![image](https://github.com/Andres7498/LUCAZPARCIAL/blob/main/demo/src/main/resources/images/localaws.png)

Lucaz:
![image](https://github.com/Andres7498/LUCAZPARCIAL/blob/main/demo/src/main/resources/images/lucasaws.png)

ec2-54-235-57-76.compute-1.amazonaws.com:

# URL video

https://www.youtube.com/watch?v=ZbtCu0wGrXk