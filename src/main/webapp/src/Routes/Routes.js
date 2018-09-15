import Async from 'react-code-splitting';
import React from 'react';
import {Route,Switch} from 'react-router-dom';

const LandPage = () => <Async load={import('../containers/LandPage/LandPage')} />

const routes=()=>{
    return(
        <Switch>
            <Route path="/" component={LandPage} />
        </Switch>
    )
}

export default routes;