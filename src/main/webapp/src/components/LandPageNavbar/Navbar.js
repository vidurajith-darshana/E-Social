import React,{Component} from 'react';
import classes from './Navbar.css';
import Logo from "../Logo/Logo";
import NavItem from "./NavItem/NavItem";
import IconButton from "@material-ui/core/IconButton/IconButton";
import MenuIcon from '@material-ui/icons/Menu';
import {connect} from "react-redux";
import * as actionCreators from '../../store/action/index';

class Navbar extends Component{

    state={
        items:[{link:"#introduction",name:"INTRODUCTION",icon:"fa fa-handshake-o fa-2x"},{link:"#services",name:"SERVICES",icon:"fa fa-shield fa-2x"},{link:"#community",name:"COMMUNITY",icon:"fa fa-users fa-2x"}]
    }

    toggleOnClick=()=>{
        this.props.toggleHandler(true);
        this.props.backdropHandler(true);
    }

    render(){

        const navItems=this.state.items.map((item,index)=>(
            <NavItem key={index} icon={item.icon} link={item.link}>{item.name}</NavItem>
        ));

        const navItemsScroll=this.state.items.map((item,index)=>(
            <NavItem key={index} icon={item.icon} link={item.link}>{item.name}</NavItem>
        ));

        const toggleButton=this.props.isScroll?<div onClick={this.toggleOnClick} className={classes.ScrollToggle}>
            <IconButton style={{marginLeft:'-12',marginRight:'20',border:'none',outline:'none'}} color="inherit" aria-label="Menu">
                <MenuIcon />
            </IconButton>
        </div>:<div onClick={this.toggleOnClick} className={classes.Toggle}>
            <IconButton style={{marginLeft:'-12',marginRight:'20',border:'none',outline:'none'}} color="inherit" aria-label="Menu">
                <MenuIcon />
            </IconButton>
        </div>;

        return (
            this.props.isScroll?
            <div className={classes.ScrollContainer}>
                <div className={classes.Content}>
                    <div className={classes.Topic}>
                        <div><Logo/></div>
                        <div>E-Social</div>
                    </div>
                    <div className={classes.NavItems}>
                        {navItemsScroll}
                    </div>
                    {toggleButton}
                </div>
            </div>

                :

            <div className={classes.Container}>
                <div className={classes.Content}>
                    <div className={classes.Topic}>
                        <div><Logo/></div>
                        <div>E-Social</div>
                    </div>
                    <div className={classes.NavItems}>
                        {navItems}
                    </div>
                    {toggleButton}
                </div>
            </div>
        );
    }
}

const mapStateToProps=(state)=>{
    return{
        isScroll:state.landPageRed.scroll
    }
}

const mapDispatchToProps=(dispatch)=>{
    return{
        toggleHandler:(data)=>dispatch(actionCreators.toggleOnHandle(data)),
        backdropHandler:(data)=>dispatch(actionCreators.backdropOnHandle(data))
    }
}

export default connect(mapStateToProps,mapDispatchToProps)(Navbar);