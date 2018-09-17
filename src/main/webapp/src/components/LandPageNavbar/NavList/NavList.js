import React,{Component} from 'react';
import classes from './NavList.css';
import NavItem from "../NavItem/NavItem";
import {connect} from "react-redux";
import * as actionCreators from "../../../store/action/index";

class NavList extends Component{

    state={
        items:[{link:"",name:"INTRODUCTION",icon:"fa fa-handshake-o fa-2x"},{link:"",name:"SERVICES",icon:"fa fa-shield fa-2x"},{link:"",name:"COMMUNITY",icon:"fa fa-users fa-2x"}]
    }

    navItemOnClick=()=>{
        this.props.toggleHandler(false);
        this.props.backdropHandler(false);
    }

    render(){

        const navItems=this.state.items.map((item,index)=>(
            <div key={index}>
                <div onClick={this.navItemOnClick} className={classes.NavItem}>
                    <NavItem state="" icon={item.icon} link="#">{item.name}</NavItem>
                </div>
                {this.state.items.length-1===index?null:<div className={classes.Divider}></div>}
            </div>

        ));

        return(
            this.props.isToggle?<div className={classes.ContainerOn}>
                {navItems}
            </div>:<div className={classes.ContainerOff}></div>
        )
    }
}

const mapStateToProps=(state)=>{
    return{
        isToggle:state.toggleRed.click
    }
}

const mapDispatchToProps=(dispatch)=>{
    return{
        toggleHandler:(data)=>dispatch(actionCreators.toggleOnHandle(data)),
        backdropHandler:(data)=>dispatch(actionCreators.backdropOnHandle(data))
    }
}

export default connect(mapStateToProps,mapDispatchToProps)(NavList);