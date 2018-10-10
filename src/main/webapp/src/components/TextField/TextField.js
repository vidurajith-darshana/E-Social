import React,{Component} from 'react';
import classes from './TextField.css';
import Ext from "../../hoc/Ext/Ext";

class TextField extends Component{
    render(){
        return(
            <Ext>
                <div className={classes.Input}>
                    <div className="mui-textfield mui-textfield--float-label">
                        <input type={this.props.type} />
                        <label>{this.props.placeholder}</label>
                    </div>
                </div>
            </Ext>
        );
    }
}

export default TextField;