import React from "react";
//Importaciones. //

    /**TARJETACOMPONENT.
     * Declaración de la función correspondiente al componente TarjetaComponent.
     * Dentro de los ( ) se agregan las funciones creadas en UsuarioComponent.
     * Las funciones son recibidas como propiedad del componente FormularioComponent.
     */

    const TarjetaComponent = ({usuario, tarjetaDelete, setUsuarioEditado})=> {

        /**RETURN
        * Definimos la estructura del componente.
        * Podemos agregar mas componentes con información.
        * 
        * Estructura tipo "card"
        * Se pueden definir dentro de parrafos o titulos las variables a mostrar.
        * Se debe indicar el objeto.nombre_propiedad.
        */
        return(
        <div className = "card">
            <div className = "card-body">
                <h3 className="card-title">{usuario.nombre} {usuario.apellido}</h3>
                <p>Edad:{usuario.edad}</p>
                <p>ID:{usuario.key}</p>
                <hr/>
                <div className="d-flex justify-content-end">
                    <button className="btn btn-sm btn-outline-primary me-2" onClick={() => setUsuarioEditado (usuario)}>Editar</button>
                    {/**Le agregamos la función para realizar un cambio en el estado del usuario
                     * setUsuarioEditado (usuario)
                     */}
                    <button className="btn btn-sm btn-outline-danger" onClick={() => tarjetaDelete (usuario.key)}>Eliminar</button>
                    {/**Le agregamos la función para eliminar un usuario (mostrandonos una lista filtrada)
                     * tarjetaDelete (usuario.key)
                     */}
                </div>
            </div>
        </div>
        );
    };

//Declaramos la exportación del componente para poder utilizarlo en otro archivo del proyecto.//
export default TarjetaComponent;