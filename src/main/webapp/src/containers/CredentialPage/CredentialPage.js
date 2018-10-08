import React,{Component} from 'react';
import {Switch, Route, withRouter} from 'react-router-dom';
import Ext from "../../hoc/Ext/Ext";
import Async from "react-code-splitting";
import Logo from "../../components/Logo/Logo";
import classes from './CredentialPage.css';

const SignIn = () => <Async load={import('../../components/SignIn/SignIn')} />
const SignUp = () => <Async load={import('../../components/SignUp/SignUp')} />

class CredentialPage extends Component{

    render(){
        return(
            <Ext>
                <div className={classes.Header}>
                    <Logo/>
                    <p>E-Social</p>
                </div>
                <div style={{display:'flex',flexDirection:'column',justifyContent:'center',alignItems:'center'}}>
                    <Switch>
                        <Route path={this.props.match.url+"/signin"} component={SignIn} />
                        <Route path={this.props.match.url+"/signup"} component={SignUp} />
                    </Switch>
                </div>
            </Ext>
        );
    }
}

export default withRouter(CredentialPage);