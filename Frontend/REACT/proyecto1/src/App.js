import React from 'react';

const App = () => {

return(
<div className="container mt-4">
        <div className='row'>
            <div className='col-4'>
                <h1 class="fw-light">Lista</h1>
                <ol class="fw-light">
                    <li>Generation 1</li>
                    <li>Generation 2</li>
                    <li>Generation 3</li>
                </ol>
            </div>
            <div className='col-3'>
                <h1 class="fw-light">Formulario</h1>
                <form action="" method="">
                <label for="name">Nombre:</label>
                <input class="form-control" type="text" id="name" name="name"></input> 
                <label for="Apellido">Apellido:</label>
                <input class="form-control" type="text" id="apellido" name="apellido"></input> 
                <label for="cohorte">Cohorte:</label>
                <input class="form-control" type="number" id="cohorte" name="cohorte"></input> 
                <label for="fechaI">Fecha inicio:</label>
                <input class="form-control" type="datetime-local" id="fechaI" name="fechaI"></input> 
                <label for="fechaF">Fecha fin:</label>
                <input class="form-control" type="datetime-local" id="fechaF" name="fechaF"></input> 
                <br></br>
                <br></br>
                <h3 class="fw-light">Ingrese un comentario:</h3>
                <textarea id="textarea" name="textarea" cols="50" rows="5" minlength="5" maxlength="100" placeholder="Cuentanos tu experiencia..."></textarea>
                <br></br>
                <br></br>
                <input class="btn btn-outline-info" type="submit" value="Ingresar alumno"></input>
                <br></br>
                <br></br>
                <input class="btn btn-outline-warning" type="reset" value="Limpiar"></input>
                </form>
            </div>
        </div>
    </div>
    ); 
};

export default App;