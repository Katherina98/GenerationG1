import React from 'react';
import ReactDOM from 'react-dom';

//Llamamos a la funcion creada en App.js especificando la ruta (la cual fue declarada como exportada)
//Al estar en la misma carpeta escribimos '/.nombre'
import App from './App'

ReactDOM.render( 
    <App/>, //Que queremos que se ejecute.
    document.querySelector("#root") //Donde queremos que se ejecute.
);