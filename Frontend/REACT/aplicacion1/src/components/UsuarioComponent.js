import React,{useState} from 'react';
import TarjetaComponent from './TarjetaComponent';
import FormularioComponent from './FormularioComponent';
//Importaciones. //


/** Ejemplo para declarar usuarios individualmente.
Se crea la constante y entre las llaves agregamos los datos.
const usuario1 ={
    nombre: 'Joseph',
    apellido:'Joestar',
    edad:'18'
}
const usuario2 ={
    nombre: 'Josuske',
    apellido:'Higashikata',
    edad:'16'
}
*/


/**USER ARRAY 
 * Arreglo de constantes para iterar durante el proyecto.
 */
const initialUsuarios =[
    {
        key:0,
        nombre: 'Joseph',
        apellido:'Joestar',
        edad:'18',
        password:'1234'
    },
    {
        key:1,
        nombre: 'Josuske',
        apellido:'Higashikata',
        edad:'16',
        password:'58884'
    },
    {
        key:3,
        nombre: 'Mateo',
        apellido:'Joestar',
        edad:'19',
        password:'2221'
    }
]

//Declaración de la función correspondiente al componente UsuarioComponent.
const UsuarioComponent = () => {

    /**USESTATE
     * Función de React que nos permite modificar en tiempo real (debe ir dentro de la constante y antes del return).
     * Nos permite obtener a los usuarios y modificarlos (a través de las funciones asignadas a los botones).
     * 
     *  const [state[0], state[1]] = useState(initial_nombreLista);
     *  state[0]= nombre de la copia del initial_nombreLista.
     *  state[1]= función que nos permite hacer cambios. 
     * 
     * En este caso utilizariamos:
     * const [usuarios, setUsuarios] = useState(initialUsuarios);
     * En [usuarios], estamos guardando la copia del initialUsuarios (con ella es que vamos a trabajar)
     * En [setUsuarios], estamos declarando la función set para modificar.
     * En useState(initialUsuarios), estamos indicando el valor inicial (la lista original-no copia).
     * En este caso corresponde a la lista de usuarios declaradas en el ARRAY USER.
     */
    const [usuarios, setUsuarios] = useState(initialUsuarios);
    
    /**EDIT
     * Función que nos permite modificar los datos de un usuario.
     * Visualmente editar a un usuario realizando click en el boton de editar.
     * Nuestro valor inicial es null ya que al inicio no sabemos a cual usuario vamos a editar.
     * Al seleccionar un usuario nuestro state cambia de null a lleno (nos muestra los datos del usuario seleccionado).
     * Se utiliza la constante de usuarioEditado.
     */ 
    const [usuarioEditado, setUsuarioEditado] = useState(null);

    /**DELETE
     * Función que nos permite obtener una lista filtrada sin el usuario que estoy "eliminando".
     * Visualmente elimina a un usuario realizando click en el boton de eliminar. 
     * Realizamos este proceso a través de la KEY o ID.
     */
    const tarjetaDelete =(usuarioKey) =>{
        const changeUsuarios = usuarios.filter(usuario => usuario.key !== usuarioKey)
        setUsuarios(changeUsuarios)
    };

    /**ADD
     * Función que nos permite agregar un usuario.
     * Visualmente agrega un usuario a la lista que ya tenemos ingresada.
     * 
     * addUsuarios, Constante donde guardamos la lista actualizada (con los nuevos usuarios).
     * ...usuarios, se utiliza para mantener los usuarios que ya tenemos ingresados en el Array de initialUsuarios.
     * usuario, indicamos que agregue el usuario creado por el formulario.
     * 
     * setUsuarios(addUsuarios) obtenemos el usuario nuevo.
     * Cambiamos el estado de los usuarios y obtenemos la lista con los nuevos usuarios.
     */
    const usuarioAdd =(usuario) =>{
        const addUsuarios = [ 
            ...usuarios,
            usuario 
        ];
        setUsuarios(addUsuarios)
    };

    /**USER-EDIT
     * Se realiza un recorrido por todos los usuarios verificando si la KEY de cada uno es la misma del usuario que sera editado.
     * Si la KEY del usuario es igual a un usuario de la lista, se mostraran los datos del usuario editado (nuevos).
     * Si la KEY del usuario no es igual a un usuario de la lista, se mostraran los datos del usuario sin editar (se mantiene).
     * El resultado es una lista donde se visualizan los usuarios editados y los usuarios sin editar.
     * El signo ? evalua si la condición es true o false.
     */ 
    const usuarioEdit=(usuarioEditado)=>{
        const changeUsuarios = usuarios.map(usuario => (usuario.key === usuarioEditado.key ? usuarioEditado : usuario))
        setUsuarios(changeUsuarios)
    }

    /**RETURN
     * Definimos la estructura del componente.
     * Podemos agregar mas componentes con información.
     */
    return (
        <div className="container mt-4">
            <div className="row">
                <div className="col-8">
                    <h1>Lista</h1>
                    {
                        usuarios.map(usuario => 
                        <TarjetaComponent 
                        key={usuario.key} 
                        usuario={usuario} 
                        tarjetaDelete={tarjetaDelete}
                        setUsuarioEditado={setUsuarioEditado}/>)
                    }
                    {/**Forma estatica de agregar usuarios en un componente.
                     * <TarjetaComponent usuario={usuario1}/>
                     * <TarjetaComponent usuario={usuario2}/>
                     * Para evitar realizar esta acción por cada usuario, utilizamos un map.
                     */}
                </div>
                <div className="col">
                    <h1>Formulario</h1>
                    <FormularioComponent
                    usuarioAdd={usuarioAdd}
                    usuarioEditado={usuarioEditado}
                    usuarioEdit={usuarioEdit}
                    setUsuarioEditado={setUsuarioEditado}/>
                </div>
            </div>
        </div>
    );
};


//Declaramos la exportación del componente para poder utilizarlo en otro archivo del proyecto.//
export default UsuarioComponent;