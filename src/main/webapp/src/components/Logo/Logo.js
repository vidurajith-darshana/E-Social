import React from 'react';
import Ext from "../../hoc/Ext/Ext";
import logoIcon from '../../images/logo.png';
import classes from './Logo.css';

const logo=()=>{
    return(
        <Ext>
            <div>
                <img className={classes.Logo} src={logoIcon} alt="logo"/>
            </div>
        </Ext>
    )
}

export default logo;