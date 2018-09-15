import React,{Component} from 'react';
import classes from './Navbar.css';
import Logo from "../Logo/Logo";

class Navbar extends Component{
    render(){
        return (
            <div className={classes.Container}>
                <div className={classes.Content}>
                    <div className={classes.Topic}>
                        <div><Logo/></div>
                        <div>E-Social</div>
                    </div>
                    <div className={classes.Sections}>
                        <div><a>Introduction</a></div>
                        <div><a>Services</a></div>
                        <div><a>Join + </a></div>
                    </div>
                </div>
            </div>
        );
    }
}

export default Navbar;