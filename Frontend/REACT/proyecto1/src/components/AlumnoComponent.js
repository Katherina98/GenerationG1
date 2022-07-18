import React,{useState} from "react";
import FormularioComponent from "./FormularioComponent";
import LiComponent from "./LiComponent";


const initialAlumnos = [

    {
        key:0,
        nombre: 'Juanito',
        apellido: 'Morales',
        cohorte: 1,
        fechaI: '2022-10-10',
        fechaT: '2022-10-12',
        comentario: 'Alumno aprueba con 100% de asistencia'
    },
    {
        key:1,
        nombre: 'Marcelo',
        apellido: 'Fuentes',
        cohorte: 1,
        fechaI: '2022-10-10',
        fechaT: '2022-10-12',
        comentario: 'Alumno aprueba con 80% de asistencia'
        
    },
    {
        key:2,
        nombre: 'Maria',
        apellido: 'Lopez',
        cohorte: 2,
        fechaI: '2023-10-01',
        fechaT: '2023-10-03',
        comentario: 'Alumno aprueba con 90% de asistencia'
    }

]


const AlumnoComponent = () =>{

        //Creamos una copia de nuestra lista inicial Alumnos y establecemos la función useState.
        const [alumnos, setAlumnos] = useState(initialAlumnos);
            
        const [alumnoEditado, setAlumnoEditado] = useState(null);

        //funcion para el boton delete, obtenemos una lista filtrada de los alumnos sin el que estoy "eliminando"
        const botonDelete = (alumnoKey) => {
            const changeAlumnos = alumnos.filter(alumno => alumno.key !== alumnoKey)
            setAlumnos(changeAlumnos)
        };

        //funcion para guardar un nuevo alumno en nuestro listado.
        const alumnoAdd =(alumno) =>{
            const addAlumnos = [
                ...alumnos,
                alumno
            ]
            setAlumnos(addAlumnos)
        }

        const alumnoEdit = (alumnoEditado) => {
            const changeAlumnos = alumnos.map(alumno => (alumno.key === alumnoEditado.key ? alumnoEditado : alumno))
            setAlumnos(changeAlumnos)
        }

    return (        
        <div className="container mt-4">
            <div className='row'>
                <div className='col-5'>
                    <h1 class="fw-light">Lista alumnos</h1>
                    {
                        alumnos.map(alumno => 
                        <LiComponent
                        key={alumno.key}
                        alumno={alumno}
                        setAlumnoEditado={setAlumnoEditado}
                        botonDelete={botonDelete}/>)
                    }
                </div>
                <div className='col'>
                    <h1 class="fw-light">Formulario</h1>
                    <h6>Recordar anotar el ID siguiente al ultimo alumno ingresado.</h6>
                    <FormularioComponent
                    alumnoAdd={alumnoAdd}
                    alumnoEditado={alumnoEditado}
                    alumnoEdit={alumnoEdit}
                    setAlumnoEditado={setAlumnoEditado}/>
                </div>
            </div>
        </div>
    );
};

export default AlumnoComponent;