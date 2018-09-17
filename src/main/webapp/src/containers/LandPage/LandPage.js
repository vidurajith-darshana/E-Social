import React,{Component} from 'react';
import Navbar from "../../components/LandPageNavbar/Navbar";
import Share from '../../components/Share/Share';
import NavList from "../../components/LandPageNavbar/NavList/NavList";
import {connect} from "react-redux";
import * as actionCreators from '../../store/action/index';
import Carousel from "../../components/Carousel/LandPageCarousel/Carousel";
import Content from "../../components/LandPageContent/Content";
import Footer from "../../components/Footer/Footer";

class LandPage extends Component{

    scrollOnPage=()=>{
        window.scrollY>=40?this.props.scrollHandler(true):this.props.scrollHandler(false);
    }

    componentDidMount(){
        window.addEventListener('scroll',this.scrollOnPage);
    }

    render(){
        return(
            <div>
                <Share/>
                <Navbar/>
                <NavList/>
                <Carousel/>
                <Content/>
                <Footer/>
            </div>
        )
    }
}

const mapDispatchToProps=(dispatch)=>{
    return{
        scrollHandler:(data)=>dispatch(actionCreators.scrollOnHandle(data))
    }
}

export default connect(null,mapDispatchToProps)(LandPage);