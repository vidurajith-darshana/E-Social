import Async from 'react-code-splitting';
import React from 'react';
import {Route, Switch, withRouter} from 'react-router-dom';
import Ext from "../hoc/Ext/Ext";

const LandPage = () => <Async load={import('../containers/LandPage/LandPage')} />
const CredentialPage = () => <Async load={import('../containers/CredentialPage/CredentialPage')} />

const routes=()=>{
    return(
        <Ext>
            <Switch>
                <Route exact path="/" component={LandPage} />
                <Route path="/user" component={CredentialPage} />
            </Switch>
        </Ext>
    )
}

export default withRouter(routes);