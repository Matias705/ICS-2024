# DISEÑO DEL REPOSITORIO
```
├── Bibliografía 
├── Clases 
    ├── Clase_X_<<Tema>> 
        ├── Presentaciones 
        ├── TomaDeNotas 
├── Modalidad
├── Parciales
    ├── ParcialX
        ├── Resúmenes
        ├── Ejercicios
├── Templates
├── TrabajosDeInvestigación
    ├── TIX
├── TrabajosPrácticos 
    ├── TPX 

En el glosario se aclara que contendrá cada carpeta, y sus nomenclaturas.

```


# REGLAS DE NOMBRADO

Se utilizará el siguiente nomenclatura para el nombrado:
`<<NombreDeProducto>>_<<NombreDeArchivo>>.<<Extensión>>`

- **NombreDeProducto**: Hace referencia al tipo de contenido que almacenará cada carpeta, por ejemplo PPT, Modalidad, TP, Resumen, TN, etc.
- **NombreDeArchivo**: Es el nombre que se le asigna al ítem de configuración, por ejemplo "TP1_DocumentoFinal.pdf", “PPT_SCM.pdf”, etc.
- **Extensión**: Es la extensión del ítem de configuración, por ejemplo pdf, docx, etc.

Ejemplo de la nomenclatura: `PPT_SeVieneReputationTV.pdf`

<br>

# LISTADO ITEMS DE CONFIGURACION

 **Nombre**                           | **Regla Nombrado**                               | **Extensión**   | **Ubicación**                            |
|--------------------------------------|-------------------------------------------------|----------------|-------------------------------------------|
| **Libro**                            | `Libro_<<NombreDelLibro>>.<<extensión>>`          | pdf, docx      | `Bibliografía/`                           |
| **Presentación**                     | `PPT_<<NombreDePresentación>>.<<extensión>>`      | pdf, pptx, txt      | `Clases/ClaseX<<Tema>>/Presentaciones/`   |
| **Toma de Nota**                     | `TN_<<NombreDelEstudiante>>.<<extensión>>`         | pdf, jpeg, txt      | `Clases/ClaseX<<Tema>>/TomaDeNotas/`      |
| **Modalidad**                        | `Modalidad_<<yyyy>>.<<extensión>>`                | pdf            | `Modalidad/`                              |
| **Enunciados Ejercicios**            | `Parciales_GuiaEjercicios.<<extensión>`           | pdf            | `Parciales/`                              |
| **Resúmen**                          | `Resúmen-X_<<NombreDelEstudiante>>.<<extensión>>` | pdf, docx, txt      | `Parciales/ParcialX/Resúmenes/`           |
| **Ejercicio Resuelto**               | `Ejercicio-X_<<NombreDelEstudiante>>.<<extensión>>`| pdf, jpeg, docx, txt | `Parciales/ParcialX/Ejercicios/`         |
| **Template**                         | `Template_<<NombreTemplate>>.<<extensión>>`       | pdf, docx, xslx | `Templates/`                              |
| **Enunciados Trabajos de Investigación**| `TI_EnunciadosTIs.<<extensión>>`               | pdf            | `TrabajosDeInvestigación/`                |
| **Trabajo de Investigación**         | `TIX_<<TítuloDelTI>>.<<extensión>>`               | pdf, txt            | `TrabajosDeInvestigación/TIX/`            |
| **Enunciados Trabajos Prácticos**    | `TP_EnunciadosTPs.<<extensión>>`                  | pdf            | `TrabajosPracticós/`                      |
| **Trabajo Práctico**                 | `TPX_<<TítuloDelTP>>.<<extensión>>`               | pdf            | `TrabajosPracticós/TPX/`                   |

<br>

# GLOSARIO

### Diseño de Repositorio:

1. **`Bibliografía`**: Se almacenará el material bibliográfico propuesto por la cátedra.
2. **`Clases`**: Almacenará una carpeta por cada clase que se da.
3. **`Clase_X_<<Tema>>`**: Es la carpeta de una clase en especifico, donde la “X” hace alusión a la fecha y se escribirá el día y el mes separados por un guión normal; luego seguirá el tema de la clase, por ejemplo Clase_13-08_Introducción a Ing de Software.  Esta carpeta almacena dos carpetas, **`TomasDeNotas`** donde estarán las tomas de notas de los estudiantes y **`Presentaciones`** con las presentaciones usadas en la clase.
4. **`Modalidad`**: Aquí se almacenará la modalidad y planificación académica en la cual se basará la cátedra a lo largo del año/cuatrimestre.
5. **`Parciales`**: Almacena un archivo con los enunciados de los ejercicios para practicar y una carpeta por cada parte.
6. **`ParcialX`**: es la carpeta con los contenidos que van a un parcial en específico, la “X” hace alusión al número del parcial. Esta contendrá dos carpetas, **`Resúmenes`** donde cada estudiante almacenará sus resúmenes y **`Ejercicios`** donde subirán las soluciones a ejercicios.
7. **`Templates`**: Contendrá las templates propuestas por la cátedra para usar en los parciales.
8. **`TrabajosDeInvestigación`**: Contendrá una carpeta por cada trabajo de investigación realizado y un archivo con los correspondientes enunciados.
9. **`TIX`**: Es la carpeta de un trabajo de investigación en específico, y almacenará todos los archivos del correspondiente trabajo.
10. **`TrabajosPrácticos`**: Contendrá una carpeta por cada trabajo práctico realizado y un archivo con los correspondientes enunciados.
11. **`TPX`**: Es la carpeta de un trabajo práctico en específico, y almacenará todos los archivos del correspondiente trabajo.

### Listado de Ítems de Configuración:

1. **`PPT`**: Presentación.
2. **`TN`**: Toma de Notas.
3. **`yyyy`**: Año de Cursada.
4. **`Resúmen-X`**: X hace alusión al tema que se está resumiendo.
5. **`Ejercicio-X`**: X hace alusión al título del Ejercicio resuelto.
6. **`TI`**: Trabajos de Investigación. Se usa para el nombre del producto, del archivo de enunciados de trabajos de investigación.
7. **`TIX`**: Trabajo de Investigación. X hace alusión al número del Trabajo de Investigación.
8. **`TP`**: Trabajos Prácticos. Se usa para el nombre del producto, del archivo de enunciados de trabajos prácticos.
9. **`TPX`**: Trabajo Práctico. X hace alusión al número del Trabajo Práctico.


# Linea Base

La línea base se establecerá tras la entrega de cada Trabajo Práctico, en la rama principal “main” del repositorio. La elección de los Trabajos Prácticos como puntos de referencia se debe a su rol como 'checkpoints' en el proceso de aprendizaje. Estos momentos marcan una oportunidad clave para consolidar los conocimientos adquiridos en la parte teórica y verificar el progreso alcanzado. Al crear una línea base después de cada TP, se asegura un registro claro del avance académico y se facilita la comparación y evaluación del desarrollo a lo largo del curso.

# TP4

Se Subio el Documento de Configuracion de Software a la correspndeinte carpeta


# TP6

Se Subio el proeycto, el documento de estilo de codigo utilizado y el documento de los pntos claves obtenidos en la conversacion con las profes (product owners del software); a la carpeta correspondiente