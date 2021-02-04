# CineApi
# Se realiza Script para montar la base de datos rapida y poder realizar pruebas de la API. El mismo se encuentra en CineApi/peliculas.sql

Una vez ejectuado el script sobre localhost:3306 se puede realizar la instalacion de la API


#How to install API:

1 Tener Spring Tool Suite 4

2 Importar el proyecto maven (pom.xml)

3 Utilizar Boot Dashboard


#How to use:

Ruta raiz: /ApiPelis


#Get:

Obtener todas las peliculas: /peliculas

Obtener una pelicula: /ver/{id}


#Post

Crear una pelicula: /crear


#Put 

Json debe estar conformado con el siguiente formato:

{

    "nombre":"Ejemplo",
    "paisDeOrigen":"Pais",
    "fechaDeEstreno":"2021-01-01T00:00:00.000Z",
    "director":"Nombre y Apellido",
    "reparto":"Nombre y Apellido"
    
}

Modificar una pelicula: /editar/{id}


#Delete

Eliminar una pelicula a traves de su Id: /eliminar/{id}
