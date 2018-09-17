import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import registerServiceWorker from './registerServiceWorker';
import {applyMiddleware, combineReducers, compose, createStore} from "redux";
import thunk from "redux-thunk";
import {BrowserRouter} from "react-router-dom";
import {Provider} from "react-redux";

import BackdropReducer from './store/reducer/BackdropReducer';
import ToggleReducer from './store/reducer/ToggleReducer';
import LandPageReducer from './store/reducer/LandPageReducer';

const rootReducer=combineReducers({
    backdropRed:BackdropReducer,
    toggleRed:ToggleReducer,
    landPageRed:LandPageReducer
})

const composeEnhancers = window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__ || compose;
const store = createStore(rootReducer,composeEnhancers(applyMiddleware(thunk)));

const app=(
    <Provider store={store}>
        <BrowserRouter basename="/">
            <App/>
        </BrowserRouter>
    </Provider>
)

ReactDOM.render(app, document.getElementById('root'));
registerServiceWorker();
