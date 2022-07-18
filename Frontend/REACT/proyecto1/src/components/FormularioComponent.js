import React,{useState, useEffect} from "react";


//Formulario vacio (objeto inicial)
const initialValues = [
    {
        key:'',
        nombre:'',
        apellido:'',
        cohorte:'',
        fechaI:'',
        fechaT:'',
        comentario:''
    }
]

const FormularioComponent = ({alumnoAdd, alumnoEditado, alumnoEdit, setAlumnoEditado}) => {
    const[values, setValues] = useState(initialValues);
    const {key, nombre, apellido, cohorte, fechaI, fechaT, comentario}=values;

    useEffect(
        ()=>{
            if(alumnoEditado !== null){
                setValues(alumnoEditado)
            } else {
                setValues({
                    key:'',
                    nombre:'',
                    apellido:'',
                    cohorte:'',
                    fechaI:'',
                    fechaT:'',
                    comentario:''
                })
            }
        }
        ,[alumnoEditado]);

    const handleInputChange=(e)=>{
        const changedFormValues ={
            ...values,
            [e.target.name]:e.target.value
            //[llave que va cambiando] : ingresar lo siguiente... 
    }
        setValues(changedFormValues)
    }

    //establecemos la funcion handleSubmit para que cuando creemos un nuevo alumno no se recargue la pagina
    const handleSubmit =(e) =>{
        e.preventDefault();
        if(alumnoEditado !== null){
            alumnoEdit(values)
        } else {
            alumnoAdd(values)
        }
    }

    return (
        <form onSubmit={handleSubmit}>
            <h3>{alumnoEditado ? 'Editar alumno':'Ingresar alumno'}</h3>
            <label for="key">Numero id:</label>
            <input class="form-control" type="number" id="key" value={key} name="key" onChange={handleInputChange}></input> 
            <label for="name">Nombre:</label>
            <input class="form-control" type="text" id="nombre" value={nombre} name="nombre" onChange={handleInputChange}></input> 
            <label for="Apellido">Apellido:</label>
            <input class="form-control" type="text" id="apellido" value={apellido} name="apellido" onChange={handleInputChange}></input> 
            <label for="cohorte">Cohorte:</label>
            <input class="form-control" type="number" id="cohorte" value={cohorte} name="cohorte" onChange={handleInputChange}></input> 
            <label for="fechaI">Fecha inicio:</label>
            <input class="form-control" type="date" id="fechaI" value={fechaI} name="fechaI" onChange={handleInputChange}></input> 
            <label for="fechaT">Fecha fin:</label>
            <input class="form-control" type="date" id="fechaT" value={fechaT} name="fechaT" onChange={handleInputChange}></input> 
            <br/><br/>
            <h3 class="fw-light">Ingrese un comentario:</h3>
            <input class="form-control" type="text" id="comentario" value={comentario} name="comentario" onChange={handleInputChange}></input>
            <br/><br/>
            <button type="submit" className="btn btn-sm btn btn-outline-success me-2">{alumnoEditado ? 'Editar': 'Crear'}</button>
            {alumnoEditado ?
            (<button type="button" className="btn btn-sm btn btn-outline-warning" onClick={()=>{setAlumnoEditado(null)}}>Cancelar</button>):''}
        
        </form>
    );
};

export default FormularioComponent;