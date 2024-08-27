# DISEÑO DEL REPOSITORIO
```
├── Bibliografía 
├── Clases 
    ├── ClaseX-(Tema) 
        ├── Presentaciones 
        ├── TomaDeNotas 
├── Modalidad 
├── TrabajosDeInvestigacion
    ├── TIX
├── TrabajosPrácticos 
    ├── TPX 
├── Parciales
    ├── ParcialX
        ├── Resumenes
        ├── Ejercicios
├── Templates

```


# REGLAS DE NOMBRADO

Se utilizará el siguiente nomenclatura para el nombrado:

`<NombreProducto>_<NombreArchivo>.<Extensión>`

**Donde:**

- **NombreProducto**:  
  Se refiere al nombre del producto, es decir, hace referencia al tipo de contenido que almacenará cada carpeta, por ejemplo: `PPT`, `Modalidad`, `TP`, `Resumen`, `TN`, etc.


- **NombreArchivo**:  
  Es el nombre que se le asigna al ítem de configuración, por ejemplo: `TP1_DocumentoFinal.pdf`, `PPT_SCM.pdf`, etc.

- **Extensión**:  
  Es la extensión del ítem de configuración, por ejemplo: `pdf`, `docx`, etc.

**Ejemplo:**  
`Modalidad_2024.pdf`

<br>

# LISTADO ITEMS DE CONFIGURACION

| **Nombre**                           | **Regla Nombrado**                           | **Extensión**   | **Ubicación**                            |
|--------------------------------------|----------------------------------------------|----------------|-------------------------------------------|
| **Libro**                            | Libro_<<NombreLibro>>.<<extensión>>          | pdf, docx      | Bibliografía/                             |
| **Presentación**                     | PPT_<<NombrePresentación>>.<<extensión>>     | pdf, pptx      | Clases/ClaseX/Presentaciones              |
| **Toma de Nota**                     | TN_<<NombreEstudiante>>.<<extensión>>        | pdf, jpeg      | Clases/ClaseX/TomaDeNotas                 |
| **Modalidad**                        | Modalidad_<<yyyy>>.<<extensión>>             | pdf            | Modalidad/                                |
| **Trabajo Práctico**                 | TPX_<<Nombre>>.<<extensión>>                 | pdf            | TrabajosPracticos/TPX                     |
| **Guía de Trabajos Prácticos**       | TP_EnunciadosTPs.<<extensión>>               | pdf            | TrabajosPracticos/                        |
| **Resumen**                          | Resumen-X_<<NombreEstudiante>>.<<extensión>> | pdf            | Parciales/ParcialX/Resúmenes              |
| **Ejercicio**                        | Ejercicio-X_<<NombreEstudiante>>.<<extensión>>| pdf, jpeg      | Parciales/ParcialX/Ejercicios             |
| **Trabajo de Investigación**         | TIX_<<Nombre>>.<<extensión>>                 | pdf            | TrabajosDeInvestigacion/TIX               |
| **Guía de Trabajos de Investigación**| TI_EnunciadosTIs.<<extensión>>               | pdf            | TrabajosDeInvestigacion/                  |
| **Guía de Trabajos Resueltos**       | Parciales_GuiaEjercicios.<<extensión>>       | pdf            | TrabajosResueltos/                        |
| **Template**                         | Template_<<Nombre>>.<<extensión>>            | pdf            | Templates/                                |

<br>

# GLOSARIO

- PPT: Presentación.
- TN: Toma de Notas.
- yyyy: Año de Cursada.
- TP: Trabajos Prácticos, se usa para aclarar el nombre del producto del archivo de enunciados de trabajos prácticos.
- TPX: Trabajo Práctico. X hace alusión al número del Trabajo Práctico
- TI: Trabajos de Investigación.
- TIX: Trabajo de Investigación. X hace alusión al número del Trabajo de Investigación
- Resumen-X: X hace alusión al título de lo que se está resumiendo
- Ejercicio-X: X hace alusión al título del Ejercicio resuelto

# Linea Base

Se establecerá una línea luego de cada TP entregado, la cual se encontrará en la rama main del repositorio.
La idea de utilizar un Trabajo Práctico (TP) radica en que este actúa como un 'checkpoint' en el proceso de adquisición de conocimientos en la materia. Permite aplicar los conceptos aprendidos en la parte teórica, convirtiéndose en un buen momento para establecer una línea base del aprendizaje alcanzado.

