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

`<NombreProducto>_<Nombre>.<Extensión>`

**Donde:**

- **NombreProducto**:  
  Se refiere al nombre del producto, es decir, hace referencia al tipo de contenido que almacenará cada carpeta, por ejemplo: `ClaseX`, `Modalidad`, `TrabajoPractico`, `Resumen`, `TomaDeNota`.


- **NombreItemDeConfiguración**:  
  Es el nombre que se le asigna al ítem de configuración, por ejemplo: `TrabajoPractico1_DocumentoFinal.pdf`, `Presentacion_UserStories.pdf`, etc.

- **Extensión**:  
  Es la extensión del ítem de configuración, por ejemplo: `pdf`, `docx`, etc.

**Ejemplo:**  
`Clase-16-08_Presentacion.pdf`

<br>

# LISTADO ITEMS DE CONFIGURACION

| **Nombre**                           | **Regla Nombrado**                           | **Extensión**   | **Ubicación**                            |
|--------------------------------------|----------------------------------------------|----------------|-------------------------------------------|
| **Libro**                            | Libro_<<nombreLibro>>.<<extensión>>          | pdf            | Bibliografía/                             |
| **Presentación**                     | PPT_<<nombrePresentación>>.<<extensión>>     | pdf, pptx      | Clases/ClaseX/Presentaciones              |
| **Toma de Nota**                     | TN_<<nombreEstudiante>>.<<extensión>>        | pdf, jpeg      | Clases/ClaseX/TomaDeNotas                 |
| **Modalidad**                        | Modalidad_<<yyyy>>.<<extensión>>             | pdf            | Modalidad/                                |
| **Trabajo Práctico**                 | TPX_<<nombre>>.<<extensión>>                 | pdf            | TrabajosPracticos/TPX                     |
| **Guía de Trabajos Prácticos**       | TP_Guia.<<extensión>>                        | pdf            | TrabajosPracticos/                        |
| **Resumen**                          | Resumen-X_<<nombreEstudiante>>.<<extensión>> | pdf            | Parciales/ParcialX/Resúmenes              |
| **Ejercicio**                        | Ejercicio-X_<<nombreEstudiante>>.<<extensión>>| pdf, jpeg      | Parciales/ParcialX/Ejercicios             |
| **Trabajo de Investigación**         | TIX_<<nombre>>.<<extensión>>                 | pdf            | TrabajosDeInvestigacion/TIX               |
| **Guía de Trabajos de Investigación**| TI_Guia.<<extensión>>                        | pdf            | TrabajosDeInvestigacion/                  |
| **Guía de Trabajos Resueltos**       | Ejercicios_Guia.<<extensión>>                | pdf            | TrabajosResueltos/                        |
| **Template**                         | Template_<<Nombre>>.<<extensión>>            | pdf            | Templates/                                |

<br>

# GLOSARIO

- PPT: Presentacion.
- TN: Toma de Notas.
- yyyy: Año de Cursada.
- TP: Trabajo Práctico.
- TPX: Trabajo Práctico. X hace alusión al número del Trabajo Práctico.
- TI: Trabajo de Investigación.
- TIX: Trabajo de Investigación. X hace alusión al número del Trabajo de Investigación.
- Resumen-X: X hace alusión al título de lo que se está resumiendo.
- Ejercicio-X: X hace alusión al título del Ejercicio resuelto.

# Linea Base

Se establecerá una línea luego de cada TP entregado, la cual se encontrará en la rama main del repositorio.
La idea de utilizar un Trabajo Práctico (TP) radica en que este actúa como un 'checkpoint' en el proceso de adquisición de conocimientos en la materia. Permite aplicar los conceptos aprendidos en la parte teórica, convirtiéndose en un buen momento para establecer una línea base del aprendizaje alcanzado.

