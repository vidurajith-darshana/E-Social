import React,{Component} from 'react';
import classes from './Backdrop.css';
import {connect} from "react-redux";

class Backdrop extends Component{
    render(){
        const backdrop=this.props.isOpen?<div className={classes.Backdrop}></div>:null;
        return(
            backdrop
        );
    }
}

const mapStateToProps=(state)=>{
    return{
        isOpen:state.backdropRed.open
    }
}

export default connect(mapStateToProps,null)(Backdrop);