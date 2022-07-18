import React,{useState, useEffect} from "react";
//Importaciones. //


/**OBJECT
 * Declaramos el objeto base del formulario.
 * Este objeto se encuentra vacio.
 * El estado de este objeto va cambiando a través del ingreso de datos en los input.
 */
const initialValues = [
    {
        key:'',
        nombre:'',
        apellido:'',
        edad:'',
        password:''
    }
]

    /**Estructura de codigo:
     * constantes,
     * useEffect,
     * useState.
     */


    /**FORMULARIOCOMPONENT.
     * Declaración de la función correspondiente al componente FormularioComponent.
     * Dentro de los ( ) se agregan las funciones creadas en UsuarioComponent.
     * Las funciones son recibidas como propiedad del componente FormularioComponent.
     */
    const FormularioComponent = ({usuarioAdd, usuarioEditado, usuarioEdit, setUsuarioEditado}) => {

    /**USESTATE
     * Función de React que nos permite modificar en tiempo real (debe ir dentro de la constante y antes del return).
     * En este caso utilizariamos:
     * const[values, setValues] = useState(initialValues);
     * En [values], estamos guardando la copia del initialValues (con ella es que vamos a trabajar)
     * En [setValues], estamos declarando la función set para modificar.
     * En useState(initialValues), estamos indicando el valor inicial (la lista original-no copia).
     * En este caso es un objeto vacio (que se ira modificando).
     */
    const[values, setValues] = useState(initialValues);

    /**Se crea una constante para establecer que los campos del formulario serán considerados como values.
     * Se declaran dentro de { } y se realiza la declaración =values;
     */
    const {key, nombre, apellido, edad, password}=values;
    
    /**USEEFECT
     * Función que cada vez que carga la página, se ejecuta una vez.
     * Estructura:
     * useEffect (acción que debe hacer) , [estado del cual debe estar pendiente, aca podemos incluir varios states]
     * 
     * Si usuarioEditado es distinto a NULL, cargar los valores del usuarioEditado
     * Si usuarioEditado es igual a NULL, cargar los valores por defecto, es decir los vacios(initialValues)
     * 
     * [usuarioEditado] estado del cual se encuentra pendiente.
     */
    useEffect(
        ()=>{
            if(usuarioEditado !== null){
                setValues(usuarioEditado)
            }else {                       
                setValues({               
                    key:'',
                    nombre:'',
                    apellido:'',
                    edad:'',
                    password:''
                })
            }

        }
        ,[usuarioEditado]);

    /**handleInputChange
     * Función donde se realiza la captura de los valores ingresados en los input.
     * Se realiza a través de un evento, el cual es la actualización del campo vacio en el input del formulario.
     * 
     * ...values, se utiliza para mantener los valores ingresados a medida que vamos completando otros input.
     * [e.target.name], se utiliza para identificar a través del name el input donde estamos posicionados.
     * e.target.value, captura el valor ingresado en el input.
     * 
     * setValues(changedFormValues), obtenemos el usuario actualizado.
     * Se cambia el estado del objeto vacio a un objeto lleno (con datos).
     */    
    const handleInputChange=(e)=>{
    const changedFormValues ={
        ...values,
        [e.target.name]:e.target.value 
        }
        setValues(changedFormValues)
    }

    /**handleSubmit
     * Función para crear las tarjetas luego de ingresar los datos del usuario en el formulario.
     * 
     * e.preventDefault(), establecemos que la página no recargue cada vez que presionamos un boton.
     * 
     * Si usuarioEditado es distinto a NULL, muestra los valores del usuarioEdit (lista de usuarios modificados y no modificados)
     * Si usuarioEditado es igual a NULL, muestra los valores del usuarioAdd (lista con los nuevos usuarios)
     */
    const handleSubmit =(e)=>{
        e.preventDefault();
        if(usuarioEditado !== null){
            usuarioEdit(values)
        } else {
            usuarioAdd(values)
        }
    }

    /**RETURN
     * Definimos la estructura del componente.
     * Podemos agregar mas componentes con información.
     */

    /**FORMULARIO
     * Agregamos la {función handleSubmit} para establecer la lista a mostrar.
     * 
     * Agregamos a cada input los siguientes campos: value, name, onChange(handleInputChange)
     * value: es el valor capturado dentro del campo del input.
     * name: es el nombre del input y es utilizado en la función handleInputChange.
     * onChange(handleInputChange): establecemos que cada vez que se realice un cambio en el input, se hara uso de la función handleInputChange.
     */
    return (
        <form onSubmit={handleSubmit}> 
            <h3>{usuarioEditado ? 'Editar Usuario':'Ingresar usuario'}</h3>
            {/*Para modificar el título del formulario:
            usuarioEditado es nulo? si no es nulo muestra editar usuario, y si es nulo muestra ingresar usuario*/}
            <div className="form-group">
            <label>ID</label>
            <input
            type="text"
            className="form-control"
            id="key"
            placeholder="Key"
            value={key}
            name='key'
            onChange={handleInputChange}
            />
            <br/>
            <label>Nombre</label>
            <input
            type="text"
            className="form-control"
            id="nombre"
            placeholder="Nombre"
            value={nombre}
            name='nombre'
            onChange={handleInputChange}
            />
            <br/>
            </div>
            <div className="form-group">
            <label>Apellido</label>
            <input
            type="text"
            className="form-control"
            id="apellido"
            placeholder="Apellido"
            value={apellido}
            name='apellido'
            onChange={handleInputChange}
            />
            <br/>
            </div>
            <div className="form-group">
            <label>Edad</label>
            <input
            type="text"
            className="form-control"
            id="edad"
            placeholder="Edad"
            value={edad}
            name='edad'
            onChange={handleInputChange}
            />
            <br/>
            </div>
            <div className="form-group">
            <label>Password</label>
            <input
            type="password"
            className="form-control"
            id="password"
            placeholder="Password"
            value={password}
            name='password'
            onChange={handleInputChange}
            ></input>
            <br/>
            </div>
            <div>    
            <button type="submit" className="btn btn-outline-primary me-2">{usuarioEditado ? 'Editar': 'Crear'}</button>
            {/**Para cambiar el nombre del boton:
               *usuarioEditado es nulo? si no es nulo muestra Editar, si es nulo muestra Crear
               */}

            {/**Para mostrar un boton adicional en el formulario:
               *usuarioEditado es nulo? si no es nulo muestra el boton Cancelar    :   si es nulo no muestres nada  ''
               */}
            {usuarioEditado ? 
            (<button type="button" className="btn btn-outline-warning" onClick={()=>{setUsuarioEditado(null)}}>Cancelar</button>):''}
            </div>
        </form>
    );
};

//Declaramos la exportación del componente para poder utilizarlo en otro archivo del proyecto.//
export default FormularioComponent;