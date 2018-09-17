import React,{Component} from 'react';
import classes from './NavItem.css';
import {connect} from "react-redux";

class NavItem extends Component{
    render(){

        return(
            this.props.isScroll?
                <div className={classes.ScrollLink}>
                    <i style={this.props.isToggle?{marginRight:'8%',marginTop:'2%',flexGrow:'1'}:{marginRight:'8%'}} className={this.props.icon} aria-hidden="true"></i>
                    <a style={this.props.isToggle?{flexGrow:'1'}:null} href={this.props.link}>{this.props.children}</a>
                </div>
                :
                <div className={classes.Link}>
                    <i style={this.props.isToggle?{marginRight:'8%',marginTop:'2%',flexGrow:'1'}:{marginRight:'8%'}} className={this.props.icon} aria-hidden="true"></i>
                    <a style={this.props.isToggle?{flexGrow:'1'}:null} href={this.props.link}>{this.props.children}</a>
                </div>

        );
    }
}

const mapStateToProps=(state)=>{
    return{
        isToggle:state.toggleRed.click,
        isScroll:state.landPageRed.scroll
    }
}

export default connect(mapStateToProps,null)(NavItem);