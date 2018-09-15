import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import registerServiceWorker from './registerServiceWorker';
import {applyMiddleware, combineReducers, compose, createStore} from "redux";
import thunk from "redux-thunk";
import {BrowserRouter} from "react-router-dom";


const rootReducer=combineReducers({

})

const composeEnhancers = window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__ || compose;
const store = createStore(rootReducer,composeEnhancers(applyMiddleware(thunk)));

const app=(
    <provider store={store}>
        <BrowserRouter basename="/">
            <App/>
        </BrowserRouter>
    </provider>
)

ReactDOM.render(app, document.getElementById('root'));
registerServiceWorker();
