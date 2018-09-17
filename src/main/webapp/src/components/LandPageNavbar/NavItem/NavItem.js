import React,{Component} from 'react';
import classes from './NavItem.css';
import {NavLink} from "react-router-dom";
import {connect} from "react-redux";

class NavItem extends Component{
    render(){
        let item=<div className={classes.Link}>
            <i style={this.props.isToggle?{marginRight:'8%',marginTop:'2%',flexGrow:'1'}:{marginRight:'8%'}} className={this.props.icon} aria-hidden="true"></i>
            <NavLink style={this.props.isToggle?{flexGrow:'1'}:null} to={this.props.link}>{this.props.children}</NavLink>
        </div>;
        if(this.props.state==='scroll'){
            item=<div className={classes.ScrollLink}>
                <NavLink to={this.props.link}>{this.props.children}</NavLink>
            </div>
        }
        return(
            item
        );
    }
}

const mapStateToProps=(state)=>{
    return{
        isToggle:state.toggleRed.click
    }
}

export default connect(mapStateToProps,null)(NavItem);