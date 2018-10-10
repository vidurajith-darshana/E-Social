import React,{Component} from 'react';
import Ext from "../../hoc/Ext/Ext";
import classes from './SignCard.css';

class SignCard extends Component{
    render(){
        return(
            <Ext>
                <div className={classes.Container}>
                    <div className={classes.Content}>
                        {this.props.children}
                    </div>
                </div>
            </Ext>
        );
    }
}

export default SignCard;