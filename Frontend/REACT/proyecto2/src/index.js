import React from 'react';
import ReactDOM from 'react-dom';
import Pagina from './Pagina';
/**Importaciones*/

import 'bootstrap/dist/css/bootstrap.min.css';
/**Bootstrap*/

/**Funcion ReactDom para establecer lo que quiero ejecutar y donde ejecutarlo*/
ReactDOM.render(
    <Pagina/>,
    document.querySelector("#root")
);


