import React from 'react';
import ReactDOM from 'react-dom';
//Importaciones. //


/**Para importar un componente debemos llamarlo y escribir su ruta desde nuestro origen.
 * Cuando los archivos se ubican en la misma carpeta se debe iniciar con './nombre_archivo'
 */
import App from './App'


/**REACTDROM.RENDER
 * Función para establecer el inicio del proyecto.
 * Indicamos lo que queremos que se ejecute (el componente App.js) 
 * Indicamos donde queremos que se ejecute (div id=”root”)
 */
ReactDOM.render( 
    <App/>, 
    document.querySelector("#root")
);