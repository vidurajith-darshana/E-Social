import React,{Component} from 'react';
import Navbar from "../../components/LandPageNavbar/Navbar";
import Share from '../../components/Share/Share';
import NavList from "../../components/LandPageNavbar/NavList/NavList";
import classes from './LandPage.css';

class LandPage extends Component{

    scrollOnPage=()=>{
        console.log('hi')
    }

    render(){
        return(
            <div id="landPage" className={classes.Scroll} onScroll={this.scrollOnPage}>
                <Share/>
                <Navbar/>
                <NavList/>
                <div style={{height:'800px'}}></div>
            </div>
        )
    }
}

export default LandPage;