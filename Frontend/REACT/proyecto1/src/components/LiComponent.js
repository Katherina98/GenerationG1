import React from "react";


const LiComponent = ({alumno, botonDelete, setAlumnoEditado})=> {
    return(
    <div className = "card">
        <div className = "card-body">
            <h3 className="card-title">{alumno.nombre} {alumno.apellido}</h3>
            <p>Id:{alumno.key}</p>
            <p>Cohorte:{alumno.cohorte}</p>
            <p>Inicio:{alumno.fechaI}</p>
            <p>Termino:{alumno.fechaT}</p>
            <h5>Observaciones del alumno:</h5>
            <p>{alumno.comentario}</p>
            <hr/>
            <div className="d-flex justify-content-end">
                <button className="btn btn-sm btn-outline-primary me-2" onClick={() => setAlumnoEditado(alumno)}>Editar</button>
                <button className="btn btn-sm btn-outline-danger" onClick={() => botonDelete (alumno.key)}>Eliminar</button>
            </div>
        </div>
    </div>
    );
};

export default LiComponent;